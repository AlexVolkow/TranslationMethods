package ru.volkov.aleksandr.top.analyzer.parser

data class ParserContext(
    val packageName: String?,
    val start: String,
    val rules: Map<String, Rule>,
    val withEps: Boolean
) {
    val nonTerms: Set<String> = rules.keys
}