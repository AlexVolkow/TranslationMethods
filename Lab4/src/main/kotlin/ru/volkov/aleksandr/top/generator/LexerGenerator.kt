package ru.volkov.aleksandr.top.generator

import ru.volkov.aleksandr.top.analyzer.lexer.LexerContext

class LexerGenerator(
    private val packageName: String?,
    private val context: LexerContext
) : AbstractGenerator() {

    override fun generate(grammarName: String) = buildString {
        packageName?.let {
            line("package $it")
            newLine()
        }
        line("import java.io.Reader")
        line("import ru.volkov.aleksandr.top.analyzer.lexer.LexerContext")
        line("import ru.volkov.aleksandr.top.analyzer.lexer.runtime.BaseLexer")
        newLine()
        line("object Tokens {")
        scope {
            (context.tokenTable!! - context.skipTokens).forEach { t, i ->
                line("const val $t = $i")
            }
        }
        line("}")
        newLine()
        line("private val patterns: Map<Int, Regex> = mapOf(")
        scope {
            context.patterns.forEach { t, r ->
                line("$t to Regex(\"${r.toString().escape()}\"),")
            }
        }
        removeLast()
        line(")")
        newLine()
        line("private val skipTokens = setOf(${context.skipTokens.joinToString()})")
        newLine()
        line("private val context = LexerContext(patterns, skipTokens, Tokens.EOF)")
        newLine()
        line("class ${grammarName.capitalize()}Lexer(reader: Reader) : BaseLexer(reader, context)")
    }

    private fun String.escape() = replace("\\", "\\\\").replace("\"", "\\\"")
}