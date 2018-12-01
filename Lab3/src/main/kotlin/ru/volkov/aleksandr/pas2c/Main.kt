package ru.volkov.aleksandr.pas2c

import PascalLexer
import PascalParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.PrintWriter


fun main(args: Array<String>) {
    args.forEach {
        val input = CharStreams.fromFileName(it)
        val pascalLexer = PascalLexer(input)
        val tokens = CommonTokenStream(pascalLexer)
        val pascalParser = PascalParser(tokens)
        val writer = PrintWriter("$it.c", "UTF-8")

        val programm = pascalParser.program()
        val p2c = Pas2C()
        val toC = p2c.visitProgram(programm)

        writer.print(toC)
        writer.close()
    }
}