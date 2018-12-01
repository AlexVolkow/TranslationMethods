package ru.volkov.aleksandr.top.parser

import ru.volkov.aleksandr.top.GrammarListener

interface IParserAnalyzer: GrammarListener {
    fun parserContext(): ParserContext
}