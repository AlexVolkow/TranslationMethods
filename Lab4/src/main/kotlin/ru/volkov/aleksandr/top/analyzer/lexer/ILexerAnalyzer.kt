package ru.volkov.aleksandr.top.analyzer.lexer

import ru.volkov.aleksandr.top.GrammarListener

interface ILexerAnalyzer : GrammarListener {
    fun lexerContext(): LexerContext
}