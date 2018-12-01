package ru.volkov.aleksandr.pas2c

import PascalBaseVisitor
import PascalParser
import java.lang.IllegalArgumentException

class Pas2C : PascalBaseVisitor<String>() {
    override fun visitProgram(ctx: PascalParser.ProgramContext?) = buildString {
        addAlign(HEADER)
        if (ctx?.declaration() != null)
            addAlign(visitDeclaration(ctx.declaration()))
        addAlign(visitMain_part(ctx?.main_part()))
    }

    override fun visitDescription(ctx: PascalParser.DescriptionContext?): String = ""

    override fun visitDeclaration(ctx: PascalParser.DeclarationContext?) = buildString {
        if (ctx!!.const_block() != null)
            append(visitConst_block(ctx.const_block()))
        if (ctx.var_block() != null)
            append(visitVar_block(ctx.var_block()))
    }

    override fun visitConst_block(ctx: PascalParser.Const_blockContext?) = buildString {
        ctx!!.const_declaration().forEach {
            addAlign(visitConst_declaration(it))
        }
    }

    override fun visitConst_declaration(ctx: PascalParser.Const_declarationContext?): String {
        return "const int ${ctx!!.IDENT()} = ${ctx.INT()};"
    }

    override fun visitVar_block(ctx: PascalParser.Var_blockContext?) = buildString {
        ctx!!.var_declaration().forEach {
            addAlign(visitVar_declaration(it))
        }
    }

    override fun visitVar_declaration(ctx: PascalParser.Var_declarationContext?): String {
        val vars = ctx!!.IDENT()
            .map { it.text }
            .joinToString(", ")
        return "int $vars;"
    }

    override fun visitMain_part(ctx: PascalParser.Main_partContext?) = buildString {
        addAlign("int main() {")
        newScope {
            ctx?.code()?.forEach {
                addAlign(visitCode(it))
            }
            addAlign("return 0;")
        }
        addAlign("}")
    }

    override fun visitCode(ctx: PascalParser.CodeContext?): String {
        if (ctx == null) {
            return ""
        }
        return when {
            ctx.math_statement() != null -> visitMath_statement(ctx.math_statement())
            ctx.assignment() != null -> visitAssignment(ctx.assignment())
            ctx.function() != null -> visitFunction(ctx.function())
            ctx.if_cond() != null -> visitIf_cond(ctx.if_cond())
            else -> visitBlock(ctx.block())
        }
    }


    override fun visitMath_value(ctx: PascalParser.Math_valueContext?): String {
        return if (ctx!!.IDENT() != null)
            ctx.IDENT().text
        else
            visitConst_val(ctx.const_val())
    }

    override fun visitMath(ctx: PascalParser.MathContext?): String {
        val str = StringBuilder(visitMath_value(ctx!!.math_value()))
        if (ctx.children.size > 1) {
            str.append(" ")
                .append(ctx.children[1].text)
                .append(" ")
                .append(visitMath(ctx.math()))
        }
        return str.toString()
    }

    override fun visitMath_statement(ctx: PascalParser.Math_statementContext?): String {
        return visitMath(ctx!!.math())
    }

    override fun visitAssignment(ctx: PascalParser.AssignmentContext?): String {
        return ctx!!.IDENT().text + " = " + visitMath_statement(ctx.math_statement()) + ";"
    }

    override fun visitFunc_parameter(ctx: PascalParser.Func_parameterContext?): String {
        return if (ctx!!.ARG() != null) {
            ctx.ARG().symbol.text.replace("'", "\"")
        } else {
            visitMath(ctx.math())
        }
    }

    override fun visitFunction(ctx: PascalParser.FunctionContext?): String {
        val name = ctx!!.IDENT().text
        if (name == "write" || name == "writeln") {
            val returnValue = StringBuilder("printf(\"")

            val parameterListStr = StringBuilder()
            ctx
                .func_parameter()
                .map { visitFunc_parameter(it) }
                .forEach {
                    if (it.first() == '\'') {
                        returnValue.append("%s")
                    } else {
                        returnValue.append("%d")
                    }
                    parameterListStr.append(", $it")
                }

            returnValue.append(if (name.contains("writeln")) "\\n\"" else "\"")
            return "$returnValue$parameterListStr);"
        } else if (name == "read" || name == "readln") {
            val returnValue = StringBuilder("scanf(\"")

            val parameterListStr = StringBuilder()
            ctx
                .func_parameter()
                .map { visitFunc_parameter(it) }
                .forEach {
                    if (it.first() == '\'') {
                        returnValue.append("%s")
                    } else {
                        returnValue.append("%d")
                    }
                    parameterListStr.append(", &$it")
                }

            return "$returnValue\"$parameterListStr);"
        } else {
            val parameterListStr = ctx
                .func_parameter()
                .map { visitFunc_parameter(it) }
                .joinToString(",")

            return "$name($parameterListStr);"
        }
    }

    override fun visitConst_val(ctx: PascalParser.Const_valContext?): String {
        if (ctx == null) {
            return ""
        }
        return ctx.INT().text
    }

    override fun visitBlock(ctx: PascalParser.BlockContext?) = buildString {
        if (ctx == null) {
            return ""
        }
        append(" {\n")
        newScope {
            ctx.code().forEach {
                addAlign(visitCode(it))
            }
        }
        addAlign("}")
    }

    override fun visitIf_cond(ctx: PascalParser.If_condContext?) = buildString {
        if (ctx == null) {
            return ""
        }
        val cond = visitCond(ctx.cond()!!)
        append("if ($cond)")
        append(visitBlock(ctx.block(0)).trimMargin())
        if (ctx.ELSE() != null) {
            append(" else")
            append(visitBlock(ctx.block(1)).trimMargin())
        }
    }

    override fun visitCond(ctx: PascalParser.CondContext?): String {
        if (ctx == null) {
            return ""
        }
        return ctx.IDENT(0).symbol.text + " ${visitSign(ctx.sign())} " + ctx.IDENT(1).symbol.text
    }

    override fun visitSign(ctx: PascalParser.SignContext?): String {
        return when (ctx!!.children[0].text) {
            "<" -> "<"
            ">" -> ">"
            "<=" -> "<="
            ">=" -> ">="
            "<>" -> "!="
            "=" -> "=="

            else -> throw IllegalArgumentException(ctx.children[0].text)
        }
    }

    var indent = 0

    private fun StringBuilder.addAlign(a: String) {
        if (a.isEmpty()) {
            return
        }
        for (i in 0 until (4 * indent)) append(" ")
        append(a)
        append(System.lineSeparator())
    }

    private fun newScope(block: () -> Unit) {
        indent++
        block()
        indent--
    }

    companion object {
        private const val HEADER =
            "#include <stdlib.h>\n" +
                    "#include <stdio.h>\n" +
                    "#include <stdbool.h>\n"
    }
}