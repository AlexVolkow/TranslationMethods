package ru.volkov.aleksandr.top.analyzer.lexer

import ru.volkov.aleksandr.top.analyzer.EOF
import ru.volkov.aleksandr.top.GrammarBaseListener
import ru.volkov.aleksandr.top.GrammarParser

class LexerAnalyzer: GrammarBaseListener(), ILexerAnalyzer {
    private var tokenCount = 0
    private val patterns = HashMap<Int, Regex>()
    private val skipTokens = HashSet<Int>()
    private val tokenTable = LinkedHashMap<String, Int>()

    override fun lexerContext(): LexerContext =
        LexerContext(patterns, skipTokens, tokenTable = tokenTable)

    override fun exitGram(ctx: GrammarParser.GramContext?) {
        tokenTable[EOF] = -1
    }

    override fun exitLexerRule(ctx: GrammarParser.LexerRuleContext) {
        val token = ctx.LEXER_IDN().text
        val tokenId = tokenTable.getOrPut(token) { tokenCount++ }

        val right = ctx.term()
        patterns[tokenId] = Regex(right.REGEX().text.trim('\"'))

        val isSkipRule = ctx.children[1].text == "skip"
        if (isSkipRule) {
            skipTokens.add(tokenId)
        }
    }
}