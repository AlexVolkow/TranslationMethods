package ru.volkov.aleksandr.top.analyzer.lexer

data class LexerContext (
    val patterns: Map<Int, Regex>,
    val skipTokens: Set<Int>,
    val eofToken: Int = -1,
    val tokenTable: Map<String, Int>? = null
)