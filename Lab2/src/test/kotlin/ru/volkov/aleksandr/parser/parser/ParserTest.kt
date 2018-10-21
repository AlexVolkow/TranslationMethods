package ru.volkov.aleksandr.parser.parser

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import ru.volkov.aleksandr.parser.exception.ParserException

internal class ParserTest {
    private val parser = Parser()

    @Test
    fun simpleFunction() {
        val test = "function sum(a,b:integer): integer"
        val tree = parser.parse(test.byteInputStream())
        println(tree)

        assertEquals("function sum ( a , b : integer ) : integer", tree.toPrettyString())
    }

    @Test
    fun simpleProcedure() {
        val test = "procedure div(a:integer; b:real)"
        val tree = parser.parse(test.byteInputStream())
        println(tree)

        assertEquals("procedure div ( a : integer ; b : real )", tree.toPrettyString())
    }

    @Test
    fun groupOfArguments() {
        val test = "procedure foo(a, b, c1:integer; b:real; e,d: char)"
        val tree = parser.parse(test.byteInputStream())
        println(tree)

        assertEquals("procedure foo ( a , b , c1 : integer ; b : real ; e , d : char )", tree.toPrettyString())
    }

    @Test
    fun noArguments() {
        val test = "function print()"
        val tree = parser.parse(test.byteInputStream())
        println(tree)

        assertEquals("function print ( )", tree.toPrettyString())
    }

    @Test
    fun noLeftBracket() {
        val test = "function bar)"
        assertThrows(ParserException::class.java) { parser.parse(test.byteInputStream())}
    }

    @Test
    fun noTypeOfFunc() {
        val test = "bar(): integer"
        assertThrows(ParserException::class.java) { parser.parse(test.byteInputStream())}
    }

    @Test
    fun noRightBracket() {
        val test = "function bar(a,b:integer : real"
        assertThrows(ParserException::class.java) { parser.parse(test.byteInputStream())}
    }

    @Test
    fun noRetType() {
        val test = "function foo(a, b, c1:integer; b:real; e,d: char): "
        assertThrows(ParserException::class.java) { parser.parse(test.byteInputStream())}
    }

    @Test
    fun noNameOfArgument() {
        val test = "procedure foo(a, , c1:integer; b:real; e,d: char)"
        assertThrows(ParserException::class.java) { parser.parse(test.byteInputStream())}
    }

    @Test
    fun incorrectTypeOfFunc() {
        val test = "lambda foo(a, b, c1:integer; b:real; e,d: char)"
        assertThrows(ParserException::class.java) { parser.parse(test.byteInputStream())}
    }
}