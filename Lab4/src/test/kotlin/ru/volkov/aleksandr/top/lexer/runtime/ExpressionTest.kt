package ru.volkov.aleksandr.top.lexer.runtime

import examples.expr.ExpressionLexer
import examples.expr.ExpressionParser
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ExpressionTest {

    @Test
    fun `2 + 2`() {
        assertEquals(4, eval("2 + 2"))
    }

    @Test
    fun `5 + 7 * 3`() {
        assertEquals(26, eval("5 + 7 * 3"))
    }

    @Test
    fun `(5 + 7) * 3`() {
        assertEquals(36, eval("(5 + 7) * 3"))
    }

    @Test
    fun `(2 ** (2 ** 3)) * 3`() {
        assertEquals(768, eval("(2 ** (2 ** 3)) * 3"))

    }

    private fun eval(s: String) = ExpressionParser(ExpressionLexer(s.reader())).parse()
}
