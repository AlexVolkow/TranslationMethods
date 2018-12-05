package ru.volkov.aleksandr.top.analyzer.parser

import ru.volkov.aleksandr.top.GrammarListener

interface IParserAnalyzer: GrammarListener {
    fun parserContext(): ParserContext
}