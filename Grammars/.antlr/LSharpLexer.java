// Generated from c:\Users\carlu\Documents\Visual Studio 2017\Projects\LSharp\LSharp\Grammars\LSharpLexer.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LSharpLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACES=1, SINGLE_LINE_COMMENT=2, DELIMITED_COMMENT=3, USING=4, PART=5, 
		OF=6, IN=7, TO=8, INTERFACE=9, CLASS=10, ENUM=11, FROM=12, PUBLIC=13, 
		INTERNAL=14, PRIVATE=15, STATIC=16, NEW=17, RETURN=18, BREAK=19, WITH=20, 
		VAR=21, UNIT=22, NULL=23, THIS=24, BASE=25, WHILE=26, ENTRYPOINT=27, SC=28, 
		LEAD=29, ARR=30, DOT=31, LT=32, GT=33, OP=34, CP=35, OSB=36, CSB=37, EQ=38, 
		PEQ=39, MEQ=40, AEQ=41, DEQ=42, QM=43, COL=44, EM=45, COM=46, PLUS=47, 
		MINUS=48, MULT=49, DIV=50, MOD=51, LTE=52, GTE=53, EQS=54, NEQ=55, AND=56, 
		OR=57, WOT=58, DEF=59, NIL=60, IDENT=61, LITINT=62, LITDEC=63, LITCHAR=64, 
		LITSTR=65, LITBOOL=66;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WHITESPACES", "SINGLE_LINE_COMMENT", "DELIMITED_COMMENT", "NewLine", 
		"Whitespace", "USING", "PART", "OF", "IN", "TO", "INTERFACE", "CLASS", 
		"ENUM", "FROM", "PUBLIC", "INTERNAL", "PRIVATE", "STATIC", "NEW", "RETURN", 
		"BREAK", "WITH", "VAR", "UNIT", "NULL", "THIS", "BASE", "WHILE", "ENTRYPOINT", 
		"SC", "LEAD", "ARR", "DOT", "LT", "GT", "OP", "CP", "OSB", "CSB", "EQ", 
		"PEQ", "MEQ", "AEQ", "DEQ", "QM", "COL", "EM", "COM", "PLUS", "MINUS", 
		"MULT", "DIV", "MOD", "LTE", "GTE", "EQS", "NEQ", "AND", "OR", "WOT", 
		"DEF", "NIL", "IDENT", "LITINT", "LITDEC", "LITCHAR", "LITSTR", "LITBOOL", 
		"CommonCharacter"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'using'", "'part'", "'of'", "'in'", "'to'", "'interface'", 
		"'class'", "'enum'", "'from'", "'public'", "'internal'", "'private'", 
		"'static'", "'new'", "'return'", "'break'", "'with'", "'var'", "'unit'", 
		"'null'", "'this'", "'base'", "'while'", "'EntryPoint'", "';'", "'>>'", 
		"'=>'", "'.'", "'<'", "'>'", "'('", "')'", "'['", "']'", "'='", "'+='", 
		"'-='", "'*='", "'/='", "'?'", "':'", "'!'", "','", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", "'??'", 
		"'?:'", "'!:'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACES", "SINGLE_LINE_COMMENT", "DELIMITED_COMMENT", "USING", 
		"PART", "OF", "IN", "TO", "INTERFACE", "CLASS", "ENUM", "FROM", "PUBLIC", 
		"INTERNAL", "PRIVATE", "STATIC", "NEW", "RETURN", "BREAK", "WITH", "VAR", 
		"UNIT", "NULL", "THIS", "BASE", "WHILE", "ENTRYPOINT", "SC", "LEAD", "ARR", 
		"DOT", "LT", "GT", "OP", "CP", "OSB", "CSB", "EQ", "PEQ", "MEQ", "AEQ", 
		"DEQ", "QM", "COL", "EM", "COM", "PLUS", "MINUS", "MULT", "DIV", "MOD", 
		"LTE", "GTE", "EQS", "NEQ", "AND", "OR", "WOT", "DEF", "NIL", "IDENT", 
		"LITINT", "LITDEC", "LITCHAR", "LITSTR", "LITBOOL"
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


	public LSharpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LSharpLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2D\u01e5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\6\2\u0090"+
		"\n\2\r\2\16\2\u0091\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u009a\n\3\f\3\16\3\u009d"+
		"\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u00a7\n\4\f\4\16\4\u00aa\13"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5\u00b4\n\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3"+
		"$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-"+
		"\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3;\3<"+
		"\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3@\5@\u0196\n@\3@\3@\7@\u019a\n@\f@"+
		"\16@\u019d\13@\3A\5A\u01a0\nA\3A\6A\u01a3\nA\rA\16A\u01a4\3B\6B\u01a8"+
		"\nB\rB\16B\u01a9\3B\3B\6B\u01ae\nB\rB\16B\u01af\3C\3C\3C\5C\u01b5\nC\3"+
		"C\3C\3D\3D\3D\7D\u01bc\nD\fD\16D\u01bf\13D\3D\3D\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\5E\u01cc\nE\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F"+
		"\3F\3F\3F\3F\3F\5F\u01e4\nF\4\u009b\u00a8\2G\3\3\5\4\7\5\t\2\13\2\r\6"+
		"\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24"+
		"+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'"+
		"Q(S)U*W+Y,[-]._/a\60c\61e\62g\63i\64k\65m\66o\67q8s9u:w;y<{=}>\177?\u0081"+
		"@\u0083A\u0085B\u0087C\u0089D\u008b\2\3\2\t\6\2\f\f\17\17\u0087\u0087"+
		"\u202a\u202b\r\2\13\13\r\16\"\"\u00a2\u00a2\u1682\u1682\u1810\u1810\u2002"+
		"\u2008\u200a\u200c\u2031\u2031\u2061\u2061\u3002\u3002\5\2C\\aac|\6\2"+
		"\62;C\\aac|\3\2\62;\b\2\f\f\17\17))^^\u0087\u0087\u202a\u202b\b\2\f\f"+
		"\17\17$$^^\u0087\u0087\u202a\u202b\2\u01fa\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2"+
		"\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\3\u008f"+
		"\3\2\2\2\5\u0095\3\2\2\2\7\u00a2\3\2\2\2\t\u00b3\3\2\2\2\13\u00b5\3\2"+
		"\2\2\r\u00b7\3\2\2\2\17\u00bd\3\2\2\2\21\u00c2\3\2\2\2\23\u00c5\3\2\2"+
		"\2\25\u00c8\3\2\2\2\27\u00cb\3\2\2\2\31\u00d5\3\2\2\2\33\u00db\3\2\2\2"+
		"\35\u00e0\3\2\2\2\37\u00e5\3\2\2\2!\u00ec\3\2\2\2#\u00f5\3\2\2\2%\u00fd"+
		"\3\2\2\2\'\u0104\3\2\2\2)\u0108\3\2\2\2+\u010f\3\2\2\2-\u0115\3\2\2\2"+
		"/\u011a\3\2\2\2\61\u011e\3\2\2\2\63\u0123\3\2\2\2\65\u0128\3\2\2\2\67"+
		"\u012d\3\2\2\29\u0132\3\2\2\2;\u0138\3\2\2\2=\u0143\3\2\2\2?\u0145\3\2"+
		"\2\2A\u0148\3\2\2\2C\u014b\3\2\2\2E\u014d\3\2\2\2G\u014f\3\2\2\2I\u0151"+
		"\3\2\2\2K\u0153\3\2\2\2M\u0155\3\2\2\2O\u0157\3\2\2\2Q\u0159\3\2\2\2S"+
		"\u015b\3\2\2\2U\u015e\3\2\2\2W\u0161\3\2\2\2Y\u0164\3\2\2\2[\u0167\3\2"+
		"\2\2]\u0169\3\2\2\2_\u016b\3\2\2\2a\u016d\3\2\2\2c\u016f\3\2\2\2e\u0171"+
		"\3\2\2\2g\u0173\3\2\2\2i\u0175\3\2\2\2k\u0177\3\2\2\2m\u0179\3\2\2\2o"+
		"\u017c\3\2\2\2q\u017f\3\2\2\2s\u0182\3\2\2\2u\u0185\3\2\2\2w\u0188\3\2"+
		"\2\2y\u018b\3\2\2\2{\u018e\3\2\2\2}\u0191\3\2\2\2\177\u0195\3\2\2\2\u0081"+
		"\u019f\3\2\2\2\u0083\u01a7\3\2\2\2\u0085\u01b1\3\2\2\2\u0087\u01b8\3\2"+
		"\2\2\u0089\u01cb\3\2\2\2\u008b\u01e3\3\2\2\2\u008d\u0090\5\13\6\2\u008e"+
		"\u0090\5\t\5\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\b\2\2\2\u0094\4\3\2\2\2\u0095\u0096\7\61\2\2\u0096\u0097\7\61\2"+
		"\2\u0097\u009b\3\2\2\2\u0098\u009a\13\2\2\2\u0099\u0098\3\2\2\2\u009a"+
		"\u009d\3\2\2\2\u009b\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009e\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009e\u009f\5\t\5\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a1\b\3\2\2\u00a1\6\3\2\2\2\u00a2\u00a3\7\61\2\2\u00a3\u00a4\7,\2\2"+
		"\u00a4\u00a8\3\2\2\2\u00a5\u00a7\13\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00ac\7,\2\2\u00ac\u00ad\7\61\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00af\b\4\2\2\u00af\b\3\2\2\2\u00b0\u00b1\7\17\2\2\u00b1\u00b4"+
		"\7\f\2\2\u00b2\u00b4\t\2\2\2\u00b3\u00b0\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4"+
		"\n\3\2\2\2\u00b5\u00b6\t\3\2\2\u00b6\f\3\2\2\2\u00b7\u00b8\7w\2\2\u00b8"+
		"\u00b9\7u\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7i\2\2"+
		"\u00bc\16\3\2\2\2\u00bd\u00be\7r\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7"+
		"t\2\2\u00c0\u00c1\7v\2\2\u00c1\20\3\2\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4"+
		"\7h\2\2\u00c4\22\3\2\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7p\2\2\u00c7\24"+
		"\3\2\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7q\2\2\u00ca\26\3\2\2\2\u00cb"+
		"\u00cc\7k\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7g\2\2"+
		"\u00cf\u00d0\7t\2\2\u00d0\u00d1\7h\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3"+
		"\7e\2\2\u00d3\u00d4\7g\2\2\u00d4\30\3\2\2\2\u00d5\u00d6\7e\2\2\u00d6\u00d7"+
		"\7n\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7u\2\2\u00da"+
		"\32\3\2\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7w\2\2\u00de"+
		"\u00df\7o\2\2\u00df\34\3\2\2\2\u00e0\u00e1\7h\2\2\u00e1\u00e2\7t\2\2\u00e2"+
		"\u00e3\7q\2\2\u00e3\u00e4\7o\2\2\u00e4\36\3\2\2\2\u00e5\u00e6\7r\2\2\u00e6"+
		"\u00e7\7w\2\2\u00e7\u00e8\7d\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea\7k\2\2"+
		"\u00ea\u00eb\7e\2\2\u00eb \3\2\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7p\2"+
		"\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2"+
		"\7p\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7n\2\2\u00f4\"\3\2\2\2\u00f5\u00f6"+
		"\7r\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9\7x\2\2\u00f9"+
		"\u00fa\7c\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc\7g\2\2\u00fc$\3\2\2\2\u00fd"+
		"\u00fe\7u\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7v\2\2"+
		"\u0101\u0102\7k\2\2\u0102\u0103\7e\2\2\u0103&\3\2\2\2\u0104\u0105\7p\2"+
		"\2\u0105\u0106\7g\2\2\u0106\u0107\7y\2\2\u0107(\3\2\2\2\u0108\u0109\7"+
		"t\2\2\u0109\u010a\7g\2\2\u010a\u010b\7v\2\2\u010b\u010c\7w\2\2\u010c\u010d"+
		"\7t\2\2\u010d\u010e\7p\2\2\u010e*\3\2\2\2\u010f\u0110\7d\2\2\u0110\u0111"+
		"\7t\2\2\u0111\u0112\7g\2\2\u0112\u0113\7c\2\2\u0113\u0114\7m\2\2\u0114"+
		",\3\2\2\2\u0115\u0116\7y\2\2\u0116\u0117\7k\2\2\u0117\u0118\7v\2\2\u0118"+
		"\u0119\7j\2\2\u0119.\3\2\2\2\u011a\u011b\7x\2\2\u011b\u011c\7c\2\2\u011c"+
		"\u011d\7t\2\2\u011d\60\3\2\2\2\u011e\u011f\7w\2\2\u011f\u0120\7p\2\2\u0120"+
		"\u0121\7k\2\2\u0121\u0122\7v\2\2\u0122\62\3\2\2\2\u0123\u0124\7p\2\2\u0124"+
		"\u0125\7w\2\2\u0125\u0126\7n\2\2\u0126\u0127\7n\2\2\u0127\64\3\2\2\2\u0128"+
		"\u0129\7v\2\2\u0129\u012a\7j\2\2\u012a\u012b\7k\2\2\u012b\u012c\7u\2\2"+
		"\u012c\66\3\2\2\2\u012d\u012e\7d\2\2\u012e\u012f\7c\2\2\u012f\u0130\7"+
		"u\2\2\u0130\u0131\7g\2\2\u01318\3\2\2\2\u0132\u0133\7y\2\2\u0133\u0134"+
		"\7j\2\2\u0134\u0135\7k\2\2\u0135\u0136\7n\2\2\u0136\u0137\7g\2\2\u0137"+
		":\3\2\2\2\u0138\u0139\7G\2\2\u0139\u013a\7p\2\2\u013a\u013b\7v\2\2\u013b"+
		"\u013c\7t\2\2\u013c\u013d\7{\2\2\u013d\u013e\7R\2\2\u013e\u013f\7q\2\2"+
		"\u013f\u0140\7k\2\2\u0140\u0141\7p\2\2\u0141\u0142\7v\2\2\u0142<\3\2\2"+
		"\2\u0143\u0144\7=\2\2\u0144>\3\2\2\2\u0145\u0146\7@\2\2\u0146\u0147\7"+
		"@\2\2\u0147@\3\2\2\2\u0148\u0149\7?\2\2\u0149\u014a\7@\2\2\u014aB\3\2"+
		"\2\2\u014b\u014c\7\60\2\2\u014cD\3\2\2\2\u014d\u014e\7>\2\2\u014eF\3\2"+
		"\2\2\u014f\u0150\7@\2\2\u0150H\3\2\2\2\u0151\u0152\7*\2\2\u0152J\3\2\2"+
		"\2\u0153\u0154\7+\2\2\u0154L\3\2\2\2\u0155\u0156\7]\2\2\u0156N\3\2\2\2"+
		"\u0157\u0158\7_\2\2\u0158P\3\2\2\2\u0159\u015a\7?\2\2\u015aR\3\2\2\2\u015b"+
		"\u015c\7-\2\2\u015c\u015d\7?\2\2\u015dT\3\2\2\2\u015e\u015f\7/\2\2\u015f"+
		"\u0160\7?\2\2\u0160V\3\2\2\2\u0161\u0162\7,\2\2\u0162\u0163\7?\2\2\u0163"+
		"X\3\2\2\2\u0164\u0165\7\61\2\2\u0165\u0166\7?\2\2\u0166Z\3\2\2\2\u0167"+
		"\u0168\7A\2\2\u0168\\\3\2\2\2\u0169\u016a\7<\2\2\u016a^\3\2\2\2\u016b"+
		"\u016c\7#\2\2\u016c`\3\2\2\2\u016d\u016e\7.\2\2\u016eb\3\2\2\2\u016f\u0170"+
		"\7-\2\2\u0170d\3\2\2\2\u0171\u0172\7/\2\2\u0172f\3\2\2\2\u0173\u0174\7"+
		",\2\2\u0174h\3\2\2\2\u0175\u0176\7\61\2\2\u0176j\3\2\2\2\u0177\u0178\7"+
		"\'\2\2\u0178l\3\2\2\2\u0179\u017a\7>\2\2\u017a\u017b\7?\2\2\u017bn\3\2"+
		"\2\2\u017c\u017d\7@\2\2\u017d\u017e\7?\2\2\u017ep\3\2\2\2\u017f\u0180"+
		"\7?\2\2\u0180\u0181\7?\2\2\u0181r\3\2\2\2\u0182\u0183\7#\2\2\u0183\u0184"+
		"\7?\2\2\u0184t\3\2\2\2\u0185\u0186\7(\2\2\u0186\u0187\7(\2\2\u0187v\3"+
		"\2\2\2\u0188\u0189\7~\2\2\u0189\u018a\7~\2\2\u018ax\3\2\2\2\u018b\u018c"+
		"\7A\2\2\u018c\u018d\7A\2\2\u018dz\3\2\2\2\u018e\u018f\7A\2\2\u018f\u0190"+
		"\7<\2\2\u0190|\3\2\2\2\u0191\u0192\7#\2\2\u0192\u0193\7<\2\2\u0193~\3"+
		"\2\2\2\u0194\u0196\7B\2\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\u019b\t\4\2\2\u0198\u019a\t\5\2\2\u0199\u0198\3\2"+
		"\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\u0080\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u01a0\7/\2\2\u019f\u019e\3\2"+
		"\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1\u01a3\t\6\2\2\u01a2"+
		"\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5\u0082\3\2\2\2\u01a6\u01a8\t\6\2\2\u01a7\u01a6\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01ab\u01ad\7\60\2\2\u01ac\u01ae\t\6\2\2\u01ad\u01ac\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u0084\3\2"+
		"\2\2\u01b1\u01b4\7)\2\2\u01b2\u01b5\n\7\2\2\u01b3\u01b5\5\u008bF\2\u01b4"+
		"\u01b2\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\7)"+
		"\2\2\u01b7\u0086\3\2\2\2\u01b8\u01bd\7$\2\2\u01b9\u01bc\n\b\2\2\u01ba"+
		"\u01bc\5\u008bF\2\u01bb\u01b9\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bc\u01bf"+
		"\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01c0\u01c1\7$\2\2\u01c1\u0088\3\2\2\2\u01c2\u01c3\7v\2"+
		"\2\u01c3\u01c4\7t\2\2\u01c4\u01c5\7w\2\2\u01c5\u01cc\7g\2\2\u01c6\u01c7"+
		"\7h\2\2\u01c7\u01c8\7c\2\2\u01c8\u01c9\7n\2\2\u01c9\u01ca\7u\2\2\u01ca"+
		"\u01cc\7g\2\2\u01cb\u01c2\3\2\2\2\u01cb\u01c6\3\2\2\2\u01cc\u008a\3\2"+
		"\2\2\u01cd\u01ce\7^\2\2\u01ce\u01e4\7)\2\2\u01cf\u01d0\7^\2\2\u01d0\u01e4"+
		"\7$\2\2\u01d1\u01d2\7^\2\2\u01d2\u01e4\7^\2\2\u01d3\u01d4\7^\2\2\u01d4"+
		"\u01e4\7\62\2\2\u01d5\u01d6\7^\2\2\u01d6\u01e4\7c\2\2\u01d7\u01d8\7^\2"+
		"\2\u01d8\u01e4\7d\2\2\u01d9\u01da\7^\2\2\u01da\u01e4\7h\2\2\u01db\u01dc"+
		"\7^\2\2\u01dc\u01e4\7p\2\2\u01dd\u01de\7^\2\2\u01de\u01e4\7t\2\2\u01df"+
		"\u01e0\7^\2\2\u01e0\u01e4\7v\2\2\u01e1\u01e2\7^\2\2\u01e2\u01e4\7x\2\2"+
		"\u01e3\u01cd\3\2\2\2\u01e3\u01cf\3\2\2\2\u01e3\u01d1\3\2\2\2\u01e3\u01d3"+
		"\3\2\2\2\u01e3\u01d5\3\2\2\2\u01e3\u01d7\3\2\2\2\u01e3\u01d9\3\2\2\2\u01e3"+
		"\u01db\3\2\2\2\u01e3\u01dd\3\2\2\2\u01e3\u01df\3\2\2\2\u01e3\u01e1\3\2"+
		"\2\2\u01e4\u008c\3\2\2\2\23\2\u008f\u0091\u009b\u00a8\u00b3\u0195\u019b"+
		"\u019f\u01a4\u01a9\u01af\u01b4\u01bb\u01bd\u01cb\u01e3\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}