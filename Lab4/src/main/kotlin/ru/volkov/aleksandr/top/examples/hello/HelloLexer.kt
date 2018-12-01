package ru.volkov.aleksandr.top.examples.hello

import java.io.Reader
import ru.volkov.aleksandr.top.lexer.LexerContext
import ru.volkov.aleksandr.top.lexer.runtime.BaseLexer

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

class HelloLexer(reader: Reader) : BaseLexer(reader, context)
