package ru.volkov.aleksandr.top.generator

abstract class AbstractGenerator: IGrammarGenerator {
    protected var indent = 0

    protected fun StringBuilder.line(line: String) {
        append(" " .repeat(4 * indent))
        append(line)
        newLine()
    }

    protected fun StringBuilder.newLine() {
        append(System.lineSeparator())
    }

    protected inline fun scope(block: () -> Unit) {
        indent++
        block()
        indent--
    }

    protected fun StringBuilder.removeLast() {
        var i = length - 1
        while (this[i].isWhitespace() && i >= 0) {
            i--
        }
        if (i >= 0) deleteCharAt(i)
    }

    abstract override fun generate(grammarName: String): String
}