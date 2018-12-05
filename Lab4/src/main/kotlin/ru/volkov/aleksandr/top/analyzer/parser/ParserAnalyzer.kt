package ru.volkov.aleksandr.top.analyzer.parser

import ru.volkov.aleksandr.top.analyzer.EPS
import ru.volkov.aleksandr.top.GrammarBaseListener
import ru.volkov.aleksandr.top.GrammarParser

class ParserAnalyzer : GrammarBaseListener(), IParserAnalyzer {
    private var packageName: String? = null
    private var start: String = "main"
    private val rules = LinkedHashMap<String, Rule>()
    private var withEps = false

    override fun parserContext(): ParserContext =
        ParserContext(packageName, start, rules, withEps)

    override fun exitBegin(ctx: GrammarParser.BeginContext) {
        start = ctx.PARSER_IDN().text
    }

    override fun exitPack(ctx: GrammarParser.PackContext) {
        packageName = ctx.text.removePrefix("package")
    }

    override fun exitParsingRule(ctx: GrammarParser.ParsingRuleContext) {
        val rule = rules.getOrPut(ctx.PARSER_IDN().text) { Rule(ctx.PARSER_IDN().text) }

        if (ctx.inAttrs() != null) {
            rule.args = ctx.inAttrs().param().map {
                Arg(
                    it.paramName().text,
                    it.paramType().text
                )
            }
        }

        if (ctx.outAttr() != null) {
            rule.returnType = ctx.outAttr().text
        }

        rule.productions = ctx.prods().map { buildProductions(it) }
    }

    private fun buildProductions(ctx: GrammarParser.ProdsContext): Production {
        if (ctx.prod().isEmpty()) {
            withEps = true
            return Production(
                listOf(
                    Element.Term(
                        EPS
                    )
                ), listOf(Element.Term(EPS))
            )
        }

        var production = ctx.prod().map { prodCtx ->
            when {
                prodCtx.PARSER_IDN() != null ->
                    Element.NonTerm(
                        prodCtx.PARSER_IDN().text,
                        prodCtx.args()?.arg()?.map { it.text.trim('{', '}', ' ') }
                    )

                prodCtx.LEXER_IDN() != null ->
                    Element.Term(prodCtx.LEXER_IDN().text)

                else ->
                    Element.Code(prodCtx.CODE().text.trim('{', '}', ' '))
            }
        }


        var withoutCode = production.filter { it !is Element.Code }
        if (withoutCode.isEmpty()) {
            withEps = true
            withoutCode = listOf(Element.Term(EPS))
            production = withoutCode + production
        }

        return Production(withoutCode, production)
    }
}