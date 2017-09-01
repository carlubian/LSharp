// Generated from c:\Users\carlu\Documents\Visual Studio 2017\Projects\LSharp\LSharp\Grammars\LSharpParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LSharpParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_usingList = 1, RULE_using = 2, RULE_namespace = 3, 
		RULE_langMember = 4, RULE_interfaceDef = 5, RULE_classDef = 6, RULE_baseClass = 7, 
		RULE_enumDef = 8, RULE_interfaceMember = 9, RULE_classMember = 10, RULE_statement = 11, 
		RULE_nonEndingStatement = 12, RULE_endingStatement = 13, RULE_breakStatement = 14, 
		RULE_throwStatement = 15, RULE_varDef = 16, RULE_localDef = 17, RULE_funcDef = 18, 
		RULE_ctorDef = 19, RULE_params = 20, RULE_assign = 21, RULE_triStatement = 22, 
		RULE_whileStatement = 23, RULE_foreachStatement = 24, RULE_switchStatement = 25, 
		RULE_caseBlock = 26, RULE_defaultBlock = 27, RULE_ifBlock = 28, RULE_elseBlock = 29, 
		RULE_returnStatement = 30, RULE_emptyStatement = 31, RULE_nullCheck = 32, 
		RULE_expression = 33, RULE_funcCall = 34, RULE_args = 35, RULE_ident = 36, 
		RULE_binaryOp = 37, RULE_assignOperator = 38, RULE_access = 39;
	public static final String[] ruleNames = {
		"program", "usingList", "using", "namespace", "langMember", "interfaceDef", 
		"classDef", "baseClass", "enumDef", "interfaceMember", "classMember", 
		"statement", "nonEndingStatement", "endingStatement", "breakStatement", 
		"throwStatement", "varDef", "localDef", "funcDef", "ctorDef", "params", 
		"assign", "triStatement", "whileStatement", "foreachStatement", "switchStatement", 
		"caseBlock", "defaultBlock", "ifBlock", "elseBlock", "returnStatement", 
		"emptyStatement", "nullCheck", "expression", "funcCall", "args", "ident", 
		"binaryOp", "assignOperator", "access"
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

	@Override
	public String getGrammarFileName() { return "LSharpParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LSharpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public UsingListContext usingList() {
			return getRuleContext(UsingListContext.class,0);
		}
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public List<LangMemberContext> langMember() {
			return getRuleContexts(LangMemberContext.class);
		}
		public LangMemberContext langMember(int i) {
			return getRuleContext(LangMemberContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(80);
				usingList();
				}
			}

			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PART) {
				{
				setState(83);
				namespace();
				}
			}

			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << INTERNAL) | (1L << PRIVATE))) != 0)) {
				{
				{
				setState(86);
				langMember();
				}
				}
				setState(91);
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

	public static class UsingListContext extends ParserRuleContext {
		public List<UsingContext> using() {
			return getRuleContexts(UsingContext.class);
		}
		public UsingContext using(int i) {
			return getRuleContext(UsingContext.class,i);
		}
		public UsingListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingList; }
	}

	public final UsingListContext usingList() throws RecognitionException {
		UsingListContext _localctx = new UsingListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_usingList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			using();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==USING) {
				{
				{
				setState(93);
				using();
				}
				}
				setState(98);
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

	public static class UsingContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(LSharpParser.USING, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public UsingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using; }
	}

	public final UsingContext using() throws RecognitionException {
		UsingContext _localctx = new UsingContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_using);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(USING);
			setState(100);
			ident(0);
			setState(101);
			match(SC);
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

	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode PART() { return getToken(LSharpParser.PART, 0); }
		public TerminalNode OF() { return getToken(LSharpParser.OF, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_namespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(PART);
			setState(104);
			match(OF);
			setState(105);
			ident(0);
			setState(106);
			match(SC);
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

	public static class LangMemberContext extends ParserRuleContext {
		public InterfaceDefContext interfaceDef() {
			return getRuleContext(InterfaceDefContext.class,0);
		}
		public ClassDefContext classDef() {
			return getRuleContext(ClassDefContext.class,0);
		}
		public EnumDefContext enumDef() {
			return getRuleContext(EnumDefContext.class,0);
		}
		public LangMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_langMember; }
	}

	public final LangMemberContext langMember() throws RecognitionException {
		LangMemberContext _localctx = new LangMemberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_langMember);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				interfaceDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				classDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				enumDef();
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

	public static class InterfaceDefContext extends ParserRuleContext {
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public TerminalNode INTERFACE() { return getToken(LSharpParser.INTERFACE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<InterfaceMemberContext> interfaceMember() {
			return getRuleContexts(InterfaceMemberContext.class);
		}
		public InterfaceMemberContext interfaceMember(int i) {
			return getRuleContext(InterfaceMemberContext.class,i);
		}
		public InterfaceDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDef; }
	}

	public final InterfaceDefContext interfaceDef() throws RecognitionException {
		InterfaceDefContext _localctx = new InterfaceDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_interfaceDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			access();
			setState(114);
			match(INTERFACE);
			setState(115);
			ident(0);
			setState(116);
			match(LEAD);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==UNIT) {
				{
				{
				setState(117);
				interfaceMember();
				}
				}
				setState(122);
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

	public static class ClassDefContext extends ParserRuleContext {
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(LSharpParser.CLASS, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(LSharpParser.STATIC, 0); }
		public BaseClassContext baseClass() {
			return getRuleContext(BaseClassContext.class,0);
		}
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			access();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(124);
				match(STATIC);
				}
			}

			setState(127);
			match(CLASS);
			setState(128);
			ident(0);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(129);
				baseClass();
				}
			}

			setState(132);
			match(LEAD);
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(133);
					classMember();
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class BaseClassContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(LSharpParser.FROM, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public BaseClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseClass; }
	}

	public final BaseClassContext baseClass() throws RecognitionException {
		BaseClassContext _localctx = new BaseClassContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_baseClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(FROM);
			setState(140);
			ident(0);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(141);
				match(COM);
				setState(142);
				ident(0);
				}
				}
				setState(147);
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

	public static class EnumDefContext extends ParserRuleContext {
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public TerminalNode ENUM() { return getToken(LSharpParser.ENUM, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public EnumDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDef; }
	}

	public final EnumDefContext enumDef() throws RecognitionException {
		EnumDefContext _localctx = new EnumDefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_enumDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			access();
			setState(149);
			match(ENUM);
			setState(150);
			ident(0);
			setState(151);
			match(LEAD);
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

	public static class InterfaceMemberContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode VAR() { return getToken(LSharpParser.VAR, 0); }
		public TerminalNode UNIT() { return getToken(LSharpParser.UNIT, 0); }
		public InterfaceMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMember; }
	}

	public final InterfaceMemberContext interfaceMember() throws RecognitionException {
		InterfaceMemberContext _localctx = new InterfaceMemberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_interfaceMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==UNIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(154);
			ident(0);
			setState(155);
			match(OP);
			setState(156);
			params();
			setState(157);
			match(CP);
			setState(158);
			match(SC);
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

	public static class ClassMemberContext extends ParserRuleContext {
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public CtorDefContext ctorDef() {
			return getRuleContext(CtorDefContext.class,0);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classMember);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				varDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				funcDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				ctorDef();
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

	public static class StatementContext extends ParserRuleContext {
		public NonEndingStatementContext nonEndingStatement() {
			return getRuleContext(NonEndingStatementContext.class,0);
		}
		public EndingStatementContext endingStatement() {
			return getRuleContext(EndingStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
			case VAR:
			case NULL:
			case THIS:
			case BASE:
			case WHILE:
			case SC:
			case OP:
			case EM:
			case IDENT:
			case LITINT:
			case LITDEC:
			case LITCHAR:
			case LITSTR:
			case LITBOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				nonEndingStatement();
				}
				break;
			case RETURN:
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				endingStatement();
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

	public static class NonEndingStatementContext extends ParserRuleContext {
		public LocalDefContext localDef() {
			return getRuleContext(LocalDefContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TriStatementContext triStatement() {
			return getRuleContext(TriStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public TerminalNode QM() { return getToken(LSharpParser.QM, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public NullCheckContext nullCheck() {
			return getRuleContext(NullCheckContext.class,0);
		}
		public NonEndingStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonEndingStatement; }
	}

	public final NonEndingStatementContext nonEndingStatement() throws RecognitionException {
		NonEndingStatementContext _localctx = new NonEndingStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_nonEndingStatement);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				localDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				triStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				foreachStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
				switchStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(175);
				funcCall();
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QM) {
					{
					setState(176);
					match(QM);
					setState(179);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NEW:
					case THIS:
					case BASE:
					case IDENT:
						{
						setState(177);
						ident(0);
						}
						break;
					case DOT:
						{
						setState(178);
						match(DOT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(183);
				match(SC);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(185);
				emptyStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(186);
				nullCheck();
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

	public static class EndingStatementContext extends ParserRuleContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public EndingStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endingStatement; }
	}

	public final EndingStatementContext endingStatement() throws RecognitionException {
		EndingStatementContext _localctx = new EndingStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_endingStatement);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				returnStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				breakStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				throwStatement();
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(LSharpParser.BREAK, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(BREAK);
			setState(195);
			match(SC);
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

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(LSharpParser.BREAK, 0); }
		public TerminalNode WITH() { return getToken(LSharpParser.WITH, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(BREAK);
			setState(198);
			match(WITH);
			setState(199);
			ident(0);
			setState(200);
			match(SC);
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

	public static class VarDefContext extends ParserRuleContext {
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public TerminalNode VAR() { return getToken(LSharpParser.VAR, 0); }
		public TerminalNode IDENT() { return getToken(LSharpParser.IDENT, 0); }
		public TerminalNode STATIC() { return getToken(LSharpParser.STATIC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_varDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			access();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(203);
				match(STATIC);
				}
			}

			setState(206);
			match(VAR);
			setState(207);
			match(IDENT);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(208);
				match(EQ);
				setState(209);
				expression(0);
				}
			}

			setState(212);
			match(SC);
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

	public static class LocalDefContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(LSharpParser.VAR, 0); }
		public TerminalNode IDENT() { return getToken(LSharpParser.IDENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LocalDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDef; }
	}

	public final LocalDefContext localDef() throws RecognitionException {
		LocalDefContext _localctx = new LocalDefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_localDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(VAR);
			setState(215);
			match(IDENT);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(216);
				match(EQ);
				setState(217);
				expression(0);
				}
			}

			setState(220);
			match(SC);
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

	public static class FuncDefContext extends ParserRuleContext {
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode VAR() { return getToken(LSharpParser.VAR, 0); }
		public TerminalNode UNIT() { return getToken(LSharpParser.UNIT, 0); }
		public TerminalNode STATIC() { return getToken(LSharpParser.STATIC, 0); }
		public TerminalNode QM() { return getToken(LSharpParser.QM, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ENTRYPOINT() { return getToken(LSharpParser.ENTRYPOINT, 0); }
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_funcDef);
		int _la;
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
			case INTERNAL:
			case PRIVATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				access();
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(223);
					match(STATIC);
					}
				}

				setState(226);
				_la = _input.LA(1);
				if ( !(_la==VAR || _la==UNIT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(227);
				ident(0);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QM) {
					{
					setState(228);
					match(QM);
					setState(231);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NEW:
					case THIS:
					case BASE:
					case IDENT:
						{
						setState(229);
						ident(0);
						}
						break;
					case DOT:
						{
						setState(230);
						match(DOT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(235);
				match(LEAD);
				setState(236);
				match(OP);
				setState(237);
				params();
				setState(238);
				match(CP);
				setState(239);
				match(ARR);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (NEW - 17)) | (1L << (RETURN - 17)) | (1L << (BREAK - 17)) | (1L << (VAR - 17)) | (1L << (NULL - 17)) | (1L << (THIS - 17)) | (1L << (BASE - 17)) | (1L << (WHILE - 17)) | (1L << (SC - 17)) | (1L << (OP - 17)) | (1L << (EM - 17)) | (1L << (IDENT - 17)) | (1L << (LITINT - 17)) | (1L << (LITDEC - 17)) | (1L << (LITCHAR - 17)) | (1L << (LITSTR - 17)) | (1L << (LITBOOL - 17)))) != 0)) {
					{
					{
					setState(240);
					statement();
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ENTRYPOINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(ENTRYPOINT);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QM) {
					{
					setState(247);
					match(QM);
					setState(250);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NEW:
					case THIS:
					case BASE:
					case IDENT:
						{
						setState(248);
						ident(0);
						}
						break;
					case DOT:
						{
						setState(249);
						match(DOT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(254);
				match(LEAD);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (NEW - 17)) | (1L << (RETURN - 17)) | (1L << (BREAK - 17)) | (1L << (VAR - 17)) | (1L << (NULL - 17)) | (1L << (THIS - 17)) | (1L << (BASE - 17)) | (1L << (WHILE - 17)) | (1L << (SC - 17)) | (1L << (OP - 17)) | (1L << (EM - 17)) | (1L << (IDENT - 17)) | (1L << (LITINT - 17)) | (1L << (LITDEC - 17)) | (1L << (LITCHAR - 17)) | (1L << (LITSTR - 17)) | (1L << (LITBOOL - 17)))) != 0)) {
					{
					{
					setState(255);
					statement();
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class CtorDefContext extends ParserRuleContext {
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public TerminalNode NEW() { return getToken(LSharpParser.NEW, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode QM() { return getToken(LSharpParser.QM, 0); }
		public List<NonEndingStatementContext> nonEndingStatement() {
			return getRuleContexts(NonEndingStatementContext.class);
		}
		public NonEndingStatementContext nonEndingStatement(int i) {
			return getRuleContext(NonEndingStatementContext.class,i);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(LSharpParser.STATIC, 0); }
		public CtorDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctorDef; }
	}

	public final CtorDefContext ctorDef() throws RecognitionException {
		CtorDefContext _localctx = new CtorDefContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ctorDef);
		int _la;
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
			case INTERNAL:
			case PRIVATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				access();
				setState(264);
				match(NEW);
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QM) {
					{
					setState(265);
					match(QM);
					setState(268);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NEW:
					case THIS:
					case BASE:
					case IDENT:
						{
						setState(266);
						ident(0);
						}
						break;
					case DOT:
						{
						setState(267);
						match(DOT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(272);
				match(LEAD);
				setState(273);
				match(OP);
				setState(274);
				params();
				setState(275);
				match(CP);
				setState(276);
				match(ARR);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (NEW - 17)) | (1L << (VAR - 17)) | (1L << (NULL - 17)) | (1L << (THIS - 17)) | (1L << (BASE - 17)) | (1L << (WHILE - 17)) | (1L << (SC - 17)) | (1L << (OP - 17)) | (1L << (EM - 17)) | (1L << (IDENT - 17)) | (1L << (LITINT - 17)) | (1L << (LITDEC - 17)) | (1L << (LITCHAR - 17)) | (1L << (LITSTR - 17)) | (1L << (LITBOOL - 17)))) != 0)) {
					{
					{
					setState(277);
					nonEndingStatement();
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(STATIC);
				setState(284);
				match(LEAD);
				setState(285);
				match(OP);
				setState(286);
				match(CP);
				setState(287);
				match(ARR);
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (NEW - 17)) | (1L << (VAR - 17)) | (1L << (NULL - 17)) | (1L << (THIS - 17)) | (1L << (BASE - 17)) | (1L << (WHILE - 17)) | (1L << (SC - 17)) | (1L << (OP - 17)) | (1L << (EM - 17)) | (1L << (IDENT - 17)) | (1L << (LITINT - 17)) | (1L << (LITDEC - 17)) | (1L << (LITCHAR - 17)) | (1L << (LITSTR - 17)) | (1L << (LITBOOL - 17)))) != 0)) {
					{
					{
					setState(288);
					nonEndingStatement();
					}
					}
					setState(293);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ParamsContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << BASE) | (1L << IDENT))) != 0)) {
				{
				setState(296);
				ident(0);
				}
			}

			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(299);
				match(COM);
				setState(300);
				ident(0);
				}
				}
				setState(305);
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

	public static class AssignContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public AssignOperatorContext assignOperator() {
			return getRuleContext(AssignOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			ident(0);
			setState(307);
			assignOperator();
			setState(308);
			expression(0);
			setState(309);
			match(SC);
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

	public static class TriStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public List<EndingStatementContext> endingStatement() {
			return getRuleContexts(EndingStatementContext.class);
		}
		public EndingStatementContext endingStatement(int i) {
			return getRuleContext(EndingStatementContext.class,i);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public TriStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triStatement; }
	}

	public final TriStatementContext triStatement() throws RecognitionException {
		TriStatementContext _localctx = new TriStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_triStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			expression(0);
			setState(312);
			match(QM);
			setState(313);
			ifBlock();
			setState(314);
			endingStatement();
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COL) {
				{
				setState(315);
				match(COL);
				setState(316);
				elseBlock();
				setState(317);
				endingStatement();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LSharpParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EndingStatementContext endingStatement() {
			return getRuleContext(EndingStatementContext.class,0);
		}
		public List<NonEndingStatementContext> nonEndingStatement() {
			return getRuleContexts(NonEndingStatementContext.class);
		}
		public NonEndingStatementContext nonEndingStatement(int i) {
			return getRuleContext(NonEndingStatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(WHILE);
			setState(322);
			expression(0);
			setState(323);
			match(ARR);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (NEW - 17)) | (1L << (VAR - 17)) | (1L << (NULL - 17)) | (1L << (THIS - 17)) | (1L << (BASE - 17)) | (1L << (WHILE - 17)) | (1L << (SC - 17)) | (1L << (OP - 17)) | (1L << (EM - 17)) | (1L << (IDENT - 17)) | (1L << (LITINT - 17)) | (1L << (LITDEC - 17)) | (1L << (LITCHAR - 17)) | (1L << (LITSTR - 17)) | (1L << (LITBOOL - 17)))) != 0)) {
				{
				{
				setState(324);
				nonEndingStatement();
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(330);
			endingStatement();
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

	public static class ForeachStatementContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LSharpParser.IDENT, 0); }
		public TerminalNode IN() { return getToken(LSharpParser.IN, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public EndingStatementContext endingStatement() {
			return getRuleContext(EndingStatementContext.class,0);
		}
		public List<NonEndingStatementContext> nonEndingStatement() {
			return getRuleContexts(NonEndingStatementContext.class);
		}
		public NonEndingStatementContext nonEndingStatement(int i) {
			return getRuleContext(NonEndingStatementContext.class,i);
		}
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_foreachStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(IDENT);
			setState(333);
			match(IN);
			setState(334);
			ident(0);
			setState(335);
			match(ARR);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (NEW - 17)) | (1L << (VAR - 17)) | (1L << (NULL - 17)) | (1L << (THIS - 17)) | (1L << (BASE - 17)) | (1L << (WHILE - 17)) | (1L << (SC - 17)) | (1L << (OP - 17)) | (1L << (EM - 17)) | (1L << (IDENT - 17)) | (1L << (LITINT - 17)) | (1L << (LITDEC - 17)) | (1L << (LITCHAR - 17)) | (1L << (LITSTR - 17)) | (1L << (LITBOOL - 17)))) != 0)) {
				{
				{
				setState(336);
				nonEndingStatement();
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			endingStatement();
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode WOT() { return getToken(LSharpParser.WOT, 0); }
		public List<CaseBlockContext> caseBlock() {
			return getRuleContexts(CaseBlockContext.class);
		}
		public CaseBlockContext caseBlock(int i) {
			return getRuleContext(CaseBlockContext.class,i);
		}
		public DefaultBlockContext defaultBlock() {
			return getRuleContext(DefaultBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_switchStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			expression(0);
			setState(345);
			match(WOT);
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(346);
					caseBlock();
					}
					} 
				}
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEF) {
				{
				setState(352);
				defaultBlock();
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

	public static class CaseBlockContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EndingStatementContext endingStatement() {
			return getRuleContext(EndingStatementContext.class,0);
		}
		public List<NonEndingStatementContext> nonEndingStatement() {
			return getRuleContexts(NonEndingStatementContext.class);
		}
		public NonEndingStatementContext nonEndingStatement(int i) {
			return getRuleContext(NonEndingStatementContext.class,i);
		}
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_caseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			expression(0);
			setState(356);
			match(COL);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (NEW - 17)) | (1L << (VAR - 17)) | (1L << (NULL - 17)) | (1L << (THIS - 17)) | (1L << (BASE - 17)) | (1L << (WHILE - 17)) | (1L << (SC - 17)) | (1L << (OP - 17)) | (1L << (EM - 17)) | (1L << (IDENT - 17)) | (1L << (LITINT - 17)) | (1L << (LITDEC - 17)) | (1L << (LITCHAR - 17)) | (1L << (LITSTR - 17)) | (1L << (LITBOOL - 17)))) != 0)) {
				{
				{
				setState(357);
				nonEndingStatement();
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363);
			endingStatement();
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

	public static class DefaultBlockContext extends ParserRuleContext {
		public EndingStatementContext endingStatement() {
			return getRuleContext(EndingStatementContext.class,0);
		}
		public List<NonEndingStatementContext> nonEndingStatement() {
			return getRuleContexts(NonEndingStatementContext.class);
		}
		public NonEndingStatementContext nonEndingStatement(int i) {
			return getRuleContext(NonEndingStatementContext.class,i);
		}
		public DefaultBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultBlock; }
	}

	public final DefaultBlockContext defaultBlock() throws RecognitionException {
		DefaultBlockContext _localctx = new DefaultBlockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_defaultBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(DEF);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (NEW - 17)) | (1L << (VAR - 17)) | (1L << (NULL - 17)) | (1L << (THIS - 17)) | (1L << (BASE - 17)) | (1L << (WHILE - 17)) | (1L << (SC - 17)) | (1L << (OP - 17)) | (1L << (EM - 17)) | (1L << (IDENT - 17)) | (1L << (LITINT - 17)) | (1L << (LITDEC - 17)) | (1L << (LITCHAR - 17)) | (1L << (LITSTR - 17)) | (1L << (LITBOOL - 17)))) != 0)) {
				{
				{
				setState(366);
				nonEndingStatement();
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372);
			endingStatement();
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

	public static class IfBlockContext extends ParserRuleContext {
		public List<NonEndingStatementContext> nonEndingStatement() {
			return getRuleContexts(NonEndingStatementContext.class);
		}
		public NonEndingStatementContext nonEndingStatement(int i) {
			return getRuleContext(NonEndingStatementContext.class,i);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (NEW - 17)) | (1L << (VAR - 17)) | (1L << (NULL - 17)) | (1L << (THIS - 17)) | (1L << (BASE - 17)) | (1L << (WHILE - 17)) | (1L << (SC - 17)) | (1L << (OP - 17)) | (1L << (EM - 17)) | (1L << (IDENT - 17)) | (1L << (LITINT - 17)) | (1L << (LITDEC - 17)) | (1L << (LITCHAR - 17)) | (1L << (LITSTR - 17)) | (1L << (LITBOOL - 17)))) != 0)) {
				{
				{
				setState(374);
				nonEndingStatement();
				}
				}
				setState(379);
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

	public static class ElseBlockContext extends ParserRuleContext {
		public List<NonEndingStatementContext> nonEndingStatement() {
			return getRuleContexts(NonEndingStatementContext.class);
		}
		public NonEndingStatementContext nonEndingStatement(int i) {
			return getRuleContext(NonEndingStatementContext.class,i);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_elseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (NEW - 17)) | (1L << (VAR - 17)) | (1L << (NULL - 17)) | (1L << (THIS - 17)) | (1L << (BASE - 17)) | (1L << (WHILE - 17)) | (1L << (SC - 17)) | (1L << (OP - 17)) | (1L << (EM - 17)) | (1L << (IDENT - 17)) | (1L << (LITINT - 17)) | (1L << (LITDEC - 17)) | (1L << (LITCHAR - 17)) | (1L << (LITSTR - 17)) | (1L << (LITBOOL - 17)))) != 0)) {
				{
				{
				setState(380);
				nonEndingStatement();
				}
				}
				setState(385);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(LSharpParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(RETURN);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (NEW - 17)) | (1L << (NULL - 17)) | (1L << (THIS - 17)) | (1L << (BASE - 17)) | (1L << (OP - 17)) | (1L << (EM - 17)) | (1L << (IDENT - 17)) | (1L << (LITINT - 17)) | (1L << (LITDEC - 17)) | (1L << (LITCHAR - 17)) | (1L << (LITSTR - 17)) | (1L << (LITBOOL - 17)))) != 0)) {
				{
				setState(387);
				expression(0);
				}
			}

			setState(390);
			match(SC);
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(SC);
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

	public static class NullCheckContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DEF() { return getToken(LSharpParser.DEF, 0); }
		public EndingStatementContext endingStatement() {
			return getRuleContext(EndingStatementContext.class,0);
		}
		public List<NonEndingStatementContext> nonEndingStatement() {
			return getRuleContexts(NonEndingStatementContext.class);
		}
		public NonEndingStatementContext nonEndingStatement(int i) {
			return getRuleContext(NonEndingStatementContext.class,i);
		}
		public TerminalNode NIL() { return getToken(LSharpParser.NIL, 0); }
		public NullCheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullCheck; }
	}

	public final NullCheckContext nullCheck() throws RecognitionException {
		NullCheckContext _localctx = new NullCheckContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_nullCheck);
		int _la;
		try {
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				expression(0);
				setState(395);
				match(DEF);
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (NEW - 17)) | (1L << (VAR - 17)) | (1L << (NULL - 17)) | (1L << (THIS - 17)) | (1L << (BASE - 17)) | (1L << (WHILE - 17)) | (1L << (SC - 17)) | (1L << (OP - 17)) | (1L << (EM - 17)) | (1L << (IDENT - 17)) | (1L << (LITINT - 17)) | (1L << (LITDEC - 17)) | (1L << (LITCHAR - 17)) | (1L << (LITSTR - 17)) | (1L << (LITBOOL - 17)))) != 0)) {
					{
					{
					setState(396);
					nonEndingStatement();
					}
					}
					setState(401);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(402);
				endingStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				expression(0);
				setState(405);
				match(NIL);
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (NEW - 17)) | (1L << (VAR - 17)) | (1L << (NULL - 17)) | (1L << (THIS - 17)) | (1L << (BASE - 17)) | (1L << (WHILE - 17)) | (1L << (SC - 17)) | (1L << (OP - 17)) | (1L << (EM - 17)) | (1L << (IDENT - 17)) | (1L << (LITINT - 17)) | (1L << (LITDEC - 17)) | (1L << (LITCHAR - 17)) | (1L << (LITSTR - 17)) | (1L << (LITBOOL - 17)))) != 0)) {
					{
					{
					setState(406);
					nonEndingStatement();
					}
					}
					setState(411);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(412);
				endingStatement();
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

	public static class ExpressionContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode LITINT() { return getToken(LSharpParser.LITINT, 0); }
		public TerminalNode LITDEC() { return getToken(LSharpParser.LITDEC, 0); }
		public TerminalNode LITCHAR() { return getToken(LSharpParser.LITCHAR, 0); }
		public TerminalNode LITSTR() { return getToken(LSharpParser.LITSTR, 0); }
		public TerminalNode LITBOOL() { return getToken(LSharpParser.LITBOOL, 0); }
		public TerminalNode NULL() { return getToken(LSharpParser.NULL, 0); }
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public TerminalNode EM() { return getToken(LSharpParser.EM, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP() { return getToken(LSharpParser.OP, 0); }
		public BinaryOpContext binaryOp() {
			return getRuleContext(BinaryOpContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(417);
				ident(0);
				}
				break;
			case 2:
				{
				setState(418);
				match(LITINT);
				}
				break;
			case 3:
				{
				setState(419);
				match(LITDEC);
				}
				break;
			case 4:
				{
				setState(420);
				match(LITCHAR);
				}
				break;
			case 5:
				{
				setState(421);
				match(LITSTR);
				}
				break;
			case 6:
				{
				setState(422);
				match(LITBOOL);
				}
				break;
			case 7:
				{
				setState(423);
				match(NULL);
				}
				break;
			case 8:
				{
				setState(424);
				funcCall();
				}
				break;
			case 9:
				{
				setState(425);
				match(EM);
				setState(426);
				expression(2);
				}
				break;
			case 10:
				{
				setState(427);
				match(OP);
				setState(428);
				expression(0);
				setState(429);
				match(CP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(445);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(443);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(433);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(434);
						match(QM);
						setState(435);
						expression(0);
						setState(436);
						match(COL);
						setState(437);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(439);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(440);
						binaryOp();
						setState(441);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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

	public static class FuncCallContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_funcCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			ident(0);
			setState(449);
			match(OP);
			setState(450);
			args();
			setState(451);
			match(CP);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (NEW - 17)) | (1L << (NULL - 17)) | (1L << (THIS - 17)) | (1L << (BASE - 17)) | (1L << (OP - 17)) | (1L << (EM - 17)) | (1L << (IDENT - 17)) | (1L << (LITINT - 17)) | (1L << (LITDEC - 17)) | (1L << (LITCHAR - 17)) | (1L << (LITSTR - 17)) | (1L << (LITBOOL - 17)))) != 0)) {
				{
				setState(453);
				expression(0);
				}
			}

			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(456);
				match(COM);
				setState(457);
				expression(0);
				}
				}
				setState(462);
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

	public static class IdentContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LSharpParser.IDENT, 0); }
		public TerminalNode THIS() { return getToken(LSharpParser.THIS, 0); }
		public TerminalNode BASE() { return getToken(LSharpParser.BASE, 0); }
		public TerminalNode NEW() { return getToken(LSharpParser.NEW, 0); }
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode DOT() { return getToken(LSharpParser.DOT, 0); }
		public TerminalNode LT() { return getToken(LSharpParser.LT, 0); }
		public TerminalNode OSB() { return getToken(LSharpParser.OSB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
	}

	public final IdentContext ident() throws RecognitionException {
		return ident(0);
	}

	private IdentContext ident(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentContext _localctx = new IdentContext(_ctx, _parentState);
		IdentContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_ident, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(464);
				match(IDENT);
				}
				break;
			case THIS:
				{
				setState(465);
				match(THIS);
				}
				break;
			case BASE:
				{
				setState(466);
				match(BASE);
				}
				break;
			case NEW:
				{
				setState(467);
				match(NEW);
				setState(468);
				funcCall();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(493);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(491);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						_localctx = new IdentContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_ident);
						setState(471);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(472);
						match(DOT);
						setState(473);
						ident(5);
						}
						break;
					case 2:
						{
						_localctx = new IdentContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_ident);
						setState(474);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(475);
						match(LT);
						setState(476);
						ident(0);
						setState(481);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COM) {
							{
							{
							setState(477);
							match(COM);
							setState(478);
							ident(0);
							}
							}
							setState(483);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(484);
						match(GT);
						}
						break;
					case 3:
						{
						_localctx = new IdentContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_ident);
						setState(486);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(487);
						match(OSB);
						setState(488);
						expression(0);
						setState(489);
						match(CSB);
						}
						break;
					}
					} 
				}
				setState(495);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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

	public static class BinaryOpContext extends ParserRuleContext {
		public BinaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOp; }
	}

	public final BinaryOpContext binaryOp() throws RecognitionException {
		BinaryOpContext _localctx = new BinaryOpContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_binaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIV) | (1L << MOD) | (1L << LTE) | (1L << GTE) | (1L << EQS) | (1L << NEQ) | (1L << AND) | (1L << OR))) != 0)) ) {
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

	public static class AssignOperatorContext extends ParserRuleContext {
		public AssignOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOperator; }
	}

	public final AssignOperatorContext assignOperator() throws RecognitionException {
		AssignOperatorContext _localctx = new AssignOperatorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_assignOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << PEQ) | (1L << MEQ) | (1L << AEQ) | (1L << DEQ))) != 0)) ) {
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

	public static class AccessContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(LSharpParser.PUBLIC, 0); }
		public TerminalNode INTERNAL() { return getToken(LSharpParser.INTERNAL, 0); }
		public TerminalNode PRIVATE() { return getToken(LSharpParser.PRIVATE, 0); }
		public AccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access; }
	}

	public final AccessContext access() throws RecognitionException {
		AccessContext _localctx = new AccessContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_access);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << INTERNAL) | (1L << PRIVATE))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 33:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 36:
			return ident_sempred((IdentContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean ident_sempred(IdentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3D\u01f9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\5\2T\n\2\3"+
		"\2\5\2W\n\2\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\3\3\3\7\3a\n\3\f\3\16\3d\13"+
		"\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6r\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\7\7y\n\7\f\7\16\7|\13\7\3\b\3\b\5\b\u0080\n\b\3\b\3\b\3\b\5"+
		"\b\u0085\n\b\3\b\3\b\7\b\u0089\n\b\f\b\16\b\u008c\13\b\3\t\3\t\3\t\3\t"+
		"\7\t\u0092\n\t\f\t\16\t\u0095\13\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u00a6\n\f\3\r\3\r\5\r\u00aa\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00b6\n\16\5\16"+
		"\u00b8\n\16\3\16\3\16\3\16\3\16\5\16\u00be\n\16\3\17\3\17\3\17\5\17\u00c3"+
		"\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\5\22\u00cf\n\22"+
		"\3\22\3\22\3\22\3\22\5\22\u00d5\n\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23"+
		"\u00dd\n\23\3\23\3\23\3\24\3\24\5\24\u00e3\n\24\3\24\3\24\3\24\3\24\3"+
		"\24\5\24\u00ea\n\24\5\24\u00ec\n\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24"+
		"\u00f4\n\24\f\24\16\24\u00f7\13\24\3\24\3\24\3\24\3\24\5\24\u00fd\n\24"+
		"\5\24\u00ff\n\24\3\24\3\24\7\24\u0103\n\24\f\24\16\24\u0106\13\24\5\24"+
		"\u0108\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u010f\n\25\5\25\u0111\n\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\7\25\u0119\n\25\f\25\16\25\u011c\13\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\7\25\u0124\n\25\f\25\16\25\u0127\13\25\5"+
		"\25\u0129\n\25\3\26\5\26\u012c\n\26\3\26\3\26\7\26\u0130\n\26\f\26\16"+
		"\26\u0133\13\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u0142\n\30\3\31\3\31\3\31\3\31\7\31\u0148\n\31\f\31\16"+
		"\31\u014b\13\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\7\32\u0154\n\32\f\32"+
		"\16\32\u0157\13\32\3\32\3\32\3\33\3\33\3\33\7\33\u015e\n\33\f\33\16\33"+
		"\u0161\13\33\3\33\5\33\u0164\n\33\3\34\3\34\3\34\7\34\u0169\n\34\f\34"+
		"\16\34\u016c\13\34\3\34\3\34\3\35\3\35\7\35\u0172\n\35\f\35\16\35\u0175"+
		"\13\35\3\35\3\35\3\36\7\36\u017a\n\36\f\36\16\36\u017d\13\36\3\37\7\37"+
		"\u0180\n\37\f\37\16\37\u0183\13\37\3 \3 \5 \u0187\n \3 \3 \3!\3!\3\"\3"+
		"\"\3\"\7\"\u0190\n\"\f\"\16\"\u0193\13\"\3\"\3\"\3\"\3\"\3\"\7\"\u019a"+
		"\n\"\f\"\16\"\u019d\13\"\3\"\3\"\5\"\u01a1\n\"\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\5#\u01b2\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u01be"+
		"\n#\f#\16#\u01c1\13#\3$\3$\3$\3$\3$\3%\5%\u01c9\n%\3%\3%\7%\u01cd\n%\f"+
		"%\16%\u01d0\13%\3&\3&\3&\3&\3&\3&\5&\u01d8\n&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\7&\u01e2\n&\f&\16&\u01e5\13&\3&\3&\3&\3&\3&\3&\3&\7&\u01ee\n&\f&\16&"+
		"\u01f1\13&\3\'\3\'\3(\3(\3)\3)\3)\2\4DJ*\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP\2\6\3\2\27\30\4\2\"#\61;\3"+
		"\2(,\3\2\17\21\2\u021d\2S\3\2\2\2\4^\3\2\2\2\6e\3\2\2\2\bi\3\2\2\2\nq"+
		"\3\2\2\2\fs\3\2\2\2\16}\3\2\2\2\20\u008d\3\2\2\2\22\u0096\3\2\2\2\24\u009b"+
		"\3\2\2\2\26\u00a5\3\2\2\2\30\u00a9\3\2\2\2\32\u00bd\3\2\2\2\34\u00c2\3"+
		"\2\2\2\36\u00c4\3\2\2\2 \u00c7\3\2\2\2\"\u00cc\3\2\2\2$\u00d8\3\2\2\2"+
		"&\u0107\3\2\2\2(\u0128\3\2\2\2*\u012b\3\2\2\2,\u0134\3\2\2\2.\u0139\3"+
		"\2\2\2\60\u0143\3\2\2\2\62\u014e\3\2\2\2\64\u015a\3\2\2\2\66\u0165\3\2"+
		"\2\28\u016f\3\2\2\2:\u017b\3\2\2\2<\u0181\3\2\2\2>\u0184\3\2\2\2@\u018a"+
		"\3\2\2\2B\u01a0\3\2\2\2D\u01b1\3\2\2\2F\u01c2\3\2\2\2H\u01c8\3\2\2\2J"+
		"\u01d7\3\2\2\2L\u01f2\3\2\2\2N\u01f4\3\2\2\2P\u01f6\3\2\2\2RT\5\4\3\2"+
		"SR\3\2\2\2ST\3\2\2\2TV\3\2\2\2UW\5\b\5\2VU\3\2\2\2VW\3\2\2\2W[\3\2\2\2"+
		"XZ\5\n\6\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\3\3\2\2\2][\3\2"+
		"\2\2^b\5\6\4\2_a\5\6\4\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\5\3"+
		"\2\2\2db\3\2\2\2ef\7\6\2\2fg\5J&\2gh\7\36\2\2h\7\3\2\2\2ij\7\7\2\2jk\7"+
		"\b\2\2kl\5J&\2lm\7\36\2\2m\t\3\2\2\2nr\5\f\7\2or\5\16\b\2pr\5\22\n\2q"+
		"n\3\2\2\2qo\3\2\2\2qp\3\2\2\2r\13\3\2\2\2st\5P)\2tu\7\13\2\2uv\5J&\2v"+
		"z\7\37\2\2wy\5\24\13\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\r\3\2"+
		"\2\2|z\3\2\2\2}\177\5P)\2~\u0080\7\22\2\2\177~\3\2\2\2\177\u0080\3\2\2"+
		"\2\u0080\u0081\3\2\2\2\u0081\u0082\7\f\2\2\u0082\u0084\5J&\2\u0083\u0085"+
		"\5\20\t\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2"+
		"\u0086\u008a\7\37\2\2\u0087\u0089\5\26\f\2\u0088\u0087\3\2\2\2\u0089\u008c"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\17\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u008e\7\16\2\2\u008e\u0093\5J&\2\u008f\u0090\7\60"+
		"\2\2\u0090\u0092\5J&\2\u0091\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\21\3\2\2\2\u0095\u0093\3\2\2\2\u0096"+
		"\u0097\5P)\2\u0097\u0098\7\r\2\2\u0098\u0099\5J&\2\u0099\u009a\7\37\2"+
		"\2\u009a\23\3\2\2\2\u009b\u009c\t\2\2\2\u009c\u009d\5J&\2\u009d\u009e"+
		"\7$\2\2\u009e\u009f\5*\26\2\u009f\u00a0\7%\2\2\u00a0\u00a1\7\36\2\2\u00a1"+
		"\25\3\2\2\2\u00a2\u00a6\5\"\22\2\u00a3\u00a6\5&\24\2\u00a4\u00a6\5(\25"+
		"\2\u00a5\u00a2\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\27"+
		"\3\2\2\2\u00a7\u00aa\5\32\16\2\u00a8\u00aa\5\34\17\2\u00a9\u00a7\3\2\2"+
		"\2\u00a9\u00a8\3\2\2\2\u00aa\31\3\2\2\2\u00ab\u00be\5$\23\2\u00ac\u00be"+
		"\5,\27\2\u00ad\u00be\5.\30\2\u00ae\u00be\5\60\31\2\u00af\u00be\5\62\32"+
		"\2\u00b0\u00be\5\64\33\2\u00b1\u00b7\5F$\2\u00b2\u00b5\7-\2\2\u00b3\u00b6"+
		"\5J&\2\u00b4\u00b6\7!\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6"+
		"\u00b8\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00ba\7\36\2\2\u00ba\u00be\3\2\2\2\u00bb\u00be\5@!\2\u00bc"+
		"\u00be\5B\"\2\u00bd\u00ab\3\2\2\2\u00bd\u00ac\3\2\2\2\u00bd\u00ad\3\2"+
		"\2\2\u00bd\u00ae\3\2\2\2\u00bd\u00af\3\2\2\2\u00bd\u00b0\3\2\2\2\u00bd"+
		"\u00b1\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\33\3\2\2"+
		"\2\u00bf\u00c3\5> \2\u00c0\u00c3\5\36\20\2\u00c1\u00c3\5 \21\2\u00c2\u00bf"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\35\3\2\2\2\u00c4"+
		"\u00c5\7\25\2\2\u00c5\u00c6\7\36\2\2\u00c6\37\3\2\2\2\u00c7\u00c8\7\25"+
		"\2\2\u00c8\u00c9\7\26\2\2\u00c9\u00ca\5J&\2\u00ca\u00cb\7\36\2\2\u00cb"+
		"!\3\2\2\2\u00cc\u00ce\5P)\2\u00cd\u00cf\7\22\2\2\u00ce\u00cd\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7\27\2\2\u00d1\u00d4\7"+
		"?\2\2\u00d2\u00d3\7(\2\2\u00d3\u00d5\5D#\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7\36\2\2\u00d7#\3\2\2\2\u00d8"+
		"\u00d9\7\27\2\2\u00d9\u00dc\7?\2\2\u00da\u00db\7(\2\2\u00db\u00dd\5D#"+
		"\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df"+
		"\7\36\2\2\u00df%\3\2\2\2\u00e0\u00e2\5P)\2\u00e1\u00e3\7\22\2\2\u00e2"+
		"\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\t\2"+
		"\2\2\u00e5\u00eb\5J&\2\u00e6\u00e9\7-\2\2\u00e7\u00ea\5J&\2\u00e8\u00ea"+
		"\7!\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb"+
		"\u00e6\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\7\37"+
		"\2\2\u00ee\u00ef\7$\2\2\u00ef\u00f0\5*\26\2\u00f0\u00f1\7%\2\2\u00f1\u00f5"+
		"\7 \2\2\u00f2\u00f4\5\30\r\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u0108\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f8\u00fe\7\35\2\2\u00f9\u00fc\7-\2\2\u00fa\u00fd\5J&\2\u00fb\u00fd"+
		"\7!\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe"+
		"\u00f9\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0104\7\37"+
		"\2\2\u0101\u0103\5\30\r\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2"+
		"\2\2\u0107\u00e0\3\2\2\2\u0107\u00f8\3\2\2\2\u0108\'\3\2\2\2\u0109\u010a"+
		"\5P)\2\u010a\u0110\7\23\2\2\u010b\u010e\7-\2\2\u010c\u010f\5J&\2\u010d"+
		"\u010f\7!\2\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f\u0111\3\2"+
		"\2\2\u0110\u010b\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0113\7\37\2\2\u0113\u0114\7$\2\2\u0114\u0115\5*\26\2\u0115\u0116\7%"+
		"\2\2\u0116\u011a\7 \2\2\u0117\u0119\5\32\16\2\u0118\u0117\3\2\2\2\u0119"+
		"\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0129\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011d\u011e\7\22\2\2\u011e\u011f\7\37\2\2\u011f"+
		"\u0120\7$\2\2\u0120\u0121\7%\2\2\u0121\u0125\7 \2\2\u0122\u0124\5\32\16"+
		"\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0109\3\2\2\2\u0128"+
		"\u011d\3\2\2\2\u0129)\3\2\2\2\u012a\u012c\5J&\2\u012b\u012a\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u0131\3\2\2\2\u012d\u012e\7\60\2\2\u012e\u0130\5"+
		"J&\2\u012f\u012d\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132+\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\5J&\2\u0135"+
		"\u0136\5N(\2\u0136\u0137\5D#\2\u0137\u0138\7\36\2\2\u0138-\3\2\2\2\u0139"+
		"\u013a\5D#\2\u013a\u013b\7-\2\2\u013b\u013c\5:\36\2\u013c\u0141\5\34\17"+
		"\2\u013d\u013e\7.\2\2\u013e\u013f\5<\37\2\u013f\u0140\5\34\17\2\u0140"+
		"\u0142\3\2\2\2\u0141\u013d\3\2\2\2\u0141\u0142\3\2\2\2\u0142/\3\2\2\2"+
		"\u0143\u0144\7\34\2\2\u0144\u0145\5D#\2\u0145\u0149\7 \2\2\u0146\u0148"+
		"\5\32\16\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2"+
		"\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d"+
		"\5\34\17\2\u014d\61\3\2\2\2\u014e\u014f\7?\2\2\u014f\u0150\7\t\2\2\u0150"+
		"\u0151\5J&\2\u0151\u0155\7 \2\2\u0152\u0154\5\32\16\2\u0153\u0152\3\2"+
		"\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\5\34\17\2\u0159\63\3\2"+
		"\2\2\u015a\u015b\5D#\2\u015b\u015f\7<\2\2\u015c\u015e\5\66\34\2\u015d"+
		"\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2"+
		"\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0164\58\35\2\u0163"+
		"\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164\65\3\2\2\2\u0165\u0166\5D#\2"+
		"\u0166\u016a\7.\2\2\u0167\u0169\5\32\16\2\u0168\u0167\3\2\2\2\u0169\u016c"+
		"\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016d\u016e\5\34\17\2\u016e\67\3\2\2\2\u016f\u0173\7=\2"+
		"\2\u0170\u0172\5\32\16\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2"+
		"\2\2\u0176\u0177\5\34\17\2\u01779\3\2\2\2\u0178\u017a\5\32\16\2\u0179"+
		"\u0178\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2"+
		"\2\2\u017c;\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u0180\5\32\16\2\u017f\u017e"+
		"\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"=\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0186\7\24\2\2\u0185\u0187\5D#\2\u0186"+
		"\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\7\36"+
		"\2\2\u0189?\3\2\2\2\u018a\u018b\7\36\2\2\u018bA\3\2\2\2\u018c\u018d\5"+
		"D#\2\u018d\u0191\7=\2\2\u018e\u0190\5\32\16\2\u018f\u018e\3\2\2\2\u0190"+
		"\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2"+
		"\2\2\u0193\u0191\3\2\2\2\u0194\u0195\5\34\17\2\u0195\u01a1\3\2\2\2\u0196"+
		"\u0197\5D#\2\u0197\u019b\7>\2\2\u0198\u019a\5\32\16\2\u0199\u0198\3\2"+
		"\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\u019e\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u019f\5\34\17\2\u019f\u01a1\3"+
		"\2\2\2\u01a0\u018c\3\2\2\2\u01a0\u0196\3\2\2\2\u01a1C\3\2\2\2\u01a2\u01a3"+
		"\b#\1\2\u01a3\u01b2\5J&\2\u01a4\u01b2\7@\2\2\u01a5\u01b2\7A\2\2\u01a6"+
		"\u01b2\7B\2\2\u01a7\u01b2\7C\2\2\u01a8\u01b2\7D\2\2\u01a9\u01b2\7\31\2"+
		"\2\u01aa\u01b2\5F$\2\u01ab\u01ac\7/\2\2\u01ac\u01b2\5D#\4\u01ad\u01ae"+
		"\7$\2\2\u01ae\u01af\5D#\2\u01af\u01b0\7%\2\2\u01b0\u01b2\3\2\2\2\u01b1"+
		"\u01a2\3\2\2\2\u01b1\u01a4\3\2\2\2\u01b1\u01a5\3\2\2\2\u01b1\u01a6\3\2"+
		"\2\2\u01b1\u01a7\3\2\2\2\u01b1\u01a8\3\2\2\2\u01b1\u01a9\3\2\2\2\u01b1"+
		"\u01aa\3\2\2\2\u01b1\u01ab\3\2\2\2\u01b1\u01ad\3\2\2\2\u01b2\u01bf\3\2"+
		"\2\2\u01b3\u01b4\f\7\2\2\u01b4\u01b5\7-\2\2\u01b5\u01b6\5D#\2\u01b6\u01b7"+
		"\7.\2\2\u01b7\u01b8\5D#\b\u01b8\u01be\3\2\2\2\u01b9\u01ba\f\5\2\2\u01ba"+
		"\u01bb\5L\'\2\u01bb\u01bc\5D#\6\u01bc\u01be\3\2\2\2\u01bd\u01b3\3\2\2"+
		"\2\u01bd\u01b9\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0"+
		"\3\2\2\2\u01c0E\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c3\5J&\2\u01c3\u01c4"+
		"\7$\2\2\u01c4\u01c5\5H%\2\u01c5\u01c6\7%\2\2\u01c6G\3\2\2\2\u01c7\u01c9"+
		"\5D#\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ce\3\2\2\2\u01ca"+
		"\u01cb\7\60\2\2\u01cb\u01cd\5D#\2\u01cc\u01ca\3\2\2\2\u01cd\u01d0\3\2"+
		"\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cfI\3\2\2\2\u01d0\u01ce"+
		"\3\2\2\2\u01d1\u01d2\b&\1\2\u01d2\u01d8\7?\2\2\u01d3\u01d8\7\32\2\2\u01d4"+
		"\u01d8\7\33\2\2\u01d5\u01d6\7\23\2\2\u01d6\u01d8\5F$\2\u01d7\u01d1\3\2"+
		"\2\2\u01d7\u01d3\3\2\2\2\u01d7\u01d4\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8"+
		"\u01ef\3\2\2\2\u01d9\u01da\f\6\2\2\u01da\u01db\7!\2\2\u01db\u01ee\5J&"+
		"\7\u01dc\u01dd\f\5\2\2\u01dd\u01de\7\"\2\2\u01de\u01e3\5J&\2\u01df\u01e0"+
		"\7\60\2\2\u01e0\u01e2\5J&\2\u01e1\u01df\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3"+
		"\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e3\3\2"+
		"\2\2\u01e6\u01e7\7#\2\2\u01e7\u01ee\3\2\2\2\u01e8\u01e9\f\4\2\2\u01e9"+
		"\u01ea\7&\2\2\u01ea\u01eb\5D#\2\u01eb\u01ec\7\'\2\2\u01ec\u01ee\3\2\2"+
		"\2\u01ed\u01d9\3\2\2\2\u01ed\u01dc\3\2\2\2\u01ed\u01e8\3\2\2\2\u01ee\u01f1"+
		"\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0K\3\2\2\2\u01f1"+
		"\u01ef\3\2\2\2\u01f2\u01f3\t\3\2\2\u01f3M\3\2\2\2\u01f4\u01f5\t\4\2\2"+
		"\u01f5O\3\2\2\2\u01f6\u01f7\t\5\2\2\u01f7Q\3\2\2\2:SV[bqz\177\u0084\u008a"+
		"\u0093\u00a5\u00a9\u00b5\u00b7\u00bd\u00c2\u00ce\u00d4\u00dc\u00e2\u00e9"+
		"\u00eb\u00f5\u00fc\u00fe\u0104\u0107\u010e\u0110\u011a\u0125\u0128\u012b"+
		"\u0131\u0141\u0149\u0155\u015f\u0163\u016a\u0173\u017b\u0181\u0186\u0191"+
		"\u019b\u01a0\u01b1\u01bd\u01bf\u01c8\u01ce\u01d7\u01e3\u01ed\u01ef";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}