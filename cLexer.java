// Generated from c.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		ID=32, NUMBER=33, Identifier=34, WS=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "ID", "NUMBER", 
			"Identifier", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#'", "';'", "'int'", "'float'", "'char'", "'double'", "'long'", 
			"'('", "')'", "','", "'{'", "'}'", "'if'", "'else'", "'while'", "'return'", 
			"'||'", "'&&'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'!'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "ID", "NUMBER", "Identifier", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public cLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "c.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u00d0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\7!\u00ae\n!"+
		"\f!\16!\u00b1\13!\3\"\6\"\u00b4\n\"\r\"\16\"\u00b5\3\"\3\"\6\"\u00ba\n"+
		"\"\r\"\16\"\u00bb\5\"\u00be\n\"\3#\5#\u00c1\n#\3#\3#\7#\u00c5\n#\f#\16"+
		"#\u00c8\13#\3$\6$\u00cb\n$\r$\16$\u00cc\3$\3$\2\2%\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\6"+
		"\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\2\u00d6\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3"+
		"\2\2\2\5K\3\2\2\2\7M\3\2\2\2\tQ\3\2\2\2\13W\3\2\2\2\r\\\3\2\2\2\17c\3"+
		"\2\2\2\21h\3\2\2\2\23j\3\2\2\2\25l\3\2\2\2\27n\3\2\2\2\31p\3\2\2\2\33"+
		"r\3\2\2\2\35u\3\2\2\2\37z\3\2\2\2!\u0080\3\2\2\2#\u0087\3\2\2\2%\u008a"+
		"\3\2\2\2\'\u008d\3\2\2\2)\u0090\3\2\2\2+\u0093\3\2\2\2-\u0095\3\2\2\2"+
		"/\u0097\3\2\2\2\61\u009a\3\2\2\2\63\u009d\3\2\2\2\65\u009f\3\2\2\2\67"+
		"\u00a1\3\2\2\29\u00a3\3\2\2\2;\u00a5\3\2\2\2=\u00a7\3\2\2\2?\u00a9\3\2"+
		"\2\2A\u00ab\3\2\2\2C\u00b3\3\2\2\2E\u00c0\3\2\2\2G\u00ca\3\2\2\2IJ\7%"+
		"\2\2J\4\3\2\2\2KL\7=\2\2L\6\3\2\2\2MN\7k\2\2NO\7p\2\2OP\7v\2\2P\b\3\2"+
		"\2\2QR\7h\2\2RS\7n\2\2ST\7q\2\2TU\7c\2\2UV\7v\2\2V\n\3\2\2\2WX\7e\2\2"+
		"XY\7j\2\2YZ\7c\2\2Z[\7t\2\2[\f\3\2\2\2\\]\7f\2\2]^\7q\2\2^_\7w\2\2_`\7"+
		"d\2\2`a\7n\2\2ab\7g\2\2b\16\3\2\2\2cd\7n\2\2de\7q\2\2ef\7p\2\2fg\7i\2"+
		"\2g\20\3\2\2\2hi\7*\2\2i\22\3\2\2\2jk\7+\2\2k\24\3\2\2\2lm\7.\2\2m\26"+
		"\3\2\2\2no\7}\2\2o\30\3\2\2\2pq\7\177\2\2q\32\3\2\2\2rs\7k\2\2st\7h\2"+
		"\2t\34\3\2\2\2uv\7g\2\2vw\7n\2\2wx\7u\2\2xy\7g\2\2y\36\3\2\2\2z{\7y\2"+
		"\2{|\7j\2\2|}\7k\2\2}~\7n\2\2~\177\7g\2\2\177 \3\2\2\2\u0080\u0081\7t"+
		"\2\2\u0081\u0082\7g\2\2\u0082\u0083\7v\2\2\u0083\u0084\7w\2\2\u0084\u0085"+
		"\7t\2\2\u0085\u0086\7p\2\2\u0086\"\3\2\2\2\u0087\u0088\7~\2\2\u0088\u0089"+
		"\7~\2\2\u0089$\3\2\2\2\u008a\u008b\7(\2\2\u008b\u008c\7(\2\2\u008c&\3"+
		"\2\2\2\u008d\u008e\7?\2\2\u008e\u008f\7?\2\2\u008f(\3\2\2\2\u0090\u0091"+
		"\7#\2\2\u0091\u0092\7?\2\2\u0092*\3\2\2\2\u0093\u0094\7>\2\2\u0094,\3"+
		"\2\2\2\u0095\u0096\7@\2\2\u0096.\3\2\2\2\u0097\u0098\7>\2\2\u0098\u0099"+
		"\7?\2\2\u0099\60\3\2\2\2\u009a\u009b\7@\2\2\u009b\u009c\7?\2\2\u009c\62"+
		"\3\2\2\2\u009d\u009e\7-\2\2\u009e\64\3\2\2\2\u009f\u00a0\7/\2\2\u00a0"+
		"\66\3\2\2\2\u00a1\u00a2\7,\2\2\u00a28\3\2\2\2\u00a3\u00a4\7\61\2\2\u00a4"+
		":\3\2\2\2\u00a5\u00a6\7\'\2\2\u00a6<\3\2\2\2\u00a7\u00a8\7#\2\2\u00a8"+
		">\3\2\2\2\u00a9\u00aa\7?\2\2\u00aa@\3\2\2\2\u00ab\u00af\t\2\2\2\u00ac"+
		"\u00ae\t\3\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0B\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4"+
		"\t\4\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00bd\3\2\2\2\u00b7\u00b9\7\60\2\2\u00b8\u00ba\t"+
		"\4\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00b7\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00beD\3\2\2\2\u00bf\u00c1\7%\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c6\t\2\2\2\u00c3\u00c5\t\3\2\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7F\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cb\t\5\2\2\u00ca\u00c9"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cf\b$\2\2\u00cfH\3\2\2\2\n\2\u00af\u00b5\u00bb"+
		"\u00bd\u00c0\u00c6\u00cc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}