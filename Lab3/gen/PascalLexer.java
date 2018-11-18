// Generated from C:/study/TranslationMethods/Lab3/src/main/antlr\Pascal.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, WS=7, VAR=8, CONST=9, 
		PROGRAM=10, BEGIN=11, END=12, INTEGER=13, ASSIGNMENT=14, EQUAL_SIGN=15, 
		DOT=16, COMMA=17, COLON=18, SEMICOLON=19, ARG=20, IDENT=21, INT=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "WS", "VAR", "CONST", 
		"PROGRAM", "BEGIN", "END", "INTEGER", "ASSIGNMENT", "EQUAL_SIGN", "DOT", 
		"COMMA", "COLON", "SEMICOLON", "ARG", "IDENT", "INT"
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


	public PascalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pascal.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0091\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\6\b=\n\b\r\b\16\b>\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\7\25v\n\25\f\25\16\25y\13\25\3\25\3\25\3\26\5\26"+
		"~\n\26\3\26\5\26\u0081\n\26\7\26\u0083\n\26\f\26\16\26\u0086\13\26\3\27"+
		"\3\27\3\27\7\27\u008b\n\27\f\27\16\27\u008e\13\27\5\27\u0090\n\27\2\2"+
		"\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\b\5\2\13\f\17\17\"\"\b\2\""+
		"#--//\61=C\\c|\4\2C\\c|\5\2\62;C\\c|\3\2\63;\3\2\62;\2\u0095\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2"+
		"\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r9\3\2\2\2\17<\3\2\2\2\21"+
		"B\3\2\2\2\23F\3\2\2\2\25L\3\2\2\2\27T\3\2\2\2\31Z\3\2\2\2\33^\3\2\2\2"+
		"\35f\3\2\2\2\37i\3\2\2\2!k\3\2\2\2#m\3\2\2\2%o\3\2\2\2\'q\3\2\2\2)s\3"+
		"\2\2\2+}\3\2\2\2-\u008f\3\2\2\2/\60\7-\2\2\60\4\3\2\2\2\61\62\7/\2\2\62"+
		"\6\3\2\2\2\63\64\7,\2\2\64\b\3\2\2\2\65\66\7\61\2\2\66\n\3\2\2\2\678\7"+
		"*\2\28\f\3\2\2\29:\7+\2\2:\16\3\2\2\2;=\t\2\2\2<;\3\2\2\2=>\3\2\2\2><"+
		"\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\b\b\2\2A\20\3\2\2\2BC\7x\2\2CD\7c\2\2D"+
		"E\7t\2\2E\22\3\2\2\2FG\7e\2\2GH\7q\2\2HI\7p\2\2IJ\7u\2\2JK\7v\2\2K\24"+
		"\3\2\2\2LM\7r\2\2MN\7t\2\2NO\7q\2\2OP\7i\2\2PQ\7t\2\2QR\7c\2\2RS\7o\2"+
		"\2S\26\3\2\2\2TU\7d\2\2UV\7g\2\2VW\7i\2\2WX\7k\2\2XY\7p\2\2Y\30\3\2\2"+
		"\2Z[\7g\2\2[\\\7p\2\2\\]\7f\2\2]\32\3\2\2\2^_\7k\2\2_`\7p\2\2`a\7v\2\2"+
		"ab\7g\2\2bc\7i\2\2cd\7g\2\2de\7t\2\2e\34\3\2\2\2fg\7<\2\2gh\7?\2\2h\36"+
		"\3\2\2\2ij\7?\2\2j \3\2\2\2kl\7\60\2\2l\"\3\2\2\2mn\7.\2\2n$\3\2\2\2o"+
		"p\7<\2\2p&\3\2\2\2qr\7=\2\2r(\3\2\2\2sw\7)\2\2tv\t\3\2\2ut\3\2\2\2vy\3"+
		"\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7)\2\2{*\3\2\2\2|~\t"+
		"\4\2\2}|\3\2\2\2~\u0084\3\2\2\2\177\u0081\t\5\2\2\u0080\177\3\2\2\2\u0081"+
		"\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085,\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0090"+
		"\7\62\2\2\u0088\u008c\t\6\2\2\u0089\u008b\t\7\2\2\u008a\u0089\3\2\2\2"+
		"\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0090"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0087\3\2\2\2\u008f\u0088\3\2\2\2\u0090"+
		".\3\2\2\2\13\2>uw}\u0080\u0084\u008c\u008f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}