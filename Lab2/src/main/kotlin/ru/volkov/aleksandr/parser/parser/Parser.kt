package ru.volkov.aleksandr.parser.parser

import ru.volkov.aleksandr.parser.exception.ParserException
import ru.volkov.aleksandr.parser.lexer.LexicalAnalyzer
import ru.volkov.aleksandr.parser.lexer.Token
import java.io.InputStream

class Parser {
    private lateinit var lexer: LexicalAnalyzer

    fun parse(inputStream: InputStream): Tree {
        lexer = LexicalAnalyzer(inputStream)
        lexer.nextToken()
        return S()
    }

    private fun S(): Tree {
        val isFun: Boolean
        val ftype = if (lexer.currToken == Token.FUNCTION) {
            isFun = true
            FUN()
        } else {
            isFun = false
            PROC()
        }

        lexer.nextToken()
        val name = NAME()
        lexer.nextToken()

        var args: Tree? = null
        if (lexer.currToken == Token.LEFT_BRACKET) {
            lexer.nextToken()
            args = ARGS()
            lexer.nextToken()
        }

        return if (isFun) {
            val rettype = RETTYPE()
            if (args == null) {
                Tree("S", ftype, name, rettype)
            } else {
                Tree("S", ftype, name, Tree("("), args, Tree(")"), rettype)
            }
        } else {
            if (args == null) {
                Tree("S", ftype, name)
            } else {
                Tree("S", ftype, name, Tree("("), args, Tree(")"))
            }
        }
    }

    private fun FUN(): Tree {
        return when (lexer.currToken) {
            Token.FUNCTION -> Tree("FUN", Tree("function"))
            else -> failWith("'function' or 'procedure'")
        }
    }

    private fun PROC(): Tree {
        return when (lexer.currToken) {
            Token.PROCEDURE -> Tree("FUN", Tree("procedure"))
            else -> failWith("'function' or 'procedure'")
        }
    }

    private fun NAME(): Tree {
        return when (lexer.currToken) {
            Token.NAME -> Tree("NAME", Tree(lexer.lastWord!!))
            else -> failWith("name of argument or type")
        }
    }

    private fun RETTYPE(): Tree {
        return when (lexer.currToken) {
            Token.END -> Tree("RETTYPE", EPS)
            Token.COLON -> {
                lexer.nextToken()
                Tree("RETTYPE", COLON_TREE, NAME())
            }
            else -> failWith("return type")
        }
    }

    private fun ARGS(): Tree {
        return when (lexer.currToken) {
            Token.RIGHT_BRACKET -> Tree("ARGS", Tree(""))
            Token.NAME -> {
                val arglist = ARGLIST()
                lexer.nextToken()
                val name = NAME()
                lexer.nextToken()
                val argsplit = ARGSPLIT()

                Tree("ARGS", arglist, COLON_TREE, name, argsplit)
            }
            else -> failWith("declaration of arguments")
        }
    }

    private fun ARGLIST(): Tree {
        return when (lexer.currToken) {
            Token.NAME -> {
                val name = NAME()
                if (lexer.nextToken() == Token.COMMA) {
                    val arglistAdd = ARGLIST_NEXT()
                    Tree("ARGLIST", name, arglistAdd)
                } else {
                    Tree("ARGLIST", name)
                }
            }
            else -> failWith("names of arguments")
        }
    }

    private fun ARGLIST_NEXT(): Tree {
        return when (lexer.currToken) {
            Token.COLON -> Tree("ARGSLIST_NEXT", EPS)

            Token.COMMA -> {
                lexer.nextToken()
                val name = NAME()
                if (lexer.nextToken() == Token.COMMA) {
                    Tree("ARGSLIST_NEXT", COMMA_TREE, name, ARGLIST_NEXT())
                } else {
                    Tree("ARGSLIST_NEXT", COMMA_TREE, name)
                }
            }

            else -> failWith("names of arguments")
        }
    }

    private fun ARGSPLIT(): Tree {
        return when (lexer.currToken) {
            Token.RIGHT_BRACKET -> Tree("ARGSPLIT", EPS)

            Token.SEMICOLON -> {
                lexer.nextToken()

                Tree("ARGSPLIT", SEMICOLON_TREE, ARGS())
            }

            else -> failWith("argument separator")
        }
    }

    private fun failWith(expected: String): Nothing {
        throw ParserException("Expected $expected at position ${lexer.currPos}, but found ${lexer.currToken}")
    }

    private fun checkToken(token: Token) {
        if (lexer.currToken != token) {
            failWith(token.name)
        }
    }

    companion object {
        private val COLON_TREE = Tree(":")
        private val SEMICOLON_TREE = Tree(";")
        private val COMMA_TREE = Tree(",")
        private val EPS = Tree("")
    }
}