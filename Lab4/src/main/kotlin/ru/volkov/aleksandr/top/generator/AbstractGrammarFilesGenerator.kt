package ru.volkov.aleksandr.top.generator

abstract class AbstractGrammarFilesGenerator {
    protected var indent = 0

    protected fun StringBuilder.line(line: String) {
        for (i in 0 until (4 * indent)) append(" ")
        append(line)
        newLine()
    }

    protected fun StringBuilder.newLine() {
        append(System.lineSeparator())
    }

    protected inline fun scoped(block: () -> Unit) {
        indent++
        block()
        indent--
    }

    protected fun StringBuilder.removeLast() {
        var i = length - 1
        while (this[i].isWhitespace() && i >= 0) i--
        if (i >= 0) deleteCharAt(i)
    }

    abstract fun generate(grammarName: String): String
}