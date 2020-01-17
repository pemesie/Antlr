// Generated from csce322a01part01.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322a01part01Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SECTIONBEGINNING=1, SECTIONENDING=2, SECTIONTITLE=3, ASSIGNVALUE=4, LISTBEGINNING=5, 
		MAZEBEGINNING=6, MOVESYMBOLS=7, MAZESYMBOLS=8, LISTENDING=9, MAZEENDING=10, 
		WHITESPACE=11, ANYTHING=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SECTIONBEGINNING", "SECTIONENDING", "SECTIONTITLE", "ASSIGNVALUE", "LISTBEGINNING", 
			"MAZEBEGINNING", "MOVESYMBOLS", "MAZESYMBOLS", "LISTENDING", "MAZEENDING", 
			"WHITESPACE", "ANYTHING"
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


	public csce322a01part01Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "csce322a01part01.g4"; }

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
		case 0:
			SECTIONBEGINNING_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			SECTIONENDING_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			SECTIONTITLE_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			ASSIGNVALUE_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			LISTBEGINNING_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			MAZEBEGINNING_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			MOVESYMBOLS_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			MAZESYMBOLS_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			LISTENDING_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			MAZEENDING_action((RuleContext)_localctx, actionIndex);
			break;
		case 10:
			WHITESPACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			ANYTHING_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void SECTIONBEGINNING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

								System.out.println("Section Beginning: " + getText()); 
			break;
		}
	}
	private void SECTIONENDING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

								 System.out.println("Section Ending: " + getText()); 
			break;
		}
	}
	private void SECTIONTITLE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

								System.out.println("Section Title: "  + getText()); 
			break;
		}
	}
	private void ASSIGNVALUE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:

								System.out.println("Assign Value: "  + getText()); 
			break;
		}
	}
	private void LISTBEGINNING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:

								System.out.println("List Beginning: "  + getText()); 
			break;
		}
	}
	private void MAZEBEGINNING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:

								System.out.println("Maze Beginning: "  + getText() );
			break;
		}
	}
	private void MOVESYMBOLS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:

								System.out.println("Move Symbol: "  + getText()); 
			break;
		}
	}
	private void MAZESYMBOLS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:

								String temp = getText();
								if(temp.length() < 2){
									System.out.println(" Maze Symbol: "  + temp);
								}
								else{
									String[] characters = new String[2];
									characters = temp.split("");
									System.out.println(" Maze Symbol: "  + characters[0]);
									System.out.println("Row  Ending: "  + characters[1]);
								}					
								
			break;
		}
	}
	private void LISTENDING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			System.out.println("List Ending: "  + getText());
			break;
		}
	}
	private void MAZEENDING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			System.out.println("Maze Ending: "  + getText());
			break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			 skip(); 
			break;
		}
	}
	private void ANYTHING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:

						System.out.println("Something on Line " + getLine() + " is Problematic.   " );
						System.exit(1); 
						
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16L\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4-\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\t\3\t\5\t=\n\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\3\2\6\6\2ffnnttww\6\2//\62;iizz\3\2&&\6\2\13\f\17\17\"\"aa\2M\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\3\33\3\2\2\2\5\36\3\2\2\2\7,\3\2\2\2\t.\3\2\2\2\13\61\3\2"+
		"\2\2\r\64\3\2\2\2\17\67\3\2\2\2\21:\3\2\2\2\23@\3\2\2\2\25C\3\2\2\2\27"+
		"F\3\2\2\2\31I\3\2\2\2\33\34\7}\2\2\34\35\b\2\2\2\35\4\3\2\2\2\36\37\7"+
		"\177\2\2\37 \b\3\3\2 \6\3\2\2\2!\"\7O\2\2\"#\7q\2\2#$\7x\2\2$%\7g\2\2"+
		"%-\7u\2\2&\'\7O\2\2\'(\7c\2\2()\7|\2\2)*\7g\2\2*+\3\2\2\2+-\b\4\4\2,!"+
		"\3\2\2\2,&\3\2\2\2-\b\3\2\2\2./\7B\2\2/\60\b\5\5\2\60\n\3\2\2\2\61\62"+
		"\7]\2\2\62\63\b\6\6\2\63\f\3\2\2\2\64\65\7*\2\2\65\66\b\7\7\2\66\16\3"+
		"\2\2\2\678\t\2\2\289\b\b\b\29\20\3\2\2\2:<\t\3\2\2;=\t\4\2\2<;\3\2\2\2"+
		"<=\3\2\2\2=>\3\2\2\2>?\b\t\t\2?\22\3\2\2\2@A\7_\2\2AB\b\n\n\2B\24\3\2"+
		"\2\2CD\7+\2\2DE\b\13\13\2E\26\3\2\2\2FG\t\5\2\2GH\b\f\f\2H\30\3\2\2\2"+
		"IJ\13\2\2\2JK\b\r\r\2K\32\3\2\2\2\5\2,<\16\3\2\2\3\3\3\3\4\4\3\5\5\3\6"+
		"\6\3\7\7\3\b\b\3\t\t\3\n\n\3\13\13\3\f\f\3\r\r";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}