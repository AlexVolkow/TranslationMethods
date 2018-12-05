package ru.volkov.aleksandr.top.generator

import ru.volkov.aleksandr.top.analyzer.EOF
import ru.volkov.aleksandr.top.analyzer.EPS
import ru.volkov.aleksandr.top.analyzer.parser.Element
import ru.volkov.aleksandr.top.analyzer.parser.ParserContext
import ru.volkov.aleksandr.top.analyzer.parser.Production
import ru.volkov.aleksandr.top.analyzer.parser.Rule
import ru.volkov.aleksandr.top.analyzer.parser.runtime.ParserException

class ParserGenerator(
    private val context: ParserContext,
    private val terms: Set<String>
) : AbstractGenerator() {
    private val first = buildFirst(context)
    private val follow = buildFollow(context)

    override fun generate(grammarName: String) = buildString {
        context.packageName?.let {
            line("package $it")
            newLine()
        }
        line("import ru.volkov.aleksandr.top.analyzer.parser.runtime.ParserException")
        newLine()
        line("class ${grammarName.capitalize()}Parser(private val lexer: ${grammarName.capitalize()}Lexer) {")
        newLine()
        scope {
            generateParseFunction()

            generateParser()

            generateConsume()
        }
        line("}")
    }

    private fun StringBuilder.generateParser() {
        for ((name, rule) in context.rules) {
            line(
                "private fun ${name.capitalize()}(${rule.argsWithTypes}) : ${rule.returnType ?: "Unit"} " +
                        "= when(lexer.token) {"
            )
            val jumpTable = jumpTable(name, rule)
            scope {
                for ((prod, tokens) in jumpTable) {
                    line("${tokens.joinToString { "Tokens.$it" }} -> {")
                    scope {
                        val countable = countable(prod)

                        for (elem in prod.prods) {
                            if (elem.isEps()) {
                                continue
                            }
                            val elemName = elem.name
                            when (elem) {
                                is Element.Term -> {
                                    if (elemName in countable) {
                                        val idx = countable.compute(elemName) { _, v -> v!! + 1 }
                                        line("val ${elemName + idx} = consume(Tokens.$elemName)")
                                    } else {
                                        line("val $elemName = consume(Tokens.$elemName)")
                                    }
                                }

                                is Element.NonTerm -> {
                                    val callAttrs = elem.attrs?.joinToString().orEmpty()

                                    if (elemName in countable) {
                                        val idx = countable.compute(elemName) { _, v -> v!! + 1}
                                        line("val ${elemName + idx} = ${elemName.capitalize()}($callAttrs)")
                                    } else {
                                        line("val $elemName = ${elemName.capitalize()}($callAttrs)")
                                    }
                                }

                                is Element.Code -> {
                                    line(elem.code)
                                }
                            }
                        }
                    }
                    line("}")
                }
                line(
                    "else -> throw ParserException(lexer.position, lexer.token, " +
                            "${jumpTable.values.flatten().joinToString { "Tokens.$it" }})"
                )
            }
            line("}")
            newLine()
        }
    }

    private fun StringBuilder.generateParseFunction() {
        val startNotTerm = context.start
        val startRule = context.rules[startNotTerm]!!

        line("fun parse(${startRule.argsWithTypes}) : ${startRule.returnType ?: "Unit"} { ")
        scope {
            line("lexer.nextToken()")
            line("return ${startNotTerm.capitalize()}(${startRule.argsWithoutTypes})")
        }
        line("}")
        newLine()
    }

    private fun StringBuilder.generateConsume() {
        line("private fun consume(token: Int): String {")
        scope {
            line("if (lexer.token != token) {")
            scope {
                line("throw ParserException(lexer.position, lexer.token, token)")
            }
            line("}")
            line("val value = lexer.tokenValue!!")
            line("lexer.nextToken()")
            line("return value")
        }
        line("}")
    }

    private fun jumpTable(name: String, rule: Rule): Map<Production, List<String>> {
        val jumpTable = rule.productions
            .associate { prod ->
                val withoutCode = prod.withoutCode
                if (withoutCode.firstOrNull()?.name == EPS) {
                    prod to follow.getValue(name).toList()
                } else {
                    prod to first.getValue(withoutCode.firstOrNull()!!.name).toList()
                }
            }

        val allTerms = jumpTable.values.flatten()
        if (allTerms.size != allTerms.distinct().size) {
            throw ParserException("Not LL(1) grammar.")
        }

        return jumpTable
    }

    private fun countable(prod: Production) =
        prod.withoutCode
            .groupingBy { it.name }
            .eachCount()
            .filterValues { i -> i > 1 }
            .mapValues { 0 }
            .toMutableMap()

    private fun buildFirst(context: ParserContext): Map<String, Set<String>> {
        val first = mutableMapOf<String, MutableSet<String>>()
        val rules = context.rules

        terms.forEach { first[it] = mutableSetOf(it) }

        rules.forEach { (name, rule) ->
            first[name] = mutableSetOf()
            if (rule.productions.any { it.withoutCode.first().isEps() }) {
                first[name]!!.add(EPS)
            }
        }

        var changed = true
        while (changed) {
            changed = false
            for ((name, rule) in rules) {
                for (prod in rule.productions) {
                    val withoutCode = prod.withoutCode
                    for (i in withoutCode.indices) {
                        val elem = withoutCode[i].name
                        changed = changed || first.getValue(name).addAll(first.getValue(elem))
                        if (EPS in first.getValue(elem) && i == withoutCode.size - 1) {
                            changed = changed || first.getValue(name).add(EPS)
                        } else {
                            break
                        }
                    }
                }
            }
        }

        println("FIRST:")
        println(first)
        return first
    }

    private fun buildFollow(context: ParserContext): Map<String, Set<String>> {
        val follow = mutableMapOf<String, MutableSet<String>>()

        context.nonTerms.forEach { follow[it] = mutableSetOf() }
        follow.getValue(context.start).add(EOF)

        var changed = true
        while (changed) {
            changed = false
            for ((name, rule) in context.rules) {
                for (prod in rule.productions) {
                    val productions = prod.withoutCode

                    for ((idx, elem) in productions.withIndex()) {
                        if (elem is Element.NonTerm && idx < productions.size - 1) {
                            val firstB = first.getValue(productions[idx + 1].name).filter { it != EPS }
                            val isChanged = follow.getValue(elem.name).addAll(firstB)
                            changed = changed || isChanged
                        }
                    }

                    if (productions.last() is Element.NonTerm) {
                        changed = changed || follow.getValue(productions.last().name).addAll(follow.getValue(name))
                    }

                    if (productions.size > 1 && EPS in first.getValue(productions.last().name)) {
                        val B = productions[productions.size - 2]
                        if (B is Element.NonTerm) {
                            changed = changed || follow.getValue(B.name).addAll(follow.getValue(name))
                        }
                    }
                }
            }
        }
        println("FOLLOW:")
        println(follow)
        return follow
    }
}
