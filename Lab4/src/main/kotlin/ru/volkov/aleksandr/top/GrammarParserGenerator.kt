package ru.volkov.aleksandr.top

import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import ru.volkov.aleksandr.top.analyzer.EPS
import ru.volkov.aleksandr.top.analyzer.GrammarAnalyzer
import ru.volkov.aleksandr.top.generator.LexerGenerator
import ru.volkov.aleksandr.top.generator.ParserGenerator
import ru.volkov.aleksandr.top.analyzer.lexer.LexerAnalyzer
import ru.volkov.aleksandr.top.analyzer.parser.ParserAnalyzer
import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {
    val inputFile = args[0]
    val targetDir = args[1]

    val grammarName = inputFile.removeSuffix(".gm").capitalize()

    val lexerAnalyzer = LexerAnalyzer()
    val parserAnalyzer = ParserAnalyzer()
    val grammarAnalyzer = GrammarAnalyzer(lexerAnalyzer, parserAnalyzer)

    parse(CharStreams.fromFileName(inputFile), grammarAnalyzer)

    val parserContext = parserAnalyzer.parserContext()
    val lexerContext = lexerAnalyzer.lexerContext()
    val lexer = LexerGenerator(parserContext.packageName, lexerContext) to "Lexer"

    val terms = if (parserContext.withEps) {
        lexerContext.tokenTable!!.keys + EPS
    } else {
        lexerContext.tokenTable!!.keys
    }

    val parser = ParserGenerator(parserContext, terms) to "Parser"

    listOf(lexer, parser).forEach { (gen, postfix) ->
        val out = Paths.get(targetDir, "$grammarName$postfix.kt")
        out.toFile().parentFile.mkdirs()
        Files.newBufferedWriter(out).use { wr ->
            wr.write(gen.generate(grammarName))
        }
    }
}

private fun parse(stream: CharStream, grammarAnalyzer: GrammarAnalyzer) {
    val lexer = GrammarLexer(stream)
    val parser = GrammarParser(CommonTokenStream(lexer))
    val walker = ParseTreeWalker()
    walker.walk(grammarAnalyzer, parser.gram())
}