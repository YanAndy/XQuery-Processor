// Generated from /Users/andy/Desktop/SanDiego/232B/milestone3/xquery-processor-master/src/main/resources/Join.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JoinLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, StringLiteral=19, StringConstant=20, Var=21, WS=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "Letter", "LetterOrDigit", "StringLiteral", "StringConstant", 
		"Var", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'for'", "'in'", "','", "'where'", "'return'", "'doc('", "')'", 
		"'text()'", "'/'", "'//'", "'<'", "'>'", "'</'", "'{'", "'}'", "'eq'", 
		"'='", "'and'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "StringLiteral", "StringConstant", 
		"Var", "WS"
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


	public JoinLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Join.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u008d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\6\26w\n\26\r\26\16\26x\3\26\3\26\3\27\3\27\7\27\177"+
		"\n\27\f\27\16\27\u0082\13\27\3\30\3\30\3\30\3\31\6\31\u0088\n\31\r\31"+
		"\16\31\u0089\3\31\3\31\3x\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\2)\2+\25-\26/\27\61\30"+
		"\3\2\6\5\2C\\aac|\7\2//\62;C\\aac|\5\2$$BB^^\5\2\13\f\17\17\"\"\u008d"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2"+
		"\2\2\5\67\3\2\2\2\7:\3\2\2\2\t<\3\2\2\2\13B\3\2\2\2\rI\3\2\2\2\17N\3\2"+
		"\2\2\21P\3\2\2\2\23W\3\2\2\2\25Y\3\2\2\2\27\\\3\2\2\2\31^\3\2\2\2\33`"+
		"\3\2\2\2\35c\3\2\2\2\37e\3\2\2\2!g\3\2\2\2#j\3\2\2\2%l\3\2\2\2\'p\3\2"+
		"\2\2)r\3\2\2\2+t\3\2\2\2-|\3\2\2\2/\u0083\3\2\2\2\61\u0087\3\2\2\2\63"+
		"\64\7h\2\2\64\65\7q\2\2\65\66\7t\2\2\66\4\3\2\2\2\678\7k\2\289\7p\2\2"+
		"9\6\3\2\2\2:;\7.\2\2;\b\3\2\2\2<=\7y\2\2=>\7j\2\2>?\7g\2\2?@\7t\2\2@A"+
		"\7g\2\2A\n\3\2\2\2BC\7t\2\2CD\7g\2\2DE\7v\2\2EF\7w\2\2FG\7t\2\2GH\7p\2"+
		"\2H\f\3\2\2\2IJ\7f\2\2JK\7q\2\2KL\7e\2\2LM\7*\2\2M\16\3\2\2\2NO\7+\2\2"+
		"O\20\3\2\2\2PQ\7v\2\2QR\7g\2\2RS\7z\2\2ST\7v\2\2TU\7*\2\2UV\7+\2\2V\22"+
		"\3\2\2\2WX\7\61\2\2X\24\3\2\2\2YZ\7\61\2\2Z[\7\61\2\2[\26\3\2\2\2\\]\7"+
		">\2\2]\30\3\2\2\2^_\7@\2\2_\32\3\2\2\2`a\7>\2\2ab\7\61\2\2b\34\3\2\2\2"+
		"cd\7}\2\2d\36\3\2\2\2ef\7\177\2\2f \3\2\2\2gh\7g\2\2hi\7s\2\2i\"\3\2\2"+
		"\2jk\7?\2\2k$\3\2\2\2lm\7c\2\2mn\7p\2\2no\7f\2\2o&\3\2\2\2pq\t\2\2\2q"+
		"(\3\2\2\2rs\t\3\2\2s*\3\2\2\2tv\7$\2\2uw\n\4\2\2vu\3\2\2\2wx\3\2\2\2x"+
		"y\3\2\2\2xv\3\2\2\2yz\3\2\2\2z{\7$\2\2{,\3\2\2\2|\u0080\5\'\24\2}\177"+
		"\5)\25\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081.\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7&\2\2\u0084\u0085\5"+
		"-\27\2\u0085\60\3\2\2\2\u0086\u0088\t\5\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008c\b\31\2\2\u008c\62\3\2\2\2\6\2x\u0080\u0089\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}