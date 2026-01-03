// Generated from C:/Users/asus/IdeaProjects/init/src/Jinja2Parser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Jinja2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TEMPLATE_START=1, VAR_START=2, COMMENT_START=3, TEXT=4, STMT_END=5, FOR=6, 
		IN=7, ENDFOR=8, IF=9, ELSE=10, ELIF=11, ENDIF=12, BLOCK=13, ENDBLOCK=14, 
		EXTENDS=15, INCLUDE=16, SET=17, MACRO=18, ENDMACRO=19, CALL=20, ENDCALL=21, 
		WITH=22, ENDWITH=23, FILTER=24, ENDFILTER=25, ID=26, NUMBER=27, STRING=28, 
		LPAREN=29, RPAREN=30, LBRACK=31, RBRACK=32, LBRACE=33, RBRACE=34, COMMA=35, 
		DOT=36, PIPE=37, ASSIGN=38, COLON=39, PLUS=40, MINUS=41, MULT=42, DIV=43, 
		MOD=44, EQ=45, NEQ=46, LT=47, GT=48, LTE=49, GTE=50, AND=51, OR=52, NOT=53, 
		IS=54, WS=55, EXPR_END=56, EXPR_ID=57, EXPR_NUMBER=58, EXPR_STRING=59, 
		EXPR_DOT=60, EXPR_LPAREN=61, EXPR_RPAREN=62, EXPR_LBRACK=63, EXPR_RBRACK=64, 
		EXPR_PIPE=65, EXPR_PLUS=66, EXPR_MINUS=67, EXPR_MULT=68, EXPR_DIV=69, 
		EXPR_WS=70, COMMENT_END=71, COMMENT_TEXT=72;
	public static final int
		RULE_template = 0, RULE_text_block = 1, RULE_var_block = 2, RULE_stmt_block = 3, 
		RULE_statement = 4, RULE_for_statement = 5, RULE_for_body = 6, RULE_if_statement = 7, 
		RULE_if_body = 8, RULE_elif_body = 9, RULE_else_body = 10, RULE_block_statement = 11, 
		RULE_block_body = 12, RULE_extends_statement = 13, RULE_include_statement = 14, 
		RULE_set_statement = 15, RULE_macro_statement = 16, RULE_params = 17, 
		RULE_macro_body = 18, RULE_expr_statement = 19, RULE_expr = 20, RULE_filter = 21, 
		RULE_atom = 22, RULE_args = 23, RULE_context = 24, RULE_pair = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"template", "text_block", "var_block", "stmt_block", "statement", "for_statement", 
			"for_body", "if_statement", "if_body", "elif_body", "else_body", "block_statement", 
			"block_body", "extends_statement", "include_statement", "set_statement", 
			"macro_statement", "params", "macro_body", "expr_statement", "expr", 
			"filter", "atom", "args", "context", "pair"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{%'", "'{{'", "'{#'", null, "'%}'", "'for'", "'in'", "'endfor'", 
			"'if'", "'else'", "'elif'", "'endif'", "'block'", "'endblock'", "'extends'", 
			"'include'", "'set'", "'macro'", "'endmacro'", "'call'", "'endcall'", 
			"'with'", "'endwith'", "'filter'", "'endfilter'", null, null, null, null, 
			null, null, null, "'{'", "'}'", "','", null, null, "'='", "':'", null, 
			null, null, null, "'%'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", 
			"'and'", "'or'", "'not'", "'is'", null, "'}}'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'#}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TEMPLATE_START", "VAR_START", "COMMENT_START", "TEXT", "STMT_END", 
			"FOR", "IN", "ENDFOR", "IF", "ELSE", "ELIF", "ENDIF", "BLOCK", "ENDBLOCK", 
			"EXTENDS", "INCLUDE", "SET", "MACRO", "ENDMACRO", "CALL", "ENDCALL", 
			"WITH", "ENDWITH", "FILTER", "ENDFILTER", "ID", "NUMBER", "STRING", "LPAREN", 
			"RPAREN", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "COMMA", "DOT", "PIPE", 
			"ASSIGN", "COLON", "PLUS", "MINUS", "MULT", "DIV", "MOD", "EQ", "NEQ", 
			"LT", "GT", "LTE", "GTE", "AND", "OR", "NOT", "IS", "WS", "EXPR_END", 
			"EXPR_ID", "EXPR_NUMBER", "EXPR_STRING", "EXPR_DOT", "EXPR_LPAREN", "EXPR_RPAREN", 
			"EXPR_LBRACK", "EXPR_RBRACK", "EXPR_PIPE", "EXPR_PLUS", "EXPR_MINUS", 
			"EXPR_MULT", "EXPR_DIV", "EXPR_WS", "COMMENT_END", "COMMENT_TEXT"
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
	public String getGrammarFileName() { return "Jinja2Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Jinja2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Jinja2Parser.EOF, 0); }
		public List<Text_blockContext> text_block() {
			return getRuleContexts(Text_blockContext.class);
		}
		public Text_blockContext text_block(int i) {
			return getRuleContext(Text_blockContext.class,i);
		}
		public List<Var_blockContext> var_block() {
			return getRuleContexts(Var_blockContext.class);
		}
		public Var_blockContext var_block(int i) {
			return getRuleContext(Var_blockContext.class,i);
		}
		public List<Stmt_blockContext> stmt_block() {
			return getRuleContexts(Stmt_blockContext.class);
		}
		public Stmt_blockContext stmt_block(int i) {
			return getRuleContext(Stmt_blockContext.class,i);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2ParserVisitor ) return ((Jinja2ParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 22L) != 0)) {
				{
				setState(55);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEXT:
					{
					setState(52);
					text_block();
					}
					break;
				case VAR_START:
					{
					setState(53);
					var_block();
					}
					break;
				case TEMPLATE_START:
					{
					setState(54);
					stmt_block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
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
	public static class Text_blockContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(Jinja2Parser.TEXT, 0); }
		public Text_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).enterText_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).exitText_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2ParserVisitor ) return ((Jinja2ParserVisitor<? extends T>)visitor).visitText_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_blockContext text_block() throws RecognitionException {
		Text_blockContext _localctx = new Text_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_text_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(TEXT);
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
	public static class Var_blockContext extends ParserRuleContext {
		public TerminalNode VAR_START() { return getToken(Jinja2Parser.VAR_START, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EXPR_END() { return getToken(Jinja2Parser.EXPR_END, 0); }
		public Var_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).enterVar_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).exitVar_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2ParserVisitor ) return ((Jinja2ParserVisitor<? extends T>)visitor).visitVar_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_blockContext var_block() throws RecognitionException {
		Var_blockContext _localctx = new Var_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(VAR_START);
			setState(65);
			expr(0);
			setState(66);
			match(EXPR_END);
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
	public static class Stmt_blockContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_START() { return getToken(Jinja2Parser.TEMPLATE_START, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode STMT_END() { return getToken(Jinja2Parser.STMT_END, 0); }
		public Stmt_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).enterStmt_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).exitStmt_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2ParserVisitor ) return ((Jinja2ParserVisitor<? extends T>)visitor).visitStmt_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_blockContext stmt_block() throws RecognitionException {
		Stmt_blockContext _localctx = new Stmt_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(TEMPLATE_START);
			setState(69);
			statement();
			setState(70);
			match(STMT_END);
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
	public static class StatementContext extends ParserRuleContext {
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public Extends_statementContext extends_statement() {
			return getRuleContext(Extends_statementContext.class,0);
		}
		public Include_statementContext include_statement() {
			return getRuleContext(Include_statementContext.class,0);
		}
		public Set_statementContext set_statement() {
			return getRuleContext(Set_statementContext.class,0);
		}
		public Macro_statementContext macro_statement() {
			return getRuleContext(Macro_statementContext.class,0);
		}
		public Expr_statementContext expr_statement() {
			return getRuleContext(Expr_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2ParserVisitor ) return ((Jinja2ParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				for_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				if_statement();
				}
				break;
			case BLOCK:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				block_statement();
				}
				break;
			case EXTENDS:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				extends_statement();
				}
				break;
			case INCLUDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				include_statement();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				set_statement();
				}
				break;
			case MACRO:
				enterOuterAlt(_localctx, 7);
				{
				setState(78);
				macro_statement();
				}
				break;
			case LPAREN:
			case NOT:
			case EXPR_ID:
			case EXPR_NUMBER:
			case EXPR_STRING:
				enterOuterAlt(_localctx, 8);
				{
				setState(79);
				expr_statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Jinja2Parser.FOR, 0); }
		public TerminalNode ID() { return getToken(Jinja2Parser.ID, 0); }
		public TerminalNode IN() { return getToken(Jinja2Parser.IN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public For_bodyContext for_body() {
			return getRuleContext(For_bodyContext.class,0);
		}
		public TerminalNode ENDFOR() { return getToken(Jinja2Parser.ENDFOR, 0); }
		public TerminalNode IF() { return getToken(Jinja2Parser.IF, 0); }
		public TerminalNode COLON() { return getToken(Jinja2Parser.COLON, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2ParserVisitor ) return ((Jinja2ParserVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(FOR);
			setState(83);
			match(ID);
			setState(84);
			match(IN);
			setState(85);
			expr(0);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(86);
				match(IF);
				setState(87);
				expr(0);
				}
			}

			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(90);
				match(COLON);
				}
			}

			setState(93);
			for_body();
			setState(94);
			match(ENDFOR);
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
	public static class For_bodyContext extends ParserRuleContext {
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public For_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).enterFor_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).exitFor_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2ParserVisitor ) return ((Jinja2ParserVisitor<? extends T>)visitor).visitFor_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_bodyContext for_body() throws RecognitionException {
		For_bodyContext _localctx = new For_bodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			template();
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
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Jinja2Parser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public If_bodyContext if_body() {
			return getRuleContext(If_bodyContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(Jinja2Parser.ENDIF, 0); }
		public List<TerminalNode> COLON() { return getTokens(Jinja2Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Jinja2Parser.COLON, i);
		}
		public List<TerminalNode> ELIF() { return getTokens(Jinja2Parser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(Jinja2Parser.ELIF, i);
		}
		public List<Elif_bodyContext> elif_body() {
			return getRuleContexts(Elif_bodyContext.class);
		}
		public Elif_bodyContext elif_body(int i) {
			return getRuleContext(Elif_bodyContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(Jinja2Parser.ELSE, 0); }
		public Else_bodyContext else_body() {
			return getRuleContext(Else_bodyContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2ParserVisitor ) return ((Jinja2ParserVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(IF);
			setState(99);
			expr(0);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(100);
				match(COLON);
				}
			}

			setState(103);
			if_body();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(104);
				match(ELIF);
				setState(105);
				expr(0);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(106);
					match(COLON);
					}
				}

				setState(109);
				elif_body();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(116);
				match(ELSE);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(117);
					match(COLON);
					}
				}

				setState(120);
				else_body();
				}
			}

			setState(123);
			match(ENDIF);
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
	public static class If_bodyContext extends ParserRuleContext {
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public If_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).enterIf_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).exitIf_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2ParserVisitor ) return ((Jinja2ParserVisitor<? extends T>)visitor).visitIf_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_bodyContext if_body() throws RecognitionException {
		If_bodyContext _localctx = new If_bodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_if_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			template();
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
	public static class Elif_bodyContext extends ParserRuleContext {
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public Elif_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).enterElif_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).exitElif_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2ParserVisitor ) return ((Jinja2ParserVisitor<? extends T>)visitor).visitElif_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_bodyContext elif_body() throws RecognitionException {
		Elif_bodyContext _localctx = new Elif_bodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elif_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			template();
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
	public static class Else_bodyContext extends ParserRuleContext {
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public Else_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).enterElse_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).exitElse_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2ParserVisitor ) return ((Jinja2ParserVisitor<? extends T>)visitor).visitElse_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_bodyContext else_body() throws RecognitionException {
		Else_bodyContext _localctx = new Else_bodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_else_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			template();
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
	public static class Block_statementContext extends ParserRuleContext {
		public TerminalNode BLOCK() { return getToken(Jinja2Parser.BLOCK, 0); }
		public TerminalNode ID() { return getToken(Jinja2Parser.ID, 0); }
		public Block_bodyContext block_body() {
			return getRuleContext(Block_bodyContext.class,0);
		}
		public TerminalNode ENDBLOCK() { return getToken(Jinja2Parser.ENDBLOCK, 0); }
		public TerminalNode COLON() { return getToken(Jinja2Parser.COLON, 0); }
		public Block_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).enterBlock_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).exitBlock_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2ParserVisitor ) return ((Jinja2ParserVisitor<? extends T>)visitor).visitBlock_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_statementContext block_statement() throws RecognitionException {
		Block_statementContext _localctx = new Block_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_block_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(BLOCK);
			setState(132);
			match(ID);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(133);
				match(COLON);
				}
			}

			setState(136);
			block_body();
			setState(137);
			match(ENDBLOCK);
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
	public static class Block_bodyContext extends ParserRuleContext {
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public Block_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).enterBlock_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).exitBlock_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2ParserVisitor ) return ((Jinja2ParserVisitor<? extends T>)visitor).visitBlock_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_bodyContext block_body() throws RecognitionException {
		Block_bodyContext _localctx = new Block_bodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			template();
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
	public static class Extends_statementContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(Jinja2Parser.EXTENDS, 0); }
		public TerminalNode STRING() { return getToken(Jinja2Parser.STRING, 0); }
		public Extends_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extends_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).enterExtends_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).exitExtends_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2ParserVisitor ) return ((Jinja2ParserVisitor<? extends T>)visitor).visitExtends_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extends_statementContext extends_statement() throws RecognitionException {
		Extends_statementContext _localctx = new Extends_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_extends_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(EXTENDS);
			setState(142);
			match(STRING);
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
	public static class Include_statementContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(Jinja2Parser.INCLUDE, 0); }
		public TerminalNode STRING() { return getToken(Jinja2Parser.STRING, 0); }
		public TerminalNode WITH() { return getToken(Jinja2Parser.WITH, 0); }
		public ContextContext context() {
			return getRuleContext(ContextContext.class,0);
		}
		public Include_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).enterInclude_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).exitInclude_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2ParserVisitor ) return ((Jinja2ParserVisitor<? extends T>)visitor).visitInclude_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Include_statementContext include_statement() throws RecognitionException {
		Include_statementContext _localctx = new Include_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_include_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(INCLUDE);
			setState(145);
			match(STRING);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(146);
				match(WITH);
				setState(147);
				context();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Set_statementContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(Jinja2Parser.SET, 0); }
		public TerminalNode ID() { return getToken(Jinja2Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Jinja2Parser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Set_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).enterSet_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).exitSet_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2ParserVisitor ) return ((Jinja2ParserVisitor<? extends T>)visitor).visitSet_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_statementContext set_statement() throws RecognitionException {
		Set_statementContext _localctx = new Set_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_set_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(SET);
			setState(151);
			match(ID);
			setState(152);
			match(ASSIGN);
			setState(153);
			expr(0);
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
	public static class Macro_statementContext extends ParserRuleContext {
		public TerminalNode MACRO() { return getToken(Jinja2Parser.MACRO, 0); }
		public TerminalNode ID() { return getToken(Jinja2Parser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(Jinja2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Jinja2Parser.RPAREN, 0); }
		public Macro_bodyContext macro_body() {
			return getRuleContext(Macro_bodyContext.class,0);
		}
		public TerminalNode ENDMACRO() { return getToken(Jinja2Parser.ENDMACRO, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Jinja2Parser.COLON, 0); }
		public Macro_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).enterMacro_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).exitMacro_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2ParserVisitor ) return ((Jinja2ParserVisitor<? extends T>)visitor).visitMacro_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_statementContext macro_statement() throws RecognitionException {
		Macro_statementContext _localctx = new Macro_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_macro_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(MACRO);
			setState(156);
			match(ID);
			setState(157);
			match(LPAREN);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(158);
				params();
				}
			}

			setState(161);
			match(RPAREN);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(162);
				match(COLON);
				}
			}

			setState(165);
			macro_body();
			setState(166);
			match(ENDMACRO);
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
	public static class ParamsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(Jinja2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Jinja2Parser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Jinja2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Jinja2Parser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2ParserVisitor ) return ((Jinja2ParserVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(ID);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(169);
				match(COMMA);
				setState(170);
				match(ID);
				}
				}
				setState(175);
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
	public static class Macro_bodyContext extends ParserRuleContext {
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public Macro_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).enterMacro_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).exitMacro_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2ParserVisitor ) return ((Jinja2ParserVisitor<? extends T>)visitor).visitMacro_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_bodyContext macro_body() throws RecognitionException {
		Macro_bodyContext _localctx = new Macro_bodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_macro_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			template();
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
	public static class Expr_statementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).enterExpr_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).exitExpr_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2ParserVisitor ) return ((Jinja2ParserVisitor<? extends T>)visitor).visitExpr_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_statementContext expr_statement() throws RecognitionException {
		Expr_statementContext _localctx = new Expr_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			expr(0);
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
	public static class ExprContext extends ParserRuleContext {
		public Token op;
		public TerminalNode NOT() { return getToken(Jinja2Parser.NOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode MULT() { return getToken(Jinja2Parser.MULT, 0); }
		public TerminalNode DIV() { return getToken(Jinja2Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(Jinja2Parser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(Jinja2Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(Jinja2Parser.MINUS, 0); }
		public TerminalNode EQ() { return getToken(Jinja2Parser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(Jinja2Parser.NEQ, 0); }
		public TerminalNode LT() { return getToken(Jinja2Parser.LT, 0); }
		public TerminalNode GT() { return getToken(Jinja2Parser.GT, 0); }
		public TerminalNode LTE() { return getToken(Jinja2Parser.LTE, 0); }
		public TerminalNode GTE() { return getToken(Jinja2Parser.GTE, 0); }
		public TerminalNode AND() { return getToken(Jinja2Parser.AND, 0); }
		public TerminalNode OR() { return getToken(Jinja2Parser.OR, 0); }
		public TerminalNode PIPE() { return getToken(Jinja2Parser.PIPE, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2ParserVisitor ) return ((Jinja2ParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(181);
				match(NOT);
				setState(182);
				expr(3);
				}
				break;
			case LPAREN:
			case EXPR_ID:
			case EXPR_NUMBER:
			case EXPR_STRING:
				{
				setState(183);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(204);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(187);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30786325577728L) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(188);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(190);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(191);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(193);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2216615441596416L) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(194);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(195);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(196);
						match(AND);
						setState(197);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(198);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(199);
						match(OR);
						setState(200);
						expr(5);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(201);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(202);
						match(PIPE);
						setState(203);
						filter();
						}
						break;
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FilterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Jinja2Parser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(Jinja2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Jinja2Parser.RPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).exitFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2ParserVisitor ) return ((Jinja2ParserVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_filter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(ID);
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(210);
				match(LPAREN);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1017813516322603008L) != 0)) {
					{
					setState(211);
					args();
					}
				}

				setState(214);
				match(RPAREN);
				}
				break;
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
	public static class AtomContext extends ParserRuleContext {
		public TerminalNode EXPR_NUMBER() { return getToken(Jinja2Parser.EXPR_NUMBER, 0); }
		public TerminalNode EXPR_STRING() { return getToken(Jinja2Parser.EXPR_STRING, 0); }
		public List<TerminalNode> EXPR_ID() { return getTokens(Jinja2Parser.EXPR_ID); }
		public TerminalNode EXPR_ID(int i) {
			return getToken(Jinja2Parser.EXPR_ID, i);
		}
		public TerminalNode DOT() { return getToken(Jinja2Parser.DOT, 0); }
		public TerminalNode LBRACK() { return getToken(Jinja2Parser.LBRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Jinja2Parser.RBRACK, 0); }
		public TerminalNode LPAREN() { return getToken(Jinja2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Jinja2Parser.RPAREN, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2ParserVisitor ) return ((Jinja2ParserVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_atom);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(EXPR_NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(EXPR_STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(EXPR_ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				match(EXPR_ID);
				setState(221);
				match(DOT);
				setState(222);
				match(EXPR_ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				match(EXPR_ID);
				setState(224);
				match(LBRACK);
				setState(225);
				expr(0);
				setState(226);
				match(RBRACK);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(228);
				match(LPAREN);
				setState(229);
				expr(0);
				setState(230);
				match(RPAREN);
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
	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Jinja2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Jinja2Parser.COMMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2ParserVisitor ) return ((Jinja2ParserVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			expr(0);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(235);
				match(COMMA);
				setState(236);
				expr(0);
				}
				}
				setState(241);
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
	public static class ContextContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Jinja2Parser.LBRACE, 0); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(Jinja2Parser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Jinja2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Jinja2Parser.COMMA, i);
		}
		public ContextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).enterContext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).exitContext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2ParserVisitor ) return ((Jinja2ParserVisitor<? extends T>)visitor).visitContext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContextContext context() throws RecognitionException {
		ContextContext _localctx = new ContextContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_context);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(LBRACE);
			setState(243);
			pair();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(244);
				match(COMMA);
				setState(245);
				pair();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
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
	public static class PairContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Jinja2Parser.ID, 0); }
		public TerminalNode COLON() { return getToken(Jinja2Parser.COLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Jinja2ParserListener ) ((Jinja2ParserListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Jinja2ParserVisitor ) return ((Jinja2ParserVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(ID);
			setState(254);
			match(COLON);
			setState(255);
			expr(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001H\u0102\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"8\b\u0000\n\u0000\f\u0000;\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"Q\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005Y\b\u0005\u0001\u0005\u0003\u0005\\\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007f\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007l\b\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007p\b\u0007\n\u0007\f\u0007s\t\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007w\b\u0007\u0001\u0007\u0003\u0007z\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u0087\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u0095\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00a0\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00a4"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u00ac\b\u0011\n\u0011\f\u0011\u00af\t\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u00b9\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00cd\b\u0014\n\u0014"+
		"\f\u0014\u00d0\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u00d5\b\u0015\u0001\u0015\u0003\u0015\u00d8\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u00e9\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u00ee\b\u0017\n\u0017\f\u0017\u00f1\t\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u00f7\b\u0018\n\u0018"+
		"\f\u0018\u00fa\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0000\u0001(\u001a\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02\u0000\u0003\u0001\u0000*,\u0001\u0000()\u0001\u0000-2\u010d\u0000"+
		"9\u0001\u0000\u0000\u0000\u0002>\u0001\u0000\u0000\u0000\u0004@\u0001"+
		"\u0000\u0000\u0000\u0006D\u0001\u0000\u0000\u0000\bP\u0001\u0000\u0000"+
		"\u0000\nR\u0001\u0000\u0000\u0000\f`\u0001\u0000\u0000\u0000\u000eb\u0001"+
		"\u0000\u0000\u0000\u0010}\u0001\u0000\u0000\u0000\u0012\u007f\u0001\u0000"+
		"\u0000\u0000\u0014\u0081\u0001\u0000\u0000\u0000\u0016\u0083\u0001\u0000"+
		"\u0000\u0000\u0018\u008b\u0001\u0000\u0000\u0000\u001a\u008d\u0001\u0000"+
		"\u0000\u0000\u001c\u0090\u0001\u0000\u0000\u0000\u001e\u0096\u0001\u0000"+
		"\u0000\u0000 \u009b\u0001\u0000\u0000\u0000\"\u00a8\u0001\u0000\u0000"+
		"\u0000$\u00b0\u0001\u0000\u0000\u0000&\u00b2\u0001\u0000\u0000\u0000("+
		"\u00b8\u0001\u0000\u0000\u0000*\u00d1\u0001\u0000\u0000\u0000,\u00e8\u0001"+
		"\u0000\u0000\u0000.\u00ea\u0001\u0000\u0000\u00000\u00f2\u0001\u0000\u0000"+
		"\u00002\u00fd\u0001\u0000\u0000\u000048\u0003\u0002\u0001\u000058\u0003"+
		"\u0004\u0002\u000068\u0003\u0006\u0003\u000074\u0001\u0000\u0000\u0000"+
		"75\u0001\u0000\u0000\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000"+
		"\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000<=\u0005\u0000\u0000\u0001=\u0001"+
		"\u0001\u0000\u0000\u0000>?\u0005\u0004\u0000\u0000?\u0003\u0001\u0000"+
		"\u0000\u0000@A\u0005\u0002\u0000\u0000AB\u0003(\u0014\u0000BC\u00058\u0000"+
		"\u0000C\u0005\u0001\u0000\u0000\u0000DE\u0005\u0001\u0000\u0000EF\u0003"+
		"\b\u0004\u0000FG\u0005\u0005\u0000\u0000G\u0007\u0001\u0000\u0000\u0000"+
		"HQ\u0003\n\u0005\u0000IQ\u0003\u000e\u0007\u0000JQ\u0003\u0016\u000b\u0000"+
		"KQ\u0003\u001a\r\u0000LQ\u0003\u001c\u000e\u0000MQ\u0003\u001e\u000f\u0000"+
		"NQ\u0003 \u0010\u0000OQ\u0003&\u0013\u0000PH\u0001\u0000\u0000\u0000P"+
		"I\u0001\u0000\u0000\u0000PJ\u0001\u0000\u0000\u0000PK\u0001\u0000\u0000"+
		"\u0000PL\u0001\u0000\u0000\u0000PM\u0001\u0000\u0000\u0000PN\u0001\u0000"+
		"\u0000\u0000PO\u0001\u0000\u0000\u0000Q\t\u0001\u0000\u0000\u0000RS\u0005"+
		"\u0006\u0000\u0000ST\u0005\u001a\u0000\u0000TU\u0005\u0007\u0000\u0000"+
		"UX\u0003(\u0014\u0000VW\u0005\t\u0000\u0000WY\u0003(\u0014\u0000XV\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000"+
		"Z\\\u0005\'\u0000\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]^\u0003\f\u0006\u0000^_\u0005\b\u0000"+
		"\u0000_\u000b\u0001\u0000\u0000\u0000`a\u0003\u0000\u0000\u0000a\r\u0001"+
		"\u0000\u0000\u0000bc\u0005\t\u0000\u0000ce\u0003(\u0014\u0000df\u0005"+
		"\'\u0000\u0000ed\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000gq\u0003\u0010\b\u0000hi\u0005\u000b\u0000\u0000ik\u0003"+
		"(\u0014\u0000jl\u0005\'\u0000\u0000kj\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0003\u0012\t\u0000np\u0001"+
		"\u0000\u0000\u0000oh\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000ry\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000tv\u0005\n\u0000\u0000uw\u0005\'\u0000"+
		"\u0000vu\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000xz\u0003\u0014\n\u0000yt\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0005\f\u0000\u0000|\u000f\u0001"+
		"\u0000\u0000\u0000}~\u0003\u0000\u0000\u0000~\u0011\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0003\u0000\u0000\u0000\u0080\u0013\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0003\u0000\u0000\u0000\u0082\u0015\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0005\r\u0000\u0000\u0084\u0086\u0005\u001a\u0000\u0000"+
		"\u0085\u0087\u0005\'\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0003\u0018\f\u0000\u0089\u008a\u0005\u000e\u0000\u0000\u008a\u0017"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0003\u0000\u0000\u0000\u008c\u0019"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u000f\u0000\u0000\u008e\u008f"+
		"\u0005\u001c\u0000\u0000\u008f\u001b\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0005\u0010\u0000\u0000\u0091\u0094\u0005\u001c\u0000\u0000\u0092\u0093"+
		"\u0005\u0016\u0000\u0000\u0093\u0095\u00030\u0018\u0000\u0094\u0092\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u001d\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0005\u0011\u0000\u0000\u0097\u0098\u0005"+
		"\u001a\u0000\u0000\u0098\u0099\u0005&\u0000\u0000\u0099\u009a\u0003(\u0014"+
		"\u0000\u009a\u001f\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u0012\u0000"+
		"\u0000\u009c\u009d\u0005\u001a\u0000\u0000\u009d\u009f\u0005\u001d\u0000"+
		"\u0000\u009e\u00a0\u0003\"\u0011\u0000\u009f\u009e\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a3\u0005\u001e\u0000\u0000\u00a2\u00a4\u0005\'\u0000\u0000\u00a3"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0003$\u0012\u0000\u00a6\u00a7"+
		"\u0005\u0013\u0000\u0000\u00a7!\u0001\u0000\u0000\u0000\u00a8\u00ad\u0005"+
		"\u001a\u0000\u0000\u00a9\u00aa\u0005#\u0000\u0000\u00aa\u00ac\u0005\u001a"+
		"\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae#\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0003\u0000\u0000\u0000\u00b1%\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0003(\u0014\u0000\u00b3\'\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0006\u0014\uffff\uffff\u0000\u00b5\u00b6\u00055\u0000\u0000\u00b6"+
		"\u00b9\u0003(\u0014\u0003\u00b7\u00b9\u0003,\u0016\u0000\u00b8\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ce\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\n\b\u0000\u0000\u00bb\u00bc\u0007\u0000"+
		"\u0000\u0000\u00bc\u00cd\u0003(\u0014\t\u00bd\u00be\n\u0007\u0000\u0000"+
		"\u00be\u00bf\u0007\u0001\u0000\u0000\u00bf\u00cd\u0003(\u0014\b\u00c0"+
		"\u00c1\n\u0006\u0000\u0000\u00c1\u00c2\u0007\u0002\u0000\u0000\u00c2\u00cd"+
		"\u0003(\u0014\u0007\u00c3\u00c4\n\u0005\u0000\u0000\u00c4\u00c5\u0005"+
		"3\u0000\u0000\u00c5\u00cd\u0003(\u0014\u0006\u00c6\u00c7\n\u0004\u0000"+
		"\u0000\u00c7\u00c8\u00054\u0000\u0000\u00c8\u00cd\u0003(\u0014\u0005\u00c9"+
		"\u00ca\n\u0002\u0000\u0000\u00ca\u00cb\u0005%\u0000\u0000\u00cb\u00cd"+
		"\u0003*\u0015\u0000\u00cc\u00ba\u0001\u0000\u0000\u0000\u00cc\u00bd\u0001"+
		"\u0000\u0000\u0000\u00cc\u00c0\u0001\u0000\u0000\u0000\u00cc\u00c3\u0001"+
		"\u0000\u0000\u0000\u00cc\u00c6\u0001\u0000\u0000\u0000\u00cc\u00c9\u0001"+
		"\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf)\u0001\u0000"+
		"\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d7\u0005\u001a"+
		"\u0000\u0000\u00d2\u00d4\u0005\u001d\u0000\u0000\u00d3\u00d5\u0003.\u0017"+
		"\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d8\u0005\u001e\u0000"+
		"\u0000\u00d7\u00d2\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d8+\u0001\u0000\u0000\u0000\u00d9\u00e9\u0005:\u0000\u0000\u00da"+
		"\u00e9\u0005;\u0000\u0000\u00db\u00e9\u00059\u0000\u0000\u00dc\u00dd\u0005"+
		"9\u0000\u0000\u00dd\u00de\u0005$\u0000\u0000\u00de\u00e9\u00059\u0000"+
		"\u0000\u00df\u00e0\u00059\u0000\u0000\u00e0\u00e1\u0005\u001f\u0000\u0000"+
		"\u00e1\u00e2\u0003(\u0014\u0000\u00e2\u00e3\u0005 \u0000\u0000\u00e3\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\u001d\u0000\u0000\u00e5\u00e6"+
		"\u0003(\u0014\u0000\u00e6\u00e7\u0005\u001e\u0000\u0000\u00e7\u00e9\u0001"+
		"\u0000\u0000\u0000\u00e8\u00d9\u0001\u0000\u0000\u0000\u00e8\u00da\u0001"+
		"\u0000\u0000\u0000\u00e8\u00db\u0001\u0000\u0000\u0000\u00e8\u00dc\u0001"+
		"\u0000\u0000\u0000\u00e8\u00df\u0001\u0000\u0000\u0000\u00e8\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e9-\u0001\u0000\u0000\u0000\u00ea\u00ef\u0003(\u0014"+
		"\u0000\u00eb\u00ec\u0005#\u0000\u0000\u00ec\u00ee\u0003(\u0014\u0000\u00ed"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0"+
		"/\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0005!\u0000\u0000\u00f3\u00f8\u00032\u0019\u0000\u00f4\u00f5\u0005#"+
		"\u0000\u0000\u00f5\u00f7\u00032\u0019\u0000\u00f6\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005\"\u0000\u0000"+
		"\u00fc1\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u001a\u0000\u0000\u00fe"+
		"\u00ff\u0005\'\u0000\u0000\u00ff\u0100\u0003(\u0014\u0000\u01003\u0001"+
		"\u0000\u0000\u0000\u001779PX[ekqvy\u0086\u0094\u009f\u00a3\u00ad\u00b8"+
		"\u00cc\u00ce\u00d4\u00d7\u00e8\u00ef\u00f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}