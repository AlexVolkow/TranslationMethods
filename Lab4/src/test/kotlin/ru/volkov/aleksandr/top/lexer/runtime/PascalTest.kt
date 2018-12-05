package ru.volkov.aleksandr.top.lexer.runtime

import examples.pascal.PascalLexer
import examples.pascal.PascalParser
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import ru.volkov.aleksandr.top.analyzer.parser.runtime.ParserException

internal class PascalTest {
    private fun parse(s: String) = PascalParser(PascalLexer(s.reader())).parse()

    @Test
    fun simpleFunction() {
        val test = "function sum(a,b:integer): integer"
        val tree = parse(test)
        println(tree)

        assertEquals("function sum ( a , b : integer ) : integer", tree.toPrettyString())
    }

    @Test
    fun simpleProcedure() {
        val test = "procedure div(a:integer; b:real)"
        val tree = parse(test)
        println(tree)

        assertEquals("procedure div ( a : integer ; b : real )", tree.toPrettyString())
    }

    @Test
    fun groupOfArguments() {
        val test = "procedure foo(a, b, c1:integer; b:real; e,d: char)"
        val tree = parse(test)
        println(tree)

        assertEquals("procedure foo ( a , b , c1 : integer ; b : real ; e , d : char )", tree.toPrettyString())
    }

    @Test
    fun noArguments() {
        val test = "function print(): real"
        val tree = parse(test)
        println(tree)

        assertEquals("function print ( ) : real", tree.toPrettyString())
    }

    @Test
    fun noLeftBracket() {
        val test = "function bar)"
        assertThrows(ParserException::class.java) { parse(test) }
    }

    @Test
    fun noTypeOfFunc() {
        val test = "bar(): integer"
        assertThrows(ParserException::class.java) { parse(test) }
    }

    @Test
    fun noRightBracket() {
        val test = "function bar(a,b:integer : real"
        assertThrows(ParserException::class.java) { parse(test) }
    }

    @Test
    fun noRetType() {
        val test = "function foo(a, b, c1:integer; b:real; e,d: char): "
        assertThrows(ParserException::class.java) { parse(test) }
    }

    @Test
    fun noNameOfArgument() {
        val test = "procedure foo(a, , c1:integer; b:real; e,d: char)"
        assertThrows(ParserException::class.java) { parse(test) }
    }

    @Test
    fun incorrectTypeOfFunc() {
        val test = "lambda foo(a, b, c1:integer; b:real; e,d: char)"
        assertThrows(ParserException::class.java) { parse(test) }
    }
}
