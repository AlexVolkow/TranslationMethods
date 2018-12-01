package ru.volkov.aleksandr.top

import ru.volkov.aleksandr.top.lexer.ILexerAnalyzer
import ru.volkov.aleksandr.top.parser.IParserAnalyzer

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