package ru.volkov.aleksandr.top.analyzer.parser.runtime

class ParserException(message: String): Exception(message) {
    constructor(position: Int, actual: Int, vararg expected: Int): this(
        "Unexpected token $actual at position $position, expected tokens: ${expected.joinToString(",")}")
}