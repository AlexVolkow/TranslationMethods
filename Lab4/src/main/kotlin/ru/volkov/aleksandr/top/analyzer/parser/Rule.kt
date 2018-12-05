package ru.volkov.aleksandr.top.analyzer.parser

data class Rule(
    val name: String,
    var productions: List<Production> = ArrayList(),
    var returnType: String? = null,
    var args: List<Arg>? = null
) {
    val argsWithTypes: String by lazy { args?.joinToString { (n, t) -> "$n: $t" }.orEmpty() }

    val argsWithoutTypes: String by lazy { args?.joinToString { (a, _) -> a }.orEmpty() }
}

data class Arg(val name: String, val type: String)

data class Production(
    val withoutCode: List<Element>,
    val prods: List<Element>
)