// Generated from C:/study/TranslationMethods/Lab3/src/main/antlr\Pascal.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, WS=7, VAR=8, CONST=9, 
		PROGRAM=10, BEGIN=11, END=12, INTEGER=13, ASSIGNMENT=14, EQUAL_SIGN=15, 
		DOT=16, COMMA=17, COLON=18, SEMICOLON=19, ARG=20, IDENT=21, INT=22;
	public static final int
		RULE_program = 0, RULE_description = 1, RULE_declaration = 2, RULE_const_block = 3, 
		RULE_const_declaration = 4, RULE_var_block = 5, RULE_var_declaration = 6, 
		RULE_main_part = 7, RULE_code = 8, RULE_math_value = 9, RULE_math = 10, 
		RULE_math_statement = 11, RULE_assignment = 12, RULE_func_parameter = 13, 
		RULE_function = 14, RULE_const_val = 15, RULE_block = 16;
	public static final String[] ruleNames = {
		"program", "description", "declaration", "const_block", "const_declaration", 
		"var_block", "var_declaration", "main_part", "code", "math_value", "math", 
		"math_statement", "assignment", "func_parameter", "function", "const_val", 
		"block"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'('", "')'", null, "'var'", "'const'", 
		"'program'", "'begin'", "'end'", "'integer'", "':='", "'='", "'.'", "','", 
		"':'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "WS", "VAR", "CONST", "PROGRAM", 
		"BEGIN", "END", "INTEGER", "ASSIGNMENT", "EQUAL_SIGN", "DOT", "COMMA", 
		"COLON", "SEMICOLON", "ARG", "IDENT", "INT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Pascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Main_partContext main_part() {
			return getRuleContext(Main_partContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROGRAM) {
				{
				setState(34);
				description();
				}
			}

			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(37);
				declaration();
				}
				break;
			}
			setState(40);
			main_part();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescriptionContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(PascalParser.PROGRAM, 0); }
		public TerminalNode IDENT() { return getToken(PascalParser.IDENT, 0); }
		public TerminalNode SEMICOLON() { return getToken(PascalParser.SEMICOLON, 0); }
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(PROGRAM);
			setState(43);
			match(IDENT);
			setState(44);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public Const_blockContext const_block() {
			return getRuleContext(Const_blockContext.class,0);
		}
		public Var_blockContext var_block() {
			return getRuleContext(Var_blockContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(46);
				const_block();
				}
			}

			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(49);
				var_block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Const_blockContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(PascalParser.CONST, 0); }
		public List<Const_declarationContext> const_declaration() {
			return getRuleContexts(Const_declarationContext.class);
		}
		public Const_declarationContext const_declaration(int i) {
			return getRuleContext(Const_declarationContext.class,i);
		}
		public Const_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterConst_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitConst_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitConst_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_blockContext const_block() throws RecognitionException {
		Const_blockContext _localctx = new Const_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_const_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(CONST);
			setState(54); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				const_declaration();
				}
				}
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Const_declarationContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(PascalParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public TerminalNode INTEGER() { return getToken(PascalParser.INTEGER, 0); }
		public TerminalNode EQUAL_SIGN() { return getToken(PascalParser.EQUAL_SIGN, 0); }
		public TerminalNode INT() { return getToken(PascalParser.INT, 0); }
		public TerminalNode SEMICOLON() { return getToken(PascalParser.SEMICOLON, 0); }
		public Const_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterConst_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitConst_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitConst_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_declarationContext const_declaration() throws RecognitionException {
		Const_declarationContext _localctx = new Const_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_const_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(IDENT);
			setState(59);
			match(COLON);
			setState(60);
			match(INTEGER);
			setState(61);
			match(EQUAL_SIGN);
			setState(62);
			match(INT);
			setState(63);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_blockContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(PascalParser.VAR, 0); }
		public List<Var_declarationContext> var_declaration() {
			return getRuleContexts(Var_declarationContext.class);
		}
		public Var_declarationContext var_declaration(int i) {
			return getRuleContext(Var_declarationContext.class,i);
		}
		public Var_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterVar_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitVar_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitVar_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_blockContext var_block() throws RecognitionException {
		Var_blockContext _localctx = new Var_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(VAR);
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				var_declaration();
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(PascalParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(PascalParser.IDENT, i);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public TerminalNode INTEGER() { return getToken(PascalParser.INTEGER, 0); }
		public TerminalNode SEMICOLON() { return getToken(PascalParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public Var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterVar_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitVar_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitVar_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(IDENT);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(72);
				match(COMMA);
				setState(73);
				match(IDENT);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(COLON);
			setState(80);
			match(INTEGER);
			setState(81);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_partContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(PascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(PascalParser.END, 0); }
		public TerminalNode DOT() { return getToken(PascalParser.DOT, 0); }
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public Main_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterMain_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitMain_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitMain_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_partContext main_part() throws RecognitionException {
		Main_partContext _localctx = new Main_partContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_main_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(BEGIN);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN) | (1L << IDENT) | (1L << INT))) != 0)) {
				{
				{
				setState(84);
				code();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(END);
			setState(91);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeContext extends ParserRuleContext {
		public Math_statementContext math_statement() {
			return getRuleContext(Math_statementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_code);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				math_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				function();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_valueContext extends ParserRuleContext {
		public Const_valContext const_val() {
			return getRuleContext(Const_valContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(PascalParser.IDENT, 0); }
		public Math_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterMath_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitMath_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitMath_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_valueContext math_value() throws RecognitionException {
		Math_valueContext _localctx = new Math_valueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_math_value);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				const_val();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathContext extends ParserRuleContext {
		public Math_valueContext math_value() {
			return getRuleContext(Math_valueContext.class,0);
		}
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public MathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitMath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitMath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathContext math() throws RecognitionException {
		MathContext _localctx = new MathContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_math);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				math_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				math_value();
				setState(105);
				match(T__0);
				setState(106);
				math();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				math_value();
				setState(109);
				match(T__1);
				setState(110);
				math();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				math_value();
				setState(113);
				match(T__2);
				setState(114);
				math();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				math_value();
				setState(117);
				match(T__3);
				setState(118);
				math();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_statementContext extends ParserRuleContext {
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public Math_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterMath_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitMath_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitMath_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_statementContext math_statement() throws RecognitionException {
		Math_statementContext _localctx = new Math_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_math_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			math();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(PascalParser.IDENT, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(PascalParser.ASSIGNMENT, 0); }
		public Math_statementContext math_statement() {
			return getRuleContext(Math_statementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PascalParser.SEMICOLON, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(IDENT);
			setState(125);
			match(ASSIGNMENT);
			setState(126);
			math_statement();
			setState(127);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_parameterContext extends ParserRuleContext {
		public TerminalNode ARG() { return getToken(PascalParser.ARG, 0); }
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public Func_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterFunc_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitFunc_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitFunc_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_parameterContext func_parameter() throws RecognitionException {
		Func_parameterContext _localctx = new Func_parameterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_func_parameter);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARG:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(ARG);
				}
				break;
			case IDENT:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				math();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(PascalParser.IDENT, 0); }
		public TerminalNode SEMICOLON() { return getToken(PascalParser.SEMICOLON, 0); }
		public List<Func_parameterContext> func_parameter() {
			return getRuleContexts(Func_parameterContext.class);
		}
		public Func_parameterContext func_parameter(int i) {
			return getRuleContext(Func_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(IDENT);
			setState(134);
			match(T__4);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARG) | (1L << IDENT) | (1L << INT))) != 0)) {
				{
				{
				setState(135);
				func_parameter();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(141);
				match(COMMA);
				setState(142);
				func_parameter();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			match(T__5);
			setState(149);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Const_valContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PascalParser.INT, 0); }
		public Const_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterConst_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitConst_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitConst_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_valContext const_val() throws RecognitionException {
		Const_valContext _localctx = new Const_valContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_const_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(PascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(PascalParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(PascalParser.SEMICOLON, 0); }
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(BEGIN);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN) | (1L << IDENT) | (1L << INT))) != 0)) {
				{
				{
				setState(154);
				code();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(END);
			setState(161);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\u00a6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\5\2&\n\2\3\2\5\2)\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\5\4\62\n\4\3\4"+
		"\5\4\65\n\4\3\5\3\5\6\59\n\5\r\5\16\5:\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\6\7F\n\7\r\7\16\7G\3\b\3\b\3\b\7\bM\n\b\f\b\16\bP\13\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\7\tX\n\t\f\t\16\t[\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n"+
		"d\n\n\3\13\3\13\5\13h\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f{\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\5\17\u0086\n\17\3\20\3\20\3\20\7\20\u008b\n\20\f\20\16\20\u008e"+
		"\13\20\3\20\3\20\7\20\u0092\n\20\f\20\16\20\u0095\13\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\7\22\u009e\n\22\f\22\16\22\u00a1\13\22\3\22\3\22"+
		"\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\2\2\u00a8"+
		"\2%\3\2\2\2\4,\3\2\2\2\6\61\3\2\2\2\b\66\3\2\2\2\n<\3\2\2\2\fC\3\2\2\2"+
		"\16I\3\2\2\2\20U\3\2\2\2\22c\3\2\2\2\24g\3\2\2\2\26z\3\2\2\2\30|\3\2\2"+
		"\2\32~\3\2\2\2\34\u0085\3\2\2\2\36\u0087\3\2\2\2 \u0099\3\2\2\2\"\u009b"+
		"\3\2\2\2$&\5\4\3\2%$\3\2\2\2%&\3\2\2\2&(\3\2\2\2\')\5\6\4\2(\'\3\2\2\2"+
		"()\3\2\2\2)*\3\2\2\2*+\5\20\t\2+\3\3\2\2\2,-\7\f\2\2-.\7\27\2\2./\7\25"+
		"\2\2/\5\3\2\2\2\60\62\5\b\5\2\61\60\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2"+
		"\2\63\65\5\f\7\2\64\63\3\2\2\2\64\65\3\2\2\2\65\7\3\2\2\2\668\7\13\2\2"+
		"\679\5\n\6\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\t\3\2\2\2<=\7"+
		"\27\2\2=>\7\24\2\2>?\7\17\2\2?@\7\21\2\2@A\7\30\2\2AB\7\25\2\2B\13\3\2"+
		"\2\2CE\7\n\2\2DF\5\16\b\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\r\3"+
		"\2\2\2IN\7\27\2\2JK\7\23\2\2KM\7\27\2\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2\2"+
		"NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7\24\2\2RS\7\17\2\2ST\7\25\2\2T\17\3"+
		"\2\2\2UY\7\r\2\2VX\5\22\n\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\"+
		"\3\2\2\2[Y\3\2\2\2\\]\7\16\2\2]^\7\22\2\2^\21\3\2\2\2_d\5\30\r\2`d\5\32"+
		"\16\2ad\5\36\20\2bd\5\"\22\2c_\3\2\2\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2d"+
		"\23\3\2\2\2eh\5 \21\2fh\7\27\2\2ge\3\2\2\2gf\3\2\2\2h\25\3\2\2\2i{\5\24"+
		"\13\2jk\5\24\13\2kl\7\3\2\2lm\5\26\f\2m{\3\2\2\2no\5\24\13\2op\7\4\2\2"+
		"pq\5\26\f\2q{\3\2\2\2rs\5\24\13\2st\7\5\2\2tu\5\26\f\2u{\3\2\2\2vw\5\24"+
		"\13\2wx\7\6\2\2xy\5\26\f\2y{\3\2\2\2zi\3\2\2\2zj\3\2\2\2zn\3\2\2\2zr\3"+
		"\2\2\2zv\3\2\2\2{\27\3\2\2\2|}\5\26\f\2}\31\3\2\2\2~\177\7\27\2\2\177"+
		"\u0080\7\20\2\2\u0080\u0081\5\30\r\2\u0081\u0082\7\25\2\2\u0082\33\3\2"+
		"\2\2\u0083\u0086\7\26\2\2\u0084\u0086\5\26\f\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0084\3\2\2\2\u0086\35\3\2\2\2\u0087\u0088\7\27\2\2\u0088\u008c\7\7\2"+
		"\2\u0089\u008b\5\34\17\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0093\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008f\u0090\7\23\2\2\u0090\u0092\5\34\17\2\u0091\u008f\3\2\2\2\u0092"+
		"\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7\b\2\2\u0097\u0098\7\25\2\2\u0098"+
		"\37\3\2\2\2\u0099\u009a\7\30\2\2\u009a!\3\2\2\2\u009b\u009f\7\r\2\2\u009c"+
		"\u009e\5\22\n\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3"+
		"\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00a3\7\16\2\2\u00a3\u00a4\7\25\2\2\u00a4#\3\2\2\2\21%(\61\64:GNYcgz"+
		"\u0085\u008c\u0093\u009f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}