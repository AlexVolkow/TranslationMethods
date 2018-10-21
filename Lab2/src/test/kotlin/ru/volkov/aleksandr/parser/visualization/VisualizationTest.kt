package ru.volkov.aleksandr.parser.visualization

import ru.volkov.aleksandr.parser.parser.Parser

fun main(args: Array<String>){
    val test = "function sum(arg1, arg2:integer; d2: real): real"
    val parser = Parser()
    val tree = parser.parse(test.byteInputStream())

    tree.print()
}