package ru.volkov.aleksandr.top

const val EPS = "EPS"
const val EOF = "EOF"

data class Rule(
    val name: String,
    var productions: List<Production> = ArrayList(),
    var returnType: String? = null,
    var args: List<Pair<String, String>>? = null
)

data class Production(val prods: List<ProdElem>, val native: List<ExtendedElem>) : List<ProdElem> by prods

sealed class ProdElem {
    abstract val name: String

    data class Term(override val name: String) : ProdElem()
    data class NonTerm(override val name: String, val callAttrs: List<String>?) : ProdElem()
}

sealed class ExtendedElem {
    data class Casual(val elem: ProdElem) : ExtendedElem()
    data class Code(val code: String) : ExtendedElem()
}