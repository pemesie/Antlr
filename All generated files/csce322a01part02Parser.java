// Generated from csce322a01part02.g4 by ANTLR 4.7.2

	import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322a01part02Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SECTIONBEGINNING=1, SECTIONENDING=2, SECTIONTITLE=3, ASSIGNVALUE=4, LISTBEGINNING=5, 
		MAZEBEGINNING=6, MOVESYMBOLS=7, MAZESYMBOLS=8, ROWENDING=9, LISTENDING=10, 
		MAZEENDING=11, WHITESPACE=12, ANYTHING=13;
	public static final int
		RULE_mazeGame = 0, RULE_section = 1, RULE_begin = 2, RULE_symbols = 3, 
		RULE_validMove = 4, RULE_row = 5, RULE_end = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"mazeGame", "section", "begin", "symbols", "validMove", "row", "end"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", null, "'@'", "'['", "'('", null, null, "'$'", "']'", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SECTIONBEGINNING", "SECTIONENDING", "SECTIONTITLE", "ASSIGNVALUE", 
			"LISTBEGINNING", "MAZEBEGINNING", "MOVESYMBOLS", "MAZESYMBOLS", "ROWENDING", 
			"LISTENDING", "MAZEENDING", "WHITESPACE", "ANYTHING"
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
	public String getGrammarFileName() { return "csce322a01part02.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		int countMoves = 0;
		int countRows = 0 ;
		int countCharacters = 0;
		int countMaze = 0;
		int countValidMove = 0; 
		int nberOfColumns, countPlayers, countG, countX, countU, countD, countL,countR;
		String[] mazeSymbols;
		ArrayList<String> tempList ;
		ArrayList<String> listMoveSymbols  = new ArrayList<>();;
		ArrayList<ArrayList<String>> listMazeSymbols = new ArrayList<>(); 

		public void checkFirstAndLastRows(ArrayList<ArrayList<String>> list){
			int size = list.size();
			ArrayList<String> firstRow = list.get(0);
			ArrayList<String> lastRow = list.get(size - 1);

			firstRow.forEach( (n) -> { if(!n.equals("x")) 
										System.out.print("The first row of the maze contains symbol(s) other than x. Such as " + n);
									 });
			lastRow.forEach( (n) -> { if(!n.equals("x")) 
										System.out.print("The last row of the maze contains symbol(s) other than x. Such as " + n);
									 });
		}

		public void checkFirstAndLastColumns(ArrayList<ArrayList<String>> list){
			int size = list.get(0).size();
			for(ArrayList<String> e: list){
				if(!e.get(0).equals("x") | !e.get(size - 1).equals("x") )
					System.out.print("The first column or last column of the maze contains symbol(s) other than x. Such as " );
			}
		}

		public void checkMoveAppearances(ArrayList<String> list){
			list.forEach( (n) -> {
								// counting 'u','d','l', and 'r' in the maze
								if(n.equals("u")) countU++;
								if(n.equals("d")) countD++;
								if(n.equals("l")) countL++;
								if(n.equals("r")) countR++;
								}
								);
		}
		public void checkSemanticRules(ArrayList<ArrayList<String>> list){
			int size = list.get(0).size();
			for(ArrayList<String> e: list){
				e.forEach( (n) -> {
								  // counting players
								  try{
								  		int integ = Integer.parseInt(n);
								  		countPlayers++;	
								     }catch(NumberFormatException | NullPointerException nfe){}
								  // counting 'g' in the maze
								  if(n.equals("g")) countG++;
								  // counting 'x' in the maze
								  if(n.equals("x")) countX++;
								  }
				);
			}
		}

		//Every player must have at least one (1) valid move available to them
		public boolean checkPlayerMove(ArrayList<ArrayList<String>> list){
			int i, j;
			boolean bool = true;
			String left, right, up, down;
			int length1 = list.size();
			int length2 = list.get(0).size();
			for(i = 0; i < length1; i++){
				for(j = 0; j < length2; j++){
					if(list.get(i).get(j).equals("1") | list.get(i).get(j).equals("2") | list.get(i).get(j).equals("3") | list.get(i).get(j).equals("4") ){
						left = list.get(i).get(j-1);
						right = list.get(i).get(j+1);
						up = list.get(i-1).get(j);			
						down = list.get(i+1).get(j);

						if(left.equals("x") & right.equals("x") & up.equals("x") & down.equals("x")  ){
							bool = bool & false;
						}
					}
				}
			}

			return bool;			
		}

	public csce322a01part02Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MazeGameContext extends ParserRuleContext {
		public List<TerminalNode> SECTIONBEGINNING() { return getTokens(csce322a01part02Parser.SECTIONBEGINNING); }
		public TerminalNode SECTIONBEGINNING(int i) {
			return getToken(csce322a01part02Parser.SECTIONBEGINNING, i);
		}
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public List<TerminalNode> SECTIONENDING() { return getTokens(csce322a01part02Parser.SECTIONENDING); }
		public TerminalNode SECTIONENDING(int i) {
			return getToken(csce322a01part02Parser.SECTIONENDING, i);
		}
		public TerminalNode EOF() { return getToken(csce322a01part02Parser.EOF, 0); }
		public MazeGameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mazeGame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).enterMazeGame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).exitMazeGame(this);
		}
	}

	public final MazeGameContext mazeGame() throws RecognitionException {
		MazeGameContext _localctx = new MazeGameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mazeGame);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(SECTIONBEGINNING);
			setState(15);
			section();
			setState(16);
			match(SECTIONENDING);
			setState(17);
			match(SECTIONBEGINNING);
			setState(18);
			section();
			setState(19);
			match(SECTIONENDING);
			System.out.println("There are" +  countPlayers + "players")
			setState(21);
			match(EOF);

					//check:more than six (6) rows in a valid Maze and more than six (6) columns in a valid Maze 
					if(countRows < 7) System.out.println("The maze has less than 6 rows. It is " + String.valueOf(countRows)); 
				    int nbrOfColumns = countCharacters/countRows; 
				    if( nbrOfColumns < 7) System.out.println("The maze has less than 6 columns. It is " +  nbrOfColumns);
				    if(countValidMove < 4) System.out.println("The maze has less than 4 moves. It is " + countValidMove);

				    checkFirstAndLastRows(listMazeSymbols);
				    checkFirstAndLastColumns(listMazeSymbols);
				    
				    //Check semantic rules
				    checkSemanticRules(listMazeSymbols);
				    if(countPlayers < 1 | countPlayers > 4) System.out.println("Semantic Violation: Rule 1");
				    if(countG != 1) System.out.println("Semantic Violation: Rule 2");
				    if(countX > countCharacters/2) System.out.println("Semantic Violation: Rule 3");

				    checkMoveAppearances(listMoveSymbols);
				    if(countU == 0 | countD == 0 | countL == 0 | countR == 0) System.out.println("Semantic Violation: Rule 4");

				    if(!checkPlayerMove(listMazeSymbols)) System.out.println("Semantic Violation: Rule 5");
			    
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
		public TerminalNode SECTIONTITLE() { return getToken(csce322a01part02Parser.SECTIONTITLE, 0); }
		public TerminalNode ASSIGNVALUE() { return getToken(csce322a01part02Parser.ASSIGNVALUE, 0); }
		public BeginContext begin() {
			return getRuleContext(BeginContext.class,0);
		}
		public SymbolsContext symbols() {
			return getRuleContext(SymbolsContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).exitSection(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(SECTIONTITLE);
			setState(25);
			match(ASSIGNVALUE);
			setState(26);
			begin();
			setState(27);
			symbols();
			setState(28);
			end();
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
		public TerminalNode LISTBEGINNING() { return getToken(csce322a01part02Parser.LISTBEGINNING, 0); }
		public TerminalNode MAZEBEGINNING() { return getToken(csce322a01part02Parser.MAZEBEGINNING, 0); }
		public BeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).enterBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).exitBegin(this);
		}
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_begin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
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
		public ValidMoveContext validMove() {
			return getRuleContext(ValidMoveContext.class,0);
		}
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public TerminalNode ROWENDING() { return getToken(csce322a01part02Parser.ROWENDING, 0); }
		public SymbolsContext symbols() {
			return getRuleContext(SymbolsContext.class,0);
		}
		public SymbolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).enterSymbols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).exitSymbols(this);
		}
	}

	public final SymbolsContext symbols() throws RecognitionException {
		SymbolsContext _localctx = new SymbolsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_symbols);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				validMove();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					{
					setState(33);
					row();
					setState(34);
					match(ROWENDING);
					setState(35);
					symbols();
					}
					}
					break;
				case 2:
					{
					setState(37);
					row();
					}
					break;
				}
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

	public static class ValidMoveContext extends ParserRuleContext {
		public Token b;
		public List<TerminalNode> MOVESYMBOLS() { return getTokens(csce322a01part02Parser.MOVESYMBOLS); }
		public TerminalNode MOVESYMBOLS(int i) {
			return getToken(csce322a01part02Parser.MOVESYMBOLS, i);
		}
		public ValidMoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validMove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).enterValidMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).exitValidMove(this);
		}
	}

	public final ValidMoveContext validMove() throws RecognitionException {
		ValidMoveContext _localctx = new ValidMoveContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_validMove);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MOVESYMBOLS) {
				{
				{
				setState(42);
				((ValidMoveContext)_localctx).b = match(MOVESYMBOLS);
				 countValidMove++; String[] characters = new String[2]; characters = (((ValidMoveContext)_localctx).b!=null?((ValidMoveContext)_localctx).b.getText():null).split(""); listMoveSymbols.add(characters[0]); 
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

	public static class RowContext extends ParserRuleContext {
		public Token a;
		public List<TerminalNode> MAZESYMBOLS() { return getTokens(csce322a01part02Parser.MAZESYMBOLS); }
		public TerminalNode MAZESYMBOLS(int i) {
			return getToken(csce322a01part02Parser.MAZESYMBOLS, i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).exitRow(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 tempList  = new ArrayList<>();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAZESYMBOLS) {
				{
				{
				setState(50);
				((RowContext)_localctx).a = match(MAZESYMBOLS);
				countCharacters++; tempList.add(String.valueOf((((RowContext)_localctx).a!=null?((RowContext)_localctx).a.getText():null))); 
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			countRows++;  
			}
			_ctx.stop = _input.LT(-1);
			 listMazeSymbols.add(tempList); 
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
		public TerminalNode LISTENDING() { return getToken(csce322a01part02Parser.LISTENDING, 0); }
		public TerminalNode MAZEENDING() { return getToken(csce322a01part02Parser.MAZEENDING, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17@\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5)\n\5\5\5+\n\5\3\6\3\6\7\6/\n\6\f\6\16\6\62\13\6\3\7\3\7\3\7\7\7\67"+
		"\n\7\f\7\16\7:\13\7\3\7\3\7\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\4\3\2\7"+
		"\b\3\2\f\r\2<\2\20\3\2\2\2\4\32\3\2\2\2\6 \3\2\2\2\b*\3\2\2\2\n\60\3\2"+
		"\2\2\f\63\3\2\2\2\16=\3\2\2\2\20\21\7\3\2\2\21\22\5\4\3\2\22\23\7\4\2"+
		"\2\23\24\7\3\2\2\24\25\5\4\3\2\25\26\7\4\2\2\26\27\b\2\1\2\27\30\7\2\2"+
		"\3\30\31\b\2\1\2\31\3\3\2\2\2\32\33\7\5\2\2\33\34\7\6\2\2\34\35\5\6\4"+
		"\2\35\36\5\b\5\2\36\37\5\16\b\2\37\5\3\2\2\2 !\t\2\2\2!\7\3\2\2\2\"+\5"+
		"\n\6\2#$\5\f\7\2$%\7\13\2\2%&\5\b\5\2&)\3\2\2\2\')\5\f\7\2(#\3\2\2\2("+
		"\'\3\2\2\2)+\3\2\2\2*\"\3\2\2\2*(\3\2\2\2+\t\3\2\2\2,-\7\t\2\2-/\b\6\1"+
		"\2.,\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\13\3\2\2\2\62\60"+
		"\3\2\2\2\638\b\7\1\2\64\65\7\n\2\2\65\67\b\7\1\2\66\64\3\2\2\2\67:\3\2"+
		"\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\b\7\1\2<\r\3\2\2\2=>"+
		"\t\3\2\2>\17\3\2\2\2\6(*\608";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}