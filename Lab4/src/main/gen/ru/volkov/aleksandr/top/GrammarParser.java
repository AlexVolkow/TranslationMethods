// Generated from C:/study/TranslationMethods/Lab4/src/main/antlr\Grammar.g4 by ANTLR 4.7
package ru.volkov.aleksandr.top;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, PARSER_IDN=14, LEXER_IDN=15, REGEX=16, 
		CODE=17, PACKAGE_NAME=18, WS=19;
	public static final int
		RULE_gram = 0, RULE_begin = 1, RULE_pack = 2, RULE_gramRule = 3, RULE_parsingRule = 4, 
		RULE_inAttrs = 5, RULE_outAttr = 6, RULE_param = 7, RULE_paramType = 8, 
		RULE_paramName = 9, RULE_prods = 10, RULE_prod = 11, RULE_args = 12, RULE_arg = 13, 
		RULE_lexerRule = 14, RULE_term = 15;
	public static final String[] ruleNames = {
		"gram", "begin", "pack", "gramRule", "parsingRule", "inAttrs", "outAttr", 
		"param", "paramType", "paramName", "prods", "prod", "args", "arg", "lexerRule", 
		"term"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'start'", "'='", "'package'", "';'", "':'", "':='", "'|'", "'['", 
		"','", "']'", "'('", "')'", "'skip'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "PARSER_IDN", "LEXER_IDN", "REGEX", "CODE", "PACKAGE_NAME", 
		"WS"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public PackContext pack() {
			return getRuleContext(PackContext.class,0);
		}
		public BeginContext begin() {
			return getRuleContext(BeginContext.class,0);
		}
		public List<GramRuleContext> gramRule() {
			return getRuleContexts(GramRuleContext.class);
		}
		public GramRuleContext gramRule(int i) {
			return getRuleContext(GramRuleContext.class,i);
		}
		public GramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGram(this);
		}
	}

	public final GramContext gram() throws RecognitionException {
		GramContext _localctx = new GramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gram);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(32);
				pack();
				}
			}

			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(35);
				begin();
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(36);
					gramRule();
					}
					}
					setState(39); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARSER_IDN || _la==LEXER_IDN );
				}
			}

			setState(43);
			match(EOF);
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

	public static class BeginContext extends ParserRuleContext {
		public TerminalNode PARSER_IDN() { return getToken(GrammarParser.PARSER_IDN, 0); }
		public BeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBegin(this);
		}
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_begin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__0);
			setState(46);
			match(T__1);
			setState(47);
			match(PARSER_IDN);
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

	public static class PackContext extends ParserRuleContext {
		public TerminalNode PACKAGE_NAME() { return getToken(GrammarParser.PACKAGE_NAME, 0); }
		public PackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPack(this);
		}
	}

	public final PackContext pack() throws RecognitionException {
		PackContext _localctx = new PackContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pack);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__2);
			setState(50);
			match(PACKAGE_NAME);
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

	public static class GramRuleContext extends ParserRuleContext {
		public ParsingRuleContext parsingRule() {
			return getRuleContext(ParsingRuleContext.class,0);
		}
		public LexerRuleContext lexerRule() {
			return getRuleContext(LexerRuleContext.class,0);
		}
		public GramRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gramRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGramRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGramRule(this);
		}
	}

	public final GramRuleContext gramRule() throws RecognitionException {
		GramRuleContext _localctx = new GramRuleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_gramRule);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARSER_IDN:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				parsingRule();
				setState(53);
				match(T__3);
				}
				break;
			case LEXER_IDN:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				lexerRule();
				setState(56);
				match(T__3);
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

	public static class ParsingRuleContext extends ParserRuleContext {
		public TerminalNode PARSER_IDN() { return getToken(GrammarParser.PARSER_IDN, 0); }
		public List<ProdsContext> prods() {
			return getRuleContexts(ProdsContext.class);
		}
		public ProdsContext prods(int i) {
			return getRuleContext(ProdsContext.class,i);
		}
		public InAttrsContext inAttrs() {
			return getRuleContext(InAttrsContext.class,0);
		}
		public OutAttrContext outAttr() {
			return getRuleContext(OutAttrContext.class,0);
		}
		public ParsingRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parsingRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParsingRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParsingRule(this);
		}
	}

	public final ParsingRuleContext parsingRule() throws RecognitionException {
		ParsingRuleContext _localctx = new ParsingRuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parsingRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(PARSER_IDN);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(61);
				inAttrs();
				}
			}

			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(64);
				match(T__4);
				setState(65);
				outAttr();
				}
			}

			setState(68);
			match(T__5);
			setState(69);
			prods();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(70);
				match(T__6);
				setState(71);
				prods();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class InAttrsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public InAttrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inAttrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInAttrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInAttrs(this);
		}
	}

	public final InAttrsContext inAttrs() throws RecognitionException {
		InAttrsContext _localctx = new InAttrsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inAttrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__7);
			setState(78);
			param();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(79);
				match(T__8);
				setState(80);
				param();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(T__9);
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

	public static class OutAttrContext extends ParserRuleContext {
		public TerminalNode LEXER_IDN() { return getToken(GrammarParser.LEXER_IDN, 0); }
		public OutAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOutAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOutAttr(this);
		}
	}

	public final OutAttrContext outAttr() throws RecognitionException {
		OutAttrContext _localctx = new OutAttrContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_outAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(LEXER_IDN);
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

	public static class ParamContext extends ParserRuleContext {
		public ParamNameContext paramName() {
			return getRuleContext(ParamNameContext.class,0);
		}
		public ParamTypeContext paramType() {
			return getRuleContext(ParamTypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			paramName();
			setState(91);
			match(T__4);
			setState(92);
			paramType();
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

	public static class ParamTypeContext extends ParserRuleContext {
		public TerminalNode LEXER_IDN() { return getToken(GrammarParser.LEXER_IDN, 0); }
		public ParamTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParamType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParamType(this);
		}
	}

	public final ParamTypeContext paramType() throws RecognitionException {
		ParamTypeContext _localctx = new ParamTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_paramType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(LEXER_IDN);
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

	public static class ParamNameContext extends ParserRuleContext {
		public TerminalNode PARSER_IDN() { return getToken(GrammarParser.PARSER_IDN, 0); }
		public ParamNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParamName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParamName(this);
		}
	}

	public final ParamNameContext paramName() throws RecognitionException {
		ParamNameContext _localctx = new ParamNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_paramName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(PARSER_IDN);
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

	public static class ProdsContext extends ParserRuleContext {
		public List<ProdContext> prod() {
			return getRuleContexts(ProdContext.class);
		}
		public ProdContext prod(int i) {
			return getRuleContext(ProdContext.class,i);
		}
		public ProdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProds(this);
		}
	}

	public final ProdsContext prods() throws RecognitionException {
		ProdsContext _localctx = new ProdsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_prods);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARSER_IDN) | (1L << LEXER_IDN) | (1L << CODE))) != 0)) {
				{
				{
				setState(98);
				prod();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ProdContext extends ParserRuleContext {
		public TerminalNode PARSER_IDN() { return getToken(GrammarParser.PARSER_IDN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode LEXER_IDN() { return getToken(GrammarParser.LEXER_IDN, 0); }
		public TerminalNode CODE() { return getToken(GrammarParser.CODE, 0); }
		public ProdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProd(this);
		}
	}

	public final ProdContext prod() throws RecognitionException {
		ProdContext _localctx = new ProdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_prod);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARSER_IDN:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(PARSER_IDN);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(105);
					args();
					}
				}

				}
				break;
			case LEXER_IDN:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(LEXER_IDN);
				}
				break;
			case CODE:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				match(CODE);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__10);
			setState(113);
			arg();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(114);
				match(T__8);
				setState(115);
				arg();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			match(T__11);
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

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode PARSER_IDN() { return getToken(GrammarParser.PARSER_IDN, 0); }
		public TerminalNode LEXER_IDN() { return getToken(GrammarParser.LEXER_IDN, 0); }
		public TerminalNode CODE() { return getToken(GrammarParser.CODE, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARSER_IDN) | (1L << LEXER_IDN) | (1L << CODE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class LexerRuleContext extends ParserRuleContext {
		public TerminalNode LEXER_IDN() { return getToken(GrammarParser.LEXER_IDN, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public LexerRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLexerRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLexerRule(this);
		}
	}

	public final LexerRuleContext lexerRule() throws RecognitionException {
		LexerRuleContext _localctx = new LexerRuleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lexerRule);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(LEXER_IDN);
				setState(126);
				match(T__4);
				setState(127);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(LEXER_IDN);
				setState(129);
				match(T__12);
				setState(130);
				term();
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

	public static class TermContext extends ParserRuleContext {
		public TerminalNode REGEX() { return getToken(GrammarParser.REGEX, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(REGEX);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25\u008a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\5\2"+
		"$\n\2\3\2\3\2\6\2(\n\2\r\2\16\2)\5\2,\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5=\n\5\3\6\3\6\5\6A\n\6\3\6\3\6\5\6"+
		"E\n\6\3\6\3\6\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\7\3\7\3\7\3\7\7\7T\n\7"+
		"\f\7\16\7W\13\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\7\ff\n\f\f\f\16\fi\13\f\3\r\3\r\5\rm\n\r\3\r\3\r\5\rq\n\r\3\16\3\16\3"+
		"\16\3\16\7\16w\n\16\f\16\16\16z\13\16\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\5\20\u0086\n\20\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \2\3\4\2\20\21\23\23\2\u0087\2#\3\2\2\2\4/\3"+
		"\2\2\2\6\63\3\2\2\2\b<\3\2\2\2\n>\3\2\2\2\fO\3\2\2\2\16Z\3\2\2\2\20\\"+
		"\3\2\2\2\22`\3\2\2\2\24b\3\2\2\2\26g\3\2\2\2\30p\3\2\2\2\32r\3\2\2\2\34"+
		"}\3\2\2\2\36\u0085\3\2\2\2 \u0087\3\2\2\2\"$\5\6\4\2#\"\3\2\2\2#$\3\2"+
		"\2\2$+\3\2\2\2%\'\5\4\3\2&(\5\b\5\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*"+
		"\3\2\2\2*,\3\2\2\2+%\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\7\2\2\3.\3\3\2\2\2"+
		"/\60\7\3\2\2\60\61\7\4\2\2\61\62\7\20\2\2\62\5\3\2\2\2\63\64\7\5\2\2\64"+
		"\65\7\24\2\2\65\7\3\2\2\2\66\67\5\n\6\2\678\7\6\2\28=\3\2\2\29:\5\36\20"+
		"\2:;\7\6\2\2;=\3\2\2\2<\66\3\2\2\2<9\3\2\2\2=\t\3\2\2\2>@\7\20\2\2?A\5"+
		"\f\7\2@?\3\2\2\2@A\3\2\2\2AD\3\2\2\2BC\7\7\2\2CE\5\16\b\2DB\3\2\2\2DE"+
		"\3\2\2\2EF\3\2\2\2FG\7\b\2\2GL\5\26\f\2HI\7\t\2\2IK\5\26\f\2JH\3\2\2\2"+
		"KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\13\3\2\2\2NL\3\2\2\2OP\7\n\2\2PU\5\20"+
		"\t\2QR\7\13\2\2RT\5\20\t\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3"+
		"\2\2\2WU\3\2\2\2XY\7\f\2\2Y\r\3\2\2\2Z[\7\21\2\2[\17\3\2\2\2\\]\5\24\13"+
		"\2]^\7\7\2\2^_\5\22\n\2_\21\3\2\2\2`a\7\21\2\2a\23\3\2\2\2bc\7\20\2\2"+
		"c\25\3\2\2\2df\5\30\r\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\27\3"+
		"\2\2\2ig\3\2\2\2jl\7\20\2\2km\5\32\16\2lk\3\2\2\2lm\3\2\2\2mq\3\2\2\2"+
		"nq\7\21\2\2oq\7\23\2\2pj\3\2\2\2pn\3\2\2\2po\3\2\2\2q\31\3\2\2\2rs\7\r"+
		"\2\2sx\5\34\17\2tu\7\13\2\2uw\5\34\17\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2"+
		"xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7\16\2\2|\33\3\2\2\2}~\t\2\2\2~\35\3"+
		"\2\2\2\177\u0080\7\21\2\2\u0080\u0081\7\7\2\2\u0081\u0086\5 \21\2\u0082"+
		"\u0083\7\21\2\2\u0083\u0084\7\17\2\2\u0084\u0086\5 \21\2\u0085\177\3\2"+
		"\2\2\u0085\u0082\3\2\2\2\u0086\37\3\2\2\2\u0087\u0088\7\22\2\2\u0088!"+
		"\3\2\2\2\17#)+<@DLUglpx\u0085";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}