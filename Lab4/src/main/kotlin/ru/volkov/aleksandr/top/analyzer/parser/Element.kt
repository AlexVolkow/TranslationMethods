package ru.volkov.aleksandr.top.analyzer.parser

import ru.volkov.aleksandr.top.analyzer.EPS

sealed class Element {
    abstract val name: String

    data class Term(override val name: String) : Element()
    data class NonTerm(override val name: String, val attrs: List<String>?) : Element()
    data class Code(val code: String, override val name: String = "code") : Element()

    fun isEps(): Boolean = this is Term && this.name == EPS
}
