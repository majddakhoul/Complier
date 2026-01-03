// Generated from C:/Users/asus/IdeaProjects/init/src/CSSParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CSSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LBRACE=1, RBRACE=2, COLON=3, SEMI=4, DOT=5, HASH=6, ID=7, COLOR=8, WS=9;
	public static final int
		RULE_stylesheet = 0, RULE_rule = 1, RULE_selector = 2, RULE_declaration = 3, 
		RULE_value = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"stylesheet", "rule", "selector", "declaration", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "':'", "';'", "'.'", "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LBRACE", "RBRACE", "COLON", "SEMI", "DOT", "HASH", "ID", "COLOR", 
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

	@Override
	public String getGrammarFileName() { return "CSSParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CSSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StylesheetContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CSSParser.EOF, 0); }
		public List<RuleContext> rule_() {
			return getRuleContexts(RuleContext.class);
		}
		public RuleContext rule_(int i) {
			return getRuleContext(RuleContext.class,i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				rule_();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DOT || _la==ID );
			setState(15);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RuleContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(CSSParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CSSParser.RBRACE, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleContext rule_() throws RecognitionException {
		RuleContext _localctx = new RuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			selector();
			setState(18);
			match(LBRACE);
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(19);
				declaration();
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CSSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CSSParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(CSSParser.DOT, 0); }
		public TerminalNode COLON() { return getToken(CSSParser.COLON, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selector);
		try {
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				match(DOT);
				setState(29);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				match(ID);
				setState(31);
				match(COLON);
				setState(32);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CSSParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(CSSParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CSSParser.COLON, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CSSParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CSSParser.SEMI, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(ID);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(36);
				match(COLON);
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			value();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(43);
				match(SEMI);
				}
				}
				setState(48);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CSSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CSSParser.ID, i);
		}
		public TerminalNode COLOR() { return getToken(CSSParser.COLOR, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSSParserListener ) ((CSSParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSSParserVisitor ) return ((CSSParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(COLOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				match(ID);
				setState(52);
				match(ID);
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

	public static final String _serializedATN =
		"\u0004\u0001\t8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0015\b\u0001\n\u0001"+
		"\f\u0001\u0018\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\"\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0005\u0003&\b\u0003\n\u0003\f\u0003)\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003-\b\u0003\n\u0003\f\u00030\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u00046\b\u0004"+
		"\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000:"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0002\u0011\u0001\u0000\u0000\u0000"+
		"\u0004!\u0001\u0000\u0000\u0000\u0006#\u0001\u0000\u0000\u0000\b5\u0001"+
		"\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000\u0000"+
		"\u0000\f\r\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e"+
		"\u0001\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\u0010"+
		"\u0005\u0000\u0000\u0001\u0010\u0001\u0001\u0000\u0000\u0000\u0011\u0012"+
		"\u0003\u0004\u0002\u0000\u0012\u0016\u0005\u0001\u0000\u0000\u0013\u0015"+
		"\u0003\u0006\u0003\u0000\u0014\u0013\u0001\u0000\u0000\u0000\u0015\u0018"+
		"\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000\u0000\u0016\u0017"+
		"\u0001\u0000\u0000\u0000\u0017\u0019\u0001\u0000\u0000\u0000\u0018\u0016"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0005\u0002\u0000\u0000\u001a\u0003"+
		"\u0001\u0000\u0000\u0000\u001b\"\u0005\u0007\u0000\u0000\u001c\u001d\u0005"+
		"\u0005\u0000\u0000\u001d\"\u0005\u0007\u0000\u0000\u001e\u001f\u0005\u0007"+
		"\u0000\u0000\u001f \u0005\u0003\u0000\u0000 \"\u0005\u0007\u0000\u0000"+
		"!\u001b\u0001\u0000\u0000\u0000!\u001c\u0001\u0000\u0000\u0000!\u001e"+
		"\u0001\u0000\u0000\u0000\"\u0005\u0001\u0000\u0000\u0000#\'\u0005\u0007"+
		"\u0000\u0000$&\u0005\u0003\u0000\u0000%$\u0001\u0000\u0000\u0000&)\u0001"+
		"\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000"+
		"(*\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000*.\u0003\b\u0004"+
		"\u0000+-\u0005\u0004\u0000\u0000,+\u0001\u0000\u0000\u0000-0\u0001\u0000"+
		"\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/\u0007"+
		"\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000016\u0005\u0007\u0000"+
		"\u000026\u0005\b\u0000\u000034\u0005\u0007\u0000\u000046\u0005\u0007\u0000"+
		"\u000051\u0001\u0000\u0000\u000052\u0001\u0000\u0000\u000053\u0001\u0000"+
		"\u0000\u00006\t\u0001\u0000\u0000\u0000\u0006\r\u0016!\'.5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}