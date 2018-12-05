package ru.volkov.aleksandr.top.lexer.runtime

import examples.binary.BinaryLexer
import examples.binary.BinaryParser
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class BooleanTest {

    @Test
    fun `simple test`() {
        assertEquals(false, eval("true and false"))
        assertEquals(true, eval("true & true"))
        assertEquals(true, eval("true or false"))
        assertEquals(false, eval("false | false"))
        assertEquals(false, eval("false XOR false"))
        assertEquals(true, eval("false ^ true"))
    }

    @Test
    fun `with brackets`() {
        assertEquals(true, eval("(true and false) xor ((false xor true xor false) and true or false)"))
    }

    @Test
    fun `true`() {
        assertEquals(true, eval("(true)"))
    }

    @Test
    fun `xor test`() {
        assertEquals(false, eval("(true xor false) ^ (false & false | true) XOR (false) xor true"))
    }

    private fun eval(s: String) = BinaryParser(BinaryLexer(s.reader())).parse()
}