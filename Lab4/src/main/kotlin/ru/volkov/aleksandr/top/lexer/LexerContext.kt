package ru.volkov.aleksandr.top.lexer

import ru.volkov.aleksandr.top.EPS

data class LexerContext (
    val patterns: Map<Int, Regex>,
    val skipTokens: Set<Int>,
    val eofToken: Int = -1,
    val tokenTable: Map<String, Int>? = null
) {
    fun terms(withEps: Boolean): Set<String> {
        return if (withEps) {
            tokenTable!!.keys + EPS
        } else {
            tokenTable!!.keys
        }
    }
}