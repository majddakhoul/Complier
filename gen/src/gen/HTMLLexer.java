// Generated from C:/Users/asus/IdeaProjects/init/src/HTMLLexer.g4 by ANTLR 4.13.2
package src\gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HTMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_EXPR=1, CLOSE_EXPR=2, OPEN_BLOCK=3, CLOSE_BLOCK=4, TAG_OPEN=5, TAG_CLOSE=6, 
		TAG_SLASH_OPEN=7, TAG_SLASH_CLOSE=8, EQUALS=9, STRING=10, ID=11, NUMBER=12, 
		DOT=13, SLASH=14, PLUS=15, COMMA=16, COLON=17, DASH=18, WS=19, TEXT=20, 
		ANY=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OPEN_EXPR", "CLOSE_EXPR", "OPEN_BLOCK", "CLOSE_BLOCK", "TAG_OPEN", "TAG_CLOSE", 
			"TAG_SLASH_OPEN", "TAG_SLASH_CLOSE", "EQUALS", "STRING", "ID", "NUMBER", 
			"DOT", "SLASH", "PLUS", "COMMA", "COLON", "DASH", "WS", "TEXT", "ANY"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{{'", "'}}'", "'{%'", "'%}'", "'<'", "'>'", "'</'", "'/>'", "'='", 
			null, null, null, "'.'", "'/'", "'+'", "','", "':'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPEN_EXPR", "CLOSE_EXPR", "OPEN_BLOCK", "CLOSE_BLOCK", "TAG_OPEN", 
			"TAG_CLOSE", "TAG_SLASH_OPEN", "TAG_SLASH_CLOSE", "EQUALS", "STRING", 
			"ID", "NUMBER", "DOT", "SLASH", "PLUS", "COMMA", "COLON", "DASH", "WS", 
			"TEXT", "ANY"
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


	public HTMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HTMLLexer.g4"; }

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
		"\u0004\u0000\u0015{\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0005\tF\b\t\n\t\f\tI\t\t\u0001\t\u0001\t\u0001\t\u0005\tN\b\t\n\t"+
		"\f\tQ\t\t\u0001\t\u0003\tT\b\t\u0001\n\u0001\n\u0005\nX\b\n\n\n\f\n[\t"+
		"\n\u0001\u000b\u0004\u000b^\b\u000b\u000b\u000b\f\u000b_\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012o\b"+
		"\u0012\u000b\u0012\f\u0012p\u0001\u0012\u0001\u0012\u0001\u0013\u0004"+
		"\u0013v\b\u0013\u000b\u0013\f\u0013w\u0001\u0014\u0001\u0014\u0000\u0000"+
		"\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015\u0001\u0000"+
		"\u0007\u0001\u0000\"\"\u0001\u0000\'\'\u0003\u0000AZ__az\u0004\u00000"+
		"9AZ__az\u0001\u000009\u0003\u0000\t\n\r\r  \u0004\u000009AZaz\u0600\u06ff"+
		"\u0081\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u0003.\u0001\u0000\u0000\u0000"+
		"\u00051\u0001\u0000\u0000\u0000\u00074\u0001\u0000\u0000\u0000\t7\u0001"+
		"\u0000\u0000\u0000\u000b9\u0001\u0000\u0000\u0000\r;\u0001\u0000\u0000"+
		"\u0000\u000f>\u0001\u0000\u0000\u0000\u0011A\u0001\u0000\u0000\u0000\u0013"+
		"S\u0001\u0000\u0000\u0000\u0015U\u0001\u0000\u0000\u0000\u0017]\u0001"+
		"\u0000\u0000\u0000\u0019a\u0001\u0000\u0000\u0000\u001bc\u0001\u0000\u0000"+
		"\u0000\u001de\u0001\u0000\u0000\u0000\u001fg\u0001\u0000\u0000\u0000!"+
		"i\u0001\u0000\u0000\u0000#k\u0001\u0000\u0000\u0000%n\u0001\u0000\u0000"+
		"\u0000\'u\u0001\u0000\u0000\u0000)y\u0001\u0000\u0000\u0000+,\u0005{\u0000"+
		"\u0000,-\u0005{\u0000\u0000-\u0002\u0001\u0000\u0000\u0000./\u0005}\u0000"+
		"\u0000/0\u0005}\u0000\u00000\u0004\u0001\u0000\u0000\u000012\u0005{\u0000"+
		"\u000023\u0005%\u0000\u00003\u0006\u0001\u0000\u0000\u000045\u0005%\u0000"+
		"\u000056\u0005}\u0000\u00006\b\u0001\u0000\u0000\u000078\u0005<\u0000"+
		"\u00008\n\u0001\u0000\u0000\u00009:\u0005>\u0000\u0000:\f\u0001\u0000"+
		"\u0000\u0000;<\u0005<\u0000\u0000<=\u0005/\u0000\u0000=\u000e\u0001\u0000"+
		"\u0000\u0000>?\u0005/\u0000\u0000?@\u0005>\u0000\u0000@\u0010\u0001\u0000"+
		"\u0000\u0000AB\u0005=\u0000\u0000B\u0012\u0001\u0000\u0000\u0000CG\u0005"+
		"\"\u0000\u0000DF\b\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000FI\u0001"+
		"\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000"+
		"HJ\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JT\u0005\"\u0000\u0000"+
		"KO\u0005\'\u0000\u0000LN\b\u0001\u0000\u0000ML\u0001\u0000\u0000\u0000"+
		"NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000PR\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RT\u0005\'\u0000"+
		"\u0000SC\u0001\u0000\u0000\u0000SK\u0001\u0000\u0000\u0000T\u0014\u0001"+
		"\u0000\u0000\u0000UY\u0007\u0002\u0000\u0000VX\u0007\u0003\u0000\u0000"+
		"WV\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000"+
		"\u0000YZ\u0001\u0000\u0000\u0000Z\u0016\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000\\^\u0007\u0004\u0000\u0000]\\\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`\u0018\u0001\u0000\u0000\u0000ab\u0005.\u0000\u0000b\u001a\u0001"+
		"\u0000\u0000\u0000cd\u0005/\u0000\u0000d\u001c\u0001\u0000\u0000\u0000"+
		"ef\u0005+\u0000\u0000f\u001e\u0001\u0000\u0000\u0000gh\u0005,\u0000\u0000"+
		"h \u0001\u0000\u0000\u0000ij\u0005:\u0000\u0000j\"\u0001\u0000\u0000\u0000"+
		"kl\u0005-\u0000\u0000l$\u0001\u0000\u0000\u0000mo\u0007\u0005\u0000\u0000"+
		"nm\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000"+
		"\u0000pq\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0006\u0012"+
		"\u0000\u0000s&\u0001\u0000\u0000\u0000tv\u0007\u0006\u0000\u0000ut\u0001"+
		"\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000"+
		"wx\u0001\u0000\u0000\u0000x(\u0001\u0000\u0000\u0000yz\t\u0000\u0000\u0000"+
		"z*\u0001\u0000\u0000\u0000\b\u0000GOSY_pw\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}