// Generated from java-escape by ANTLR 4.11.1

    import backend.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, Identifier=13, Integer=14, Boolean=15, String=16, 
		MUL=17, DIV=18, ADD=19, SUB=20, ADDTWICE=21, RANGE=22, LT=23, LE=24, GT=25, 
		GE=26, EQ=27, NE=28, LINE_COMMENT=29, WHITESPACE=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "Identifier", "Integer", "Boolean", "String", 
			"MUL", "DIV", "ADD", "SUB", "ADDTWICE", "RANGE", "LT", "LE", "GT", "GE", 
			"EQ", "NE", "LINE_COMMENT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'print'", "'('", "')'", "'function'", "'{'", "'}'", 
			"','", "'while'", "'if'", "'else'", null, null, null, null, "'*'", "'/'", 
			"'+'", "'-'", "'++'", "'..'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "Identifier", "Integer", "Boolean", "String", "MUL", "DIV", "ADD", 
			"SUB", "ADDTWICE", "RANGE", "LT", "LE", "GT", "GE", "EQ", "NE", "LINE_COMMENT", 
			"WHITESPACE"
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


	public PLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PL.g4"; }

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
		"\u0004\u0000\u001e\u00b3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0004\fj\b\f\u000b\f\f\f"+
		"k\u0001\r\u0004\ro\b\r\u000b\r\f\rp\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e|\b\u000e\u0001\u000f\u0001\u000f\u0005\u000f\u0080\b\u000f"+
		"\n\u000f\f\u000f\u0083\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u00a9\b\u001c\n\u001c\f\u001c"+
		"\u00ac\t\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0000\u0000\u001e\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e\u0001\u0000\u0005\u0002\u0000AZaz\u0001\u000009\u0003\u0000\n"+
		"\n\r\r\"\"\u0002\u0000\n\n\r\r\u0003\u0000\t\n\r\r  \u00b7\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u0000"+
		"5\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001"+
		"\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0001=\u0001\u0000\u0000"+
		"\u0000\u0003?\u0001\u0000\u0000\u0000\u0005A\u0001\u0000\u0000\u0000\u0007"+
		"G\u0001\u0000\u0000\u0000\tI\u0001\u0000\u0000\u0000\u000bK\u0001\u0000"+
		"\u0000\u0000\rT\u0001\u0000\u0000\u0000\u000fV\u0001\u0000\u0000\u0000"+
		"\u0011X\u0001\u0000\u0000\u0000\u0013Z\u0001\u0000\u0000\u0000\u0015`"+
		"\u0001\u0000\u0000\u0000\u0017c\u0001\u0000\u0000\u0000\u0019i\u0001\u0000"+
		"\u0000\u0000\u001bn\u0001\u0000\u0000\u0000\u001d{\u0001\u0000\u0000\u0000"+
		"\u001f}\u0001\u0000\u0000\u0000!\u0086\u0001\u0000\u0000\u0000#\u0088"+
		"\u0001\u0000\u0000\u0000%\u008a\u0001\u0000\u0000\u0000\'\u008c\u0001"+
		"\u0000\u0000\u0000)\u008e\u0001\u0000\u0000\u0000+\u0091\u0001\u0000\u0000"+
		"\u0000-\u0094\u0001\u0000\u0000\u0000/\u0096\u0001\u0000\u0000\u00001"+
		"\u0099\u0001\u0000\u0000\u00003\u009b\u0001\u0000\u0000\u00005\u009e\u0001"+
		"\u0000\u0000\u00007\u00a1\u0001\u0000\u0000\u00009\u00a4\u0001\u0000\u0000"+
		"\u0000;\u00af\u0001\u0000\u0000\u0000=>\u0005;\u0000\u0000>\u0002\u0001"+
		"\u0000\u0000\u0000?@\u0005=\u0000\u0000@\u0004\u0001\u0000\u0000\u0000"+
		"AB\u0005p\u0000\u0000BC\u0005r\u0000\u0000CD\u0005i\u0000\u0000DE\u0005"+
		"n\u0000\u0000EF\u0005t\u0000\u0000F\u0006\u0001\u0000\u0000\u0000GH\u0005"+
		"(\u0000\u0000H\b\u0001\u0000\u0000\u0000IJ\u0005)\u0000\u0000J\n\u0001"+
		"\u0000\u0000\u0000KL\u0005f\u0000\u0000LM\u0005u\u0000\u0000MN\u0005n"+
		"\u0000\u0000NO\u0005c\u0000\u0000OP\u0005t\u0000\u0000PQ\u0005i\u0000"+
		"\u0000QR\u0005o\u0000\u0000RS\u0005n\u0000\u0000S\f\u0001\u0000\u0000"+
		"\u0000TU\u0005{\u0000\u0000U\u000e\u0001\u0000\u0000\u0000VW\u0005}\u0000"+
		"\u0000W\u0010\u0001\u0000\u0000\u0000XY\u0005,\u0000\u0000Y\u0012\u0001"+
		"\u0000\u0000\u0000Z[\u0005w\u0000\u0000[\\\u0005h\u0000\u0000\\]\u0005"+
		"i\u0000\u0000]^\u0005l\u0000\u0000^_\u0005e\u0000\u0000_\u0014\u0001\u0000"+
		"\u0000\u0000`a\u0005i\u0000\u0000ab\u0005f\u0000\u0000b\u0016\u0001\u0000"+
		"\u0000\u0000cd\u0005e\u0000\u0000de\u0005l\u0000\u0000ef\u0005s\u0000"+
		"\u0000fg\u0005e\u0000\u0000g\u0018\u0001\u0000\u0000\u0000hj\u0007\u0000"+
		"\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l\u001a\u0001\u0000\u0000"+
		"\u0000mo\u0007\u0001\u0000\u0000nm\u0001\u0000\u0000\u0000op\u0001\u0000"+
		"\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000q\u001c"+
		"\u0001\u0000\u0000\u0000rs\u0005t\u0000\u0000st\u0005r\u0000\u0000tu\u0005"+
		"u\u0000\u0000u|\u0005e\u0000\u0000vw\u0005f\u0000\u0000wx\u0005a\u0000"+
		"\u0000xy\u0005l\u0000\u0000yz\u0005s\u0000\u0000z|\u0005e\u0000\u0000"+
		"{r\u0001\u0000\u0000\u0000{v\u0001\u0000\u0000\u0000|\u001e\u0001\u0000"+
		"\u0000\u0000}\u0081\u0005\"\u0000\u0000~\u0080\b\u0002\u0000\u0000\u007f"+
		"~\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0084"+
		"\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0005\"\u0000\u0000\u0085 \u0001\u0000\u0000\u0000\u0086\u0087\u0005"+
		"*\u0000\u0000\u0087\"\u0001\u0000\u0000\u0000\u0088\u0089\u0005/\u0000"+
		"\u0000\u0089$\u0001\u0000\u0000\u0000\u008a\u008b\u0005+\u0000\u0000\u008b"+
		"&\u0001\u0000\u0000\u0000\u008c\u008d\u0005-\u0000\u0000\u008d(\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0005+\u0000\u0000\u008f\u0090\u0005+\u0000"+
		"\u0000\u0090*\u0001\u0000\u0000\u0000\u0091\u0092\u0005.\u0000\u0000\u0092"+
		"\u0093\u0005.\u0000\u0000\u0093,\u0001\u0000\u0000\u0000\u0094\u0095\u0005"+
		"<\u0000\u0000\u0095.\u0001\u0000\u0000\u0000\u0096\u0097\u0005<\u0000"+
		"\u0000\u0097\u0098\u0005=\u0000\u0000\u00980\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0005>\u0000\u0000\u009a2\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		">\u0000\u0000\u009c\u009d\u0005=\u0000\u0000\u009d4\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0005=\u0000\u0000\u009f\u00a0\u0005=\u0000\u0000\u00a0"+
		"6\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005!\u0000\u0000\u00a2\u00a3\u0005"+
		"=\u0000\u0000\u00a38\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005/\u0000"+
		"\u0000\u00a5\u00a6\u0005/\u0000\u0000\u00a6\u00aa\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a9\b\u0003\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9"+
		"\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ae\u0006\u001c\u0000\u0000\u00ae"+
		":\u0001\u0000\u0000\u0000\u00af\u00b0\u0007\u0004\u0000\u0000\u00b0\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0006\u001d\u0000\u0000\u00b2<\u0001"+
		"\u0000\u0000\u0000\u0006\u0000kp{\u0081\u00aa\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}