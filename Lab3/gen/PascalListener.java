// Generated from C:/study/TranslationMethods/Lab3/src/main/antlr\Pascal.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PascalParser}.
 */
public interface PascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PascalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PascalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PascalParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(PascalParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(PascalParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(PascalParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(PascalParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#const_block}.
	 * @param ctx the parse tree
	 */
	void enterConst_block(PascalParser.Const_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#const_block}.
	 * @param ctx the parse tree
	 */
	void exitConst_block(PascalParser.Const_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#const_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConst_declaration(PascalParser.Const_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#const_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConst_declaration(PascalParser.Const_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#var_block}.
	 * @param ctx the parse tree
	 */
	void enterVar_block(PascalParser.Var_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#var_block}.
	 * @param ctx the parse tree
	 */
	void exitVar_block(PascalParser.Var_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaration(PascalParser.Var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaration(PascalParser.Var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#main_part}.
	 * @param ctx the parse tree
	 */
	void enterMain_part(PascalParser.Main_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#main_part}.
	 * @param ctx the parse tree
	 */
	void exitMain_part(PascalParser.Main_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(PascalParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(PascalParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#if_cond}.
	 * @param ctx the parse tree
	 */
	void enterIf_cond(PascalParser.If_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#if_cond}.
	 * @param ctx the parse tree
	 */
	void exitIf_cond(PascalParser.If_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(PascalParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(PascalParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(PascalParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(PascalParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#math_value}.
	 * @param ctx the parse tree
	 */
	void enterMath_value(PascalParser.Math_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#math_value}.
	 * @param ctx the parse tree
	 */
	void exitMath_value(PascalParser.Math_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#math}.
	 * @param ctx the parse tree
	 */
	void enterMath(PascalParser.MathContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#math}.
	 * @param ctx the parse tree
	 */
	void exitMath(PascalParser.MathContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#math_statement}.
	 * @param ctx the parse tree
	 */
	void enterMath_statement(PascalParser.Math_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#math_statement}.
	 * @param ctx the parse tree
	 */
	void exitMath_statement(PascalParser.Math_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PascalParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PascalParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#func_parameter}.
	 * @param ctx the parse tree
	 */
	void enterFunc_parameter(PascalParser.Func_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#func_parameter}.
	 * @param ctx the parse tree
	 */
	void exitFunc_parameter(PascalParser.Func_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(PascalParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(PascalParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#const_val}.
	 * @param ctx the parse tree
	 */
	void enterConst_val(PascalParser.Const_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#const_val}.
	 * @param ctx the parse tree
	 */
	void exitConst_val(PascalParser.Const_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PascalParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PascalParser.BlockContext ctx);
}