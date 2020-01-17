// Generated from csce322a01part01.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322a01part01Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SECTIONBEGINNING=1, SECTIONENDING=2, SECTIONTITLE=3, ASSIGNVALUE=4, LISTBEGINNING=5, 
		MAZEBEGINNING=6, MOVESYMBOLS=7, MAZESYMBOLS=8, LISTENDING=9, MAZEENDING=10, 
		WHITESPACE=11, ANYTHING=12;
	public static final int
		RULE_start = 0, RULE_contains = 1, RULE_section = 2, RULE_begin = 3, RULE_symbols = 4, 
		RULE_end = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "contains", "section", "begin", "symbols", "end"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", null, "'@'", "'['", "'('", null, null, "']'", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SECTIONBEGINNING", "SECTIONENDING", "SECTIONTITLE", "ASSIGNVALUE", 
			"LISTBEGINNING", "MAZEBEGINNING", "MOVESYMBOLS", "MAZESYMBOLS", "LISTENDING", 
			"MAZEENDING", "WHITESPACE", "ANYTHING"
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
	public String getGrammarFileName() { return "csce322a01part01.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public csce322a01part01Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public ContainsContext contains() {
			return getRuleContext(ContainsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(csce322a01part01Parser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part01Listener ) ((csce322a01part01Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part01Listener ) ((csce322a01part01Listener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			contains();
			setState(13);
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

	public static class ContainsContext extends ParserRuleContext {
		public List<TerminalNode> SECTIONBEGINNING() { return getTokens(csce322a01part01Parser.SECTIONBEGINNING); }
		public TerminalNode SECTIONBEGINNING(int i) {
			return getToken(csce322a01part01Parser.SECTIONBEGINNING, i);
		}
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public List<TerminalNode> SECTIONENDING() { return getTokens(csce322a01part01Parser.SECTIONENDING); }
		public TerminalNode SECTIONENDING(int i) {
			return getToken(csce322a01part01Parser.SECTIONENDING, i);
		}
		public ContainsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contains; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part01Listener ) ((csce322a01part01Listener)listener).enterContains(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part01Listener ) ((csce322a01part01Listener)listener).exitContains(this);
		}
	}

	public final ContainsContext contains() throws RecognitionException {
		ContainsContext _localctx = new ContainsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_contains);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(SECTIONBEGINNING);
			setState(16);
			section();
			setState(17);
			match(SECTIONENDING);
			setState(18);
			match(SECTIONBEGINNING);
			setState(19);
			section();
			setState(20);
			match(SECTIONENDING);
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

	public static class SectionContext extends ParserRuleContext {
		public TerminalNode SECTIONTITLE() { return getToken(csce322a01part01Parser.SECTIONTITLE, 0); }
		public TerminalNode ASSIGNVALUE() { return getToken(csce322a01part01Parser.ASSIGNVALUE, 0); }
		public BeginContext begin() {
			return getRuleContext(BeginContext.class,0);
		}
		public SymbolsContext symbols() {
			return getRuleContext(SymbolsContext.class,0);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part01Listener ) ((csce322a01part01Listener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part01Listener ) ((csce322a01part01Listener)listener).exitSection(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(SECTIONTITLE);
			setState(23);
			match(ASSIGNVALUE);
			setState(24);
			begin();
			setState(25);
			symbols();

						 
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
		public TerminalNode LISTBEGINNING() { return getToken(csce322a01part01Parser.LISTBEGINNING, 0); }
		public TerminalNode MAZEBEGINNING() { return getToken(csce322a01part01Parser.MAZEBEGINNING, 0); }
		public BeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part01Listener ) ((csce322a01part01Listener)listener).enterBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part01Listener ) ((csce322a01part01Listener)listener).exitBegin(this);
		}
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_begin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_la = _input.LA(1);
			if ( !(_la==LISTBEGINNING || _la==MAZEBEGINNING) ) {
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

	public static class SymbolsContext extends ParserRuleContext {
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<TerminalNode> MOVESYMBOLS() { return getTokens(csce322a01part01Parser.MOVESYMBOLS); }
		public TerminalNode MOVESYMBOLS(int i) {
			return getToken(csce322a01part01Parser.MOVESYMBOLS, i);
		}
		public List<TerminalNode> MAZESYMBOLS() { return getTokens(csce322a01part01Parser.MAZESYMBOLS); }
		public TerminalNode MAZESYMBOLS(int i) {
			return getToken(csce322a01part01Parser.MAZESYMBOLS, i);
		}
		public SymbolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part01Listener ) ((csce322a01part01Listener)listener).enterSymbols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part01Listener ) ((csce322a01part01Listener)listener).exitSymbols(this);
		}
	}

	public final SymbolsContext symbols() throws RecognitionException {
		SymbolsContext _localctx = new SymbolsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_symbols);
		int _la;
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MOVESYMBOLS) {
					{
					{
					setState(30);
					match(MOVESYMBOLS);
					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(36);
				end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MAZESYMBOLS) {
					{
					{
					setState(37);
					match(MAZESYMBOLS);
					}
					}
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(43);
				end();
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

	public static class EndContext extends ParserRuleContext {
		public TerminalNode LISTENDING() { return getToken(csce322a01part01Parser.LISTENDING, 0); }
		public TerminalNode MAZEENDING() { return getToken(csce322a01part01Parser.MAZEENDING, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part01Listener ) ((csce322a01part01Listener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part01Listener ) ((csce322a01part01Listener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !(_la==LISTENDING || _la==MAZEENDING) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16\63\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\7\6\"\n\6\f\6\16\6%\13\6\3"+
		"\6\3\6\7\6)\n\6\f\6\16\6,\13\6\3\6\5\6/\n\6\3\7\3\7\3\7\2\2\b\2\4\6\b"+
		"\n\f\2\4\3\2\7\b\3\2\13\f\2/\2\16\3\2\2\2\4\21\3\2\2\2\6\30\3\2\2\2\b"+
		"\36\3\2\2\2\n.\3\2\2\2\f\60\3\2\2\2\16\17\5\4\3\2\17\20\7\2\2\3\20\3\3"+
		"\2\2\2\21\22\7\3\2\2\22\23\5\6\4\2\23\24\7\4\2\2\24\25\7\3\2\2\25\26\5"+
		"\6\4\2\26\27\7\4\2\2\27\5\3\2\2\2\30\31\7\5\2\2\31\32\7\6\2\2\32\33\5"+
		"\b\5\2\33\34\5\n\6\2\34\35\b\4\1\2\35\7\3\2\2\2\36\37\t\2\2\2\37\t\3\2"+
		"\2\2 \"\7\t\2\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3"+
		"\2\2\2&/\5\f\7\2\')\7\n\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+"+
		"-\3\2\2\2,*\3\2\2\2-/\5\f\7\2.#\3\2\2\2.*\3\2\2\2/\13\3\2\2\2\60\61\t"+
		"\3\2\2\61\r\3\2\2\2\5#*.";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}