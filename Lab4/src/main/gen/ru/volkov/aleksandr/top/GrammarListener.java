// Generated from C:/study/TranslationMethods/Lab4/src/main/antlr\Grammar.g4 by ANTLR 4.7
package ru.volkov.aleksandr.top;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#gram}.
	 * @param ctx the parse tree
	 */
	void enterGram(GrammarParser.GramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#gram}.
	 * @param ctx the parse tree
	 */
	void exitGram(GrammarParser.GramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#begin}.
	 * @param ctx the parse tree
	 */
	void enterBegin(GrammarParser.BeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#begin}.
	 * @param ctx the parse tree
	 */
	void exitBegin(GrammarParser.BeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#pack}.
	 * @param ctx the parse tree
	 */
	void enterPack(GrammarParser.PackContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#pack}.
	 * @param ctx the parse tree
	 */
	void exitPack(GrammarParser.PackContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#gramRule}.
	 * @param ctx the parse tree
	 */
	void enterGramRule(GrammarParser.GramRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#gramRule}.
	 * @param ctx the parse tree
	 */
	void exitGramRule(GrammarParser.GramRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#parsingRule}.
	 * @param ctx the parse tree
	 */
	void enterParsingRule(GrammarParser.ParsingRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#parsingRule}.
	 * @param ctx the parse tree
	 */
	void exitParsingRule(GrammarParser.ParsingRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#inAttrs}.
	 * @param ctx the parse tree
	 */
	void enterInAttrs(GrammarParser.InAttrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#inAttrs}.
	 * @param ctx the parse tree
	 */
	void exitInAttrs(GrammarParser.InAttrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#outAttr}.
	 * @param ctx the parse tree
	 */
	void enterOutAttr(GrammarParser.OutAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#outAttr}.
	 * @param ctx the parse tree
	 */
	void exitOutAttr(GrammarParser.OutAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(GrammarParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(GrammarParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#paramType}.
	 * @param ctx the parse tree
	 */
	void enterParamType(GrammarParser.ParamTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#paramType}.
	 * @param ctx the parse tree
	 */
	void exitParamType(GrammarParser.ParamTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#paramName}.
	 * @param ctx the parse tree
	 */
	void enterParamName(GrammarParser.ParamNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#paramName}.
	 * @param ctx the parse tree
	 */
	void exitParamName(GrammarParser.ParamNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#prods}.
	 * @param ctx the parse tree
	 */
	void enterProds(GrammarParser.ProdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#prods}.
	 * @param ctx the parse tree
	 */
	void exitProds(GrammarParser.ProdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#prod}.
	 * @param ctx the parse tree
	 */
	void enterProd(GrammarParser.ProdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#prod}.
	 * @param ctx the parse tree
	 */
	void exitProd(GrammarParser.ProdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(GrammarParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(GrammarParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(GrammarParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(GrammarParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lexerRule}.
	 * @param ctx the parse tree
	 */
	void enterLexerRule(GrammarParser.LexerRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lexerRule}.
	 * @param ctx the parse tree
	 */
	void exitLexerRule(GrammarParser.LexerRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(GrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(GrammarParser.TermContext ctx);
}