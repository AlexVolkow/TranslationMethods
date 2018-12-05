package ru.volkov.aleksandr.top.analyzer

import ru.volkov.aleksandr.top.GrammarBaseListener
import ru.volkov.aleksandr.top.GrammarParser
import ru.volkov.aleksandr.top.analyzer.lexer.ILexerAnalyzer
import ru.volkov.aleksandr.top.analyzer.parser.IParserAnalyzer

class GrammarAnalyzer(
    private val lexerAnalyzer: ILexerAnalyzer,
    private val parserAnalyzer: IParserAnalyzer
) : GrammarBaseListener() {

    override fun exitGram(ctx: GrammarParser.GramContext?) {
        lexerAnalyzer.exitGram(ctx)
    }

    override fun exitLexerRule(ctx: GrammarParser.LexerRuleContext?) {
        lexerAnalyzer.exitLexerRule(ctx)
    }

    override fun exitBegin(ctx: GrammarParser.BeginContext?) {
        parserAnalyzer.exitBegin(ctx)
    }

    override fun exitParsingRule(ctx: GrammarParser.ParsingRuleContext?) {
        parserAnalyzer.exitParsingRule(ctx)
    }

    override fun exitPack(ctx: GrammarParser.PackContext?) {
        parserAnalyzer.exitPack(ctx)
    }
}