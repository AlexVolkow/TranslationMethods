package ru.volkov.aleksandr.top

import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import ru.volkov.aleksandr.top.generator.LexerGrammarFilesGenerator
import ru.volkov.aleksandr.top.lexer.LexerAnalyzer
import ru.volkov.aleksandr.top.parser.ParserAnalyzer
import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {
    val inputFile = args[0]
    val targetDir = args[1]

    val grammarName = inputFile.removeSuffix(".gram").capitalize()

    val lexerAnalyzer = LexerAnalyzer()
    val parserAnalyzer = ParserAnalyzer()
    val grammarAnalyzer = GrammarAnalyzer(lexerAnalyzer, parserAnalyzer)

    parse(CharStreams.fromFileName(inputFile), grammarAnalyzer)

    val packageName = "ru.volkov.aleksandr.top.examples.hello"
    val lex = LexerGrammarFilesGenerator(packageName, lexerAnalyzer.lexerContext()) to "Lexer"
    //val par = ParserGrammarFilesGenerator(collector) to "Parser"
    //val test = TestGrammarFilesGenerator(collector) to "Test"

    listOf(lex).forEach { (gen, postfix) ->
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