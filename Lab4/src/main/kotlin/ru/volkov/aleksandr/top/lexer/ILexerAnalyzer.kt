package ru.volkov.aleksandr.top.lexer

import ru.volkov.aleksandr.top.GrammarListener

interface ILexerAnalyzer : GrammarListener {
    fun lexerContext(): LexerContext
}