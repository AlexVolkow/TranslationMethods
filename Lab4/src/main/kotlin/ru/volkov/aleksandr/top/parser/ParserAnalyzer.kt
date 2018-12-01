package ru.volkov.aleksandr.top.parser

import ru.volkov.aleksandr.top.GrammarBaseListener
import ru.volkov.aleksandr.top.GrammarParser
import ru.volkov.aleksandr.top.Rule

class ParserAnalyzer : GrammarBaseListener(), IParserAnalyzer {
    private var packageName: String? = null
    private var start: String = "main"
    private val rules = LinkedHashMap<String, Rule>()


    override fun parserContext(): ParserContext = ParserContext(packageName, start, rules)

    override fun exitBegin(ctx: GrammarParser.BeginContext) {
        start = ctx.PARSER_IDN().text
    }

    override fun exitPack(ctx: GrammarParser.PackContext) {
        packageName = ctx.text.removePrefix("package")
    }

    override fun exitParsingRule(ctx: GrammarParser.ParsingRuleContext?) {
        super.exitParsingRule(ctx)
    }
}