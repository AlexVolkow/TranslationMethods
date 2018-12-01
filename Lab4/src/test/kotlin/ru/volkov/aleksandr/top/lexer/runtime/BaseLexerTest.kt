package ru.volkov.aleksandr.top.lexer.runtime

import org.junit.jupiter.api.Test
import ru.volkov.aleksandr.top.lexer.LexerContext
import java.io.Reader
import kotlin.test.assertEquals

internal class BaseLexerTest {
    private val patterns: Map<Int, Regex> = mapOf(
        0 to Regex("hello"),
        1 to Regex("[A-Z][a-z]*"),
        2 to Regex("\\s+")
    )

    private val skipTokens = setOf(2)

    object Tokens {
        val HELLO = 0
        val ID = 1
        val WS = 2
        val EOF = -1
    }

    private val context = LexerContext(patterns, skipTokens, Tokens.EOF)

    fun helloLexer(reader: Reader): BaseLexer {
        return BaseLexer(reader, context)
    }

    @Test
    fun `correct lexer`() {
        val test = "hello John Smith hello"

        val lexer = helloLexer(test.reader())
        val tokens = ArrayList<Int>()
        while (lexer.haveTokens()) {
            lexer.nextToken()
            tokens.add(lexer.token)
        }

        val ans = listOf(0, 1, 1, 0)

        assertEquals(ans, tokens)
    }
}
