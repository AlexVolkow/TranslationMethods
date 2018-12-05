package ru.volkov.aleksandr.top.analyzer.lexer.runtime

import ru.volkov.aleksandr.top.analyzer.lexer.LexerContext
import java.io.IOException
import java.io.Reader

open class BaseLexer(
    reader: Reader,
    context: LexerContext
) {
    private val skipTokens = context.skipTokens
    private val patterns = context.patterns
    private val eofToken = context.eofToken

    private val text: String = reader.readText()

    var token: Int = eofToken
    var tokenValue: String? = null
    var position: Int = 0

    fun nextToken() {
        do {
            next()
        } while (token in skipTokens)
    }

    fun haveTokens(): Boolean {
        return position < text.length
    }

    private fun next() {
        if (!haveTokens()) {
            if (token != eofToken) {
                token = eofToken
                tokenValue = null
                return
            } else {
                throw IOException("No more tokens.")
            }
        }

        for ((id, pattern) in patterns) {
            val matchResult = pattern.find(text, position)

            if (matchResult != null && matchResult.range.first == position) {
                token = id
                tokenValue = matchResult.value
                position += matchResult.value.length

                return
            }
        }

        throw LexerException("Unexpected token at position $position.")
    }
}