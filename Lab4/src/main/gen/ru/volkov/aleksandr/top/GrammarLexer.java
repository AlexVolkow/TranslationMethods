// Generated from C:/study/TranslationMethods/Lab4/src/main/antlr\Grammar.g4 by ANTLR 4.7
package ru.volkov.aleksandr.top;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, PARSER_IDN=14, LEXER_IDN=15, REGEX=16, 
		CODE=17, PACKAGE_NAME=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "PARSER_IDN", "LEXER_IDN", "REGEX", 
		"CODE", "PACKAGE_NAME", "WS"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u0086\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\7\17T"+
		"\n\17\f\17\16\17W\13\17\3\20\3\20\7\20[\n\20\f\20\16\20^\13\20\3\21\3"+
		"\21\3\21\3\21\7\21d\n\21\f\21\16\21g\13\21\3\21\3\21\3\22\3\22\6\22m\n"+
		"\22\r\22\16\22n\3\22\5\22r\n\22\7\22t\n\22\f\22\16\22w\13\22\3\22\3\22"+
		"\3\23\6\23|\n\23\r\23\16\23}\3\24\6\24\u0081\n\24\r\24\16\24\u0082\3\24"+
		"\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\t\3\2c|\6\2\62;C\\aac|\3\2C\\"+
		"\5\2\f\f\17\17))\4\2}}\177\177\5\2\60\60\62;c|\5\2\13\f\17\17\"\"\2\u008e"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t9\3\2"+
		"\2\2\13;\3\2\2\2\r=\3\2\2\2\17@\3\2\2\2\21B\3\2\2\2\23D\3\2\2\2\25F\3"+
		"\2\2\2\27H\3\2\2\2\31J\3\2\2\2\33L\3\2\2\2\35Q\3\2\2\2\37X\3\2\2\2!_\3"+
		"\2\2\2#j\3\2\2\2%{\3\2\2\2\'\u0080\3\2\2\2)*\7u\2\2*+\7v\2\2+,\7c\2\2"+
		",-\7t\2\2-.\7v\2\2.\4\3\2\2\2/\60\7?\2\2\60\6\3\2\2\2\61\62\7r\2\2\62"+
		"\63\7c\2\2\63\64\7e\2\2\64\65\7m\2\2\65\66\7c\2\2\66\67\7i\2\2\678\7g"+
		"\2\28\b\3\2\2\29:\7=\2\2:\n\3\2\2\2;<\7<\2\2<\f\3\2\2\2=>\7<\2\2>?\7?"+
		"\2\2?\16\3\2\2\2@A\7~\2\2A\20\3\2\2\2BC\7]\2\2C\22\3\2\2\2DE\7.\2\2E\24"+
		"\3\2\2\2FG\7_\2\2G\26\3\2\2\2HI\7*\2\2I\30\3\2\2\2JK\7+\2\2K\32\3\2\2"+
		"\2LM\7u\2\2MN\7m\2\2NO\7k\2\2OP\7r\2\2P\34\3\2\2\2QU\t\2\2\2RT\t\3\2\2"+
		"SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\36\3\2\2\2WU\3\2\2\2X\\\t\4"+
		"\2\2Y[\t\3\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2] \3\2\2\2^\\"+
		"\3\2\2\2_e\7$\2\2`d\n\5\2\2ab\7^\2\2bd\7)\2\2c`\3\2\2\2ca\3\2\2\2dg\3"+
		"\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7$\2\2i\"\3\2\2\2ju\7"+
		"}\2\2km\n\6\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pr\5"+
		"#\22\2qp\3\2\2\2qr\3\2\2\2rt\3\2\2\2sl\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3"+
		"\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7\177\2\2y$\3\2\2\2z|\t\7\2\2{z\3\2\2\2|"+
		"}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~&\3\2\2\2\177\u0081\t\b\2\2\u0080\177\3"+
		"\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0085\b\24\2\2\u0085(\3\2\2\2\r\2U\\cenqu{}\u0082"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}