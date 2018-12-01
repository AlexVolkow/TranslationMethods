package ru.volkov.aleksandr.top.parser

import ru.volkov.aleksandr.top.Rule

data class ParserContext(
    val packageName: String?,
    val start: String,
    val rules: Map<String, Rule>
) {
    val nonTerms: Set<String> = rules.keys
}