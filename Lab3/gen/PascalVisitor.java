// Generated from C:/study/TranslationMethods/Lab3/src/main/antlr\Pascal.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PascalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PascalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PascalParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PascalParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(PascalParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(PascalParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#const_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_block(PascalParser.Const_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#const_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_declaration(PascalParser.Const_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#var_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_block(PascalParser.Var_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declaration(PascalParser.Var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#main_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_part(PascalParser.Main_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(PascalParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#if_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_cond(PascalParser.If_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(PascalParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(PascalParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#math_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_value(PascalParser.Math_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath(PascalParser.MathContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#math_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_statement(PascalParser.Math_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(PascalParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#func_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_parameter(PascalParser.Func_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(PascalParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#const_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_val(PascalParser.Const_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PascalParser.BlockContext ctx);
}