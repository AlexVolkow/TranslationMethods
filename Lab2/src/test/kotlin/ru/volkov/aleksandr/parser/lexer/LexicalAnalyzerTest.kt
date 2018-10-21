package ru.volkov.aleksandr.parser.lexer

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import ru.volkov.aleksandr.parser.exception.ParserException
import ru.volkov.aleksandr.parser.lexer.Token.*

internal class LexicalAnalyzerTest {

    @Test
    fun parseFunction() {
        val dec = "function sum(a:integer;b:integer):integer"
        val ans = listOf(
            FUNCTION,
            NAME,
            LEFT_BRACKET,
            NAME,
            COLON,
            NAME,
            SEMICOLON,
            NAME,
            COLON,
            NAME,
            RIGHT_BRACKET,
            COLON,
            NAME
        )

        testLexer(dec, ans)
    }

    @Test
    fun parseProcedure() {
        val dec = "     procedure fac23  ()"
        val ans = listOf(PROCEDURE, NAME, LEFT_BRACKET, RIGHT_BRACKET)

        testLexer(dec, ans)
    }

    @Test
    fun towArgumentOneType() {
        val dec = "     procedure sum(a,b:integer)"
        val ans = listOf(PROCEDURE, NAME, LEFT_BRACKET, NAME, COMMA, NAME, COLON, NAME, RIGHT_BRACKET)

        testLexer(dec, ans)
    }

    @Test
    fun incorrectNameOfFunction() {
        val dec = "procedure 12sum$ (a,b:integer)"
        val ans = listOf(PROCEDURE, NAME, LEFT_BRACKET, NAME, COMMA, NAME, COLON, NAME, RIGHT_BRACKET)
        assertThrows(ParserException::class.java) { testLexer(dec, ans)}
    }

    private fun testLexer(dec: String, ans: List<Token>) {
        val lexer = LexicalAnalyzer(dec.byteInputStream())
        for (token in ans) {
            assertEquals(token, lexer.nextToken())
        }

        assertEquals(END, lexer.nextToken())
    }
}