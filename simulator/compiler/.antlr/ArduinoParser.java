// Generated from e:\Asignaturas\Cuarto\TFG\SimuladorSoftwareRobots\simulator\compiler\Arduino.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArduinoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, BIT_SHIFT_L=73, 
		BIT_SHIFT_R=74, BINARY_CONST=75, OCTAL_CONST=76, HEX_CONST=77, INT_CONST=78, 
		FLOAT_CONST=79, CHAR_CONST=80, UNTERMINATED_CHAR=81, STRING_CONST=82, 
		UNTERMINATED_STRING=83, ID=84, LINE_COMMENT=85, MULTILINE_COMMENT=86, 
		WHITESPACE=87;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_program_code = 2, RULE_declaration = 3, 
		RULE_h_file = 4, RULE_definition = 5, RULE_simple_definition = 6, RULE_assignment_definition = 7, 
		RULE_array_definition = 8, RULE_array_index = 9, RULE_array_elements = 10, 
		RULE_constant = 11, RULE_var_type = 12, RULE_function = 13, RULE_function_args = 14, 
		RULE_iteration_sentence = 15, RULE_conditional_sentence = 16, RULE_code_block = 17, 
		RULE_sentence = 18, RULE_case_sentence = 19, RULE_expression = 20, RULE_incdec_expression = 21, 
		RULE_function_call = 22, RULE_parameter = 23, RULE_static_variable = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "program_code", "declaration", "h_file", "definition", 
			"simple_definition", "assignment_definition", "array_definition", "array_index", 
			"array_elements", "constant", "var_type", "function", "function_args", 
			"iteration_sentence", "conditional_sentence", "code_block", "sentence", 
			"case_sentence", "expression", "incdec_expression", "function_call", 
			"parameter", "static_variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#include'", "'<'", "'>'", "'.'", "';'", "'='", "'const'", "'#define'", 
			"'['", "']'", "'{'", "','", "'}'", "'bool'", "'boolean'", "'byte'", "'char'", 
			"'double'", "'float'", "'int'", "'long'", "'short'", "'size_t'", "'string'", 
			"'unsigned int'", "'unsigned char'", "'unsigned long'", "'void'", "'word'", 
			"'('", "')'", "'while'", "'do'", "'for'", "'if'", "'else'", "'switch'", 
			"'return'", "'break'", "'continue'", "'case'", "':'", "'default'", "'!'", 
			"'~'", "'*'", "'/'", "'%'", "'+'", "'-'", "'>='", "'<='", "'=='", "'!='", 
			"'&'", "'^'", "'|'", "'&&'", "'||'", "'%='", "'&='", "'*='", "'+='", 
			"'-='", "'/='", "'^='", "'|='", "'true'", "'false'", "'++'", "'--'", 
			"'static'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "BIT_SHIFT_L", "BIT_SHIFT_R", "BINARY_CONST", "OCTAL_CONST", "HEX_CONST", 
			"INT_CONST", "FLOAT_CONST", "CHAR_CONST", "UNTERMINATED_CHAR", "STRING_CONST", 
			"UNTERMINATED_STRING", "ID", "LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE"
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
	public String getGrammarFileName() { return "Arduino.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArduinoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ArduinoParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			program();
			setState(51);
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

	public static class ProgramContext extends ParserRuleContext {
		public DeclarationContext declaration;
		public List<DeclarationContext> declarations = new ArrayList<DeclarationContext>();
		public Program_codeContext program_code;
		public List<Program_codeContext> code = new ArrayList<Program_codeContext>();
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<Program_codeContext> program_code() {
			return getRuleContexts(Program_codeContext.class);
		}
		public Program_codeContext program_code(int i) {
			return getRuleContext(Program_codeContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(53);
				((ProgramContext)_localctx).declaration = declaration();
				((ProgramContext)_localctx).declarations.add(((ProgramContext)_localctx).declaration);
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0) || _la==ID) {
				{
				{
				setState(59);
				((ProgramContext)_localctx).program_code = program_code();
				((ProgramContext)_localctx).code.add(((ProgramContext)_localctx).program_code);
				}
				}
				setState(64);
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

	public static class Program_codeContext extends ParserRuleContext {
		public DefinitionContext var_def;
		public FunctionContext func_def;
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Program_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_code; }
	}

	public final Program_codeContext program_code() throws RecognitionException {
		Program_codeContext _localctx = new Program_codeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_program_code);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				((Program_codeContext)_localctx).var_def = definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				((Program_codeContext)_localctx).func_def = function();
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode STRING_CONST() { return getToken(ArduinoParser.STRING_CONST, 0); }
		public H_fileContext h_file() {
			return getRuleContext(H_fileContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(T__0);
				setState(70);
				match(STRING_CONST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(T__0);
				setState(72);
				match(T__1);
				setState(73);
				h_file();
				setState(74);
				match(T__2);
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

	public static class H_fileContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ArduinoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ArduinoParser.ID, i);
		}
		public H_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h_file; }
	}

	public final H_fileContext h_file() throws RecognitionException {
		H_fileContext _localctx = new H_fileContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_h_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(ID);
			setState(79);
			match(T__3);
			setState(80);
			match(ID);
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

	public static class DefinitionContext extends ParserRuleContext {
		public Simple_definitionContext s_def;
		public Array_definitionContext a_def;
		public Assignment_definitionContext assign_def;
		public ConstantContext cte_def;
		public Simple_definitionContext simple_definition() {
			return getRuleContext(Simple_definitionContext.class,0);
		}
		public Array_definitionContext array_definition() {
			return getRuleContext(Array_definitionContext.class,0);
		}
		public Assignment_definitionContext assignment_definition() {
			return getRuleContext(Assignment_definitionContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_definition);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				((DefinitionContext)_localctx).s_def = simple_definition();
				setState(83);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				((DefinitionContext)_localctx).a_def = array_definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				((DefinitionContext)_localctx).assign_def = assignment_definition();
				setState(87);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				((DefinitionContext)_localctx).cte_def = constant();
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

	public static class Simple_definitionContext extends ParserRuleContext {
		public Var_typeContext v_type;
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Simple_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_definition; }
	}

	public final Simple_definitionContext simple_definition() throws RecognitionException {
		Simple_definitionContext _localctx = new Simple_definitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_simple_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((Simple_definitionContext)_localctx).v_type = var_type();
			setState(93);
			match(ID);
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

	public static class Assignment_definitionContext extends ParserRuleContext {
		public Var_typeContext v_type;
		public ExpressionContext val;
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assignment_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_definition; }
	}

	public final Assignment_definitionContext assignment_definition() throws RecognitionException {
		Assignment_definitionContext _localctx = new Assignment_definitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			((Assignment_definitionContext)_localctx).v_type = var_type();
			setState(96);
			match(ID);
			setState(97);
			match(T__5);
			setState(98);
			((Assignment_definitionContext)_localctx).val = expression(0);
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

	public static class Array_definitionContext extends ParserRuleContext {
		public Token const_type;
		public Array_definitionContext c_array;
		public Array_elementsContext elems;
		public Var_typeContext v_type;
		public Array_indexContext a_index;
		public ExpressionContext expr;
		public Array_definitionContext array_definition() {
			return getRuleContext(Array_definitionContext.class,0);
		}
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public Array_elementsContext array_elements() {
			return getRuleContext(Array_elementsContext.class,0);
		}
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Array_indexContext array_index() {
			return getRuleContext(Array_indexContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_definition; }
	}

	public final Array_definitionContext array_definition() throws RecognitionException {
		Array_definitionContext _localctx = new Array_definitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array_definition);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				((Array_definitionContext)_localctx).const_type = match(T__6);
				setState(101);
				((Array_definitionContext)_localctx).c_array = array_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				((Array_definitionContext)_localctx).const_type = match(T__7);
				setState(103);
				match(ID);
				setState(104);
				((Array_definitionContext)_localctx).elems = array_elements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				((Array_definitionContext)_localctx).v_type = var_type();
				setState(106);
				match(ID);
				setState(107);
				((Array_definitionContext)_localctx).a_index = array_index();
				setState(108);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				((Array_definitionContext)_localctx).v_type = var_type();
				setState(111);
				match(ID);
				setState(112);
				((Array_definitionContext)_localctx).a_index = array_index();
				setState(113);
				match(T__5);
				setState(114);
				((Array_definitionContext)_localctx).elems = array_elements();
				setState(115);
				match(T__4);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(117);
				((Array_definitionContext)_localctx).v_type = var_type();
				setState(118);
				match(ID);
				setState(119);
				((Array_definitionContext)_localctx).a_index = array_index();
				setState(120);
				match(T__5);
				setState(121);
				((Array_definitionContext)_localctx).expr = expression(0);
				setState(122);
				match(T__4);
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

	public static class Array_indexContext extends ParserRuleContext {
		public Array_indexContext a_index;
		public TerminalNode INT_CONST() { return getToken(ArduinoParser.INT_CONST, 0); }
		public Array_indexContext array_index() {
			return getRuleContext(Array_indexContext.class,0);
		}
		public Array_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_index; }
	}

	public final Array_indexContext array_index() throws RecognitionException {
		Array_indexContext _localctx = new Array_indexContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_array_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__8);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_CONST) {
				{
				setState(127);
				match(INT_CONST);
				}
			}

			setState(130);
			match(T__9);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(131);
				((Array_indexContext)_localctx).a_index = array_index();
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

	public static class Array_elementsContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> elements = new ArrayList<ExpressionContext>();
		public List<Array_elementsContext> array_elements() {
			return getRuleContexts(Array_elementsContext.class);
		}
		public Array_elementsContext array_elements(int i) {
			return getRuleContext(Array_elementsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Array_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_elements; }
	}

	public final Array_elementsContext array_elements() throws RecognitionException {
		Array_elementsContext _localctx = new Array_elementsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_array_elements);
		int _la;
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(T__10);
				setState(135);
				array_elements();
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(136);
					match(T__11);
					setState(137);
					array_elements();
					}
					}
					setState(140); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__11 );
				setState(142);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(T__10);
				setState(145);
				((Array_elementsContext)_localctx).expression = expression(0);
				((Array_elementsContext)_localctx).elements.add(((Array_elementsContext)_localctx).expression);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(146);
					match(T__11);
					setState(147);
					((Array_elementsContext)_localctx).expression = expression(0);
					((Array_elementsContext)_localctx).elements.add(((Array_elementsContext)_localctx).expression);
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
				match(T__12);
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

	public static class ConstantContext extends ParserRuleContext {
		public Token const_type;
		public Var_typeContext v_type;
		public ExpressionContext val;
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constant);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				((ConstantContext)_localctx).const_type = match(T__6);
				setState(158);
				((ConstantContext)_localctx).v_type = var_type();
				setState(159);
				match(ID);
				setState(160);
				match(T__5);
				setState(161);
				((ConstantContext)_localctx).val = expression(0);
				setState(162);
				match(T__4);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				((ConstantContext)_localctx).const_type = match(T__7);
				setState(165);
				match(ID);
				setState(166);
				((ConstantContext)_localctx).val = expression(0);
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

	public static class Var_typeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0) || _la==ID) ) {
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

	public static class FunctionContext extends ParserRuleContext {
		public Var_typeContext v_type;
		public Function_argsContext f_args;
		public SentenceContext sentence;
		public List<SentenceContext> sentences = new ArrayList<SentenceContext>();
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Function_argsContext function_args() {
			return getRuleContext(Function_argsContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			((FunctionContext)_localctx).v_type = var_type();
			setState(172);
			match(ID);
			setState(173);
			match(T__29);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0) || _la==ID) {
				{
				setState(174);
				((FunctionContext)_localctx).f_args = function_args();
				}
			}

			setState(177);
			match(T__30);
			setState(178);
			match(T__10);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__68 - 68)) | (1L << (T__69 - 68)) | (1L << (T__70 - 68)) | (1L << (T__71 - 68)) | (1L << (BINARY_CONST - 68)) | (1L << (OCTAL_CONST - 68)) | (1L << (HEX_CONST - 68)) | (1L << (INT_CONST - 68)) | (1L << (FLOAT_CONST - 68)) | (1L << (CHAR_CONST - 68)) | (1L << (STRING_CONST - 68)) | (1L << (ID - 68)))) != 0)) {
				{
				{
				setState(179);
				((FunctionContext)_localctx).sentence = sentence();
				((FunctionContext)_localctx).sentences.add(((FunctionContext)_localctx).sentence);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			match(T__12);
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

	public static class Function_argsContext extends ParserRuleContext {
		public Simple_definitionContext simple_definition;
		public List<Simple_definitionContext> f_args = new ArrayList<Simple_definitionContext>();
		public List<Simple_definitionContext> simple_definition() {
			return getRuleContexts(Simple_definitionContext.class);
		}
		public Simple_definitionContext simple_definition(int i) {
			return getRuleContext(Simple_definitionContext.class,i);
		}
		public Function_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_args; }
	}

	public final Function_argsContext function_args() throws RecognitionException {
		Function_argsContext _localctx = new Function_argsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			((Function_argsContext)_localctx).simple_definition = simple_definition();
			((Function_argsContext)_localctx).f_args.add(((Function_argsContext)_localctx).simple_definition);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(188);
				match(T__11);
				setState(189);
				((Function_argsContext)_localctx).simple_definition = simple_definition();
				((Function_argsContext)_localctx).f_args.add(((Function_argsContext)_localctx).simple_definition);
				}
				}
				setState(194);
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

	public static class Iteration_sentenceContext extends ParserRuleContext {
		public Token it_type;
		public ExpressionContext expr;
		public Code_blockContext code;
		public Assignment_definitionContext assign_def;
		public ExpressionContext condition;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Assignment_definitionContext assignment_definition() {
			return getRuleContext(Assignment_definitionContext.class,0);
		}
		public Iteration_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_sentence; }
	}

	public final Iteration_sentenceContext iteration_sentence() throws RecognitionException {
		Iteration_sentenceContext _localctx = new Iteration_sentenceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_iteration_sentence);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				((Iteration_sentenceContext)_localctx).it_type = match(T__31);
				setState(196);
				match(T__29);
				setState(197);
				((Iteration_sentenceContext)_localctx).expr = expression(0);
				setState(198);
				match(T__30);
				setState(199);
				((Iteration_sentenceContext)_localctx).code = code_block();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				((Iteration_sentenceContext)_localctx).it_type = match(T__32);
				setState(202);
				((Iteration_sentenceContext)_localctx).code = code_block();
				setState(203);
				match(T__31);
				setState(204);
				match(T__29);
				setState(205);
				((Iteration_sentenceContext)_localctx).expr = expression(0);
				setState(206);
				match(T__30);
				setState(207);
				match(T__4);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				((Iteration_sentenceContext)_localctx).it_type = match(T__33);
				setState(210);
				match(T__29);
				setState(211);
				((Iteration_sentenceContext)_localctx).assign_def = assignment_definition();
				setState(212);
				match(T__4);
				setState(213);
				((Iteration_sentenceContext)_localctx).condition = expression(0);
				setState(214);
				match(T__4);
				setState(215);
				((Iteration_sentenceContext)_localctx).expr = expression(0);
				setState(216);
				match(T__30);
				setState(217);
				((Iteration_sentenceContext)_localctx).code = code_block();
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

	public static class Conditional_sentenceContext extends ParserRuleContext {
		public Token cond_type;
		public ExpressionContext expr;
		public Code_blockContext if_code;
		public Code_blockContext else_code;
		public Case_sentenceContext case_sentence;
		public List<Case_sentenceContext> sentences = new ArrayList<Case_sentenceContext>();
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Code_blockContext> code_block() {
			return getRuleContexts(Code_blockContext.class);
		}
		public Code_blockContext code_block(int i) {
			return getRuleContext(Code_blockContext.class,i);
		}
		public List<Case_sentenceContext> case_sentence() {
			return getRuleContexts(Case_sentenceContext.class);
		}
		public Case_sentenceContext case_sentence(int i) {
			return getRuleContext(Case_sentenceContext.class,i);
		}
		public Conditional_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_sentence; }
	}

	public final Conditional_sentenceContext conditional_sentence() throws RecognitionException {
		Conditional_sentenceContext _localctx = new Conditional_sentenceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_conditional_sentence);
		int _la;
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				((Conditional_sentenceContext)_localctx).cond_type = match(T__34);
				setState(222);
				match(T__29);
				setState(223);
				((Conditional_sentenceContext)_localctx).expr = expression(0);
				setState(224);
				match(T__30);
				setState(225);
				((Conditional_sentenceContext)_localctx).if_code = code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				((Conditional_sentenceContext)_localctx).cond_type = match(T__34);
				setState(228);
				match(T__29);
				setState(229);
				((Conditional_sentenceContext)_localctx).expr = expression(0);
				setState(230);
				match(T__30);
				setState(231);
				((Conditional_sentenceContext)_localctx).if_code = code_block();
				setState(232);
				match(T__35);
				setState(233);
				((Conditional_sentenceContext)_localctx).else_code = code_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				((Conditional_sentenceContext)_localctx).cond_type = match(T__36);
				setState(236);
				match(T__29);
				setState(237);
				((Conditional_sentenceContext)_localctx).expr = expression(0);
				setState(238);
				match(T__30);
				setState(239);
				match(T__10);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__40 || _la==T__42) {
					{
					{
					setState(240);
					((Conditional_sentenceContext)_localctx).case_sentence = case_sentence();
					((Conditional_sentenceContext)_localctx).sentences.add(((Conditional_sentenceContext)_localctx).case_sentence);
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(246);
				match(T__12);
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

	public static class Code_blockContext extends ParserRuleContext {
		public SentenceContext sentence;
		public List<SentenceContext> sentences = new ArrayList<SentenceContext>();
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_code_block);
		int _la;
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(T__10);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__68 - 68)) | (1L << (T__69 - 68)) | (1L << (T__70 - 68)) | (1L << (T__71 - 68)) | (1L << (BINARY_CONST - 68)) | (1L << (OCTAL_CONST - 68)) | (1L << (HEX_CONST - 68)) | (1L << (INT_CONST - 68)) | (1L << (FLOAT_CONST - 68)) | (1L << (CHAR_CONST - 68)) | (1L << (STRING_CONST - 68)) | (1L << (ID - 68)))) != 0)) {
					{
					{
					setState(251);
					((Code_blockContext)_localctx).sentence = sentence();
					((Code_blockContext)_localctx).sentences.add(((Code_blockContext)_localctx).sentence);
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(257);
				match(T__12);
				}
				break;
			case T__6:
			case T__7:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__43:
			case T__44:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case BINARY_CONST:
			case OCTAL_CONST:
			case HEX_CONST:
			case INT_CONST:
			case FLOAT_CONST:
			case CHAR_CONST:
			case STRING_CONST:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				((Code_blockContext)_localctx).sentence = sentence();
				((Code_blockContext)_localctx).sentences.add(((Code_blockContext)_localctx).sentence);
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

	public static class SentenceContext extends ParserRuleContext {
		public Assignment_definitionContext a_def;
		public Simple_definitionContext s_def;
		public Array_definitionContext arr_def;
		public ConstantContext const_def;
		public Static_variableContext s_var;
		public Iteration_sentenceContext it_sent;
		public Conditional_sentenceContext cond_sent;
		public ExpressionContext expr;
		public Token s_type;
		public Assignment_definitionContext assignment_definition() {
			return getRuleContext(Assignment_definitionContext.class,0);
		}
		public Simple_definitionContext simple_definition() {
			return getRuleContext(Simple_definitionContext.class,0);
		}
		public Array_definitionContext array_definition() {
			return getRuleContext(Array_definitionContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Static_variableContext static_variable() {
			return getRuleContext(Static_variableContext.class,0);
		}
		public Iteration_sentenceContext iteration_sentence() {
			return getRuleContext(Iteration_sentenceContext.class,0);
		}
		public Conditional_sentenceContext conditional_sentence() {
			return getRuleContext(Conditional_sentenceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sentence);
		int _la;
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				((SentenceContext)_localctx).a_def = assignment_definition();
				setState(262);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				((SentenceContext)_localctx).s_def = simple_definition();
				setState(265);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				((SentenceContext)_localctx).arr_def = array_definition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				((SentenceContext)_localctx).const_def = constant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(269);
				((SentenceContext)_localctx).s_var = static_variable();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(270);
				((SentenceContext)_localctx).it_sent = iteration_sentence();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(271);
				((SentenceContext)_localctx).cond_sent = conditional_sentence();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(272);
				((SentenceContext)_localctx).expr = expression(0);
				setState(273);
				match(T__4);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(275);
				((SentenceContext)_localctx).s_type = match(T__37);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (T__29 - 30)) | (1L << (T__43 - 30)) | (1L << (T__44 - 30)) | (1L << (T__67 - 30)) | (1L << (T__68 - 30)) | (1L << (T__69 - 30)) | (1L << (T__70 - 30)) | (1L << (BINARY_CONST - 30)) | (1L << (OCTAL_CONST - 30)) | (1L << (HEX_CONST - 30)) | (1L << (INT_CONST - 30)) | (1L << (FLOAT_CONST - 30)) | (1L << (CHAR_CONST - 30)) | (1L << (STRING_CONST - 30)) | (1L << (ID - 30)))) != 0)) {
					{
					setState(276);
					((SentenceContext)_localctx).expr = expression(0);
					}
				}

				setState(279);
				match(T__4);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(280);
				((SentenceContext)_localctx).s_type = match(T__38);
				setState(281);
				match(T__4);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(282);
				((SentenceContext)_localctx).s_type = match(T__39);
				setState(283);
				match(T__4);
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

	public static class Case_sentenceContext extends ParserRuleContext {
		public Token sent_type;
		public ExpressionContext expr;
		public SentenceContext sentence;
		public List<SentenceContext> sentences = new ArrayList<SentenceContext>();
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public Case_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_sentence; }
	}

	public final Case_sentenceContext case_sentence() throws RecognitionException {
		Case_sentenceContext _localctx = new Case_sentenceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_case_sentence);
		try {
			int _alt;
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				((Case_sentenceContext)_localctx).sent_type = match(T__40);
				setState(287);
				((Case_sentenceContext)_localctx).expr = expression(0);
				setState(288);
				match(T__41);
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(289);
						((Case_sentenceContext)_localctx).sentence = sentence();
						((Case_sentenceContext)_localctx).sentences.add(((Case_sentenceContext)_localctx).sentence);
						}
						} 
					}
					setState(294);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(295);
				match(T__38);
				setState(296);
				match(T__4);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				((Case_sentenceContext)_localctx).sent_type = match(T__42);
				setState(299);
				match(T__41);
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(300);
						((Case_sentenceContext)_localctx).sentence = sentence();
						((Case_sentenceContext)_localctx).sentences.add(((Case_sentenceContext)_localctx).sentence);
						}
						} 
					}
					setState(305);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(306);
				match(T__38);
				setState(307);
				match(T__4);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext array_name;
		public ExpressionContext left;
		public ExpressionContext assign;
		public ExpressionContext r_expr;
		public Function_callContext f_call;
		public Incdec_expressionContext i_d_expr;
		public Token operator;
		public ExpressionContext expr;
		public ExpressionContext right;
		public ExpressionContext value;
		public ExpressionContext index;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Incdec_expressionContext incdec_expression() {
			return getRuleContext(Incdec_expressionContext.class,0);
		}
		public TerminalNode HEX_CONST() { return getToken(ArduinoParser.HEX_CONST, 0); }
		public TerminalNode OCTAL_CONST() { return getToken(ArduinoParser.OCTAL_CONST, 0); }
		public TerminalNode BINARY_CONST() { return getToken(ArduinoParser.BINARY_CONST, 0); }
		public TerminalNode INT_CONST() { return getToken(ArduinoParser.INT_CONST, 0); }
		public TerminalNode FLOAT_CONST() { return getToken(ArduinoParser.FLOAT_CONST, 0); }
		public TerminalNode CHAR_CONST() { return getToken(ArduinoParser.CHAR_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(ArduinoParser.STRING_CONST, 0); }
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public TerminalNode BIT_SHIFT_R() { return getToken(ArduinoParser.BIT_SHIFT_R, 0); }
		public TerminalNode BIT_SHIFT_L() { return getToken(ArduinoParser.BIT_SHIFT_L, 0); }
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(311);
				match(T__29);
				setState(312);
				((ExpressionContext)_localctx).r_expr = expression(0);
				setState(313);
				match(T__30);
				}
				break;
			case 2:
				{
				setState(315);
				((ExpressionContext)_localctx).f_call = function_call();
				}
				break;
			case 3:
				{
				setState(316);
				((ExpressionContext)_localctx).i_d_expr = incdec_expression();
				}
				break;
			case 4:
				{
				setState(317);
				((ExpressionContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__43 || _la==T__44) ) {
					((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(318);
				((ExpressionContext)_localctx).expr = expression(23);
				}
				break;
			case 5:
				{
				setState(319);
				match(T__67);
				}
				break;
			case 6:
				{
				setState(320);
				match(T__68);
				}
				break;
			case 7:
				{
				setState(321);
				match(HEX_CONST);
				}
				break;
			case 8:
				{
				setState(322);
				match(OCTAL_CONST);
				}
				break;
			case 9:
				{
				setState(323);
				match(BINARY_CONST);
				}
				break;
			case 10:
				{
				setState(324);
				match(INT_CONST);
				}
				break;
			case 11:
				{
				setState(325);
				match(FLOAT_CONST);
				}
				break;
			case 12:
				{
				setState(326);
				match(CHAR_CONST);
				}
				break;
			case 13:
				{
				setState(327);
				match(STRING_CONST);
				}
				break;
			case 14:
				{
				setState(328);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(372);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(331);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(332);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__46) | (1L << T__47))) != 0)) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(333);
						((ExpressionContext)_localctx).right = expression(23);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(334);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(335);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__48 || _la==T__49) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(336);
						((ExpressionContext)_localctx).right = expression(22);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(337);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(338);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==BIT_SHIFT_L || _la==BIT_SHIFT_R) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(339);
						((ExpressionContext)_localctx).right = expression(21);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(340);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(341);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__50) | (1L << T__51))) != 0)) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(342);
						((ExpressionContext)_localctx).right = expression(20);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(343);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(344);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__52 || _la==T__53) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(345);
						((ExpressionContext)_localctx).right = expression(19);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(346);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(347);
						((ExpressionContext)_localctx).operator = match(T__54);
						setState(348);
						((ExpressionContext)_localctx).right = expression(18);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(349);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(350);
						((ExpressionContext)_localctx).operator = match(T__55);
						setState(351);
						((ExpressionContext)_localctx).right = expression(17);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(352);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(353);
						((ExpressionContext)_localctx).operator = match(T__56);
						setState(354);
						((ExpressionContext)_localctx).right = expression(16);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(355);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(356);
						((ExpressionContext)_localctx).operator = match(T__57);
						setState(357);
						((ExpressionContext)_localctx).right = expression(15);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(358);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(359);
						((ExpressionContext)_localctx).operator = match(T__58);
						setState(360);
						((ExpressionContext)_localctx).right = expression(14);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(361);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(362);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (T__59 - 60)) | (1L << (T__60 - 60)) | (1L << (T__61 - 60)) | (1L << (T__62 - 60)) | (1L << (T__63 - 60)) | (1L << (T__64 - 60)) | (1L << (T__65 - 60)) | (1L << (T__66 - 60)))) != 0)) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(363);
						((ExpressionContext)_localctx).right = expression(13);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.assign = _prevctx;
						_localctx.assign = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(364);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(365);
						match(T__5);
						setState(366);
						((ExpressionContext)_localctx).value = expression(12);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.array_name = _prevctx;
						_localctx.array_name = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(367);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(368);
						match(T__8);
						setState(369);
						((ExpressionContext)_localctx).index = expression(0);
						setState(370);
						match(T__9);
						}
						break;
					}
					} 
				}
				setState(376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class Incdec_expressionContext extends ParserRuleContext {
		public Token operator;
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public Incdec_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incdec_expression; }
	}

	public final Incdec_expressionContext incdec_expression() throws RecognitionException {
		Incdec_expressionContext _localctx = new Incdec_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_incdec_expression);
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				((Incdec_expressionContext)_localctx).operator = match(T__69);
				setState(378);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(ID);
				setState(380);
				((Incdec_expressionContext)_localctx).operator = match(T__69);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				((Incdec_expressionContext)_localctx).operator = match(T__70);
				setState(382);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(383);
				match(ID);
				setState(384);
				((Incdec_expressionContext)_localctx).operator = match(T__70);
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

	public static class Function_callContext extends ParserRuleContext {
		public Token obj;
		public Token ID;
		public List<Token> elems = new ArrayList<Token>();
		public Function_callContext f_call;
		public Token f_name;
		public ParameterContext args;
		public List<TerminalNode> ID() { return getTokens(ArduinoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ArduinoParser.ID, i);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function_call);
		int _la;
		try {
			int _alt;
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				((Function_callContext)_localctx).obj = match(ID);
				setState(392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(388);
						match(T__3);
						setState(389);
						((Function_callContext)_localctx).ID = match(ID);
						((Function_callContext)_localctx).elems.add(((Function_callContext)_localctx).ID);
						}
						} 
					}
					setState(394);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(395);
				match(T__3);
				setState(396);
				((Function_callContext)_localctx).f_call = function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				((Function_callContext)_localctx).f_name = match(ID);
				setState(398);
				match(T__29);
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (T__29 - 30)) | (1L << (T__43 - 30)) | (1L << (T__44 - 30)) | (1L << (T__67 - 30)) | (1L << (T__68 - 30)) | (1L << (T__69 - 30)) | (1L << (T__70 - 30)) | (1L << (BINARY_CONST - 30)) | (1L << (OCTAL_CONST - 30)) | (1L << (HEX_CONST - 30)) | (1L << (INT_CONST - 30)) | (1L << (FLOAT_CONST - 30)) | (1L << (CHAR_CONST - 30)) | (1L << (STRING_CONST - 30)) | (1L << (ID - 30)))) != 0)) {
					{
					setState(399);
					((Function_callContext)_localctx).args = parameter();
					}
				}

				setState(402);
				match(T__30);
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

	public static class ParameterContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> parameters = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			((ParameterContext)_localctx).expression = expression(0);
			((ParameterContext)_localctx).parameters.add(((ParameterContext)_localctx).expression);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(406);
				match(T__11);
				setState(407);
				((ParameterContext)_localctx).expression = expression(0);
				((ParameterContext)_localctx).parameters.add(((ParameterContext)_localctx).expression);
				}
				}
				setState(412);
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

	public static class Static_variableContext extends ParserRuleContext {
		public Var_typeContext v_type;
		public ExpressionContext val;
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Static_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_variable; }
	}

	public final Static_variableContext static_variable() throws RecognitionException {
		Static_variableContext _localctx = new Static_variableContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_static_variable);
		try {
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(T__71);
				setState(414);
				((Static_variableContext)_localctx).v_type = var_type();
				setState(415);
				match(ID);
				setState(416);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				match(T__71);
				setState(419);
				((Static_variableContext)_localctx).v_type = var_type();
				setState(420);
				match(ID);
				setState(421);
				match(T__5);
				setState(422);
				((Static_variableContext)_localctx).val = expression(0);
				setState(423);
				match(T__4);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 22);
		case 1:
			return precpred(_ctx, 21);
		case 2:
			return precpred(_ctx, 20);
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 15);
		case 8:
			return precpred(_ctx, 14);
		case 9:
			return precpred(_ctx, 13);
		case 10:
			return precpred(_ctx, 12);
		case 11:
			return precpred(_ctx, 11);
		case 12:
			return precpred(_ctx, 24);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Y\u01ae\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\7\3?\n\3\f\3\16"+
		"\3B\13\3\3\4\3\4\5\4F\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7]\n\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\177\n\n\3\13\3\13\5\13\u0083"+
		"\n\13\3\13\3\13\5\13\u0087\n\13\3\f\3\f\3\f\3\f\6\f\u008d\n\f\r\f\16\f"+
		"\u008e\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0097\n\f\f\f\16\f\u009a\13\f\3\f\3"+
		"\f\5\f\u009e\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00aa\n\r"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00b2\n\17\3\17\3\17\3\17\7\17\u00b7"+
		"\n\17\f\17\16\17\u00ba\13\17\3\17\3\17\3\20\3\20\3\20\7\20\u00c1\n\20"+
		"\f\20\16\20\u00c4\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u00de\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00f4\n\22\f\22"+
		"\16\22\u00f7\13\22\3\22\3\22\5\22\u00fb\n\22\3\23\3\23\7\23\u00ff\n\23"+
		"\f\23\16\23\u0102\13\23\3\23\3\23\5\23\u0106\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0118"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u011f\n\24\3\25\3\25\3\25\3\25\7\25"+
		"\u0125\n\25\f\25\16\25\u0128\13\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25"+
		"\u0130\n\25\f\25\16\25\u0133\13\25\3\25\3\25\5\25\u0137\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u014c\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\7\26\u0177\n\26\f\26\16\26\u017a\13\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0184\n\27\3\30\3\30\3\30\7\30"+
		"\u0189\n\30\f\30\16\30\u018c\13\30\3\30\3\30\3\30\3\30\3\30\5\30\u0193"+
		"\n\30\3\30\5\30\u0196\n\30\3\31\3\31\3\31\7\31\u019b\n\31\f\31\16\31\u019e"+
		"\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u01ac\n\32\3\32\2\3*\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\2\n\4\2\20\37VV\3\2./\3\2\60\62\3\2\63\64\3\2KL\4\2\4\5\65\66"+
		"\3\2\678\3\2>E\2\u01df\2\64\3\2\2\2\4:\3\2\2\2\6E\3\2\2\2\bN\3\2\2\2\n"+
		"P\3\2\2\2\f\\\3\2\2\2\16^\3\2\2\2\20a\3\2\2\2\22~\3\2\2\2\24\u0080\3\2"+
		"\2\2\26\u009d\3\2\2\2\30\u00a9\3\2\2\2\32\u00ab\3\2\2\2\34\u00ad\3\2\2"+
		"\2\36\u00bd\3\2\2\2 \u00dd\3\2\2\2\"\u00fa\3\2\2\2$\u0105\3\2\2\2&\u011e"+
		"\3\2\2\2(\u0136\3\2\2\2*\u014b\3\2\2\2,\u0183\3\2\2\2.\u0195\3\2\2\2\60"+
		"\u0197\3\2\2\2\62\u01ab\3\2\2\2\64\65\5\4\3\2\65\66\7\2\2\3\66\3\3\2\2"+
		"\2\679\5\b\5\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;@\3\2\2\2<:\3"+
		"\2\2\2=?\5\6\4\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\5\3\2\2\2B@"+
		"\3\2\2\2CF\5\f\7\2DF\5\34\17\2EC\3\2\2\2ED\3\2\2\2F\7\3\2\2\2GH\7\3\2"+
		"\2HO\7T\2\2IJ\7\3\2\2JK\7\4\2\2KL\5\n\6\2LM\7\5\2\2MO\3\2\2\2NG\3\2\2"+
		"\2NI\3\2\2\2O\t\3\2\2\2PQ\7V\2\2QR\7\6\2\2RS\7V\2\2S\13\3\2\2\2TU\5\16"+
		"\b\2UV\7\7\2\2V]\3\2\2\2W]\5\22\n\2XY\5\20\t\2YZ\7\7\2\2Z]\3\2\2\2[]\5"+
		"\30\r\2\\T\3\2\2\2\\W\3\2\2\2\\X\3\2\2\2\\[\3\2\2\2]\r\3\2\2\2^_\5\32"+
		"\16\2_`\7V\2\2`\17\3\2\2\2ab\5\32\16\2bc\7V\2\2cd\7\b\2\2de\5*\26\2e\21"+
		"\3\2\2\2fg\7\t\2\2g\177\5\22\n\2hi\7\n\2\2ij\7V\2\2j\177\5\26\f\2kl\5"+
		"\32\16\2lm\7V\2\2mn\5\24\13\2no\7\7\2\2o\177\3\2\2\2pq\5\32\16\2qr\7V"+
		"\2\2rs\5\24\13\2st\7\b\2\2tu\5\26\f\2uv\7\7\2\2v\177\3\2\2\2wx\5\32\16"+
		"\2xy\7V\2\2yz\5\24\13\2z{\7\b\2\2{|\5*\26\2|}\7\7\2\2}\177\3\2\2\2~f\3"+
		"\2\2\2~h\3\2\2\2~k\3\2\2\2~p\3\2\2\2~w\3\2\2\2\177\23\3\2\2\2\u0080\u0082"+
		"\7\13\2\2\u0081\u0083\7P\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0086\7\f\2\2\u0085\u0087\5\24\13\2\u0086\u0085\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\25\3\2\2\2\u0088\u0089\7\r\2\2\u0089"+
		"\u008c\5\26\f\2\u008a\u008b\7\16\2\2\u008b\u008d\5\26\f\2\u008c\u008a"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\7\17\2\2\u0091\u009e\3\2\2\2\u0092\u0093\7"+
		"\r\2\2\u0093\u0098\5*\26\2\u0094\u0095\7\16\2\2\u0095\u0097\5*\26\2\u0096"+
		"\u0094\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7\17\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u0088\3\2\2\2\u009d\u0092\3\2\2\2\u009e\27\3\2\2"+
		"\2\u009f\u00a0\7\t\2\2\u00a0\u00a1\5\32\16\2\u00a1\u00a2\7V\2\2\u00a2"+
		"\u00a3\7\b\2\2\u00a3\u00a4\5*\26\2\u00a4\u00a5\7\7\2\2\u00a5\u00aa\3\2"+
		"\2\2\u00a6\u00a7\7\n\2\2\u00a7\u00a8\7V\2\2\u00a8\u00aa\5*\26\2\u00a9"+
		"\u009f\3\2\2\2\u00a9\u00a6\3\2\2\2\u00aa\31\3\2\2\2\u00ab\u00ac\t\2\2"+
		"\2\u00ac\33\3\2\2\2\u00ad\u00ae\5\32\16\2\u00ae\u00af\7V\2\2\u00af\u00b1"+
		"\7 \2\2\u00b0\u00b2\5\36\20\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2"+
		"\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7!\2\2\u00b4\u00b8\7\r\2\2\u00b5\u00b7"+
		"\5&\24\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7\17"+
		"\2\2\u00bc\35\3\2\2\2\u00bd\u00c2\5\16\b\2\u00be\u00bf\7\16\2\2\u00bf"+
		"\u00c1\5\16\b\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3"+
		"\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\37\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5"+
		"\u00c6\7\"\2\2\u00c6\u00c7\7 \2\2\u00c7\u00c8\5*\26\2\u00c8\u00c9\7!\2"+
		"\2\u00c9\u00ca\5$\23\2\u00ca\u00de\3\2\2\2\u00cb\u00cc\7#\2\2\u00cc\u00cd"+
		"\5$\23\2\u00cd\u00ce\7\"\2\2\u00ce\u00cf\7 \2\2\u00cf\u00d0\5*\26\2\u00d0"+
		"\u00d1\7!\2\2\u00d1\u00d2\7\7\2\2\u00d2\u00de\3\2\2\2\u00d3\u00d4\7$\2"+
		"\2\u00d4\u00d5\7 \2\2\u00d5\u00d6\5\20\t\2\u00d6\u00d7\7\7\2\2\u00d7\u00d8"+
		"\5*\26\2\u00d8\u00d9\7\7\2\2\u00d9\u00da\5*\26\2\u00da\u00db\7!\2\2\u00db"+
		"\u00dc\5$\23\2\u00dc\u00de\3\2\2\2\u00dd\u00c5\3\2\2\2\u00dd\u00cb\3\2"+
		"\2\2\u00dd\u00d3\3\2\2\2\u00de!\3\2\2\2\u00df\u00e0\7%\2\2\u00e0\u00e1"+
		"\7 \2\2\u00e1\u00e2\5*\26\2\u00e2\u00e3\7!\2\2\u00e3\u00e4\5$\23\2\u00e4"+
		"\u00fb\3\2\2\2\u00e5\u00e6\7%\2\2\u00e6\u00e7\7 \2\2\u00e7\u00e8\5*\26"+
		"\2\u00e8\u00e9\7!\2\2\u00e9\u00ea\5$\23\2\u00ea\u00eb\7&\2\2\u00eb\u00ec"+
		"\5$\23\2\u00ec\u00fb\3\2\2\2\u00ed\u00ee\7\'\2\2\u00ee\u00ef\7 \2\2\u00ef"+
		"\u00f0\5*\26\2\u00f0\u00f1\7!\2\2\u00f1\u00f5\7\r\2\2\u00f2\u00f4\5(\25"+
		"\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6"+
		"\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\7\17\2\2"+
		"\u00f9\u00fb\3\2\2\2\u00fa\u00df\3\2\2\2\u00fa\u00e5\3\2\2\2\u00fa\u00ed"+
		"\3\2\2\2\u00fb#\3\2\2\2\u00fc\u0100\7\r\2\2\u00fd\u00ff\5&\24\2\u00fe"+
		"\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0106\7\17\2\2\u0104"+
		"\u0106\5&\24\2\u0105\u00fc\3\2\2\2\u0105\u0104\3\2\2\2\u0106%\3\2\2\2"+
		"\u0107\u0108\5\20\t\2\u0108\u0109\7\7\2\2\u0109\u011f\3\2\2\2\u010a\u010b"+
		"\5\16\b\2\u010b\u010c\7\7\2\2\u010c\u011f\3\2\2\2\u010d\u011f\5\22\n\2"+
		"\u010e\u011f\5\30\r\2\u010f\u011f\5\62\32\2\u0110\u011f\5 \21\2\u0111"+
		"\u011f\5\"\22\2\u0112\u0113\5*\26\2\u0113\u0114\7\7\2\2\u0114\u011f\3"+
		"\2\2\2\u0115\u0117\7(\2\2\u0116\u0118\5*\26\2\u0117\u0116\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011f\7\7\2\2\u011a\u011b\7)"+
		"\2\2\u011b\u011f\7\7\2\2\u011c\u011d\7*\2\2\u011d\u011f\7\7\2\2\u011e"+
		"\u0107\3\2\2\2\u011e\u010a\3\2\2\2\u011e\u010d\3\2\2\2\u011e\u010e\3\2"+
		"\2\2\u011e\u010f\3\2\2\2\u011e\u0110\3\2\2\2\u011e\u0111\3\2\2\2\u011e"+
		"\u0112\3\2\2\2\u011e\u0115\3\2\2\2\u011e\u011a\3\2\2\2\u011e\u011c\3\2"+
		"\2\2\u011f\'\3\2\2\2\u0120\u0121\7+\2\2\u0121\u0122\5*\26\2\u0122\u0126"+
		"\7,\2\2\u0123\u0125\5&\24\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0129\u012a\7)\2\2\u012a\u012b\7\7\2\2\u012b\u0137\3\2\2\2\u012c"+
		"\u012d\7-\2\2\u012d\u0131\7,\2\2\u012e\u0130\5&\24\2\u012f\u012e\3\2\2"+
		"\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134"+
		"\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\7)\2\2\u0135\u0137\7\7\2\2\u0136"+
		"\u0120\3\2\2\2\u0136\u012c\3\2\2\2\u0137)\3\2\2\2\u0138\u0139\b\26\1\2"+
		"\u0139\u013a\7 \2\2\u013a\u013b\5*\26\2\u013b\u013c\7!\2\2\u013c\u014c"+
		"\3\2\2\2\u013d\u014c\5.\30\2\u013e\u014c\5,\27\2\u013f\u0140\t\3\2\2\u0140"+
		"\u014c\5*\26\31\u0141\u014c\7F\2\2\u0142\u014c\7G\2\2\u0143\u014c\7O\2"+
		"\2\u0144\u014c\7N\2\2\u0145\u014c\7M\2\2\u0146\u014c\7P\2\2\u0147\u014c"+
		"\7Q\2\2\u0148\u014c\7R\2\2\u0149\u014c\7T\2\2\u014a\u014c\7V\2\2\u014b"+
		"\u0138\3\2\2\2\u014b\u013d\3\2\2\2\u014b\u013e\3\2\2\2\u014b\u013f\3\2"+
		"\2\2\u014b\u0141\3\2\2\2\u014b\u0142\3\2\2\2\u014b\u0143\3\2\2\2\u014b"+
		"\u0144\3\2\2\2\u014b\u0145\3\2\2\2\u014b\u0146\3\2\2\2\u014b\u0147\3\2"+
		"\2\2\u014b\u0148\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c"+
		"\u0178\3\2\2\2\u014d\u014e\f\30\2\2\u014e\u014f\t\4\2\2\u014f\u0177\5"+
		"*\26\31\u0150\u0151\f\27\2\2\u0151\u0152\t\5\2\2\u0152\u0177\5*\26\30"+
		"\u0153\u0154\f\26\2\2\u0154\u0155\t\6\2\2\u0155\u0177\5*\26\27\u0156\u0157"+
		"\f\25\2\2\u0157\u0158\t\7\2\2\u0158\u0177\5*\26\26\u0159\u015a\f\24\2"+
		"\2\u015a\u015b\t\b\2\2\u015b\u0177\5*\26\25\u015c\u015d\f\23\2\2\u015d"+
		"\u015e\79\2\2\u015e\u0177\5*\26\24\u015f\u0160\f\22\2\2\u0160\u0161\7"+
		":\2\2\u0161\u0177\5*\26\23\u0162\u0163\f\21\2\2\u0163\u0164\7;\2\2\u0164"+
		"\u0177\5*\26\22\u0165\u0166\f\20\2\2\u0166\u0167\7<\2\2\u0167\u0177\5"+
		"*\26\21\u0168\u0169\f\17\2\2\u0169\u016a\7=\2\2\u016a\u0177\5*\26\20\u016b"+
		"\u016c\f\16\2\2\u016c\u016d\t\t\2\2\u016d\u0177\5*\26\17\u016e\u016f\f"+
		"\r\2\2\u016f\u0170\7\b\2\2\u0170\u0177\5*\26\16\u0171\u0172\f\32\2\2\u0172"+
		"\u0173\7\13\2\2\u0173\u0174\5*\26\2\u0174\u0175\7\f\2\2\u0175\u0177\3"+
		"\2\2\2\u0176\u014d\3\2\2\2\u0176\u0150\3\2\2\2\u0176\u0153\3\2\2\2\u0176"+
		"\u0156\3\2\2\2\u0176\u0159\3\2\2\2\u0176\u015c\3\2\2\2\u0176\u015f\3\2"+
		"\2\2\u0176\u0162\3\2\2\2\u0176\u0165\3\2\2\2\u0176\u0168\3\2\2\2\u0176"+
		"\u016b\3\2\2\2\u0176\u016e\3\2\2\2\u0176\u0171\3\2\2\2\u0177\u017a\3\2"+
		"\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179+\3\2\2\2\u017a\u0178"+
		"\3\2\2\2\u017b\u017c\7H\2\2\u017c\u0184\7V\2\2\u017d\u017e\7V\2\2\u017e"+
		"\u0184\7H\2\2\u017f\u0180\7I\2\2\u0180\u0184\7V\2\2\u0181\u0182\7V\2\2"+
		"\u0182\u0184\7I\2\2\u0183\u017b\3\2\2\2\u0183\u017d\3\2\2\2\u0183\u017f"+
		"\3\2\2\2\u0183\u0181\3\2\2\2\u0184-\3\2\2\2\u0185\u018a\7V\2\2\u0186\u0187"+
		"\7\6\2\2\u0187\u0189\7V\2\2\u0188\u0186\3\2\2\2\u0189\u018c\3\2\2\2\u018a"+
		"\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2\2\2\u018c\u018a\3\2"+
		"\2\2\u018d\u018e\7\6\2\2\u018e\u0196\5.\30\2\u018f\u0190\7V\2\2\u0190"+
		"\u0192\7 \2\2\u0191\u0193\5\60\31\2\u0192\u0191\3\2\2\2\u0192\u0193\3"+
		"\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\7!\2\2\u0195\u0185\3\2\2\2\u0195"+
		"\u018f\3\2\2\2\u0196/\3\2\2\2\u0197\u019c\5*\26\2\u0198\u0199\7\16\2\2"+
		"\u0199\u019b\5*\26\2\u019a\u0198\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a"+
		"\3\2\2\2\u019c\u019d\3\2\2\2\u019d\61\3\2\2\2\u019e\u019c\3\2\2\2\u019f"+
		"\u01a0\7J\2\2\u01a0\u01a1\5\32\16\2\u01a1\u01a2\7V\2\2\u01a2\u01a3\7\7"+
		"\2\2\u01a3\u01ac\3\2\2\2\u01a4\u01a5\7J\2\2\u01a5\u01a6\5\32\16\2\u01a6"+
		"\u01a7\7V\2\2\u01a7\u01a8\7\b\2\2\u01a8\u01a9\5*\26\2\u01a9\u01aa\7\7"+
		"\2\2\u01aa\u01ac\3\2\2\2\u01ab\u019f\3\2\2\2\u01ab\u01a4\3\2\2\2\u01ac"+
		"\63\3\2\2\2$:@EN\\~\u0082\u0086\u008e\u0098\u009d\u00a9\u00b1\u00b8\u00c2"+
		"\u00dd\u00f5\u00fa\u0100\u0105\u0117\u011e\u0126\u0131\u0136\u014b\u0176"+
		"\u0178\u0183\u018a\u0192\u0195\u019c\u01ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}