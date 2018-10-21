package ru.volkov.aleksandr.parser.lexer

import ru.volkov.aleksandr.parser.exception.ParserException
import java.io.InputStream

class LexicalAnalyzer(private val input: InputStream) {
    private var currChar: Char = NULL_CHAR

    var currPos: Int = 0
    var currToken: Token = Token.START
    var lastWord: String? = null

    init {
        nextChar()
    }

    fun nextToken(): Token {
        while (currChar.isWhitespace()) {
            nextChar()
        }

        when {
            currChar == '(' -> {
                nextChar()
                currToken = Token.LEFT_BRACKET
            }

            currChar == ')' -> {
                nextChar()
                currToken = Token.RIGHT_BRACKET
            }

            currChar == ';' -> {
                nextChar()
                currToken = Token.SEMICOLON
            }

            currChar == ',' -> {
                nextChar()
                currToken = Token.COMMA
            }

            currChar == ':' -> {
                nextChar()
                currToken = Token.COLON
            }

            currChar.isLetter() -> {
                lastWord = nextWord()

                currToken = when (lastWord) {
                    "procedure" -> Token.PROCEDURE
                    "function" -> Token.FUNCTION
                    else -> Token.NAME
                }
            }

            currChar == NULL_CHAR -> {
                currToken = Token.END
            }

            else -> {
                throw ParserException("Unknown character $currChar at position $currPos")
            }
        }

        return currToken
    }

    private fun nextWord(): String {
        val currToken = StringBuilder()
            .append(currChar)

        while (currChar.isLetterOrDigit()) {
            nextChar()

            if (currChar == NULL_CHAR) {
                break
            }

            if (currChar.isLetterOrDigit()) {
                currToken.append(currChar)
            } else {
                break
            }
        }

        return currToken.toString()
    }

    private fun nextChar() {
        currPos++
        val byte = input.read()
        currChar = if (byte == -1) {
            NULL_CHAR
        } else {
            byte.toChar()
        }
    }

    companion object {
        private const val NULL_CHAR = '\u0000'
    }
}