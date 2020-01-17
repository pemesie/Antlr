// Generated from csce322a01part02.g4 by ANTLR 4.7.2

	import java.util.ArrayList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322a01part02Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SECTIONBEGINNING=1, SECTIONENDING=2, SECTIONTITLE=3, ASSIGNVALUE=4, LISTBEGINNING=5, 
		MAZEBEGINNING=6, MOVESYMBOLS=7, MAZESYMBOLS=8, ROWENDING=9, LISTENDING=10, 
		MAZEENDING=11, WHITESPACE=12, ANYTHING=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SECTIONBEGINNING", "SECTIONENDING", "SECTIONTITLE", "ASSIGNVALUE", "LISTBEGINNING", 
			"MAZEBEGINNING", "MOVESYMBOLS", "MAZESYMBOLS", "ROWENDING", "LISTENDING", 
			"MAZEENDING", "WHITESPACE", "ANYTHING"
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


	public csce322a01part02Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "csce322a01part02.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 2:
			SECTIONTITLE_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			WHITESPACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			ANYTHING_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void SECTIONTITLE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

								if(getText().equals("Moves")) countMoves++;
								else countMaze++;
								
			break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 skip(); 
			break;
		}
	}
	private void ANYTHING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

						System.out.println("Something on Line " + getLine() + " is Problematic." );
						System.exit(1);  // ????????????????????? should I exit
						
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17L\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4-\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b=\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\3\2\4\6\2//\62;iizz\6\2\13\f\17\17\"\"aa\2O\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7,\3\2\2\2\t.\3\2\2\2\13\60"+
		"\3\2\2\2\r\62\3\2\2\2\17<\3\2\2\2\21>\3\2\2\2\23@\3\2\2\2\25B\3\2\2\2"+
		"\27D\3\2\2\2\31F\3\2\2\2\33I\3\2\2\2\35\36\7}\2\2\36\4\3\2\2\2\37 \7\177"+
		"\2\2 \6\3\2\2\2!\"\7O\2\2\"#\7q\2\2#$\7x\2\2$%\7g\2\2%-\7u\2\2&\'\7O\2"+
		"\2\'(\7c\2\2()\7|\2\2)*\7g\2\2*+\3\2\2\2+-\b\4\2\2,!\3\2\2\2,&\3\2\2\2"+
		"-\b\3\2\2\2./\7B\2\2/\n\3\2\2\2\60\61\7]\2\2\61\f\3\2\2\2\62\63\7*\2\2"+
		"\63\16\3\2\2\2\64\65\7w\2\2\65=\7a\2\2\66\67\7f\2\2\67=\7a\2\289\7n\2"+
		"\29=\7a\2\2:;\7t\2\2;=\7a\2\2<\64\3\2\2\2<\66\3\2\2\2<8\3\2\2\2<:\3\2"+
		"\2\2=\20\3\2\2\2>?\t\2\2\2?\22\3\2\2\2@A\7&\2\2A\24\3\2\2\2BC\7_\2\2C"+
		"\26\3\2\2\2DE\7+\2\2E\30\3\2\2\2FG\t\3\2\2GH\b\r\3\2H\32\3\2\2\2IJ\13"+
		"\2\2\2JK\b\16\4\2K\34\3\2\2\2\5\2,<\5\3\4\2\3\r\3\3\16\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}