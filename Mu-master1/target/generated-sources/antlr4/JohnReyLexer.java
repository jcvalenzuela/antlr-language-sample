// Generated from JohnRey.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JohnReyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OR=1, AND=2, EQ=3, NEQ=4, GT=5, LT=6, GTEQ=7, LTEQ=8, PLUS=9, MINUS=10, 
		MULT=11, DIV=12, MOD=13, POW=14, NOT=15, SCOL=16, ASSIGN=17, OPAR=18, 
		CPAR=19, OBRACE=20, CBRACE=21, TRUE=22, FALSE=23, NIL=24, IF=25, ELSE=26, 
		WHILE=27, LOG=28, ID=29, INT=30, FLOAT=31, STRING=32, COMMENT=33, SPACE=34, 
		OTHER=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'"
	};
	public static final String[] ruleNames = {
		"OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", 
		"MULT", "DIV", "MOD", "POW", "NOT", "SCOL", "ASSIGN", "OPAR", "CPAR", 
		"OBRACE", "CBRACE", "TRUE", "FALSE", "NIL", "IF", "ELSE", "WHILE", "LOG", 
		"ID", "INT", "FLOAT", "STRING", "COMMENT", "SPACE", "OTHER"
	};


	public JohnReyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JohnRey.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u00d9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\7\36\u00a2\n\36\f\36\16\36\u00a5\13\36\3\37\6\37\u00a8"+
		"\n\37\r\37\16\37\u00a9\3 \6 \u00ad\n \r \16 \u00ae\3 \3 \7 \u00b3\n \f"+
		" \16 \u00b6\13 \3 \3 \6 \u00ba\n \r \16 \u00bb\5 \u00be\n \3!\3!\3!\3"+
		"!\7!\u00c4\n!\f!\16!\u00c7\13!\3!\3!\3\"\3\"\7\"\u00cd\n\"\f\"\16\"\u00d0"+
		"\13\"\3\"\3\"\3#\3#\3#\3#\3$\3$\2\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\b\5\2C\\aac|\6\2"+
		"\62;C\\aac|\3\2\62;\5\2\f\f\17\17$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u00e1"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\3I\3\2\2\2\5L\3\2\2\2\7O\3\2\2\2\tR\3\2\2\2\13U\3\2\2\2\rX\3\2\2\2"+
		"\17[\3\2\2\2\21^\3\2\2\2\23a\3\2\2\2\25c\3\2\2\2\27e\3\2\2\2\31g\3\2\2"+
		"\2\33i\3\2\2\2\35m\3\2\2\2\37o\3\2\2\2!q\3\2\2\2#s\3\2\2\2%v\3\2\2\2\'"+
		"x\3\2\2\2)z\3\2\2\2+|\3\2\2\2-~\3\2\2\2/\u0083\3\2\2\2\61\u0089\3\2\2"+
		"\2\63\u008d\3\2\2\2\65\u0090\3\2\2\2\67\u0095\3\2\2\29\u009b\3\2\2\2;"+
		"\u009f\3\2\2\2=\u00a7\3\2\2\2?\u00bd\3\2\2\2A\u00bf\3\2\2\2C\u00ca\3\2"+
		"\2\2E\u00d3\3\2\2\2G\u00d7\3\2\2\2IJ\7~\2\2JK\7~\2\2K\4\3\2\2\2LM\7(\2"+
		"\2MN\7(\2\2N\6\3\2\2\2OP\7G\2\2PQ\7S\2\2Q\b\3\2\2\2RS\7P\2\2ST\7G\2\2"+
		"T\n\3\2\2\2UV\7I\2\2VW\7V\2\2W\f\3\2\2\2XY\7N\2\2YZ\7V\2\2Z\16\3\2\2\2"+
		"[\\\7@\2\2\\]\7?\2\2]\20\3\2\2\2^_\7>\2\2_`\7?\2\2`\22\3\2\2\2ab\7-\2"+
		"\2b\24\3\2\2\2cd\7/\2\2d\26\3\2\2\2ef\7,\2\2f\30\3\2\2\2gh\7\61\2\2h\32"+
		"\3\2\2\2ij\7O\2\2jk\7Q\2\2kl\7F\2\2l\34\3\2\2\2mn\7`\2\2n\36\3\2\2\2o"+
		"p\7#\2\2p \3\2\2\2qr\7=\2\2r\"\3\2\2\2st\7C\2\2tu\7U\2\2u$\3\2\2\2vw\7"+
		"*\2\2w&\3\2\2\2xy\7+\2\2y(\3\2\2\2z{\7}\2\2{*\3\2\2\2|}\7\177\2\2},\3"+
		"\2\2\2~\177\7v\2\2\177\u0080\7t\2\2\u0080\u0081\7w\2\2\u0081\u0082\7g"+
		"\2\2\u0082.\3\2\2\2\u0083\u0084\7h\2\2\u0084\u0085\7c\2\2\u0085\u0086"+
		"\7n\2\2\u0086\u0087\7u\2\2\u0087\u0088\7g\2\2\u0088\60\3\2\2\2\u0089\u008a"+
		"\7p\2\2\u008a\u008b\7k\2\2\u008b\u008c\7n\2\2\u008c\62\3\2\2\2\u008d\u008e"+
		"\7k\2\2\u008e\u008f\7h\2\2\u008f\64\3\2\2\2\u0090\u0091\7g\2\2\u0091\u0092"+
		"\7n\2\2\u0092\u0093\7u\2\2\u0093\u0094\7g\2\2\u0094\66\3\2\2\2\u0095\u0096"+
		"\7y\2\2\u0096\u0097\7j\2\2\u0097\u0098\7k\2\2\u0098\u0099\7n\2\2\u0099"+
		"\u009a\7g\2\2\u009a8\3\2\2\2\u009b\u009c\7q\2\2\u009c\u009d\7w\2\2\u009d"+
		"\u009e\7v\2\2\u009e:\3\2\2\2\u009f\u00a3\t\2\2\2\u00a0\u00a2\t\3\2\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4<\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8\t\4\2\2\u00a7\u00a6"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		">\3\2\2\2\u00ab\u00ad\t\4\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2"+
		"\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b4"+
		"\7\60\2\2\u00b1\u00b3\t\4\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2"+
		"\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00be\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b7\u00b9\7\60\2\2\u00b8\u00ba\t\4\2\2\u00b9\u00b8\3\2\2\2"+
		"\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be"+
		"\3\2\2\2\u00bd\u00ac\3\2\2\2\u00bd\u00b7\3\2\2\2\u00be@\3\2\2\2\u00bf"+
		"\u00c5\7$\2\2\u00c0\u00c4\n\5\2\2\u00c1\u00c2\7$\2\2\u00c2\u00c4\7$\2"+
		"\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"\u00c9\7$\2\2\u00c9B\3\2\2\2\u00ca\u00ce\7%\2\2\u00cb\u00cd\n\6\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\b\"\2\2\u00d2"+
		"D\3\2\2\2\u00d3\u00d4\t\7\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\b#\2\2\u00d6"+
		"F\3\2\2\2\u00d7\u00d8\13\2\2\2\u00d8H\3\2\2\2\f\2\u00a3\u00a9\u00ae\u00b4"+
		"\u00bb\u00bd\u00c3\u00c5\u00ce\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}