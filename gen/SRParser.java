// Generated from C:/Users/corre/OneDrive/Documentos/2019-02/Lenguajes de programacion/Traductor_Lenguajes_v2/gramar\SR.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SRParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TK_NOOP=1, TK_NULL=2, TK_P=3, TK_V=4, TK_AF=5, TK_AND=6, TK_ANY=7, TK_BEGIN=8, 
		TK_BODY=9, TK_BOOL=10, TK_BY=11, TK_CALL=12, TK_CAP=13, TK_CHAR=14, TK_CO=15, 
		TK_CONST=16, TK_CREATE=17, TK_DESTROY=18, TK_DO=19, TK_DOWNTO=20, TK_ELSE=21, 
		TK_END=22, TK_ENUM=23, TK_EXIT=24, TK_EXTEND=25, TK_EXTERNAL=26, TK_FA=27, 
		TK_FALSE=28, TK_TRUE=29, TK_FI=30, TK_FILE=31, TK_FINAL=32, TK_FORWARD=33, 
		TK_GLOBAL=34, TK_HIGH=35, TK_IF=36, TK_IMPORT=37, TK_IN=38, TK_INITIAL=39, 
		TK_INT=40, TK_LOW=41, TK_MOD=42, TK_NEW=43, TK_NEXT=44, TK_NI=45, TK_NOT=46, 
		TK_OC=47, TK_OD=48, TK_ON=49, TK_OP=50, TK_OPTYPE=51, TK_OR=52, TK_PROC=53, 
		TK_PROCEDURE=54, TK_PROCESS=55, TK_PTR=56, TK_REAL=57, TK_REC=58, TK_RECEIVE=59, 
		TK_REF=60, TK_REPLY=61, TK_RES=62, TK_RESOURCE=63, TK_RETURN=64, TK_RETURNS=65, 
		TK_SEM=66, TK_SEND=67, TK_SEPARATE=68, TK_SKIP=69, TK_SUCHTHAT=70, TK_STOP=71, 
		TK_STRING=72, TK_TO=73, TK_TYPE=74, TK_UNION=75, TK_VAL=76, TK_VAR=77, 
		TK_VM=78, TK_XOR=79, TK_COMMA=80, TK_COLON=81, TK_EQ=82, TK_INCR=83, TK_PLUS=84, 
		TK_DECR=85, TK_MINUS=86, TK_ASTER=87, TK_EXPON=88, TK_DIV=89, TK_REMDR=90, 
		TK_LPAREN=91, TK_RPAREN=92, TK_ARROW=93, TK_SQUARE=94, TK_ASSIGN=95, TK_SWAP=96, 
		TK_LBRACKET=97, TK_RBRACKET=98, TK_GE=99, TK_LE=100, TK_GT=101, TK_LT=102, 
		TK_NE=103, TK_OR_OP=104, TK_AND_OP=105, TK_PERIOD=106, TK_NOT_OP=107, 
		TK_ADDR=108, TK_HAT=109, TK_CONCAT=110, TK_LBRACE=111, TK_RBRACE=112, 
		TK_QMARK=113, TK_PARALLEL=114, TK_RSHIFT=115, TK_LSHIFT=116, TK_AUG_PLUS=117, 
		TK_AUG_MINUS=118, TK_AUG_ASTER=119, TK_AUG_EXPON=120, TK_AUG_DIV=121, 
		TK_AUG_REMDR=122, TK_AUG_OR=123, TK_AUG_AND=124, TK_AUG_CONCAT=125, TK_AUG_RSHIFT=126, 
		TK_AUG_LSHIFT=127, TK_SEPARATOR=128, TK_ID=129, TK_NUM=130, TK_TEXT=131, 
		LINE_COMMENT=132, BLOCK_COMMENT=133, WHITE_SPACE=134, NEW_LINE=135;
	public static final int
		RULE_inicio = 0, RULE_component = 1, RULE_spec_component = 2, RULE_combined_component = 3, 
		RULE_combined_specpart = 4, RULE_comp_label = 5, RULE_comp_kwd = 6, RULE_spec_body = 7, 
		RULE_maybe_params = 8, RULE_comp_params = 9, RULE_separate_body = 10, 
		RULE_id_opt = 11, RULE_spec_stmt_ls = 12, RULE_spec_stmt = 13, RULE_body_stmt_ls = 14, 
		RULE_body_stmt = 15, RULE_body_only = 16, RULE_common_stmt = 17, RULE_import_clause = 18, 
		RULE_extend_clause = 19, RULE_import_list = 20, RULE_import_name = 21, 
		RULE_op_decl = 22, RULE_op_or_ext = 23, RULE_oper_def_lp = 24, RULE_oper_def = 25, 
		RULE_colon_opt = 26, RULE_sem_decl = 27, RULE_sem_def_lp = 28, RULE_sem_def = 29, 
		RULE_sem_proto = 30, RULE_sem_init = 31, RULE_proc = 32, RULE_procedure = 33, 
		RULE_process = 34, RULE_initial_block = 35, RULE_initial_opt = 36, RULE_final_block = 37, 
		RULE_final_opt = 38, RULE_prototype = 39, RULE_parameters = 40, RULE_param_spec_ls = 41, 
		RULE_param_spec_lp = 42, RULE_param_spec = 43, RULE_param_kind_opt = 44, 
		RULE_return_spec_opt = 45, RULE_return_spec_null = 46, RULE_param_names = 47, 
		RULE_return_name_opt = 48, RULE_decl = 49, RULE_type_decl = 50, RULE_type_restriction = 51, 
		RULE_obj_decl = 52, RULE_var_or_const = 53, RULE_var_def_lp = 54, RULE_var_def = 55, 
		RULE_var_att = 56, RULE_type = 57, RULE_unsub_type = 58, RULE_basic_type = 59, 
		RULE_string_def = 60, RULE_string_lim = 61, RULE_enum_def = 62, RULE_pointer_def = 63, 
		RULE_record_def = 64, RULE_union_def = 65, RULE_field_lp = 66, RULE_field = 67, 
		RULE_capability_def = 68, RULE_cap_for = 69, RULE_optype_decl = 70, RULE_op_prototype = 71, 
		RULE_eq_opt = 72, RULE_op_restriction_opt = 73, RULE_op_restriction = 74, 
		RULE_block = 75, RULE_block_items = 76, RULE_block_item = 77, RULE_stmt = 78, 
		RULE_skip_stmt = 79, RULE_stop_stmt = 80, RULE_exit_code_opt = 81, RULE_exit_stmt = 82, 
		RULE_next_stmt = 83, RULE_return_stmt = 84, RULE_reply_stmt = 85, RULE_forward_stmt = 86, 
		RULE_send_stmt = 87, RULE_receive_stmt = 88, RULE_v_stmt = 89, RULE_p_stmt = 90, 
		RULE_explicit_call = 91, RULE_destroy_stmt = 92, RULE_begin_end = 93, 
		RULE_if_stmt = 94, RULE_do_stmt = 95, RULE_guarded_cmd_lp = 96, RULE_guarded_cmd = 97, 
		RULE_else_cmd_opt = 98, RULE_for_all_stmt = 99, RULE_input_stmt = 100, 
		RULE_in_cmd_lp = 101, RULE_in_cmd = 102, RULE_in_spec = 103, RULE_in_op = 104, 
		RULE_sync_expr_opt = 105, RULE_sched_expr_opt = 106, RULE_concurrent_stmt = 107, 
		RULE_concurrent_cmd_lp = 108, RULE_concurrent_cmd = 109, RULE_separator_opt = 110, 
		RULE_concurrent_invocation = 111, RULE_post_processing_opt = 112, RULE_quantifiers_opt = 113, 
		RULE_quantifier_lp = 114, RULE_quantifier = 115, RULE_direction = 116, 
		RULE_step_opt = 117, RULE_such_that_opt = 118, RULE_expr = 119, RULE_literal = 120, 
		RULE_prefix_expr = 121, RULE_new_item = 122, RULE_paren_expr = 123, RULE_paren_list = 124, 
		RULE_paren_item_ls = 125, RULE_expr_lp = 126, RULE_constructor = 127, 
		RULE_constr_item_lp = 128, RULE_constr_item = 129, RULE_create_expr = 130, 
		RULE_create_call = 131, RULE_rsrc_name = 132, RULE_location_opt = 133, 
		RULE_qualified_id = 134, RULE_end_id = 135, RULE_id_ls = 136, RULE_id_lp = 137, 
		RULE_id_subs_lp = 138, RULE_id_subs = 139, RULE_subscripts = 140, RULE_subscripts_opt = 141, 
		RULE_bracketed_list = 142, RULE_bound_lp = 143, RULE_bounds = 144, RULE_bound = 145;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "component", "spec_component", "combined_component", "combined_specpart", 
			"comp_label", "comp_kwd", "spec_body", "maybe_params", "comp_params", 
			"separate_body", "id_opt", "spec_stmt_ls", "spec_stmt", "body_stmt_ls", 
			"body_stmt", "body_only", "common_stmt", "import_clause", "extend_clause", 
			"import_list", "import_name", "op_decl", "op_or_ext", "oper_def_lp", 
			"oper_def", "colon_opt", "sem_decl", "sem_def_lp", "sem_def", "sem_proto", 
			"sem_init", "proc", "procedure", "process", "initial_block", "initial_opt", 
			"final_block", "final_opt", "prototype", "parameters", "param_spec_ls", 
			"param_spec_lp", "param_spec", "param_kind_opt", "return_spec_opt", "return_spec_null", 
			"param_names", "return_name_opt", "decl", "type_decl", "type_restriction", 
			"obj_decl", "var_or_const", "var_def_lp", "var_def", "var_att", "type", 
			"unsub_type", "basic_type", "string_def", "string_lim", "enum_def", "pointer_def", 
			"record_def", "union_def", "field_lp", "field", "capability_def", "cap_for", 
			"optype_decl", "op_prototype", "eq_opt", "op_restriction_opt", "op_restriction", 
			"block", "block_items", "block_item", "stmt", "skip_stmt", "stop_stmt", 
			"exit_code_opt", "exit_stmt", "next_stmt", "return_stmt", "reply_stmt", 
			"forward_stmt", "send_stmt", "receive_stmt", "v_stmt", "p_stmt", "explicit_call", 
			"destroy_stmt", "begin_end", "if_stmt", "do_stmt", "guarded_cmd_lp", 
			"guarded_cmd", "else_cmd_opt", "for_all_stmt", "input_stmt", "in_cmd_lp", 
			"in_cmd", "in_spec", "in_op", "sync_expr_opt", "sched_expr_opt", "concurrent_stmt", 
			"concurrent_cmd_lp", "concurrent_cmd", "separator_opt", "concurrent_invocation", 
			"post_processing_opt", "quantifiers_opt", "quantifier_lp", "quantifier", 
			"direction", "step_opt", "such_that_opt", "expr", "literal", "prefix_expr", 
			"new_item", "paren_expr", "paren_list", "paren_item_ls", "expr_lp", "constructor", 
			"constr_item_lp", "constr_item", "create_expr", "create_call", "rsrc_name", 
			"location_opt", "qualified_id", "end_id", "id_ls", "id_lp", "id_subs_lp", 
			"id_subs", "subscripts", "subscripts_opt", "bracketed_list", "bound_lp", 
			"bounds", "bound"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'noop'", "'null'", "'P'", "'V'", "'af'", "'and'", "'any'", "'begin'", 
			"'body'", "'bool'", "'by'", "'call'", "'cap'", "'char'", "'co'", "'const'", 
			"'create'", "'destroy'", "'do'", "'downto'", "'else'", "'end'", "'enum'", 
			"'exit'", "'extend'", "'external'", "'fa'", "'false'", "'true'", "'fi'", 
			"'file'", "'final'", "'forward'", "'global'", "'high'", "'if'", "'import'", 
			"'in'", "'initial'", "'int'", "'low'", "'mod'", "'new'", "'next'", "'ni'", 
			"'not'", "'oc'", "'od'", "'on'", "'op'", "'optype'", "'or'", "'proc'", 
			"'procedure'", "'process'", "'ptr'", "'real'", "'rec'", "'receive'", 
			"'ref'", "'reply'", "'res'", "'resource'", "'return'", "'returns'", "'sem'", 
			"'send'", "'separate'", "'skip'", "'st'", "'stop'", "'string'", "'to'", 
			"'type'", "'union'", "'val'", "'var'", "'vm'", "'xor'", "','", "':'", 
			"'='", "'++'", "'+'", "'--'", "'-'", "'*'", "'**'", "'/'", "'%'", "'('", 
			"')'", "'->'", "'[]'", "':='", "':=:'", "'['", "']'", "'>='", "'<='", 
			"'>'", "'<'", "'!='", "'|'", "'&'", "'.'", "'~'", "'@'", "'^'", "'||'", 
			"'{'", "'}'", "'?'", "'//'", "'>>'", "'<<'", "'+:='", "'-:='", "'*:='", 
			"'**:='", "'/:='", "'%:='", "'|:='", "'&:='", "'||:='", "'>>:='", "'<<:='", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TK_NOOP", "TK_NULL", "TK_P", "TK_V", "TK_AF", "TK_AND", "TK_ANY", 
			"TK_BEGIN", "TK_BODY", "TK_BOOL", "TK_BY", "TK_CALL", "TK_CAP", "TK_CHAR", 
			"TK_CO", "TK_CONST", "TK_CREATE", "TK_DESTROY", "TK_DO", "TK_DOWNTO", 
			"TK_ELSE", "TK_END", "TK_ENUM", "TK_EXIT", "TK_EXTEND", "TK_EXTERNAL", 
			"TK_FA", "TK_FALSE", "TK_TRUE", "TK_FI", "TK_FILE", "TK_FINAL", "TK_FORWARD", 
			"TK_GLOBAL", "TK_HIGH", "TK_IF", "TK_IMPORT", "TK_IN", "TK_INITIAL", 
			"TK_INT", "TK_LOW", "TK_MOD", "TK_NEW", "TK_NEXT", "TK_NI", "TK_NOT", 
			"TK_OC", "TK_OD", "TK_ON", "TK_OP", "TK_OPTYPE", "TK_OR", "TK_PROC", 
			"TK_PROCEDURE", "TK_PROCESS", "TK_PTR", "TK_REAL", "TK_REC", "TK_RECEIVE", 
			"TK_REF", "TK_REPLY", "TK_RES", "TK_RESOURCE", "TK_RETURN", "TK_RETURNS", 
			"TK_SEM", "TK_SEND", "TK_SEPARATE", "TK_SKIP", "TK_SUCHTHAT", "TK_STOP", 
			"TK_STRING", "TK_TO", "TK_TYPE", "TK_UNION", "TK_VAL", "TK_VAR", "TK_VM", 
			"TK_XOR", "TK_COMMA", "TK_COLON", "TK_EQ", "TK_INCR", "TK_PLUS", "TK_DECR", 
			"TK_MINUS", "TK_ASTER", "TK_EXPON", "TK_DIV", "TK_REMDR", "TK_LPAREN", 
			"TK_RPAREN", "TK_ARROW", "TK_SQUARE", "TK_ASSIGN", "TK_SWAP", "TK_LBRACKET", 
			"TK_RBRACKET", "TK_GE", "TK_LE", "TK_GT", "TK_LT", "TK_NE", "TK_OR_OP", 
			"TK_AND_OP", "TK_PERIOD", "TK_NOT_OP", "TK_ADDR", "TK_HAT", "TK_CONCAT", 
			"TK_LBRACE", "TK_RBRACE", "TK_QMARK", "TK_PARALLEL", "TK_RSHIFT", "TK_LSHIFT", 
			"TK_AUG_PLUS", "TK_AUG_MINUS", "TK_AUG_ASTER", "TK_AUG_EXPON", "TK_AUG_DIV", 
			"TK_AUG_REMDR", "TK_AUG_OR", "TK_AUG_AND", "TK_AUG_CONCAT", "TK_AUG_RSHIFT", 
			"TK_AUG_LSHIFT", "TK_SEPARATOR", "TK_ID", "TK_NUM", "TK_TEXT", "LINE_COMMENT", 
			"BLOCK_COMMENT", "WHITE_SPACE", "NEW_LINE"
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
	public String getGrammarFileName() { return "SR.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SRParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicioContext extends ParserRuleContext {
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(292);
				component();
				}
				}
				setState(295); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_BODY) | (1L << TK_GLOBAL) | (1L << TK_RESOURCE))) != 0) );
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

	public static class ComponentContext extends ParserRuleContext {
		public Spec_componentContext spec_component() {
			return getRuleContext(Spec_componentContext.class,0);
		}
		public Combined_componentContext combined_component() {
			return getRuleContext(Combined_componentContext.class,0);
		}
		public Separate_bodyContext separate_body() {
			return getRuleContext(Separate_bodyContext.class,0);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_component);
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				spec_component();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				combined_component();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				separate_body();
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

	public static class Spec_componentContext extends ParserRuleContext {
		public Comp_labelContext comp_label() {
			return getRuleContext(Comp_labelContext.class,0);
		}
		public Spec_stmt_lsContext spec_stmt_ls() {
			return getRuleContext(Spec_stmt_lsContext.class,0);
		}
		public Spec_bodyContext spec_body() {
			return getRuleContext(Spec_bodyContext.class,0);
		}
		public Spec_componentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterSpec_component(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitSpec_component(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitSpec_component(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Spec_componentContext spec_component() throws RecognitionException {
		Spec_componentContext _localctx = new Spec_componentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_spec_component);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			comp_label();
			setState(303);
			spec_stmt_ls(0);
			setState(304);
			spec_body();
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

	public static class Combined_componentContext extends ParserRuleContext {
		public Combined_specpartContext combined_specpart() {
			return getRuleContext(Combined_specpartContext.class,0);
		}
		public Body_stmt_lsContext body_stmt_ls() {
			return getRuleContext(Body_stmt_lsContext.class,0);
		}
		public End_idContext end_id() {
			return getRuleContext(End_idContext.class,0);
		}
		public Combined_componentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combined_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterCombined_component(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitCombined_component(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitCombined_component(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Combined_componentContext combined_component() throws RecognitionException {
		Combined_componentContext _localctx = new Combined_componentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_combined_component);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			combined_specpart();
			setState(307);
			body_stmt_ls(0);
			setState(308);
			end_id();
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

	public static class Combined_specpartContext extends ParserRuleContext {
		public Comp_labelContext comp_label() {
			return getRuleContext(Comp_labelContext.class,0);
		}
		public Comp_paramsContext comp_params() {
			return getRuleContext(Comp_paramsContext.class,0);
		}
		public Combined_specpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combined_specpart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterCombined_specpart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitCombined_specpart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitCombined_specpart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Combined_specpartContext combined_specpart() throws RecognitionException {
		Combined_specpartContext _localctx = new Combined_specpartContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_combined_specpart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			comp_label();
			setState(311);
			comp_params();
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

	public static class Comp_labelContext extends ParserRuleContext {
		public Comp_kwdContext comp_kwd() {
			return getRuleContext(Comp_kwdContext.class,0);
		}
		public TerminalNode TK_ID() { return getToken(SRParser.TK_ID, 0); }
		public Comp_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterComp_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitComp_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitComp_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_labelContext comp_label() throws RecognitionException {
		Comp_labelContext _localctx = new Comp_labelContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comp_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			comp_kwd();
			setState(314);
			match(TK_ID);
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

	public static class Comp_kwdContext extends ParserRuleContext {
		public TerminalNode TK_GLOBAL() { return getToken(SRParser.TK_GLOBAL, 0); }
		public TerminalNode TK_RESOURCE() { return getToken(SRParser.TK_RESOURCE, 0); }
		public Comp_kwdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_kwd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterComp_kwd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitComp_kwd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitComp_kwd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_kwdContext comp_kwd() throws RecognitionException {
		Comp_kwdContext _localctx = new Comp_kwdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comp_kwd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_la = _input.LA(1);
			if ( !(_la==TK_GLOBAL || _la==TK_RESOURCE) ) {
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

	public static class Spec_bodyContext extends ParserRuleContext {
		public End_idContext end_id() {
			return getRuleContext(End_idContext.class,0);
		}
		public TerminalNode TK_BODY() { return getToken(SRParser.TK_BODY, 0); }
		public TerminalNode TK_ID() { return getToken(SRParser.TK_ID, 0); }
		public Maybe_paramsContext maybe_params() {
			return getRuleContext(Maybe_paramsContext.class,0);
		}
		public Body_stmt_lsContext body_stmt_ls() {
			return getRuleContext(Body_stmt_lsContext.class,0);
		}
		public TerminalNode TK_SEPARATE() { return getToken(SRParser.TK_SEPARATE, 0); }
		public Spec_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterSpec_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitSpec_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitSpec_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Spec_bodyContext spec_body() throws RecognitionException {
		Spec_bodyContext _localctx = new Spec_bodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_spec_body);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				end_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(TK_BODY);
				setState(320);
				match(TK_ID);
				setState(321);
				maybe_params();
				setState(322);
				body_stmt_ls(0);
				setState(323);
				end_id();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				match(TK_BODY);
				setState(326);
				match(TK_ID);
				setState(327);
				maybe_params();
				setState(328);
				match(TK_SEPARATE);
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

	public static class Maybe_paramsContext extends ParserRuleContext {
		public Comp_paramsContext comp_params() {
			return getRuleContext(Comp_paramsContext.class,0);
		}
		public Maybe_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maybe_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterMaybe_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitMaybe_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitMaybe_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Maybe_paramsContext maybe_params() throws RecognitionException {
		Maybe_paramsContext _localctx = new Maybe_paramsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_maybe_params);
		try {
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				comp_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Comp_paramsContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Comp_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterComp_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitComp_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitComp_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_paramsContext comp_params() throws RecognitionException {
		Comp_paramsContext _localctx = new Comp_paramsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comp_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			parameters();
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

	public static class Separate_bodyContext extends ParserRuleContext {
		public TerminalNode TK_BODY() { return getToken(SRParser.TK_BODY, 0); }
		public TerminalNode TK_ID() { return getToken(SRParser.TK_ID, 0); }
		public Body_stmt_lsContext body_stmt_ls() {
			return getRuleContext(Body_stmt_lsContext.class,0);
		}
		public End_idContext end_id() {
			return getRuleContext(End_idContext.class,0);
		}
		public Separate_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separate_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterSeparate_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitSeparate_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitSeparate_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Separate_bodyContext separate_body() throws RecognitionException {
		Separate_bodyContext _localctx = new Separate_bodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_separate_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(TK_BODY);
			setState(339);
			match(TK_ID);
			setState(340);
			body_stmt_ls(0);
			setState(341);
			end_id();
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

	public static class Id_optContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(SRParser.TK_ID, 0); }
		public Id_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterId_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitId_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitId_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_optContext id_opt() throws RecognitionException {
		Id_optContext _localctx = new Id_optContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_id_opt);
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				match(TK_ID);
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

	public static class Spec_stmt_lsContext extends ParserRuleContext {
		public Spec_stmtContext spec_stmt() {
			return getRuleContext(Spec_stmtContext.class,0);
		}
		public Spec_stmt_lsContext spec_stmt_ls() {
			return getRuleContext(Spec_stmt_lsContext.class,0);
		}
		public TerminalNode TK_SEPARATOR() { return getToken(SRParser.TK_SEPARATOR, 0); }
		public Spec_stmt_lsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec_stmt_ls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterSpec_stmt_ls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitSpec_stmt_ls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitSpec_stmt_ls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Spec_stmt_lsContext spec_stmt_ls() throws RecognitionException {
		return spec_stmt_ls(0);
	}

	private Spec_stmt_lsContext spec_stmt_ls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Spec_stmt_lsContext _localctx = new Spec_stmt_lsContext(_ctx, _parentState);
		Spec_stmt_lsContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_spec_stmt_ls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(348);
			spec_stmt();
			}
			_ctx.stop = _input.LT(-1);
			setState(355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Spec_stmt_lsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_spec_stmt_ls);
					setState(350);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(351);
					match(TK_SEPARATOR);
					setState(352);
					spec_stmt();
					}
					} 
				}
				setState(357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Spec_stmtContext extends ParserRuleContext {
		public Common_stmtContext common_stmt() {
			return getRuleContext(Common_stmtContext.class,0);
		}
		public Extend_clauseContext extend_clause() {
			return getRuleContext(Extend_clauseContext.class,0);
		}
		public Body_onlyContext body_only() {
			return getRuleContext(Body_onlyContext.class,0);
		}
		public Spec_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterSpec_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitSpec_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitSpec_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Spec_stmtContext spec_stmt() throws RecognitionException {
		Spec_stmtContext _localctx = new Spec_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_spec_stmt);
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				common_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				extend_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				body_only();
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

	public static class Body_stmt_lsContext extends ParserRuleContext {
		public Body_stmtContext body_stmt() {
			return getRuleContext(Body_stmtContext.class,0);
		}
		public Body_stmt_lsContext body_stmt_ls() {
			return getRuleContext(Body_stmt_lsContext.class,0);
		}
		public TerminalNode TK_SEPARATOR() { return getToken(SRParser.TK_SEPARATOR, 0); }
		public Body_stmt_lsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_stmt_ls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterBody_stmt_ls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitBody_stmt_ls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitBody_stmt_ls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_stmt_lsContext body_stmt_ls() throws RecognitionException {
		return body_stmt_ls(0);
	}

	private Body_stmt_lsContext body_stmt_ls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Body_stmt_lsContext _localctx = new Body_stmt_lsContext(_ctx, _parentState);
		Body_stmt_lsContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_body_stmt_ls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(364);
			body_stmt();
			}
			_ctx.stop = _input.LT(-1);
			setState(371);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Body_stmt_lsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_body_stmt_ls);
					setState(366);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(367);
					match(TK_SEPARATOR);
					setState(368);
					body_stmt();
					}
					} 
				}
				setState(373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class Body_stmtContext extends ParserRuleContext {
		public Common_stmtContext common_stmt() {
			return getRuleContext(Common_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Body_onlyContext body_only() {
			return getRuleContext(Body_onlyContext.class,0);
		}
		public Extend_clauseContext extend_clause() {
			return getRuleContext(Extend_clauseContext.class,0);
		}
		public Body_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterBody_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitBody_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitBody_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_stmtContext body_stmt() throws RecognitionException {
		Body_stmtContext _localctx = new Body_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_body_stmt);
		try {
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				common_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
				body_only();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(377);
				extend_clause();
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

	public static class Body_onlyContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ProcContext proc() {
			return getRuleContext(ProcContext.class,0);
		}
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public ProcedureContext procedure() {
			return getRuleContext(ProcedureContext.class,0);
		}
		public Initial_blockContext initial_block() {
			return getRuleContext(Initial_blockContext.class,0);
		}
		public Final_blockContext final_block() {
			return getRuleContext(Final_blockContext.class,0);
		}
		public Body_onlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_only; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterBody_only(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitBody_only(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitBody_only(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_onlyContext body_only() throws RecognitionException {
		Body_onlyContext _localctx = new Body_onlyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_body_only);
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_P:
			case TK_V:
			case TK_BEGIN:
			case TK_CALL:
			case TK_CO:
			case TK_DESTROY:
			case TK_DO:
			case TK_EXIT:
			case TK_FA:
			case TK_FORWARD:
			case TK_IF:
			case TK_IN:
			case TK_NEXT:
			case TK_RECEIVE:
			case TK_REPLY:
			case TK_RETURN:
			case TK_SEND:
			case TK_SKIP:
			case TK_STOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				stmt();
				}
				break;
			case TK_PROC:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				proc();
				}
				break;
			case TK_PROCESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(382);
				process();
				}
				break;
			case TK_PROCEDURE:
				enterOuterAlt(_localctx, 4);
				{
				setState(383);
				procedure();
				}
				break;
			case TK_INITIAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(384);
				initial_block();
				}
				break;
			case TK_FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(385);
				final_block();
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

	public static class Common_stmtContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Import_clauseContext import_clause() {
			return getRuleContext(Import_clauseContext.class,0);
		}
		public Common_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterCommon_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitCommon_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitCommon_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_stmtContext common_stmt() throws RecognitionException {
		Common_stmtContext _localctx = new Common_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_common_stmt);
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				decl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				import_clause();
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

	public static class Import_clauseContext extends ParserRuleContext {
		public TerminalNode TK_IMPORT() { return getToken(SRParser.TK_IMPORT, 0); }
		public Import_listContext import_list() {
			return getRuleContext(Import_listContext.class,0);
		}
		public Import_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterImport_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitImport_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitImport_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_clauseContext import_clause() throws RecognitionException {
		Import_clauseContext _localctx = new Import_clauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_import_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(TK_IMPORT);
			setState(394);
			import_list(0);
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

	public static class Extend_clauseContext extends ParserRuleContext {
		public TerminalNode TK_EXTEND() { return getToken(SRParser.TK_EXTEND, 0); }
		public Import_listContext import_list() {
			return getRuleContext(Import_listContext.class,0);
		}
		public Extend_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extend_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterExtend_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitExtend_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitExtend_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extend_clauseContext extend_clause() throws RecognitionException {
		Extend_clauseContext _localctx = new Extend_clauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_extend_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(TK_EXTEND);
			setState(397);
			import_list(0);
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

	public static class Import_listContext extends ParserRuleContext {
		public Import_nameContext import_name() {
			return getRuleContext(Import_nameContext.class,0);
		}
		public Import_listContext import_list() {
			return getRuleContext(Import_listContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(SRParser.TK_COMMA, 0); }
		public Import_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterImport_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitImport_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitImport_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_listContext import_list() throws RecognitionException {
		return import_list(0);
	}

	private Import_listContext import_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Import_listContext _localctx = new Import_listContext(_ctx, _parentState);
		Import_listContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_import_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(400);
			import_name();
			}
			_ctx.stop = _input.LT(-1);
			setState(407);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Import_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_import_list);
					setState(402);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(403);
					match(TK_COMMA);
					setState(404);
					import_name();
					}
					} 
				}
				setState(409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class Import_nameContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(SRParser.TK_ID, 0); }
		public Import_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterImport_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitImport_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitImport_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_nameContext import_name() throws RecognitionException {
		Import_nameContext _localctx = new Import_nameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_import_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(TK_ID);
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

	public static class Op_declContext extends ParserRuleContext {
		public Op_or_extContext op_or_ext() {
			return getRuleContext(Op_or_extContext.class,0);
		}
		public Oper_def_lpContext oper_def_lp() {
			return getRuleContext(Oper_def_lpContext.class,0);
		}
		public Op_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterOp_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitOp_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitOp_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_declContext op_decl() throws RecognitionException {
		Op_declContext _localctx = new Op_declContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_op_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			op_or_ext();
			setState(413);
			oper_def_lp(0);
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

	public static class Op_or_extContext extends ParserRuleContext {
		public TerminalNode TK_OP() { return getToken(SRParser.TK_OP, 0); }
		public TerminalNode TK_EXTERNAL() { return getToken(SRParser.TK_EXTERNAL, 0); }
		public Op_or_extContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_or_ext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterOp_or_ext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitOp_or_ext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitOp_or_ext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_or_extContext op_or_ext() throws RecognitionException {
		Op_or_extContext _localctx = new Op_or_extContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_op_or_ext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			_la = _input.LA(1);
			if ( !(_la==TK_EXTERNAL || _la==TK_OP) ) {
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

	public static class Oper_def_lpContext extends ParserRuleContext {
		public Oper_defContext oper_def() {
			return getRuleContext(Oper_defContext.class,0);
		}
		public Oper_def_lpContext oper_def_lp() {
			return getRuleContext(Oper_def_lpContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(SRParser.TK_COMMA, 0); }
		public Oper_def_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper_def_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterOper_def_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitOper_def_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitOper_def_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Oper_def_lpContext oper_def_lp() throws RecognitionException {
		return oper_def_lp(0);
	}

	private Oper_def_lpContext oper_def_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Oper_def_lpContext _localctx = new Oper_def_lpContext(_ctx, _parentState);
		Oper_def_lpContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_oper_def_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(418);
			oper_def();
			}
			_ctx.stop = _input.LT(-1);
			setState(425);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Oper_def_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_oper_def_lp);
					setState(420);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(421);
					match(TK_COMMA);
					setState(422);
					oper_def();
					}
					} 
				}
				setState(427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class Oper_defContext extends ParserRuleContext {
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
		}
		public Op_prototypeContext op_prototype() {
			return getRuleContext(Op_prototypeContext.class,0);
		}
		public Colon_optContext colon_opt() {
			return getRuleContext(Colon_optContext.class,0);
		}
		public Qualified_idContext qualified_id() {
			return getRuleContext(Qualified_idContext.class,0);
		}
		public Oper_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterOper_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitOper_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitOper_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Oper_defContext oper_def() throws RecognitionException {
		Oper_defContext _localctx = new Oper_defContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_oper_def);
		try {
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				id_subs_lp(0);
				setState(429);
				op_prototype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				id_subs_lp(0);
				setState(432);
				colon_opt();
				setState(433);
				qualified_id();
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

	public static class Colon_optContext extends ParserRuleContext {
		public TerminalNode TK_COLON() { return getToken(SRParser.TK_COLON, 0); }
		public Colon_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colon_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterColon_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitColon_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitColon_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Colon_optContext colon_opt() throws RecognitionException {
		Colon_optContext _localctx = new Colon_optContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_colon_opt);
		try {
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TK_COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				match(TK_COLON);
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

	public static class Sem_declContext extends ParserRuleContext {
		public TerminalNode TK_SEM() { return getToken(SRParser.TK_SEM, 0); }
		public Sem_def_lpContext sem_def_lp() {
			return getRuleContext(Sem_def_lpContext.class,0);
		}
		public Sem_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sem_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterSem_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitSem_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitSem_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sem_declContext sem_decl() throws RecognitionException {
		Sem_declContext _localctx = new Sem_declContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sem_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(TK_SEM);
			setState(442);
			sem_def_lp(0);
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

	public static class Sem_def_lpContext extends ParserRuleContext {
		public Sem_defContext sem_def() {
			return getRuleContext(Sem_defContext.class,0);
		}
		public Sem_def_lpContext sem_def_lp() {
			return getRuleContext(Sem_def_lpContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(SRParser.TK_COMMA, 0); }
		public Sem_def_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sem_def_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterSem_def_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitSem_def_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitSem_def_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sem_def_lpContext sem_def_lp() throws RecognitionException {
		return sem_def_lp(0);
	}

	private Sem_def_lpContext sem_def_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Sem_def_lpContext _localctx = new Sem_def_lpContext(_ctx, _parentState);
		Sem_def_lpContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_sem_def_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(445);
			sem_def();
			}
			_ctx.stop = _input.LT(-1);
			setState(452);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Sem_def_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sem_def_lp);
					setState(447);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(448);
					match(TK_COMMA);
					setState(449);
					sem_def();
					}
					} 
				}
				setState(454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class Sem_defContext extends ParserRuleContext {
		public Id_subsContext id_subs() {
			return getRuleContext(Id_subsContext.class,0);
		}
		public Sem_protoContext sem_proto() {
			return getRuleContext(Sem_protoContext.class,0);
		}
		public Sem_initContext sem_init() {
			return getRuleContext(Sem_initContext.class,0);
		}
		public Sem_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sem_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterSem_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitSem_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitSem_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sem_defContext sem_def() throws RecognitionException {
		Sem_defContext _localctx = new Sem_defContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_sem_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			id_subs();
			setState(456);
			sem_proto();
			setState(457);
			sem_init();
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

	public static class Sem_protoContext extends ParserRuleContext {
		public Return_spec_nullContext return_spec_null() {
			return getRuleContext(Return_spec_nullContext.class,0);
		}
		public Sem_protoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sem_proto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterSem_proto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitSem_proto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitSem_proto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sem_protoContext sem_proto() throws RecognitionException {
		Sem_protoContext _localctx = new Sem_protoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_sem_proto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			return_spec_null();
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

	public static class Sem_initContext extends ParserRuleContext {
		public TerminalNode TK_ASSIGN() { return getToken(SRParser.TK_ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Sem_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sem_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterSem_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitSem_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitSem_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sem_initContext sem_init() throws RecognitionException {
		Sem_initContext _localctx = new Sem_initContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_sem_init);
		try {
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				match(TK_ASSIGN);
				setState(463);
				expr(0);
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

	public static class ProcContext extends ParserRuleContext {
		public TerminalNode TK_PROC() { return getToken(SRParser.TK_PROC, 0); }
		public TerminalNode TK_ID() { return getToken(SRParser.TK_ID, 0); }
		public Param_namesContext param_names() {
			return getRuleContext(Param_namesContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public End_idContext end_id() {
			return getRuleContext(End_idContext.class,0);
		}
		public ProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitProc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcContext proc() throws RecognitionException {
		ProcContext _localctx = new ProcContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_proc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(TK_PROC);
			setState(467);
			match(TK_ID);
			setState(468);
			param_names();
			setState(469);
			block();
			setState(470);
			end_id();
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

	public static class ProcedureContext extends ParserRuleContext {
		public TerminalNode TK_PROCEDURE() { return getToken(SRParser.TK_PROCEDURE, 0); }
		public TerminalNode TK_ID() { return getToken(SRParser.TK_ID, 0); }
		public PrototypeContext prototype() {
			return getRuleContext(PrototypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public End_idContext end_id() {
			return getRuleContext(End_idContext.class,0);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(TK_PROCEDURE);
			setState(473);
			match(TK_ID);
			setState(474);
			prototype();
			setState(475);
			block();
			setState(476);
			end_id();
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

	public static class ProcessContext extends ParserRuleContext {
		public TerminalNode TK_PROCESS() { return getToken(SRParser.TK_PROCESS, 0); }
		public TerminalNode TK_ID() { return getToken(SRParser.TK_ID, 0); }
		public Return_spec_nullContext return_spec_null() {
			return getRuleContext(Return_spec_nullContext.class,0);
		}
		public Quantifiers_optContext quantifiers_opt() {
			return getRuleContext(Quantifiers_optContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public End_idContext end_id() {
			return getRuleContext(End_idContext.class,0);
		}
		public ProcessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterProcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitProcess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitProcess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcessContext process() throws RecognitionException {
		ProcessContext _localctx = new ProcessContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_process);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(TK_PROCESS);
			setState(479);
			match(TK_ID);
			setState(480);
			return_spec_null();
			setState(481);
			quantifiers_opt();
			setState(482);
			block();
			setState(483);
			end_id();
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

	public static class Initial_blockContext extends ParserRuleContext {
		public TerminalNode TK_INITIAL() { return getToken(SRParser.TK_INITIAL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode TK_END() { return getToken(SRParser.TK_END, 0); }
		public Initial_optContext initial_opt() {
			return getRuleContext(Initial_optContext.class,0);
		}
		public Initial_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterInitial_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitInitial_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitInitial_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initial_blockContext initial_block() throws RecognitionException {
		Initial_blockContext _localctx = new Initial_blockContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_initial_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(TK_INITIAL);
			setState(486);
			block();
			setState(487);
			match(TK_END);
			setState(488);
			initial_opt();
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

	public static class Initial_optContext extends ParserRuleContext {
		public TerminalNode TK_INITIAL() { return getToken(SRParser.TK_INITIAL, 0); }
		public Initial_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterInitial_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitInitial_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitInitial_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initial_optContext initial_opt() throws RecognitionException {
		Initial_optContext _localctx = new Initial_optContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_initial_opt);
		try {
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				match(TK_INITIAL);
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

	public static class Final_blockContext extends ParserRuleContext {
		public TerminalNode TK_FINAL() { return getToken(SRParser.TK_FINAL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode TK_END() { return getToken(SRParser.TK_END, 0); }
		public Final_optContext final_opt() {
			return getRuleContext(Final_optContext.class,0);
		}
		public Final_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_final_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterFinal_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitFinal_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitFinal_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Final_blockContext final_block() throws RecognitionException {
		Final_blockContext _localctx = new Final_blockContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_final_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(TK_FINAL);
			setState(495);
			block();
			setState(496);
			match(TK_END);
			setState(497);
			final_opt();
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

	public static class Final_optContext extends ParserRuleContext {
		public TerminalNode TK_FINAL() { return getToken(SRParser.TK_FINAL, 0); }
		public Final_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_final_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterFinal_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitFinal_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitFinal_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Final_optContext final_opt() throws RecognitionException {
		Final_optContext _localctx = new Final_optContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_final_opt);
		try {
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				match(TK_FINAL);
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

	public static class PrototypeContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Return_spec_optContext return_spec_opt() {
			return getRuleContext(Return_spec_optContext.class,0);
		}
		public PrototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prototype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterPrototype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitPrototype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitPrototype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrototypeContext prototype() throws RecognitionException {
		PrototypeContext _localctx = new PrototypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_prototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			parameters();
			setState(504);
			return_spec_opt();
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

	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode TK_LPAREN() { return getToken(SRParser.TK_LPAREN, 0); }
		public Param_spec_lsContext param_spec_ls() {
			return getRuleContext(Param_spec_lsContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(SRParser.TK_RPAREN, 0); }
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(TK_LPAREN);
			setState(507);
			param_spec_ls();
			setState(508);
			match(TK_RPAREN);
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

	public static class Param_spec_lsContext extends ParserRuleContext {
		public Param_spec_lpContext param_spec_lp() {
			return getRuleContext(Param_spec_lpContext.class,0);
		}
		public Param_spec_lsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_spec_ls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterParam_spec_ls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitParam_spec_ls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitParam_spec_ls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_spec_lsContext param_spec_ls() throws RecognitionException {
		Param_spec_lsContext _localctx = new Param_spec_lsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_param_spec_ls);
		try {
			setState(512);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_RPAREN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TK_BOOL:
			case TK_CAP:
			case TK_CHAR:
			case TK_ENUM:
			case TK_FILE:
			case TK_INT:
			case TK_PTR:
			case TK_REAL:
			case TK_REC:
			case TK_REF:
			case TK_RES:
			case TK_STRING:
			case TK_UNION:
			case TK_VAL:
			case TK_VAR:
			case TK_LBRACKET:
			case TK_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				param_spec_lp();
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

	public static class Param_spec_lpContext extends ParserRuleContext {
		public Param_specContext param_spec() {
			return getRuleContext(Param_specContext.class,0);
		}
		public TerminalNode TK_SEPARATOR() { return getToken(SRParser.TK_SEPARATOR, 0); }
		public Param_spec_lpContext param_spec_lp() {
			return getRuleContext(Param_spec_lpContext.class,0);
		}
		public Param_spec_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_spec_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterParam_spec_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitParam_spec_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitParam_spec_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_spec_lpContext param_spec_lp() throws RecognitionException {
		Param_spec_lpContext _localctx = new Param_spec_lpContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_param_spec_lp);
		try {
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				param_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				param_spec();
				setState(516);
				match(TK_SEPARATOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(518);
				param_spec();
				setState(519);
				match(TK_SEPARATOR);
				setState(520);
				param_spec_lp();
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

	public static class Param_specContext extends ParserRuleContext {
		public Param_kind_optContext param_kind_opt() {
			return getRuleContext(Param_kind_optContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
		}
		public TerminalNode TK_COLON() { return getToken(SRParser.TK_COLON, 0); }
		public Param_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterParam_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitParam_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitParam_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_specContext param_spec() throws RecognitionException {
		Param_specContext _localctx = new Param_specContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_param_spec);
		try {
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				param_kind_opt();
				setState(525);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				param_kind_opt();
				setState(528);
				id_subs_lp(0);
				setState(529);
				match(TK_COLON);
				setState(530);
				type();
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

	public static class Param_kind_optContext extends ParserRuleContext {
		public TerminalNode TK_VAL() { return getToken(SRParser.TK_VAL, 0); }
		public TerminalNode TK_VAR() { return getToken(SRParser.TK_VAR, 0); }
		public TerminalNode TK_RES() { return getToken(SRParser.TK_RES, 0); }
		public TerminalNode TK_REF() { return getToken(SRParser.TK_REF, 0); }
		public Param_kind_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_kind_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterParam_kind_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitParam_kind_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitParam_kind_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_kind_optContext param_kind_opt() throws RecognitionException {
		Param_kind_optContext _localctx = new Param_kind_optContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_param_kind_opt);
		try {
			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_BOOL:
			case TK_CAP:
			case TK_CHAR:
			case TK_ENUM:
			case TK_FILE:
			case TK_INT:
			case TK_PTR:
			case TK_REAL:
			case TK_REC:
			case TK_STRING:
			case TK_UNION:
			case TK_LBRACKET:
			case TK_ID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TK_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				match(TK_VAL);
				}
				break;
			case TK_VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(536);
				match(TK_VAR);
				}
				break;
			case TK_RES:
				enterOuterAlt(_localctx, 4);
				{
				setState(537);
				match(TK_RES);
				}
				break;
			case TK_REF:
				enterOuterAlt(_localctx, 5);
				{
				setState(538);
				match(TK_REF);
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

	public static class Return_spec_optContext extends ParserRuleContext {
		public Return_spec_nullContext return_spec_null() {
			return getRuleContext(Return_spec_nullContext.class,0);
		}
		public TerminalNode TK_RETURNS() { return getToken(SRParser.TK_RETURNS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Id_subsContext id_subs() {
			return getRuleContext(Id_subsContext.class,0);
		}
		public TerminalNode TK_COLON() { return getToken(SRParser.TK_COLON, 0); }
		public TerminalNode TK_ID() { return getToken(SRParser.TK_ID, 0); }
		public Return_spec_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_spec_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterReturn_spec_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitReturn_spec_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitReturn_spec_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_spec_optContext return_spec_opt() throws RecognitionException {
		Return_spec_optContext _localctx = new Return_spec_optContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_return_spec_opt);
		try {
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				return_spec_null();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				match(TK_RETURNS);
				setState(543);
				type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(544);
				match(TK_RETURNS);
				setState(545);
				id_subs();
				setState(546);
				match(TK_COLON);
				setState(547);
				type();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(549);
				match(TK_RETURNS);
				setState(550);
				match(TK_ID);
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

	public static class Return_spec_nullContext extends ParserRuleContext {
		public Return_spec_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_spec_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterReturn_spec_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitReturn_spec_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitReturn_spec_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_spec_nullContext return_spec_null() throws RecognitionException {
		Return_spec_nullContext _localctx = new Return_spec_nullContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_return_spec_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Param_namesContext extends ParserRuleContext {
		public TerminalNode TK_LPAREN() { return getToken(SRParser.TK_LPAREN, 0); }
		public Id_lsContext id_ls() {
			return getRuleContext(Id_lsContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(SRParser.TK_RPAREN, 0); }
		public Return_name_optContext return_name_opt() {
			return getRuleContext(Return_name_optContext.class,0);
		}
		public Param_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterParam_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitParam_names(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitParam_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_namesContext param_names() throws RecognitionException {
		Param_namesContext _localctx = new Param_namesContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_param_names);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(TK_LPAREN);
			setState(556);
			id_ls();
			setState(557);
			match(TK_RPAREN);
			setState(558);
			return_name_opt();
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

	public static class Return_name_optContext extends ParserRuleContext {
		public TerminalNode TK_RETURNS() { return getToken(SRParser.TK_RETURNS, 0); }
		public TerminalNode TK_ID() { return getToken(SRParser.TK_ID, 0); }
		public Return_name_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_name_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterReturn_name_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitReturn_name_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitReturn_name_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_name_optContext return_name_opt() throws RecognitionException {
		Return_name_optContext _localctx = new Return_name_optContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_return_name_opt);
		try {
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				match(TK_RETURNS);
				setState(562);
				match(TK_ID);
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

	public static class DeclContext extends ParserRuleContext {
		public Type_declContext type_decl() {
			return getRuleContext(Type_declContext.class,0);
		}
		public Obj_declContext obj_decl() {
			return getRuleContext(Obj_declContext.class,0);
		}
		public Optype_declContext optype_decl() {
			return getRuleContext(Optype_declContext.class,0);
		}
		public Sem_declContext sem_decl() {
			return getRuleContext(Sem_declContext.class,0);
		}
		public Op_declContext op_decl() {
			return getRuleContext(Op_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_decl);
		try {
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				type_decl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(567);
				obj_decl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(568);
				optype_decl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(569);
				sem_decl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(570);
				op_decl();
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

	public static class Type_declContext extends ParserRuleContext {
		public TerminalNode TK_TYPE() { return getToken(SRParser.TK_TYPE, 0); }
		public TerminalNode TK_ID() { return getToken(SRParser.TK_ID, 0); }
		public TerminalNode TK_EQ() { return getToken(SRParser.TK_EQ, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type_restrictionContext type_restriction() {
			return getRuleContext(Type_restrictionContext.class,0);
		}
		public Type_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterType_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitType_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitType_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_declContext type_decl() throws RecognitionException {
		Type_declContext _localctx = new Type_declContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_type_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(TK_TYPE);
			setState(574);
			match(TK_ID);
			setState(575);
			match(TK_EQ);
			setState(576);
			type();
			setState(577);
			type_restriction();
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

	public static class Type_restrictionContext extends ParserRuleContext {
		public TerminalNode TK_LBRACE() { return getToken(SRParser.TK_LBRACE, 0); }
		public TerminalNode TK_ID() { return getToken(SRParser.TK_ID, 0); }
		public TerminalNode TK_RBRACE() { return getToken(SRParser.TK_RBRACE, 0); }
		public Type_restrictionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_restriction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterType_restriction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitType_restriction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitType_restriction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_restrictionContext type_restriction() throws RecognitionException {
		Type_restrictionContext _localctx = new Type_restrictionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_type_restriction);
		try {
			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				match(TK_LBRACE);
				setState(581);
				match(TK_ID);
				setState(582);
				match(TK_RBRACE);
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

	public static class Obj_declContext extends ParserRuleContext {
		public Var_or_constContext var_or_const() {
			return getRuleContext(Var_or_constContext.class,0);
		}
		public Var_def_lpContext var_def_lp() {
			return getRuleContext(Var_def_lpContext.class,0);
		}
		public Obj_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterObj_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitObj_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitObj_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Obj_declContext obj_decl() throws RecognitionException {
		Obj_declContext _localctx = new Obj_declContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_obj_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			var_or_const();
			setState(586);
			var_def_lp(0);
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

	public static class Var_or_constContext extends ParserRuleContext {
		public TerminalNode TK_VAR() { return getToken(SRParser.TK_VAR, 0); }
		public TerminalNode TK_CONST() { return getToken(SRParser.TK_CONST, 0); }
		public Var_or_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_or_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterVar_or_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitVar_or_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitVar_or_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_or_constContext var_or_const() throws RecognitionException {
		Var_or_constContext _localctx = new Var_or_constContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_var_or_const);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_la = _input.LA(1);
			if ( !(_la==TK_CONST || _la==TK_VAR) ) {
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

	public static class Var_def_lpContext extends ParserRuleContext {
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public Var_def_lpContext var_def_lp() {
			return getRuleContext(Var_def_lpContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(SRParser.TK_COMMA, 0); }
		public Var_def_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterVar_def_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitVar_def_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitVar_def_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_def_lpContext var_def_lp() throws RecognitionException {
		return var_def_lp(0);
	}

	private Var_def_lpContext var_def_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Var_def_lpContext _localctx = new Var_def_lpContext(_ctx, _parentState);
		Var_def_lpContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_var_def_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(591);
			var_def();
			}
			_ctx.stop = _input.LT(-1);
			setState(598);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Var_def_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_var_def_lp);
					setState(593);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(594);
					match(TK_COMMA);
					setState(595);
					var_def();
					}
					} 
				}
				setState(600);
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

	public static class Var_defContext extends ParserRuleContext {
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
		}
		public Var_attContext var_att() {
			return getRuleContext(Var_attContext.class,0);
		}
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterVar_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitVar_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitVar_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_var_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			id_subs_lp(0);
			setState(602);
			var_att();
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

	public static class Var_attContext extends ParserRuleContext {
		public TerminalNode TK_COLON() { return getToken(SRParser.TK_COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TK_ASSIGN() { return getToken(SRParser.TK_ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_SEPARATOR() { return getToken(SRParser.TK_SEPARATOR, 0); }
		public Var_attContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_att; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterVar_att(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitVar_att(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitVar_att(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_attContext var_att() throws RecognitionException {
		Var_attContext _localctx = new Var_attContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_var_att);
		try {
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(604);
				match(TK_COLON);
				setState(605);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(606);
				match(TK_COLON);
				setState(607);
				type();
				setState(608);
				match(TK_ASSIGN);
				setState(609);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(611);
				match(TK_ASSIGN);
				setState(612);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(613);
				match(TK_SEPARATOR);
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

	public static class TypeContext extends ParserRuleContext {
		public SubscriptsContext subscripts() {
			return getRuleContext(SubscriptsContext.class,0);
		}
		public Unsub_typeContext unsub_type() {
			return getRuleContext(Unsub_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_type);
		try {
			setState(620);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(616);
				subscripts();
				setState(617);
				unsub_type();
				}
				break;
			case TK_BOOL:
			case TK_CAP:
			case TK_CHAR:
			case TK_ENUM:
			case TK_FILE:
			case TK_INT:
			case TK_PTR:
			case TK_REAL:
			case TK_REC:
			case TK_STRING:
			case TK_UNION:
			case TK_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(619);
				unsub_type();
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

	public static class Unsub_typeContext extends ParserRuleContext {
		public Basic_typeContext basic_type() {
			return getRuleContext(Basic_typeContext.class,0);
		}
		public String_defContext string_def() {
			return getRuleContext(String_defContext.class,0);
		}
		public Enum_defContext enum_def() {
			return getRuleContext(Enum_defContext.class,0);
		}
		public Pointer_defContext pointer_def() {
			return getRuleContext(Pointer_defContext.class,0);
		}
		public Record_defContext record_def() {
			return getRuleContext(Record_defContext.class,0);
		}
		public Union_defContext union_def() {
			return getRuleContext(Union_defContext.class,0);
		}
		public Capability_defContext capability_def() {
			return getRuleContext(Capability_defContext.class,0);
		}
		public Qualified_idContext qualified_id() {
			return getRuleContext(Qualified_idContext.class,0);
		}
		public Unsub_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsub_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterUnsub_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitUnsub_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitUnsub_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unsub_typeContext unsub_type() throws RecognitionException {
		Unsub_typeContext _localctx = new Unsub_typeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_unsub_type);
		try {
			setState(630);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_BOOL:
			case TK_CHAR:
			case TK_FILE:
			case TK_INT:
			case TK_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				basic_type();
				}
				break;
			case TK_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				string_def();
				}
				break;
			case TK_ENUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(624);
				enum_def();
				}
				break;
			case TK_PTR:
				enterOuterAlt(_localctx, 4);
				{
				setState(625);
				pointer_def();
				}
				break;
			case TK_REC:
				enterOuterAlt(_localctx, 5);
				{
				setState(626);
				record_def();
				}
				break;
			case TK_UNION:
				enterOuterAlt(_localctx, 6);
				{
				setState(627);
				union_def();
				}
				break;
			case TK_CAP:
				enterOuterAlt(_localctx, 7);
				{
				setState(628);
				capability_def();
				}
				break;
			case TK_ID:
				enterOuterAlt(_localctx, 8);
				{
				setState(629);
				qualified_id();
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

	public static class Basic_typeContext extends ParserRuleContext {
		public TerminalNode TK_BOOL() { return getToken(SRParser.TK_BOOL, 0); }
		public TerminalNode TK_CHAR() { return getToken(SRParser.TK_CHAR, 0); }
		public TerminalNode TK_INT() { return getToken(SRParser.TK_INT, 0); }
		public TerminalNode TK_FILE() { return getToken(SRParser.TK_FILE, 0); }
		public TerminalNode TK_REAL() { return getToken(SRParser.TK_REAL, 0); }
		public Basic_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterBasic_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitBasic_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitBasic_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_typeContext basic_type() throws RecognitionException {
		Basic_typeContext _localctx = new Basic_typeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_basic_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_BOOL) | (1L << TK_CHAR) | (1L << TK_FILE) | (1L << TK_INT) | (1L << TK_REAL))) != 0)) ) {
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

	public static class String_defContext extends ParserRuleContext {
		public TerminalNode TK_STRING() { return getToken(SRParser.TK_STRING, 0); }
		public TerminalNode TK_LBRACKET() { return getToken(SRParser.TK_LBRACKET, 0); }
		public String_limContext string_lim() {
			return getRuleContext(String_limContext.class,0);
		}
		public TerminalNode TK_RBRACKET() { return getToken(SRParser.TK_RBRACKET, 0); }
		public TerminalNode TK_LPAREN() { return getToken(SRParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(SRParser.TK_RPAREN, 0); }
		public String_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterString_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitString_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitString_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_defContext string_def() throws RecognitionException {
		String_defContext _localctx = new String_defContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_string_def);
		try {
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				match(TK_STRING);
				setState(635);
				match(TK_LBRACKET);
				setState(636);
				string_lim();
				setState(637);
				match(TK_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(639);
				match(TK_STRING);
				setState(640);
				match(TK_LPAREN);
				setState(641);
				string_lim();
				setState(642);
				match(TK_RPAREN);
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

	public static class String_limContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_ASTER() { return getToken(SRParser.TK_ASTER, 0); }
		public String_limContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_lim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterString_lim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitString_lim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitString_lim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_limContext string_lim() throws RecognitionException {
		String_limContext _localctx = new String_limContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_string_lim);
		try {
			setState(648);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NOOP:
			case TK_NULL:
			case TK_BOOL:
			case TK_CHAR:
			case TK_CREATE:
			case TK_FALSE:
			case TK_TRUE:
			case TK_FILE:
			case TK_HIGH:
			case TK_INT:
			case TK_LOW:
			case TK_NEW:
			case TK_NOT:
			case TK_REAL:
			case TK_STRING:
			case TK_INCR:
			case TK_PLUS:
			case TK_DECR:
			case TK_MINUS:
			case TK_LPAREN:
			case TK_ADDR:
			case TK_QMARK:
			case TK_ID:
			case TK_NUM:
			case TK_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				expr(0);
				}
				break;
			case TK_ASTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
				match(TK_ASTER);
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

	public static class Enum_defContext extends ParserRuleContext {
		public TerminalNode TK_ENUM() { return getToken(SRParser.TK_ENUM, 0); }
		public TerminalNode TK_LPAREN() { return getToken(SRParser.TK_LPAREN, 0); }
		public Id_lpContext id_lp() {
			return getRuleContext(Id_lpContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(SRParser.TK_RPAREN, 0); }
		public Enum_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterEnum_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitEnum_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitEnum_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_defContext enum_def() throws RecognitionException {
		Enum_defContext _localctx = new Enum_defContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_enum_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(TK_ENUM);
			setState(651);
			match(TK_LPAREN);
			setState(652);
			id_lp(0);
			setState(653);
			match(TK_RPAREN);
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

	public static class Pointer_defContext extends ParserRuleContext {
		public TerminalNode TK_PTR() { return getToken(SRParser.TK_PTR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TK_ANY() { return getToken(SRParser.TK_ANY, 0); }
		public Pointer_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterPointer_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitPointer_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitPointer_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pointer_defContext pointer_def() throws RecognitionException {
		Pointer_defContext _localctx = new Pointer_defContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_pointer_def);
		try {
			setState(659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(655);
				match(TK_PTR);
				setState(656);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
				match(TK_PTR);
				setState(658);
				match(TK_ANY);
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

	public static class Record_defContext extends ParserRuleContext {
		public TerminalNode TK_REC() { return getToken(SRParser.TK_REC, 0); }
		public TerminalNode TK_LPAREN() { return getToken(SRParser.TK_LPAREN, 0); }
		public Field_lpContext field_lp() {
			return getRuleContext(Field_lpContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(SRParser.TK_RPAREN, 0); }
		public Record_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterRecord_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitRecord_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitRecord_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_defContext record_def() throws RecognitionException {
		Record_defContext _localctx = new Record_defContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_record_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(TK_REC);
			setState(662);
			match(TK_LPAREN);
			setState(663);
			field_lp();
			setState(664);
			match(TK_RPAREN);
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

	public static class Union_defContext extends ParserRuleContext {
		public TerminalNode TK_UNION() { return getToken(SRParser.TK_UNION, 0); }
		public TerminalNode TK_LPAREN() { return getToken(SRParser.TK_LPAREN, 0); }
		public Field_lpContext field_lp() {
			return getRuleContext(Field_lpContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(SRParser.TK_RPAREN, 0); }
		public Union_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterUnion_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitUnion_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitUnion_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_defContext union_def() throws RecognitionException {
		Union_defContext _localctx = new Union_defContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_union_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(TK_UNION);
			setState(667);
			match(TK_LPAREN);
			setState(668);
			field_lp();
			setState(669);
			match(TK_RPAREN);
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

	public static class Field_lpContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode TK_SEPARATOR() { return getToken(SRParser.TK_SEPARATOR, 0); }
		public Field_lpContext field_lp() {
			return getRuleContext(Field_lpContext.class,0);
		}
		public Field_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterField_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitField_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitField_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_lpContext field_lp() throws RecognitionException {
		Field_lpContext _localctx = new Field_lpContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_field_lp);
		try {
			setState(679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				field();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				field();
				setState(673);
				match(TK_SEPARATOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(675);
				field();
				setState(676);
				match(TK_SEPARATOR);
				setState(677);
				field_lp();
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

	public static class FieldContext extends ParserRuleContext {
		public Var_def_lpContext var_def_lp() {
			return getRuleContext(Var_def_lpContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			var_def_lp(0);
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

	public static class Capability_defContext extends ParserRuleContext {
		public TerminalNode TK_CAP() { return getToken(SRParser.TK_CAP, 0); }
		public Cap_forContext cap_for() {
			return getRuleContext(Cap_forContext.class,0);
		}
		public Capability_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capability_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterCapability_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitCapability_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitCapability_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capability_defContext capability_def() throws RecognitionException {
		Capability_defContext _localctx = new Capability_defContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_capability_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(TK_CAP);
			setState(684);
			cap_for();
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

	public static class Cap_forContext extends ParserRuleContext {
		public Qualified_idContext qualified_id() {
			return getRuleContext(Qualified_idContext.class,0);
		}
		public Op_prototypeContext op_prototype() {
			return getRuleContext(Op_prototypeContext.class,0);
		}
		public TerminalNode TK_SEM() { return getToken(SRParser.TK_SEM, 0); }
		public Sem_protoContext sem_proto() {
			return getRuleContext(Sem_protoContext.class,0);
		}
		public TerminalNode TK_VM() { return getToken(SRParser.TK_VM, 0); }
		public Cap_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cap_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterCap_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitCap_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitCap_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cap_forContext cap_for() throws RecognitionException {
		Cap_forContext _localctx = new Cap_forContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_cap_for);
		try {
			setState(691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				qualified_id();
				}
				break;
			case TK_LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				op_prototype();
				}
				break;
			case TK_SEM:
				enterOuterAlt(_localctx, 3);
				{
				setState(688);
				match(TK_SEM);
				setState(689);
				sem_proto();
				}
				break;
			case TK_VM:
				enterOuterAlt(_localctx, 4);
				{
				setState(690);
				match(TK_VM);
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

	public static class Optype_declContext extends ParserRuleContext {
		public TerminalNode TK_OPTYPE() { return getToken(SRParser.TK_OPTYPE, 0); }
		public TerminalNode TK_ID() { return getToken(SRParser.TK_ID, 0); }
		public Eq_optContext eq_opt() {
			return getRuleContext(Eq_optContext.class,0);
		}
		public Op_prototypeContext op_prototype() {
			return getRuleContext(Op_prototypeContext.class,0);
		}
		public Optype_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optype_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterOptype_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitOptype_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitOptype_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optype_declContext optype_decl() throws RecognitionException {
		Optype_declContext _localctx = new Optype_declContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_optype_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(TK_OPTYPE);
			setState(694);
			match(TK_ID);
			setState(695);
			eq_opt();
			setState(696);
			op_prototype();
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

	public static class Op_prototypeContext extends ParserRuleContext {
		public PrototypeContext prototype() {
			return getRuleContext(PrototypeContext.class,0);
		}
		public Op_restriction_optContext op_restriction_opt() {
			return getRuleContext(Op_restriction_optContext.class,0);
		}
		public Op_prototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_prototype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterOp_prototype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitOp_prototype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitOp_prototype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_prototypeContext op_prototype() throws RecognitionException {
		Op_prototypeContext _localctx = new Op_prototypeContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_op_prototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			prototype();
			setState(699);
			op_restriction_opt();
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

	public static class Eq_optContext extends ParserRuleContext {
		public TerminalNode TK_EQ() { return getToken(SRParser.TK_EQ, 0); }
		public Eq_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterEq_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitEq_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitEq_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_optContext eq_opt() throws RecognitionException {
		Eq_optContext _localctx = new Eq_optContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_eq_opt);
		try {
			setState(703);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TK_EQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(702);
				match(TK_EQ);
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

	public static class Op_restriction_optContext extends ParserRuleContext {
		public TerminalNode TK_LBRACE() { return getToken(SRParser.TK_LBRACE, 0); }
		public Op_restrictionContext op_restriction() {
			return getRuleContext(Op_restrictionContext.class,0);
		}
		public TerminalNode TK_RBRACE() { return getToken(SRParser.TK_RBRACE, 0); }
		public Op_restriction_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_restriction_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterOp_restriction_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitOp_restriction_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitOp_restriction_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_restriction_optContext op_restriction_opt() throws RecognitionException {
		Op_restriction_optContext _localctx = new Op_restriction_optContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_op_restriction_opt);
		try {
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(706);
				match(TK_LBRACE);
				setState(707);
				op_restriction();
				setState(708);
				match(TK_RBRACE);
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

	public static class Op_restrictionContext extends ParserRuleContext {
		public TerminalNode TK_CALL() { return getToken(SRParser.TK_CALL, 0); }
		public TerminalNode TK_SEND() { return getToken(SRParser.TK_SEND, 0); }
		public TerminalNode TK_COMMA() { return getToken(SRParser.TK_COMMA, 0); }
		public Op_restrictionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_restriction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterOp_restriction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitOp_restriction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitOp_restriction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_restrictionContext op_restriction() throws RecognitionException {
		Op_restrictionContext _localctx = new Op_restrictionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_op_restriction);
		try {
			setState(720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(712);
				match(TK_CALL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(713);
				match(TK_SEND);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(714);
				match(TK_CALL);
				setState(715);
				match(TK_COMMA);
				setState(716);
				match(TK_SEND);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(717);
				match(TK_SEND);
				setState(718);
				match(TK_COMMA);
				setState(719);
				match(TK_CALL);
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

	public static class BlockContext extends ParserRuleContext {
		public Block_itemsContext block_items() {
			return getRuleContext(Block_itemsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			block_items(0);
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

	public static class Block_itemsContext extends ParserRuleContext {
		public Block_itemContext block_item() {
			return getRuleContext(Block_itemContext.class,0);
		}
		public Block_itemsContext block_items() {
			return getRuleContext(Block_itemsContext.class,0);
		}
		public TerminalNode TK_SEPARATOR() { return getToken(SRParser.TK_SEPARATOR, 0); }
		public Block_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterBlock_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitBlock_items(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitBlock_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_itemsContext block_items() throws RecognitionException {
		return block_items(0);
	}

	private Block_itemsContext block_items(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Block_itemsContext _localctx = new Block_itemsContext(_ctx, _parentState);
		Block_itemsContext _prevctx = _localctx;
		int _startState = 152;
		enterRecursionRule(_localctx, 152, RULE_block_items, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(725);
			block_item();
			}
			_ctx.stop = _input.LT(-1);
			setState(732);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Block_itemsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_block_items);
					setState(727);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(728);
					match(TK_SEPARATOR);
					setState(729);
					block_item();
					}
					} 
				}
				setState(734);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class Block_itemContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Import_clauseContext import_clause() {
			return getRuleContext(Import_clauseContext.class,0);
		}
		public Block_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterBlock_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitBlock_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitBlock_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_itemContext block_item() throws RecognitionException {
		Block_itemContext _localctx = new Block_itemContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_block_item);
		try {
			setState(740);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(736);
				decl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(737);
				stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(738);
				expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(739);
				import_clause();
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

	public static class StmtContext extends ParserRuleContext {
		public Skip_stmtContext skip_stmt() {
			return getRuleContext(Skip_stmtContext.class,0);
		}
		public Stop_stmtContext stop_stmt() {
			return getRuleContext(Stop_stmtContext.class,0);
		}
		public Exit_stmtContext exit_stmt() {
			return getRuleContext(Exit_stmtContext.class,0);
		}
		public Next_stmtContext next_stmt() {
			return getRuleContext(Next_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Reply_stmtContext reply_stmt() {
			return getRuleContext(Reply_stmtContext.class,0);
		}
		public Forward_stmtContext forward_stmt() {
			return getRuleContext(Forward_stmtContext.class,0);
		}
		public Send_stmtContext send_stmt() {
			return getRuleContext(Send_stmtContext.class,0);
		}
		public Explicit_callContext explicit_call() {
			return getRuleContext(Explicit_callContext.class,0);
		}
		public Destroy_stmtContext destroy_stmt() {
			return getRuleContext(Destroy_stmtContext.class,0);
		}
		public Begin_endContext begin_end() {
			return getRuleContext(Begin_endContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Do_stmtContext do_stmt() {
			return getRuleContext(Do_stmtContext.class,0);
		}
		public For_all_stmtContext for_all_stmt() {
			return getRuleContext(For_all_stmtContext.class,0);
		}
		public V_stmtContext v_stmt() {
			return getRuleContext(V_stmtContext.class,0);
		}
		public Input_stmtContext input_stmt() {
			return getRuleContext(Input_stmtContext.class,0);
		}
		public Receive_stmtContext receive_stmt() {
			return getRuleContext(Receive_stmtContext.class,0);
		}
		public P_stmtContext p_stmt() {
			return getRuleContext(P_stmtContext.class,0);
		}
		public Concurrent_stmtContext concurrent_stmt() {
			return getRuleContext(Concurrent_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_stmt);
		try {
			setState(761);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_SKIP:
				enterOuterAlt(_localctx, 1);
				{
				setState(742);
				skip_stmt();
				}
				break;
			case TK_STOP:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
				stop_stmt();
				}
				break;
			case TK_EXIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(744);
				exit_stmt();
				}
				break;
			case TK_NEXT:
				enterOuterAlt(_localctx, 4);
				{
				setState(745);
				next_stmt();
				}
				break;
			case TK_RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(746);
				return_stmt();
				}
				break;
			case TK_REPLY:
				enterOuterAlt(_localctx, 6);
				{
				setState(747);
				reply_stmt();
				}
				break;
			case TK_FORWARD:
				enterOuterAlt(_localctx, 7);
				{
				setState(748);
				forward_stmt();
				}
				break;
			case TK_SEND:
				enterOuterAlt(_localctx, 8);
				{
				setState(749);
				send_stmt();
				}
				break;
			case TK_CALL:
				enterOuterAlt(_localctx, 9);
				{
				setState(750);
				explicit_call();
				}
				break;
			case TK_DESTROY:
				enterOuterAlt(_localctx, 10);
				{
				setState(751);
				destroy_stmt();
				}
				break;
			case TK_BEGIN:
				enterOuterAlt(_localctx, 11);
				{
				setState(752);
				begin_end();
				}
				break;
			case TK_IF:
				enterOuterAlt(_localctx, 12);
				{
				setState(753);
				if_stmt();
				}
				break;
			case TK_DO:
				enterOuterAlt(_localctx, 13);
				{
				setState(754);
				do_stmt();
				}
				break;
			case TK_FA:
				enterOuterAlt(_localctx, 14);
				{
				setState(755);
				for_all_stmt();
				}
				break;
			case TK_V:
				enterOuterAlt(_localctx, 15);
				{
				setState(756);
				v_stmt();
				}
				break;
			case TK_IN:
				enterOuterAlt(_localctx, 16);
				{
				setState(757);
				input_stmt();
				}
				break;
			case TK_RECEIVE:
				enterOuterAlt(_localctx, 17);
				{
				setState(758);
				receive_stmt();
				}
				break;
			case TK_P:
				enterOuterAlt(_localctx, 18);
				{
				setState(759);
				p_stmt();
				}
				break;
			case TK_CO:
				enterOuterAlt(_localctx, 19);
				{
				setState(760);
				concurrent_stmt();
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

	public static class Skip_stmtContext extends ParserRuleContext {
		public TerminalNode TK_SKIP() { return getToken(SRParser.TK_SKIP, 0); }
		public Skip_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skip_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterSkip_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitSkip_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitSkip_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Skip_stmtContext skip_stmt() throws RecognitionException {
		Skip_stmtContext _localctx = new Skip_stmtContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_skip_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			match(TK_SKIP);
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

	public static class Stop_stmtContext extends ParserRuleContext {
		public TerminalNode TK_STOP() { return getToken(SRParser.TK_STOP, 0); }
		public Exit_code_optContext exit_code_opt() {
			return getRuleContext(Exit_code_optContext.class,0);
		}
		public Stop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stop_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterStop_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitStop_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitStop_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stop_stmtContext stop_stmt() throws RecognitionException {
		Stop_stmtContext _localctx = new Stop_stmtContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_stop_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(TK_STOP);
			setState(766);
			exit_code_opt();
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

	public static class Exit_code_optContext extends ParserRuleContext {
		public TerminalNode TK_LPAREN() { return getToken(SRParser.TK_LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(SRParser.TK_RPAREN, 0); }
		public Exit_code_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_code_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterExit_code_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitExit_code_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitExit_code_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exit_code_optContext exit_code_opt() throws RecognitionException {
		Exit_code_optContext _localctx = new Exit_code_optContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_exit_code_opt);
		try {
			setState(773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
				match(TK_LPAREN);
				setState(770);
				expr(0);
				setState(771);
				match(TK_RPAREN);
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

	public static class Exit_stmtContext extends ParserRuleContext {
		public TerminalNode TK_EXIT() { return getToken(SRParser.TK_EXIT, 0); }
		public Exit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterExit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitExit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitExit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exit_stmtContext exit_stmt() throws RecognitionException {
		Exit_stmtContext _localctx = new Exit_stmtContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_exit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			match(TK_EXIT);
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

	public static class Next_stmtContext extends ParserRuleContext {
		public TerminalNode TK_NEXT() { return getToken(SRParser.TK_NEXT, 0); }
		public Next_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterNext_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitNext_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitNext_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Next_stmtContext next_stmt() throws RecognitionException {
		Next_stmtContext _localctx = new Next_stmtContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_next_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(TK_NEXT);
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

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode TK_RETURN() { return getToken(SRParser.TK_RETURN, 0); }
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			match(TK_RETURN);
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

	public static class Reply_stmtContext extends ParserRuleContext {
		public TerminalNode TK_REPLY() { return getToken(SRParser.TK_REPLY, 0); }
		public Reply_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reply_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterReply_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitReply_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitReply_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reply_stmtContext reply_stmt() throws RecognitionException {
		Reply_stmtContext _localctx = new Reply_stmtContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_reply_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			match(TK_REPLY);
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

	public static class Forward_stmtContext extends ParserRuleContext {
		public TerminalNode TK_FORWARD() { return getToken(SRParser.TK_FORWARD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Paren_listContext paren_list() {
			return getRuleContext(Paren_listContext.class,0);
		}
		public Forward_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forward_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterForward_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitForward_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitForward_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Forward_stmtContext forward_stmt() throws RecognitionException {
		Forward_stmtContext _localctx = new Forward_stmtContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_forward_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(TK_FORWARD);
			setState(784);
			expr(0);
			setState(785);
			paren_list();
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

	public static class Send_stmtContext extends ParserRuleContext {
		public TerminalNode TK_SEND() { return getToken(SRParser.TK_SEND, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Paren_listContext paren_list() {
			return getRuleContext(Paren_listContext.class,0);
		}
		public Send_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_send_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterSend_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitSend_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitSend_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Send_stmtContext send_stmt() throws RecognitionException {
		Send_stmtContext _localctx = new Send_stmtContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_send_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(TK_SEND);
			setState(788);
			expr(0);
			setState(789);
			paren_list();
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

	public static class Receive_stmtContext extends ParserRuleContext {
		public TerminalNode TK_RECEIVE() { return getToken(SRParser.TK_RECEIVE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Paren_listContext paren_list() {
			return getRuleContext(Paren_listContext.class,0);
		}
		public Receive_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receive_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterReceive_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitReceive_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitReceive_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Receive_stmtContext receive_stmt() throws RecognitionException {
		Receive_stmtContext _localctx = new Receive_stmtContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_receive_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(TK_RECEIVE);
			setState(792);
			expr(0);
			setState(793);
			paren_list();
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

	public static class V_stmtContext extends ParserRuleContext {
		public TerminalNode TK_V() { return getToken(SRParser.TK_V, 0); }
		public TerminalNode TK_LPAREN() { return getToken(SRParser.TK_LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(SRParser.TK_RPAREN, 0); }
		public V_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterV_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitV_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitV_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final V_stmtContext v_stmt() throws RecognitionException {
		V_stmtContext _localctx = new V_stmtContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_v_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(TK_V);
			setState(796);
			match(TK_LPAREN);
			setState(797);
			expr(0);
			setState(798);
			match(TK_RPAREN);
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

	public static class P_stmtContext extends ParserRuleContext {
		public TerminalNode TK_P() { return getToken(SRParser.TK_P, 0); }
		public TerminalNode TK_LPAREN() { return getToken(SRParser.TK_LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(SRParser.TK_RPAREN, 0); }
		public P_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterP_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitP_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitP_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_stmtContext p_stmt() throws RecognitionException {
		P_stmtContext _localctx = new P_stmtContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_p_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(TK_P);
			setState(801);
			match(TK_LPAREN);
			setState(802);
			expr(0);
			setState(803);
			match(TK_RPAREN);
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

	public static class Explicit_callContext extends ParserRuleContext {
		public TerminalNode TK_CALL() { return getToken(SRParser.TK_CALL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Paren_listContext paren_list() {
			return getRuleContext(Paren_listContext.class,0);
		}
		public Explicit_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterExplicit_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitExplicit_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitExplicit_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Explicit_callContext explicit_call() throws RecognitionException {
		Explicit_callContext _localctx = new Explicit_callContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_explicit_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(TK_CALL);
			setState(806);
			expr(0);
			setState(807);
			paren_list();
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

	public static class Destroy_stmtContext extends ParserRuleContext {
		public TerminalNode TK_DESTROY() { return getToken(SRParser.TK_DESTROY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Destroy_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destroy_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterDestroy_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitDestroy_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitDestroy_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Destroy_stmtContext destroy_stmt() throws RecognitionException {
		Destroy_stmtContext _localctx = new Destroy_stmtContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_destroy_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(TK_DESTROY);
			setState(810);
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

	public static class Begin_endContext extends ParserRuleContext {
		public TerminalNode TK_BEGIN() { return getToken(SRParser.TK_BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode TK_END() { return getToken(SRParser.TK_END, 0); }
		public Begin_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterBegin_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitBegin_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitBegin_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_endContext begin_end() throws RecognitionException {
		Begin_endContext _localctx = new Begin_endContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_begin_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			match(TK_BEGIN);
			setState(813);
			block();
			setState(814);
			match(TK_END);
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

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode TK_IF() { return getToken(SRParser.TK_IF, 0); }
		public Guarded_cmd_lpContext guarded_cmd_lp() {
			return getRuleContext(Guarded_cmd_lpContext.class,0);
		}
		public Else_cmd_optContext else_cmd_opt() {
			return getRuleContext(Else_cmd_optContext.class,0);
		}
		public TerminalNode TK_FI() { return getToken(SRParser.TK_FI, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(TK_IF);
			setState(817);
			guarded_cmd_lp(0);
			setState(818);
			else_cmd_opt();
			setState(819);
			match(TK_FI);
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

	public static class Do_stmtContext extends ParserRuleContext {
		public TerminalNode TK_DO() { return getToken(SRParser.TK_DO, 0); }
		public Guarded_cmd_lpContext guarded_cmd_lp() {
			return getRuleContext(Guarded_cmd_lpContext.class,0);
		}
		public Else_cmd_optContext else_cmd_opt() {
			return getRuleContext(Else_cmd_optContext.class,0);
		}
		public TerminalNode TK_OD() { return getToken(SRParser.TK_OD, 0); }
		public Do_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterDo_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitDo_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitDo_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_stmtContext do_stmt() throws RecognitionException {
		Do_stmtContext _localctx = new Do_stmtContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_do_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			match(TK_DO);
			setState(822);
			guarded_cmd_lp(0);
			setState(823);
			else_cmd_opt();
			setState(824);
			match(TK_OD);
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

	public static class Guarded_cmd_lpContext extends ParserRuleContext {
		public Guarded_cmdContext guarded_cmd() {
			return getRuleContext(Guarded_cmdContext.class,0);
		}
		public Guarded_cmd_lpContext guarded_cmd_lp() {
			return getRuleContext(Guarded_cmd_lpContext.class,0);
		}
		public TerminalNode TK_SQUARE() { return getToken(SRParser.TK_SQUARE, 0); }
		public Guarded_cmd_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guarded_cmd_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterGuarded_cmd_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitGuarded_cmd_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitGuarded_cmd_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Guarded_cmd_lpContext guarded_cmd_lp() throws RecognitionException {
		return guarded_cmd_lp(0);
	}

	private Guarded_cmd_lpContext guarded_cmd_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Guarded_cmd_lpContext _localctx = new Guarded_cmd_lpContext(_ctx, _parentState);
		Guarded_cmd_lpContext _prevctx = _localctx;
		int _startState = 192;
		enterRecursionRule(_localctx, 192, RULE_guarded_cmd_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(827);
			guarded_cmd();
			}
			_ctx.stop = _input.LT(-1);
			setState(834);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Guarded_cmd_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_guarded_cmd_lp);
					setState(829);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(830);
					match(TK_SQUARE);
					setState(831);
					guarded_cmd();
					}
					} 
				}
				setState(836);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	public static class Guarded_cmdContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_ARROW() { return getToken(SRParser.TK_ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Guarded_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guarded_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterGuarded_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitGuarded_cmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitGuarded_cmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Guarded_cmdContext guarded_cmd() throws RecognitionException {
		Guarded_cmdContext _localctx = new Guarded_cmdContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_guarded_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			expr(0);
			setState(838);
			match(TK_ARROW);
			setState(839);
			block();
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

	public static class Else_cmd_optContext extends ParserRuleContext {
		public TerminalNode TK_SQUARE() { return getToken(SRParser.TK_SQUARE, 0); }
		public TerminalNode TK_ELSE() { return getToken(SRParser.TK_ELSE, 0); }
		public TerminalNode TK_ARROW() { return getToken(SRParser.TK_ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_cmd_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_cmd_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterElse_cmd_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitElse_cmd_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitElse_cmd_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_cmd_optContext else_cmd_opt() throws RecognitionException {
		Else_cmd_optContext _localctx = new Else_cmd_optContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_else_cmd_opt);
		try {
			setState(846);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_FI:
			case TK_NI:
			case TK_OD:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TK_SQUARE:
				enterOuterAlt(_localctx, 2);
				{
				setState(842);
				match(TK_SQUARE);
				setState(843);
				match(TK_ELSE);
				setState(844);
				match(TK_ARROW);
				setState(845);
				block();
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

	public static class For_all_stmtContext extends ParserRuleContext {
		public TerminalNode TK_FA() { return getToken(SRParser.TK_FA, 0); }
		public Quantifier_lpContext quantifier_lp() {
			return getRuleContext(Quantifier_lpContext.class,0);
		}
		public TerminalNode TK_ARROW() { return getToken(SRParser.TK_ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode TK_AF() { return getToken(SRParser.TK_AF, 0); }
		public For_all_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_all_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterFor_all_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitFor_all_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitFor_all_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_all_stmtContext for_all_stmt() throws RecognitionException {
		For_all_stmtContext _localctx = new For_all_stmtContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_for_all_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			match(TK_FA);
			setState(849);
			quantifier_lp(0);
			setState(850);
			match(TK_ARROW);
			setState(851);
			block();
			setState(852);
			match(TK_AF);
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

	public static class Input_stmtContext extends ParserRuleContext {
		public TerminalNode TK_IN() { return getToken(SRParser.TK_IN, 0); }
		public In_cmd_lpContext in_cmd_lp() {
			return getRuleContext(In_cmd_lpContext.class,0);
		}
		public Else_cmd_optContext else_cmd_opt() {
			return getRuleContext(Else_cmd_optContext.class,0);
		}
		public TerminalNode TK_NI() { return getToken(SRParser.TK_NI, 0); }
		public Input_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterInput_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitInput_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitInput_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_stmtContext input_stmt() throws RecognitionException {
		Input_stmtContext _localctx = new Input_stmtContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_input_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			match(TK_IN);
			setState(855);
			in_cmd_lp(0);
			setState(856);
			else_cmd_opt();
			setState(857);
			match(TK_NI);
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

	public static class In_cmd_lpContext extends ParserRuleContext {
		public In_cmdContext in_cmd() {
			return getRuleContext(In_cmdContext.class,0);
		}
		public In_cmd_lpContext in_cmd_lp() {
			return getRuleContext(In_cmd_lpContext.class,0);
		}
		public TerminalNode TK_SQUARE() { return getToken(SRParser.TK_SQUARE, 0); }
		public In_cmd_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_cmd_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterIn_cmd_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitIn_cmd_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitIn_cmd_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_cmd_lpContext in_cmd_lp() throws RecognitionException {
		return in_cmd_lp(0);
	}

	private In_cmd_lpContext in_cmd_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		In_cmd_lpContext _localctx = new In_cmd_lpContext(_ctx, _parentState);
		In_cmd_lpContext _prevctx = _localctx;
		int _startState = 202;
		enterRecursionRule(_localctx, 202, RULE_in_cmd_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(860);
			in_cmd();
			}
			_ctx.stop = _input.LT(-1);
			setState(867);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new In_cmd_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_in_cmd_lp);
					setState(862);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(863);
					match(TK_SQUARE);
					setState(864);
					in_cmd();
					}
					} 
				}
				setState(869);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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

	public static class In_cmdContext extends ParserRuleContext {
		public Quantifiers_optContext quantifiers_opt() {
			return getRuleContext(Quantifiers_optContext.class,0);
		}
		public In_specContext in_spec() {
			return getRuleContext(In_specContext.class,0);
		}
		public Sync_expr_optContext sync_expr_opt() {
			return getRuleContext(Sync_expr_optContext.class,0);
		}
		public Sched_expr_optContext sched_expr_opt() {
			return getRuleContext(Sched_expr_optContext.class,0);
		}
		public TerminalNode TK_ARROW() { return getToken(SRParser.TK_ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public In_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterIn_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitIn_cmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitIn_cmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_cmdContext in_cmd() throws RecognitionException {
		In_cmdContext _localctx = new In_cmdContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_in_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			quantifiers_opt();
			setState(871);
			in_spec();
			setState(872);
			sync_expr_opt();
			setState(873);
			sched_expr_opt();
			setState(874);
			match(TK_ARROW);
			setState(875);
			block();
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

	public static class In_specContext extends ParserRuleContext {
		public In_opContext in_op() {
			return getRuleContext(In_opContext.class,0);
		}
		public Param_namesContext param_names() {
			return getRuleContext(Param_namesContext.class,0);
		}
		public In_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterIn_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitIn_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitIn_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_specContext in_spec() throws RecognitionException {
		In_specContext _localctx = new In_specContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_in_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			in_op();
			setState(878);
			param_names();
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

	public static class In_opContext extends ParserRuleContext {
		public Qualified_idContext qualified_id() {
			return getRuleContext(Qualified_idContext.class,0);
		}
		public SubscriptsContext subscripts() {
			return getRuleContext(SubscriptsContext.class,0);
		}
		public In_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterIn_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitIn_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitIn_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_opContext in_op() throws RecognitionException {
		In_opContext _localctx = new In_opContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_in_op);
		try {
			setState(884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(880);
				qualified_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(881);
				qualified_id();
				setState(882);
				subscripts();
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

	public static class Sync_expr_optContext extends ParserRuleContext {
		public TerminalNode TK_AND() { return getToken(SRParser.TK_AND, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_SUCHTHAT() { return getToken(SRParser.TK_SUCHTHAT, 0); }
		public Sync_expr_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sync_expr_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterSync_expr_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitSync_expr_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitSync_expr_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sync_expr_optContext sync_expr_opt() throws RecognitionException {
		Sync_expr_optContext _localctx = new Sync_expr_optContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_sync_expr_opt);
		try {
			setState(891);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_BY:
			case TK_ARROW:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TK_AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(887);
				match(TK_AND);
				setState(888);
				expr(0);
				}
				break;
			case TK_SUCHTHAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(889);
				match(TK_SUCHTHAT);
				setState(890);
				expr(0);
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

	public static class Sched_expr_optContext extends ParserRuleContext {
		public TerminalNode TK_BY() { return getToken(SRParser.TK_BY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Sched_expr_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sched_expr_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterSched_expr_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitSched_expr_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitSched_expr_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sched_expr_optContext sched_expr_opt() throws RecognitionException {
		Sched_expr_optContext _localctx = new Sched_expr_optContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_sched_expr_opt);
		try {
			setState(896);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ARROW:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TK_BY:
				enterOuterAlt(_localctx, 2);
				{
				setState(894);
				match(TK_BY);
				setState(895);
				expr(0);
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

	public static class Concurrent_stmtContext extends ParserRuleContext {
		public TerminalNode TK_CO() { return getToken(SRParser.TK_CO, 0); }
		public Concurrent_cmd_lpContext concurrent_cmd_lp() {
			return getRuleContext(Concurrent_cmd_lpContext.class,0);
		}
		public TerminalNode TK_OC() { return getToken(SRParser.TK_OC, 0); }
		public Concurrent_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concurrent_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterConcurrent_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitConcurrent_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitConcurrent_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Concurrent_stmtContext concurrent_stmt() throws RecognitionException {
		Concurrent_stmtContext _localctx = new Concurrent_stmtContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_concurrent_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			match(TK_CO);
			setState(899);
			concurrent_cmd_lp(0);
			setState(900);
			match(TK_OC);
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

	public static class Concurrent_cmd_lpContext extends ParserRuleContext {
		public Concurrent_cmdContext concurrent_cmd() {
			return getRuleContext(Concurrent_cmdContext.class,0);
		}
		public Concurrent_cmd_lpContext concurrent_cmd_lp() {
			return getRuleContext(Concurrent_cmd_lpContext.class,0);
		}
		public TerminalNode TK_PARALLEL() { return getToken(SRParser.TK_PARALLEL, 0); }
		public Concurrent_cmd_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concurrent_cmd_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterConcurrent_cmd_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitConcurrent_cmd_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitConcurrent_cmd_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Concurrent_cmd_lpContext concurrent_cmd_lp() throws RecognitionException {
		return concurrent_cmd_lp(0);
	}

	private Concurrent_cmd_lpContext concurrent_cmd_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Concurrent_cmd_lpContext _localctx = new Concurrent_cmd_lpContext(_ctx, _parentState);
		Concurrent_cmd_lpContext _prevctx = _localctx;
		int _startState = 216;
		enterRecursionRule(_localctx, 216, RULE_concurrent_cmd_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(903);
			concurrent_cmd();
			}
			_ctx.stop = _input.LT(-1);
			setState(910);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Concurrent_cmd_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_concurrent_cmd_lp);
					setState(905);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(906);
					match(TK_PARALLEL);
					setState(907);
					concurrent_cmd();
					}
					} 
				}
				setState(912);
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

	public static class Concurrent_cmdContext extends ParserRuleContext {
		public Quantifiers_optContext quantifiers_opt() {
			return getRuleContext(Quantifiers_optContext.class,0);
		}
		public Separator_optContext separator_opt() {
			return getRuleContext(Separator_optContext.class,0);
		}
		public Concurrent_invocationContext concurrent_invocation() {
			return getRuleContext(Concurrent_invocationContext.class,0);
		}
		public Post_processing_optContext post_processing_opt() {
			return getRuleContext(Post_processing_optContext.class,0);
		}
		public Concurrent_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concurrent_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterConcurrent_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitConcurrent_cmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitConcurrent_cmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Concurrent_cmdContext concurrent_cmd() throws RecognitionException {
		Concurrent_cmdContext _localctx = new Concurrent_cmdContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_concurrent_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			quantifiers_opt();
			setState(914);
			separator_opt(0);
			setState(915);
			concurrent_invocation();
			setState(916);
			post_processing_opt();
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

	public static class Separator_optContext extends ParserRuleContext {
		public Separator_optContext separator_opt() {
			return getRuleContext(Separator_optContext.class,0);
		}
		public TerminalNode TK_SEPARATOR() { return getToken(SRParser.TK_SEPARATOR, 0); }
		public Separator_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separator_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterSeparator_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitSeparator_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitSeparator_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Separator_optContext separator_opt() throws RecognitionException {
		return separator_opt(0);
	}

	private Separator_optContext separator_opt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Separator_optContext _localctx = new Separator_optContext(_ctx, _parentState);
		Separator_optContext _prevctx = _localctx;
		int _startState = 220;
		enterRecursionRule(_localctx, 220, RULE_separator_opt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(923);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Separator_optContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_separator_opt);
					setState(919);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(920);
					match(TK_SEPARATOR);
					}
					} 
				}
				setState(925);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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

	public static class Concurrent_invocationContext extends ParserRuleContext {
		public Explicit_callContext explicit_call() {
			return getRuleContext(Explicit_callContext.class,0);
		}
		public Send_stmtContext send_stmt() {
			return getRuleContext(Send_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Concurrent_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concurrent_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterConcurrent_invocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitConcurrent_invocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitConcurrent_invocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Concurrent_invocationContext concurrent_invocation() throws RecognitionException {
		Concurrent_invocationContext _localctx = new Concurrent_invocationContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_concurrent_invocation);
		try {
			setState(929);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(926);
				explicit_call();
				}
				break;
			case TK_SEND:
				enterOuterAlt(_localctx, 2);
				{
				setState(927);
				send_stmt();
				}
				break;
			case TK_NOOP:
			case TK_NULL:
			case TK_BOOL:
			case TK_CHAR:
			case TK_CREATE:
			case TK_FALSE:
			case TK_TRUE:
			case TK_FILE:
			case TK_HIGH:
			case TK_INT:
			case TK_LOW:
			case TK_NEW:
			case TK_NOT:
			case TK_REAL:
			case TK_STRING:
			case TK_INCR:
			case TK_PLUS:
			case TK_DECR:
			case TK_MINUS:
			case TK_LPAREN:
			case TK_ADDR:
			case TK_QMARK:
			case TK_ID:
			case TK_NUM:
			case TK_TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(928);
				expr(0);
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

	public static class Post_processing_optContext extends ParserRuleContext {
		public TerminalNode TK_ARROW() { return getToken(SRParser.TK_ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Post_processing_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_post_processing_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterPost_processing_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitPost_processing_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitPost_processing_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Post_processing_optContext post_processing_opt() throws RecognitionException {
		Post_processing_optContext _localctx = new Post_processing_optContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_post_processing_opt);
		try {
			setState(934);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(932);
				match(TK_ARROW);
				setState(933);
				block();
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

	public static class Quantifiers_optContext extends ParserRuleContext {
		public TerminalNode TK_LPAREN() { return getToken(SRParser.TK_LPAREN, 0); }
		public Quantifier_lpContext quantifier_lp() {
			return getRuleContext(Quantifier_lpContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(SRParser.TK_RPAREN, 0); }
		public Quantifiers_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifiers_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterQuantifiers_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitQuantifiers_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitQuantifiers_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quantifiers_optContext quantifiers_opt() throws RecognitionException {
		Quantifiers_optContext _localctx = new Quantifiers_optContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_quantifiers_opt);
		try {
			setState(941);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(937);
				match(TK_LPAREN);
				setState(938);
				quantifier_lp(0);
				setState(939);
				match(TK_RPAREN);
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

	public static class Quantifier_lpContext extends ParserRuleContext {
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public Quantifier_lpContext quantifier_lp() {
			return getRuleContext(Quantifier_lpContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(SRParser.TK_COMMA, 0); }
		public Quantifier_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterQuantifier_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitQuantifier_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitQuantifier_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quantifier_lpContext quantifier_lp() throws RecognitionException {
		return quantifier_lp(0);
	}

	private Quantifier_lpContext quantifier_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Quantifier_lpContext _localctx = new Quantifier_lpContext(_ctx, _parentState);
		Quantifier_lpContext _prevctx = _localctx;
		int _startState = 228;
		enterRecursionRule(_localctx, 228, RULE_quantifier_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(944);
			quantifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(951);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Quantifier_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_quantifier_lp);
					setState(946);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(947);
					match(TK_COMMA);
					setState(948);
					quantifier();
					}
					} 
				}
				setState(953);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	public static class QuantifierContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(SRParser.TK_ID, 0); }
		public TerminalNode TK_ASSIGN() { return getToken(SRParser.TK_ASSIGN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public Step_optContext step_opt() {
			return getRuleContext(Step_optContext.class,0);
		}
		public Such_that_optContext such_that_opt() {
			return getRuleContext(Such_that_optContext.class,0);
		}
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_quantifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			match(TK_ID);
			setState(955);
			match(TK_ASSIGN);
			setState(956);
			expr(0);
			setState(957);
			direction();
			setState(958);
			expr(0);
			setState(959);
			step_opt();
			setState(960);
			such_that_opt();
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

	public static class DirectionContext extends ParserRuleContext {
		public TerminalNode TK_TO() { return getToken(SRParser.TK_TO, 0); }
		public TerminalNode TK_DOWNTO() { return getToken(SRParser.TK_DOWNTO, 0); }
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitDirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitDirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			_la = _input.LA(1);
			if ( !(_la==TK_DOWNTO || _la==TK_TO) ) {
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

	public static class Step_optContext extends ParserRuleContext {
		public TerminalNode TK_BY() { return getToken(SRParser.TK_BY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Step_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterStep_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitStep_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitStep_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Step_optContext step_opt() throws RecognitionException {
		Step_optContext _localctx = new Step_optContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_step_opt);
		try {
			setState(967);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(965);
				match(TK_BY);
				setState(966);
				expr(0);
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

	public static class Such_that_optContext extends ParserRuleContext {
		public TerminalNode TK_SUCHTHAT() { return getToken(SRParser.TK_SUCHTHAT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Such_that_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_such_that_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterSuch_that_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitSuch_that_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitSuch_that_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Such_that_optContext such_that_opt() throws RecognitionException {
		Such_that_optContext _localctx = new Such_that_optContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_such_that_opt);
		try {
			setState(972);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(970);
				match(TK_SUCHTHAT);
				setState(971);
				expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(SRParser.TK_ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public Prefix_exprContext prefix_expr() {
			return getRuleContext(Prefix_exprContext.class,0);
		}
		public Create_exprContext create_expr() {
			return getRuleContext(Create_exprContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TK_EXPON() { return getToken(SRParser.TK_EXPON, 0); }
		public TerminalNode TK_ASTER() { return getToken(SRParser.TK_ASTER, 0); }
		public TerminalNode TK_DIV() { return getToken(SRParser.TK_DIV, 0); }
		public TerminalNode TK_MOD() { return getToken(SRParser.TK_MOD, 0); }
		public TerminalNode TK_REMDR() { return getToken(SRParser.TK_REMDR, 0); }
		public TerminalNode TK_PLUS() { return getToken(SRParser.TK_PLUS, 0); }
		public TerminalNode TK_MINUS() { return getToken(SRParser.TK_MINUS, 0); }
		public TerminalNode TK_CONCAT() { return getToken(SRParser.TK_CONCAT, 0); }
		public TerminalNode TK_EQ() { return getToken(SRParser.TK_EQ, 0); }
		public TerminalNode TK_NE() { return getToken(SRParser.TK_NE, 0); }
		public TerminalNode TK_GE() { return getToken(SRParser.TK_GE, 0); }
		public TerminalNode TK_LE() { return getToken(SRParser.TK_LE, 0); }
		public TerminalNode TK_GT() { return getToken(SRParser.TK_GT, 0); }
		public TerminalNode TK_LT() { return getToken(SRParser.TK_LT, 0); }
		public TerminalNode TK_AND() { return getToken(SRParser.TK_AND, 0); }
		public TerminalNode TK_OR() { return getToken(SRParser.TK_OR, 0); }
		public TerminalNode TK_XOR() { return getToken(SRParser.TK_XOR, 0); }
		public TerminalNode TK_RSHIFT() { return getToken(SRParser.TK_RSHIFT, 0); }
		public TerminalNode TK_LSHIFT() { return getToken(SRParser.TK_LSHIFT, 0); }
		public TerminalNode TK_SWAP() { return getToken(SRParser.TK_SWAP, 0); }
		public TerminalNode TK_ASSIGN() { return getToken(SRParser.TK_ASSIGN, 0); }
		public TerminalNode TK_AUG_PLUS() { return getToken(SRParser.TK_AUG_PLUS, 0); }
		public TerminalNode TK_AUG_MINUS() { return getToken(SRParser.TK_AUG_MINUS, 0); }
		public TerminalNode TK_AUG_ASTER() { return getToken(SRParser.TK_AUG_ASTER, 0); }
		public TerminalNode TK_AUG_DIV() { return getToken(SRParser.TK_AUG_DIV, 0); }
		public TerminalNode TK_AUG_REMDR() { return getToken(SRParser.TK_AUG_REMDR, 0); }
		public TerminalNode TK_AUG_EXPON() { return getToken(SRParser.TK_AUG_EXPON, 0); }
		public TerminalNode TK_AUG_OR() { return getToken(SRParser.TK_AUG_OR, 0); }
		public TerminalNode TK_AUG_AND() { return getToken(SRParser.TK_AUG_AND, 0); }
		public TerminalNode TK_AUG_CONCAT() { return getToken(SRParser.TK_AUG_CONCAT, 0); }
		public TerminalNode TK_AUG_RSHIFT() { return getToken(SRParser.TK_AUG_RSHIFT, 0); }
		public TerminalNode TK_AUG_LSHIFT() { return getToken(SRParser.TK_AUG_LSHIFT, 0); }
		public Paren_listContext paren_list() {
			return getRuleContext(Paren_listContext.class,0);
		}
		public TerminalNode TK_INCR() { return getToken(SRParser.TK_INCR, 0); }
		public TerminalNode TK_DECR() { return getToken(SRParser.TK_DECR, 0); }
		public TerminalNode TK_HAT() { return getToken(SRParser.TK_HAT, 0); }
		public TerminalNode TK_PERIOD() { return getToken(SRParser.TK_PERIOD, 0); }
		public TerminalNode TK_LBRACKET() { return getToken(SRParser.TK_LBRACKET, 0); }
		public Bound_lpContext bound_lp() {
			return getRuleContext(Bound_lpContext.class,0);
		}
		public TerminalNode TK_RBRACKET() { return getToken(SRParser.TK_RBRACKET, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 238;
		enterRecursionRule(_localctx, 238, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ID:
				{
				setState(975);
				match(TK_ID);
				}
				break;
			case TK_NOOP:
			case TK_NULL:
			case TK_FALSE:
			case TK_TRUE:
			case TK_NUM:
			case TK_TEXT:
				{
				setState(976);
				literal();
				}
				break;
			case TK_LPAREN:
				{
				setState(977);
				constructor();
				}
				break;
			case TK_BOOL:
			case TK_CHAR:
			case TK_FILE:
			case TK_HIGH:
			case TK_INT:
			case TK_LOW:
			case TK_NEW:
			case TK_NOT:
			case TK_REAL:
			case TK_STRING:
			case TK_INCR:
			case TK_PLUS:
			case TK_DECR:
			case TK_MINUS:
			case TK_ADDR:
			case TK_QMARK:
				{
				setState(978);
				prefix_expr();
				}
				break;
			case TK_CREATE:
				{
				setState(979);
				create_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1096);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1094);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(982);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(983);
						match(TK_EXPON);
						setState(984);
						expr(33);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(985);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(986);
						match(TK_ASTER);
						setState(987);
						expr(32);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(988);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(989);
						match(TK_DIV);
						setState(990);
						expr(31);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(991);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(992);
						match(TK_MOD);
						setState(993);
						expr(30);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(994);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(995);
						match(TK_REMDR);
						setState(996);
						expr(29);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(997);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(998);
						match(TK_PLUS);
						setState(999);
						expr(28);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1000);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1001);
						match(TK_MINUS);
						setState(1002);
						expr(27);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1003);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1004);
						match(TK_CONCAT);
						setState(1005);
						expr(26);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1006);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1007);
						match(TK_EQ);
						setState(1008);
						expr(25);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1009);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1010);
						match(TK_NE);
						setState(1011);
						expr(24);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1012);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1013);
						match(TK_GE);
						setState(1014);
						expr(23);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1015);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1016);
						match(TK_LE);
						setState(1017);
						expr(22);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1018);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1019);
						match(TK_GT);
						setState(1020);
						expr(21);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1021);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1022);
						match(TK_LT);
						setState(1023);
						expr(20);
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1024);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1025);
						match(TK_AND);
						setState(1026);
						expr(19);
						}
						break;
					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1027);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1028);
						match(TK_OR);
						setState(1029);
						expr(18);
						}
						break;
					case 17:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1030);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1031);
						match(TK_XOR);
						setState(1032);
						expr(17);
						}
						break;
					case 18:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1033);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1034);
						match(TK_RSHIFT);
						setState(1035);
						expr(16);
						}
						break;
					case 19:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1036);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1037);
						match(TK_LSHIFT);
						setState(1038);
						expr(15);
						}
						break;
					case 20:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1039);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1040);
						match(TK_SWAP);
						setState(1041);
						expr(14);
						}
						break;
					case 21:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1042);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1043);
						match(TK_ASSIGN);
						setState(1044);
						expr(13);
						}
						break;
					case 22:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1045);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1046);
						match(TK_AUG_PLUS);
						setState(1047);
						expr(12);
						}
						break;
					case 23:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1048);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1049);
						match(TK_AUG_MINUS);
						setState(1050);
						expr(11);
						}
						break;
					case 24:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1051);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1052);
						match(TK_AUG_ASTER);
						setState(1053);
						expr(10);
						}
						break;
					case 25:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1054);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1055);
						match(TK_AUG_DIV);
						setState(1056);
						expr(9);
						}
						break;
					case 26:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1057);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1058);
						match(TK_AUG_REMDR);
						setState(1059);
						expr(8);
						}
						break;
					case 27:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1060);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1061);
						match(TK_AUG_EXPON);
						setState(1062);
						expr(7);
						}
						break;
					case 28:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1063);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1064);
						match(TK_AUG_OR);
						setState(1065);
						expr(6);
						}
						break;
					case 29:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1066);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1067);
						match(TK_AUG_AND);
						setState(1068);
						expr(5);
						}
						break;
					case 30:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1069);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1070);
						match(TK_AUG_CONCAT);
						setState(1071);
						expr(4);
						}
						break;
					case 31:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1072);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1073);
						match(TK_AUG_RSHIFT);
						setState(1074);
						expr(3);
						}
						break;
					case 32:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1075);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1076);
						match(TK_AUG_LSHIFT);
						setState(1077);
						expr(2);
						}
						break;
					case 33:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1078);
						if (!(precpred(_ctx, 41))) throw new FailedPredicateException(this, "precpred(_ctx, 41)");
						setState(1079);
						paren_list();
						}
						break;
					case 34:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1080);
						if (!(precpred(_ctx, 38))) throw new FailedPredicateException(this, "precpred(_ctx, 38)");
						setState(1081);
						match(TK_INCR);
						}
						break;
					case 35:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1082);
						if (!(precpred(_ctx, 37))) throw new FailedPredicateException(this, "precpred(_ctx, 37)");
						setState(1083);
						match(TK_DECR);
						}
						break;
					case 36:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1084);
						if (!(precpred(_ctx, 36))) throw new FailedPredicateException(this, "precpred(_ctx, 36)");
						setState(1085);
						match(TK_HAT);
						}
						break;
					case 37:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1086);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(1087);
						match(TK_PERIOD);
						setState(1088);
						match(TK_ID);
						}
						break;
					case 38:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1089);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(1090);
						match(TK_LBRACKET);
						setState(1091);
						bound_lp(0);
						setState(1092);
						match(TK_RBRACKET);
						}
						break;
					}
					} 
				}
				setState(1098);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode TK_NUM() { return getToken(SRParser.TK_NUM, 0); }
		public TerminalNode TK_FALSE() { return getToken(SRParser.TK_FALSE, 0); }
		public TerminalNode TK_TRUE() { return getToken(SRParser.TK_TRUE, 0); }
		public TerminalNode TK_TEXT() { return getToken(SRParser.TK_TEXT, 0); }
		public TerminalNode TK_NULL() { return getToken(SRParser.TK_NULL, 0); }
		public TerminalNode TK_NOOP() { return getToken(SRParser.TK_NOOP, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_NOOP) | (1L << TK_NULL) | (1L << TK_FALSE) | (1L << TK_TRUE))) != 0) || _la==TK_NUM || _la==TK_TEXT) ) {
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

	public static class Prefix_exprContext extends ParserRuleContext {
		public TerminalNode TK_NOT() { return getToken(SRParser.TK_NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_PLUS() { return getToken(SRParser.TK_PLUS, 0); }
		public TerminalNode TK_MINUS() { return getToken(SRParser.TK_MINUS, 0); }
		public TerminalNode TK_ADDR() { return getToken(SRParser.TK_ADDR, 0); }
		public TerminalNode TK_QMARK() { return getToken(SRParser.TK_QMARK, 0); }
		public TerminalNode TK_INCR() { return getToken(SRParser.TK_INCR, 0); }
		public TerminalNode TK_DECR() { return getToken(SRParser.TK_DECR, 0); }
		public Basic_typeContext basic_type() {
			return getRuleContext(Basic_typeContext.class,0);
		}
		public Paren_exprContext paren_expr() {
			return getRuleContext(Paren_exprContext.class,0);
		}
		public TerminalNode TK_STRING() { return getToken(SRParser.TK_STRING, 0); }
		public TerminalNode TK_LOW() { return getToken(SRParser.TK_LOW, 0); }
		public TerminalNode TK_LPAREN() { return getToken(SRParser.TK_LPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(SRParser.TK_RPAREN, 0); }
		public TerminalNode TK_HIGH() { return getToken(SRParser.TK_HIGH, 0); }
		public TerminalNode TK_NEW() { return getToken(SRParser.TK_NEW, 0); }
		public Subscripts_optContext subscripts_opt() {
			return getRuleContext(Subscripts_optContext.class,0);
		}
		public New_itemContext new_item() {
			return getRuleContext(New_itemContext.class,0);
		}
		public Prefix_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterPrefix_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitPrefix_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitPrefix_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_exprContext prefix_expr() throws RecognitionException {
		Prefix_exprContext _localctx = new Prefix_exprContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_prefix_expr);
		try {
			setState(1136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1101);
				match(TK_NOT);
				setState(1102);
				expr(0);
				}
				break;
			case TK_PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1103);
				match(TK_PLUS);
				setState(1104);
				expr(0);
				}
				break;
			case TK_MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1105);
				match(TK_MINUS);
				setState(1106);
				expr(0);
				}
				break;
			case TK_ADDR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1107);
				match(TK_ADDR);
				setState(1108);
				expr(0);
				}
				break;
			case TK_QMARK:
				enterOuterAlt(_localctx, 5);
				{
				setState(1109);
				match(TK_QMARK);
				setState(1110);
				expr(0);
				}
				break;
			case TK_INCR:
				enterOuterAlt(_localctx, 6);
				{
				setState(1111);
				match(TK_INCR);
				setState(1112);
				expr(0);
				}
				break;
			case TK_DECR:
				enterOuterAlt(_localctx, 7);
				{
				setState(1113);
				match(TK_DECR);
				setState(1114);
				expr(0);
				}
				break;
			case TK_BOOL:
			case TK_CHAR:
			case TK_FILE:
			case TK_INT:
			case TK_REAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(1115);
				basic_type();
				setState(1116);
				paren_expr();
				}
				break;
			case TK_STRING:
				enterOuterAlt(_localctx, 9);
				{
				setState(1118);
				match(TK_STRING);
				setState(1119);
				paren_expr();
				}
				break;
			case TK_LOW:
				enterOuterAlt(_localctx, 10);
				{
				setState(1120);
				match(TK_LOW);
				setState(1121);
				match(TK_LPAREN);
				setState(1122);
				type();
				setState(1123);
				match(TK_RPAREN);
				}
				break;
			case TK_HIGH:
				enterOuterAlt(_localctx, 11);
				{
				setState(1125);
				match(TK_HIGH);
				setState(1126);
				match(TK_LPAREN);
				setState(1127);
				type();
				setState(1128);
				match(TK_RPAREN);
				}
				break;
			case TK_NEW:
				enterOuterAlt(_localctx, 12);
				{
				setState(1130);
				match(TK_NEW);
				setState(1131);
				match(TK_LPAREN);
				setState(1132);
				subscripts_opt();
				setState(1133);
				new_item();
				setState(1134);
				match(TK_RPAREN);
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

	public static class New_itemContext extends ParserRuleContext {
		public Unsub_typeContext unsub_type() {
			return getRuleContext(Unsub_typeContext.class,0);
		}
		public TerminalNode TK_SEM() { return getToken(SRParser.TK_SEM, 0); }
		public Sem_protoContext sem_proto() {
			return getRuleContext(Sem_protoContext.class,0);
		}
		public TerminalNode TK_OP() { return getToken(SRParser.TK_OP, 0); }
		public Op_prototypeContext op_prototype() {
			return getRuleContext(Op_prototypeContext.class,0);
		}
		public New_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterNew_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitNew_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitNew_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_itemContext new_item() throws RecognitionException {
		New_itemContext _localctx = new New_itemContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_new_item);
		try {
			setState(1143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_BOOL:
			case TK_CAP:
			case TK_CHAR:
			case TK_ENUM:
			case TK_FILE:
			case TK_INT:
			case TK_PTR:
			case TK_REAL:
			case TK_REC:
			case TK_STRING:
			case TK_UNION:
			case TK_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1138);
				unsub_type();
				}
				break;
			case TK_SEM:
				enterOuterAlt(_localctx, 2);
				{
				setState(1139);
				match(TK_SEM);
				setState(1140);
				sem_proto();
				}
				break;
			case TK_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1141);
				match(TK_OP);
				setState(1142);
				op_prototype();
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

	public static class Paren_exprContext extends ParserRuleContext {
		public TerminalNode TK_LPAREN() { return getToken(SRParser.TK_LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(SRParser.TK_RPAREN, 0); }
		public Paren_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paren_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterParen_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitParen_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitParen_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Paren_exprContext paren_expr() throws RecognitionException {
		Paren_exprContext _localctx = new Paren_exprContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_paren_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145);
			match(TK_LPAREN);
			setState(1146);
			expr(0);
			setState(1147);
			match(TK_RPAREN);
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

	public static class Paren_listContext extends ParserRuleContext {
		public TerminalNode TK_LPAREN() { return getToken(SRParser.TK_LPAREN, 0); }
		public Paren_item_lsContext paren_item_ls() {
			return getRuleContext(Paren_item_lsContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(SRParser.TK_RPAREN, 0); }
		public Paren_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paren_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterParen_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitParen_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitParen_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Paren_listContext paren_list() throws RecognitionException {
		Paren_listContext _localctx = new Paren_listContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_paren_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1149);
			match(TK_LPAREN);
			setState(1150);
			paren_item_ls();
			setState(1151);
			match(TK_RPAREN);
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

	public static class Paren_item_lsContext extends ParserRuleContext {
		public Expr_lpContext expr_lp() {
			return getRuleContext(Expr_lpContext.class,0);
		}
		public Paren_item_lsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paren_item_ls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterParen_item_ls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitParen_item_ls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitParen_item_ls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Paren_item_lsContext paren_item_ls() throws RecognitionException {
		Paren_item_lsContext _localctx = new Paren_item_lsContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_paren_item_ls);
		try {
			setState(1155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_RPAREN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TK_NOOP:
			case TK_NULL:
			case TK_BOOL:
			case TK_CHAR:
			case TK_CREATE:
			case TK_FALSE:
			case TK_TRUE:
			case TK_FILE:
			case TK_HIGH:
			case TK_INT:
			case TK_LOW:
			case TK_NEW:
			case TK_NOT:
			case TK_REAL:
			case TK_STRING:
			case TK_INCR:
			case TK_PLUS:
			case TK_DECR:
			case TK_MINUS:
			case TK_LPAREN:
			case TK_ADDR:
			case TK_QMARK:
			case TK_ID:
			case TK_NUM:
			case TK_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1154);
				expr_lp(0);
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

	public static class Expr_lpContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_lpContext expr_lp() {
			return getRuleContext(Expr_lpContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(SRParser.TK_COMMA, 0); }
		public Expr_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterExpr_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitExpr_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitExpr_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_lpContext expr_lp() throws RecognitionException {
		return expr_lp(0);
	}

	private Expr_lpContext expr_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_lpContext _localctx = new Expr_lpContext(_ctx, _parentState);
		Expr_lpContext _prevctx = _localctx;
		int _startState = 252;
		enterRecursionRule(_localctx, 252, RULE_expr_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1158);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_lp);
					setState(1160);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1161);
					match(TK_COMMA);
					setState(1162);
					expr(0);
					}
					} 
				}
				setState(1167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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

	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode TK_LPAREN() { return getToken(SRParser.TK_LPAREN, 0); }
		public Constr_item_lpContext constr_item_lp() {
			return getRuleContext(Constr_item_lpContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(SRParser.TK_RPAREN, 0); }
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			match(TK_LPAREN);
			setState(1169);
			constr_item_lp(0);
			setState(1170);
			match(TK_RPAREN);
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

	public static class Constr_item_lpContext extends ParserRuleContext {
		public Constr_itemContext constr_item() {
			return getRuleContext(Constr_itemContext.class,0);
		}
		public Constr_item_lpContext constr_item_lp() {
			return getRuleContext(Constr_item_lpContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(SRParser.TK_COMMA, 0); }
		public Constr_item_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constr_item_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterConstr_item_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitConstr_item_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitConstr_item_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constr_item_lpContext constr_item_lp() throws RecognitionException {
		return constr_item_lp(0);
	}

	private Constr_item_lpContext constr_item_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Constr_item_lpContext _localctx = new Constr_item_lpContext(_ctx, _parentState);
		Constr_item_lpContext _prevctx = _localctx;
		int _startState = 256;
		enterRecursionRule(_localctx, 256, RULE_constr_item_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1173);
			constr_item();
			}
			_ctx.stop = _input.LT(-1);
			setState(1180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Constr_item_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constr_item_lp);
					setState(1175);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1176);
					match(TK_COMMA);
					setState(1177);
					constr_item();
					}
					} 
				}
				setState(1182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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

	public static class Constr_itemContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TK_LBRACKET() { return getToken(SRParser.TK_LBRACKET, 0); }
		public TerminalNode TK_RBRACKET() { return getToken(SRParser.TK_RBRACKET, 0); }
		public Constr_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constr_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterConstr_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitConstr_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitConstr_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constr_itemContext constr_item() throws RecognitionException {
		Constr_itemContext _localctx = new Constr_itemContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_constr_item);
		try {
			setState(1189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NOOP:
			case TK_NULL:
			case TK_BOOL:
			case TK_CHAR:
			case TK_CREATE:
			case TK_FALSE:
			case TK_TRUE:
			case TK_FILE:
			case TK_HIGH:
			case TK_INT:
			case TK_LOW:
			case TK_NEW:
			case TK_NOT:
			case TK_REAL:
			case TK_STRING:
			case TK_INCR:
			case TK_PLUS:
			case TK_DECR:
			case TK_MINUS:
			case TK_LPAREN:
			case TK_ADDR:
			case TK_QMARK:
			case TK_ID:
			case TK_NUM:
			case TK_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1183);
				expr(0);
				}
				break;
			case TK_LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1184);
				match(TK_LBRACKET);
				setState(1185);
				expr(0);
				setState(1186);
				match(TK_RBRACKET);
				setState(1187);
				expr(0);
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

	public static class Create_exprContext extends ParserRuleContext {
		public TerminalNode TK_CREATE() { return getToken(SRParser.TK_CREATE, 0); }
		public Create_callContext create_call() {
			return getRuleContext(Create_callContext.class,0);
		}
		public Location_optContext location_opt() {
			return getRuleContext(Location_optContext.class,0);
		}
		public Create_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterCreate_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitCreate_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitCreate_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_exprContext create_expr() throws RecognitionException {
		Create_exprContext _localctx = new Create_exprContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_create_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191);
			match(TK_CREATE);
			setState(1192);
			create_call();
			setState(1193);
			location_opt();
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

	public static class Create_callContext extends ParserRuleContext {
		public Rsrc_nameContext rsrc_name() {
			return getRuleContext(Rsrc_nameContext.class,0);
		}
		public Paren_listContext paren_list() {
			return getRuleContext(Paren_listContext.class,0);
		}
		public Create_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterCreate_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitCreate_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitCreate_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_callContext create_call() throws RecognitionException {
		Create_callContext _localctx = new Create_callContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_create_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			rsrc_name();
			setState(1196);
			paren_list();
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

	public static class Rsrc_nameContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(SRParser.TK_ID, 0); }
		public TerminalNode TK_VM() { return getToken(SRParser.TK_VM, 0); }
		public Rsrc_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rsrc_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterRsrc_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitRsrc_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitRsrc_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rsrc_nameContext rsrc_name() throws RecognitionException {
		Rsrc_nameContext _localctx = new Rsrc_nameContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_rsrc_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			_la = _input.LA(1);
			if ( !(_la==TK_VM || _la==TK_ID) ) {
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

	public static class Location_optContext extends ParserRuleContext {
		public TerminalNode TK_ON() { return getToken(SRParser.TK_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Location_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterLocation_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitLocation_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitLocation_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Location_optContext location_opt() throws RecognitionException {
		Location_optContext _localctx = new Location_optContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_location_opt);
		try {
			setState(1203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1201);
				match(TK_ON);
				setState(1202);
				expr(0);
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

	public static class Qualified_idContext extends ParserRuleContext {
		public List<TerminalNode> TK_ID() { return getTokens(SRParser.TK_ID); }
		public TerminalNode TK_ID(int i) {
			return getToken(SRParser.TK_ID, i);
		}
		public TerminalNode TK_PERIOD() { return getToken(SRParser.TK_PERIOD, 0); }
		public Qualified_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterQualified_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitQualified_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitQualified_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_idContext qualified_id() throws RecognitionException {
		Qualified_idContext _localctx = new Qualified_idContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_qualified_id);
		try {
			setState(1209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1205);
				match(TK_ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1206);
				match(TK_ID);
				setState(1207);
				match(TK_PERIOD);
				setState(1208);
				match(TK_ID);
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

	public static class End_idContext extends ParserRuleContext {
		public TerminalNode TK_END() { return getToken(SRParser.TK_END, 0); }
		public Id_optContext id_opt() {
			return getRuleContext(Id_optContext.class,0);
		}
		public End_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterEnd_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitEnd_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitEnd_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_idContext end_id() throws RecognitionException {
		End_idContext _localctx = new End_idContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_end_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			match(TK_END);
			setState(1212);
			id_opt();
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

	public static class Id_lsContext extends ParserRuleContext {
		public Id_lpContext id_lp() {
			return getRuleContext(Id_lpContext.class,0);
		}
		public Id_lsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_ls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterId_ls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitId_ls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitId_ls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_lsContext id_ls() throws RecognitionException {
		Id_lsContext _localctx = new Id_lsContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_id_ls);
		try {
			setState(1216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_RPAREN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TK_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1215);
				id_lp(0);
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

	public static class Id_lpContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(SRParser.TK_ID, 0); }
		public Id_lpContext id_lp() {
			return getRuleContext(Id_lpContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(SRParser.TK_COMMA, 0); }
		public Id_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterId_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitId_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitId_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_lpContext id_lp() throws RecognitionException {
		return id_lp(0);
	}

	private Id_lpContext id_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Id_lpContext _localctx = new Id_lpContext(_ctx, _parentState);
		Id_lpContext _prevctx = _localctx;
		int _startState = 274;
		enterRecursionRule(_localctx, 274, RULE_id_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1219);
			match(TK_ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(1226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Id_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_id_lp);
					setState(1221);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1222);
					match(TK_COMMA);
					setState(1223);
					match(TK_ID);
					}
					} 
				}
				setState(1228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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

	public static class Id_subs_lpContext extends ParserRuleContext {
		public Id_subsContext id_subs() {
			return getRuleContext(Id_subsContext.class,0);
		}
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(SRParser.TK_COMMA, 0); }
		public Id_subs_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_subs_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterId_subs_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitId_subs_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitId_subs_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_subs_lpContext id_subs_lp() throws RecognitionException {
		return id_subs_lp(0);
	}

	private Id_subs_lpContext id_subs_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Id_subs_lpContext _localctx = new Id_subs_lpContext(_ctx, _parentState);
		Id_subs_lpContext _prevctx = _localctx;
		int _startState = 276;
		enterRecursionRule(_localctx, 276, RULE_id_subs_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1230);
			id_subs();
			}
			_ctx.stop = _input.LT(-1);
			setState(1237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Id_subs_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_id_subs_lp);
					setState(1232);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1233);
					match(TK_COMMA);
					setState(1234);
					id_subs();
					}
					} 
				}
				setState(1239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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

	public static class Id_subsContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(SRParser.TK_ID, 0); }
		public SubscriptsContext subscripts() {
			return getRuleContext(SubscriptsContext.class,0);
		}
		public Id_subsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_subs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterId_subs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitId_subs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitId_subs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_subsContext id_subs() throws RecognitionException {
		Id_subsContext _localctx = new Id_subsContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_id_subs);
		try {
			setState(1243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1240);
				match(TK_ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1241);
				match(TK_ID);
				setState(1242);
				subscripts();
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

	public static class SubscriptsContext extends ParserRuleContext {
		public Bracketed_listContext bracketed_list() {
			return getRuleContext(Bracketed_listContext.class,0);
		}
		public SubscriptsContext subscripts() {
			return getRuleContext(SubscriptsContext.class,0);
		}
		public SubscriptsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscripts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterSubscripts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitSubscripts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitSubscripts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptsContext subscripts() throws RecognitionException {
		SubscriptsContext _localctx = new SubscriptsContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_subscripts);
		try {
			setState(1249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1245);
				bracketed_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1246);
				bracketed_list();
				setState(1247);
				subscripts();
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

	public static class Subscripts_optContext extends ParserRuleContext {
		public SubscriptsContext subscripts() {
			return getRuleContext(SubscriptsContext.class,0);
		}
		public Subscripts_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscripts_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterSubscripts_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitSubscripts_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitSubscripts_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscripts_optContext subscripts_opt() throws RecognitionException {
		Subscripts_optContext _localctx = new Subscripts_optContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_subscripts_opt);
		try {
			setState(1253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_BOOL:
			case TK_CAP:
			case TK_CHAR:
			case TK_ENUM:
			case TK_FILE:
			case TK_INT:
			case TK_OP:
			case TK_PTR:
			case TK_REAL:
			case TK_REC:
			case TK_SEM:
			case TK_STRING:
			case TK_UNION:
			case TK_ID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TK_LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1252);
				subscripts();
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

	public static class Bracketed_listContext extends ParserRuleContext {
		public TerminalNode TK_LBRACKET() { return getToken(SRParser.TK_LBRACKET, 0); }
		public Bound_lpContext bound_lp() {
			return getRuleContext(Bound_lpContext.class,0);
		}
		public TerminalNode TK_RBRACKET() { return getToken(SRParser.TK_RBRACKET, 0); }
		public Bracketed_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketed_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterBracketed_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitBracketed_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitBracketed_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bracketed_listContext bracketed_list() throws RecognitionException {
		Bracketed_listContext _localctx = new Bracketed_listContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_bracketed_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			match(TK_LBRACKET);
			setState(1256);
			bound_lp(0);
			setState(1257);
			match(TK_RBRACKET);
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

	public static class Bound_lpContext extends ParserRuleContext {
		public BoundsContext bounds() {
			return getRuleContext(BoundsContext.class,0);
		}
		public Bound_lpContext bound_lp() {
			return getRuleContext(Bound_lpContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(SRParser.TK_COMMA, 0); }
		public Bound_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bound_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterBound_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitBound_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitBound_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bound_lpContext bound_lp() throws RecognitionException {
		return bound_lp(0);
	}

	private Bound_lpContext bound_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bound_lpContext _localctx = new Bound_lpContext(_ctx, _parentState);
		Bound_lpContext _prevctx = _localctx;
		int _startState = 286;
		enterRecursionRule(_localctx, 286, RULE_bound_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1260);
			bounds();
			}
			_ctx.stop = _input.LT(-1);
			setState(1267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bound_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bound_lp);
					setState(1262);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1263);
					match(TK_COMMA);
					setState(1264);
					bounds();
					}
					} 
				}
				setState(1269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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

	public static class BoundsContext extends ParserRuleContext {
		public List<BoundContext> bound() {
			return getRuleContexts(BoundContext.class);
		}
		public BoundContext bound(int i) {
			return getRuleContext(BoundContext.class,i);
		}
		public TerminalNode TK_COLON() { return getToken(SRParser.TK_COLON, 0); }
		public BoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitBounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoundsContext bounds() throws RecognitionException {
		BoundsContext _localctx = new BoundsContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_bounds);
		try {
			setState(1275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1270);
				bound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1271);
				bound();
				setState(1272);
				match(TK_COLON);
				setState(1273);
				bound();
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

	public static class BoundContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_ASTER() { return getToken(SRParser.TK_ASTER, 0); }
		public BoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoundContext bound() throws RecognitionException {
		BoundContext _localctx = new BoundContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_bound);
		try {
			setState(1279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NOOP:
			case TK_NULL:
			case TK_BOOL:
			case TK_CHAR:
			case TK_CREATE:
			case TK_FALSE:
			case TK_TRUE:
			case TK_FILE:
			case TK_HIGH:
			case TK_INT:
			case TK_LOW:
			case TK_NEW:
			case TK_NOT:
			case TK_REAL:
			case TK_STRING:
			case TK_INCR:
			case TK_PLUS:
			case TK_DECR:
			case TK_MINUS:
			case TK_LPAREN:
			case TK_ADDR:
			case TK_QMARK:
			case TK_ID:
			case TK_NUM:
			case TK_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1277);
				expr(0);
				}
				break;
			case TK_ASTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1278);
				match(TK_ASTER);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return spec_stmt_ls_sempred((Spec_stmt_lsContext)_localctx, predIndex);
		case 14:
			return body_stmt_ls_sempred((Body_stmt_lsContext)_localctx, predIndex);
		case 20:
			return import_list_sempred((Import_listContext)_localctx, predIndex);
		case 24:
			return oper_def_lp_sempred((Oper_def_lpContext)_localctx, predIndex);
		case 28:
			return sem_def_lp_sempred((Sem_def_lpContext)_localctx, predIndex);
		case 54:
			return var_def_lp_sempred((Var_def_lpContext)_localctx, predIndex);
		case 76:
			return block_items_sempred((Block_itemsContext)_localctx, predIndex);
		case 96:
			return guarded_cmd_lp_sempred((Guarded_cmd_lpContext)_localctx, predIndex);
		case 101:
			return in_cmd_lp_sempred((In_cmd_lpContext)_localctx, predIndex);
		case 108:
			return concurrent_cmd_lp_sempred((Concurrent_cmd_lpContext)_localctx, predIndex);
		case 110:
			return separator_opt_sempred((Separator_optContext)_localctx, predIndex);
		case 114:
			return quantifier_lp_sempred((Quantifier_lpContext)_localctx, predIndex);
		case 119:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 126:
			return expr_lp_sempred((Expr_lpContext)_localctx, predIndex);
		case 128:
			return constr_item_lp_sempred((Constr_item_lpContext)_localctx, predIndex);
		case 137:
			return id_lp_sempred((Id_lpContext)_localctx, predIndex);
		case 138:
			return id_subs_lp_sempred((Id_subs_lpContext)_localctx, predIndex);
		case 143:
			return bound_lp_sempred((Bound_lpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean spec_stmt_ls_sempred(Spec_stmt_lsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean body_stmt_ls_sempred(Body_stmt_lsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean import_list_sempred(Import_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean oper_def_lp_sempred(Oper_def_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean sem_def_lp_sempred(Sem_def_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean var_def_lp_sempred(Var_def_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean block_items_sempred(Block_itemsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean guarded_cmd_lp_sempred(Guarded_cmd_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean in_cmd_lp_sempred(In_cmd_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean concurrent_cmd_lp_sempred(Concurrent_cmd_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean separator_opt_sempred(Separator_optContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean quantifier_lp_sempred(Quantifier_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 32);
		case 13:
			return precpred(_ctx, 31);
		case 14:
			return precpred(_ctx, 30);
		case 15:
			return precpred(_ctx, 29);
		case 16:
			return precpred(_ctx, 28);
		case 17:
			return precpred(_ctx, 27);
		case 18:
			return precpred(_ctx, 26);
		case 19:
			return precpred(_ctx, 25);
		case 20:
			return precpred(_ctx, 24);
		case 21:
			return precpred(_ctx, 23);
		case 22:
			return precpred(_ctx, 22);
		case 23:
			return precpred(_ctx, 21);
		case 24:
			return precpred(_ctx, 20);
		case 25:
			return precpred(_ctx, 19);
		case 26:
			return precpred(_ctx, 18);
		case 27:
			return precpred(_ctx, 17);
		case 28:
			return precpred(_ctx, 16);
		case 29:
			return precpred(_ctx, 15);
		case 30:
			return precpred(_ctx, 14);
		case 31:
			return precpred(_ctx, 13);
		case 32:
			return precpred(_ctx, 12);
		case 33:
			return precpred(_ctx, 11);
		case 34:
			return precpred(_ctx, 10);
		case 35:
			return precpred(_ctx, 9);
		case 36:
			return precpred(_ctx, 8);
		case 37:
			return precpred(_ctx, 7);
		case 38:
			return precpred(_ctx, 6);
		case 39:
			return precpred(_ctx, 5);
		case 40:
			return precpred(_ctx, 4);
		case 41:
			return precpred(_ctx, 3);
		case 42:
			return precpred(_ctx, 2);
		case 43:
			return precpred(_ctx, 1);
		case 44:
			return precpred(_ctx, 41);
		case 45:
			return precpred(_ctx, 38);
		case 46:
			return precpred(_ctx, 37);
		case 47:
			return precpred(_ctx, 36);
		case 48:
			return precpred(_ctx, 35);
		case 49:
			return precpred(_ctx, 34);
		}
		return true;
	}
	private boolean expr_lp_sempred(Expr_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean constr_item_lp_sempred(Constr_item_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean id_lp_sempred(Id_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean id_subs_lp_sempred(Id_subs_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 53:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean bound_lp_sempred(Bound_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 54:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0089\u0504\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\3\2\6\2\u0128\n\2\r\2\16\2\u0129\3\3\3\3\3\3\5\3\u012f"+
		"\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u014d\n\t\3\n\3\n\5"+
		"\n\u0151\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u015c\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u0164\n\16\f\16\16\16\u0167\13\16\3\17"+
		"\3\17\3\17\5\17\u016c\n\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0174\n"+
		"\20\f\20\16\20\u0177\13\20\3\21\3\21\3\21\3\21\5\21\u017d\n\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u0185\n\22\3\23\3\23\3\23\5\23\u018a\n\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0198"+
		"\n\26\f\26\16\26\u019b\13\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\7\32\u01aa\n\32\f\32\16\32\u01ad\13\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\5\33\u01b6\n\33\3\34\3\34\5\34\u01ba\n\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u01c5\n\36\f\36\16"+
		"\36\u01c8\13\36\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3!\5!\u01d3\n!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3"+
		"%\3&\3&\5&\u01ef\n&\3\'\3\'\3\'\3\'\3\'\3(\3(\5(\u01f8\n(\3)\3)\3)\3*"+
		"\3*\3*\3*\3+\3+\5+\u0203\n+\3,\3,\3,\3,\3,\3,\3,\3,\5,\u020d\n,\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\5-\u0217\n-\3.\3.\3.\3.\3.\5.\u021e\n.\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\5/\u022a\n/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\5\62\u0236\n\62\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u023e\n"+
		"\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\5\65\u024a\n\65"+
		"\3\66\3\66\3\66\3\67\3\67\38\38\38\38\38\38\78\u0257\n8\f8\168\u025a\13"+
		"8\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0269\n:\3;\3;\3;\3;\5;\u026f"+
		"\n;\3<\3<\3<\3<\3<\3<\3<\3<\5<\u0279\n<\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>"+
		"\3>\3>\5>\u0287\n>\3?\3?\5?\u028b\n?\3@\3@\3@\3@\3@\3A\3A\3A\3A\5A\u0296"+
		"\nA\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\5D\u02aa\nD"+
		"\3E\3E\3F\3F\3F\3G\3G\3G\3G\3G\5G\u02b6\nG\3H\3H\3H\3H\3H\3I\3I\3I\3J"+
		"\3J\5J\u02c2\nJ\3K\3K\3K\3K\3K\5K\u02c9\nK\3L\3L\3L\3L\3L\3L\3L\3L\5L"+
		"\u02d3\nL\3M\3M\3N\3N\3N\3N\3N\3N\7N\u02dd\nN\fN\16N\u02e0\13N\3O\3O\3"+
		"O\3O\3O\5O\u02e7\nO\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3"+
		"P\3P\3P\5P\u02fc\nP\3Q\3Q\3R\3R\3R\3S\3S\3S\3S\3S\5S\u0308\nS\3T\3T\3"+
		"U\3U\3V\3V\3W\3W\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3"+
		"\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3^\3^\3^\3_\3_\3_\3_\3`\3`\3`\3`\3`\3a"+
		"\3a\3a\3a\3a\3b\3b\3b\3b\3b\3b\7b\u0343\nb\fb\16b\u0346\13b\3c\3c\3c\3"+
		"c\3d\3d\3d\3d\3d\5d\u0351\nd\3e\3e\3e\3e\3e\3e\3f\3f\3f\3f\3f\3g\3g\3"+
		"g\3g\3g\3g\7g\u0364\ng\fg\16g\u0367\13g\3h\3h\3h\3h\3h\3h\3h\3i\3i\3i"+
		"\3j\3j\3j\3j\5j\u0377\nj\3k\3k\3k\3k\3k\5k\u037e\nk\3l\3l\3l\5l\u0383"+
		"\nl\3m\3m\3m\3m\3n\3n\3n\3n\3n\3n\7n\u038f\nn\fn\16n\u0392\13n\3o\3o\3"+
		"o\3o\3o\3p\3p\3p\7p\u039c\np\fp\16p\u039f\13p\3q\3q\3q\5q\u03a4\nq\3r"+
		"\3r\3r\5r\u03a9\nr\3s\3s\3s\3s\3s\5s\u03b0\ns\3t\3t\3t\3t\3t\3t\7t\u03b8"+
		"\nt\ft\16t\u03bb\13t\3u\3u\3u\3u\3u\3u\3u\3u\3v\3v\3w\3w\3w\5w\u03ca\n"+
		"w\3x\3x\3x\5x\u03cf\nx\3y\3y\3y\3y\3y\3y\5y\u03d7\ny\3y\3y\3y\3y\3y\3"+
		"y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3"+
		"y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3"+
		"y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3"+
		"y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3"+
		"y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\7y\u0449\ny\fy\16y\u044c\13"+
		"y\3z\3z\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3"+
		"{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\5{\u0473\n{\3|\3|\3|\3|\3"+
		"|\5|\u047a\n|\3}\3}\3}\3}\3~\3~\3~\3~\3\177\3\177\5\177\u0486\n\177\3"+
		"\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\7\u0080\u048e\n\u0080\f"+
		"\u0080\16\u0080\u0491\13\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\7\u0082\u049d\n\u0082\f\u0082"+
		"\16\u0082\u04a0\13\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\5\u0083\u04a8\n\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085"+
		"\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\5\u0087\u04b6\n\u0087"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u04bc\n\u0088\3\u0089\3\u0089"+
		"\3\u0089\3\u008a\3\u008a\5\u008a\u04c3\n\u008a\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\7\u008b\u04cb\n\u008b\f\u008b\16\u008b\u04ce"+
		"\13\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\7\u008c\u04d6"+
		"\n\u008c\f\u008c\16\u008c\u04d9\13\u008c\3\u008d\3\u008d\3\u008d\5\u008d"+
		"\u04de\n\u008d\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u04e4\n\u008e\3"+
		"\u008f\3\u008f\5\u008f\u04e8\n\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3"+
		"\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\7\u0091\u04f4\n\u0091\f"+
		"\u0091\16\u0091\u04f7\13\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\5\u0092\u04fe\n\u0092\3\u0093\3\u0093\5\u0093\u0502\n\u0093\3\u0093\2"+
		"\24\32\36*\62:n\u009a\u00c2\u00cc\u00da\u00de\u00e6\u00f0\u00fe\u0102"+
		"\u0114\u0116\u0120\u0094\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\2\t\4\2$$AA\4\2\34\34"+
		"\64\64\4\2\22\22OO\7\2\f\f\20\20!!**;;\4\2\26\26KK\5\2\3\4\36\37\u0084"+
		"\u0085\4\2PP\u0083\u0083\2\u0527\2\u0127\3\2\2\2\4\u012e\3\2\2\2\6\u0130"+
		"\3\2\2\2\b\u0134\3\2\2\2\n\u0138\3\2\2\2\f\u013b\3\2\2\2\16\u013e\3\2"+
		"\2\2\20\u014c\3\2\2\2\22\u0150\3\2\2\2\24\u0152\3\2\2\2\26\u0154\3\2\2"+
		"\2\30\u015b\3\2\2\2\32\u015d\3\2\2\2\34\u016b\3\2\2\2\36\u016d\3\2\2\2"+
		" \u017c\3\2\2\2\"\u0184\3\2\2\2$\u0189\3\2\2\2&\u018b\3\2\2\2(\u018e\3"+
		"\2\2\2*\u0191\3\2\2\2,\u019c\3\2\2\2.\u019e\3\2\2\2\60\u01a1\3\2\2\2\62"+
		"\u01a3\3\2\2\2\64\u01b5\3\2\2\2\66\u01b9\3\2\2\28\u01bb\3\2\2\2:\u01be"+
		"\3\2\2\2<\u01c9\3\2\2\2>\u01cd\3\2\2\2@\u01d2\3\2\2\2B\u01d4\3\2\2\2D"+
		"\u01da\3\2\2\2F\u01e0\3\2\2\2H\u01e7\3\2\2\2J\u01ee\3\2\2\2L\u01f0\3\2"+
		"\2\2N\u01f7\3\2\2\2P\u01f9\3\2\2\2R\u01fc\3\2\2\2T\u0202\3\2\2\2V\u020c"+
		"\3\2\2\2X\u0216\3\2\2\2Z\u021d\3\2\2\2\\\u0229\3\2\2\2^\u022b\3\2\2\2"+
		"`\u022d\3\2\2\2b\u0235\3\2\2\2d\u023d\3\2\2\2f\u023f\3\2\2\2h\u0249\3"+
		"\2\2\2j\u024b\3\2\2\2l\u024e\3\2\2\2n\u0250\3\2\2\2p\u025b\3\2\2\2r\u0268"+
		"\3\2\2\2t\u026e\3\2\2\2v\u0278\3\2\2\2x\u027a\3\2\2\2z\u0286\3\2\2\2|"+
		"\u028a\3\2\2\2~\u028c\3\2\2\2\u0080\u0295\3\2\2\2\u0082\u0297\3\2\2\2"+
		"\u0084\u029c\3\2\2\2\u0086\u02a9\3\2\2\2\u0088\u02ab\3\2\2\2\u008a\u02ad"+
		"\3\2\2\2\u008c\u02b5\3\2\2\2\u008e\u02b7\3\2\2\2\u0090\u02bc\3\2\2\2\u0092"+
		"\u02c1\3\2\2\2\u0094\u02c8\3\2\2\2\u0096\u02d2\3\2\2\2\u0098\u02d4\3\2"+
		"\2\2\u009a\u02d6\3\2\2\2\u009c\u02e6\3\2\2\2\u009e\u02fb\3\2\2\2\u00a0"+
		"\u02fd\3\2\2\2\u00a2\u02ff\3\2\2\2\u00a4\u0307\3\2\2\2\u00a6\u0309\3\2"+
		"\2\2\u00a8\u030b\3\2\2\2\u00aa\u030d\3\2\2\2\u00ac\u030f\3\2\2\2\u00ae"+
		"\u0311\3\2\2\2\u00b0\u0315\3\2\2\2\u00b2\u0319\3\2\2\2\u00b4\u031d\3\2"+
		"\2\2\u00b6\u0322\3\2\2\2\u00b8\u0327\3\2\2\2\u00ba\u032b\3\2\2\2\u00bc"+
		"\u032e\3\2\2\2\u00be\u0332\3\2\2\2\u00c0\u0337\3\2\2\2\u00c2\u033c\3\2"+
		"\2\2\u00c4\u0347\3\2\2\2\u00c6\u0350\3\2\2\2\u00c8\u0352\3\2\2\2\u00ca"+
		"\u0358\3\2\2\2\u00cc\u035d\3\2\2\2\u00ce\u0368\3\2\2\2\u00d0\u036f\3\2"+
		"\2\2\u00d2\u0376\3\2\2\2\u00d4\u037d\3\2\2\2\u00d6\u0382\3\2\2\2\u00d8"+
		"\u0384\3\2\2\2\u00da\u0388\3\2\2\2\u00dc\u0393\3\2\2\2\u00de\u0398\3\2"+
		"\2\2\u00e0\u03a3\3\2\2\2\u00e2\u03a8\3\2\2\2\u00e4\u03af\3\2\2\2\u00e6"+
		"\u03b1\3\2\2\2\u00e8\u03bc\3\2\2\2\u00ea\u03c4\3\2\2\2\u00ec\u03c9\3\2"+
		"\2\2\u00ee\u03ce\3\2\2\2\u00f0\u03d6\3\2\2\2\u00f2\u044d\3\2\2\2\u00f4"+
		"\u0472\3\2\2\2\u00f6\u0479\3\2\2\2\u00f8\u047b\3\2\2\2\u00fa\u047f\3\2"+
		"\2\2\u00fc\u0485\3\2\2\2\u00fe\u0487\3\2\2\2\u0100\u0492\3\2\2\2\u0102"+
		"\u0496\3\2\2\2\u0104\u04a7\3\2\2\2\u0106\u04a9\3\2\2\2\u0108\u04ad\3\2"+
		"\2\2\u010a\u04b0\3\2\2\2\u010c\u04b5\3\2\2\2\u010e\u04bb\3\2\2\2\u0110"+
		"\u04bd\3\2\2\2\u0112\u04c2\3\2\2\2\u0114\u04c4\3\2\2\2\u0116\u04cf\3\2"+
		"\2\2\u0118\u04dd\3\2\2\2\u011a\u04e3\3\2\2\2\u011c\u04e7\3\2\2\2\u011e"+
		"\u04e9\3\2\2\2\u0120\u04ed\3\2\2\2\u0122\u04fd\3\2\2\2\u0124\u0501\3\2"+
		"\2\2\u0126\u0128\5\4\3\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\3\3\2\2\2\u012b\u012f\5\6\4\2"+
		"\u012c\u012f\5\b\5\2\u012d\u012f\5\26\f\2\u012e\u012b\3\2\2\2\u012e\u012c"+
		"\3\2\2\2\u012e\u012d\3\2\2\2\u012f\5\3\2\2\2\u0130\u0131\5\f\7\2\u0131"+
		"\u0132\5\32\16\2\u0132\u0133\5\20\t\2\u0133\7\3\2\2\2\u0134\u0135\5\n"+
		"\6\2\u0135\u0136\5\36\20\2\u0136\u0137\5\u0110\u0089\2\u0137\t\3\2\2\2"+
		"\u0138\u0139\5\f\7\2\u0139\u013a\5\24\13\2\u013a\13\3\2\2\2\u013b\u013c"+
		"\5\16\b\2\u013c\u013d\7\u0083\2\2\u013d\r\3\2\2\2\u013e\u013f\t\2\2\2"+
		"\u013f\17\3\2\2\2\u0140\u014d\5\u0110\u0089\2\u0141\u0142\7\13\2\2\u0142"+
		"\u0143\7\u0083\2\2\u0143\u0144\5\22\n\2\u0144\u0145\5\36\20\2\u0145\u0146"+
		"\5\u0110\u0089\2\u0146\u014d\3\2\2\2\u0147\u0148\7\13\2\2\u0148\u0149"+
		"\7\u0083\2\2\u0149\u014a\5\22\n\2\u014a\u014b\7F\2\2\u014b\u014d\3\2\2"+
		"\2\u014c\u0140\3\2\2\2\u014c\u0141\3\2\2\2\u014c\u0147\3\2\2\2\u014d\21"+
		"\3\2\2\2\u014e\u0151\5\24\13\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2\2\2"+
		"\u0150\u014f\3\2\2\2\u0151\23\3\2\2\2\u0152\u0153\5R*\2\u0153\25\3\2\2"+
		"\2\u0154\u0155\7\13\2\2\u0155\u0156\7\u0083\2\2\u0156\u0157\5\36\20\2"+
		"\u0157\u0158\5\u0110\u0089\2\u0158\27\3\2\2\2\u0159\u015c\3\2\2\2\u015a"+
		"\u015c\7\u0083\2\2\u015b\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015c\31\3"+
		"\2\2\2\u015d\u015e\b\16\1\2\u015e\u015f\5\34\17\2\u015f\u0165\3\2\2\2"+
		"\u0160\u0161\f\3\2\2\u0161\u0162\7\u0082\2\2\u0162\u0164\5\34\17\2\u0163"+
		"\u0160\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2"+
		"\2\2\u0166\33\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u016c\5$\23\2\u0169\u016c"+
		"\5(\25\2\u016a\u016c\5\"\22\2\u016b\u0168\3\2\2\2\u016b\u0169\3\2\2\2"+
		"\u016b\u016a\3\2\2\2\u016c\35\3\2\2\2\u016d\u016e\b\20\1\2\u016e\u016f"+
		"\5 \21\2\u016f\u0175\3\2\2\2\u0170\u0171\f\3\2\2\u0171\u0172\7\u0082\2"+
		"\2\u0172\u0174\5 \21\2\u0173\u0170\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173"+
		"\3\2\2\2\u0175\u0176\3\2\2\2\u0176\37\3\2\2\2\u0177\u0175\3\2\2\2\u0178"+
		"\u017d\5$\23\2\u0179\u017d\5\u00f0y\2\u017a\u017d\5\"\22\2\u017b\u017d"+
		"\5(\25\2\u017c\u0178\3\2\2\2\u017c\u0179\3\2\2\2\u017c\u017a\3\2\2\2\u017c"+
		"\u017b\3\2\2\2\u017d!\3\2\2\2\u017e\u0185\5\u009eP\2\u017f\u0185\5B\""+
		"\2\u0180\u0185\5F$\2\u0181\u0185\5D#\2\u0182\u0185\5H%\2\u0183\u0185\5"+
		"L\'\2\u0184\u017e\3\2\2\2\u0184\u017f\3\2\2\2\u0184\u0180\3\2\2\2\u0184"+
		"\u0181\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u0185#\3\2\2\2"+
		"\u0186\u018a\3\2\2\2\u0187\u018a\5d\63\2\u0188\u018a\5&\24\2\u0189\u0186"+
		"\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u018a%\3\2\2\2\u018b"+
		"\u018c\7\'\2\2\u018c\u018d\5*\26\2\u018d\'\3\2\2\2\u018e\u018f\7\33\2"+
		"\2\u018f\u0190\5*\26\2\u0190)\3\2\2\2\u0191\u0192\b\26\1\2\u0192\u0193"+
		"\5,\27\2\u0193\u0199\3\2\2\2\u0194\u0195\f\3\2\2\u0195\u0196\7R\2\2\u0196"+
		"\u0198\5,\27\2\u0197\u0194\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2"+
		"\2\2\u0199\u019a\3\2\2\2\u019a+\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d"+
		"\7\u0083\2\2\u019d-\3\2\2\2\u019e\u019f\5\60\31\2\u019f\u01a0\5\62\32"+
		"\2\u01a0/\3\2\2\2\u01a1\u01a2\t\3\2\2\u01a2\61\3\2\2\2\u01a3\u01a4\b\32"+
		"\1\2\u01a4\u01a5\5\64\33\2\u01a5\u01ab\3\2\2\2\u01a6\u01a7\f\3\2\2\u01a7"+
		"\u01a8\7R\2\2\u01a8\u01aa\5\64\33\2\u01a9\u01a6\3\2\2\2\u01aa\u01ad\3"+
		"\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\63\3\2\2\2\u01ad"+
		"\u01ab\3\2\2\2\u01ae\u01af\5\u0116\u008c\2\u01af\u01b0\5\u0090I\2\u01b0"+
		"\u01b6\3\2\2\2\u01b1\u01b2\5\u0116\u008c\2\u01b2\u01b3\5\66\34\2\u01b3"+
		"\u01b4\5\u010e\u0088\2\u01b4\u01b6\3\2\2\2\u01b5\u01ae\3\2\2\2\u01b5\u01b1"+
		"\3\2\2\2\u01b6\65\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01ba\7S\2\2\u01b9"+
		"\u01b7\3\2\2\2\u01b9\u01b8\3\2\2\2\u01ba\67\3\2\2\2\u01bb\u01bc\7D\2\2"+
		"\u01bc\u01bd\5:\36\2\u01bd9\3\2\2\2\u01be\u01bf\b\36\1\2\u01bf\u01c0\5"+
		"<\37\2\u01c0\u01c6\3\2\2\2\u01c1\u01c2\f\3\2\2\u01c2\u01c3\7R\2\2\u01c3"+
		"\u01c5\5<\37\2\u01c4\u01c1\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2"+
		"\2\2\u01c6\u01c7\3\2\2\2\u01c7;\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca"+
		"\5\u0118\u008d\2\u01ca\u01cb\5> \2\u01cb\u01cc\5@!\2\u01cc=\3\2\2\2\u01cd"+
		"\u01ce\5^\60\2\u01ce?\3\2\2\2\u01cf\u01d3\3\2\2\2\u01d0\u01d1\7a\2\2\u01d1"+
		"\u01d3\5\u00f0y\2\u01d2\u01cf\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3A\3\2\2"+
		"\2\u01d4\u01d5\7\67\2\2\u01d5\u01d6\7\u0083\2\2\u01d6\u01d7\5`\61\2\u01d7"+
		"\u01d8\5\u0098M\2\u01d8\u01d9\5\u0110\u0089\2\u01d9C\3\2\2\2\u01da\u01db"+
		"\78\2\2\u01db\u01dc\7\u0083\2\2\u01dc\u01dd\5P)\2\u01dd\u01de\5\u0098"+
		"M\2\u01de\u01df\5\u0110\u0089\2\u01dfE\3\2\2\2\u01e0\u01e1\79\2\2\u01e1"+
		"\u01e2\7\u0083\2\2\u01e2\u01e3\5^\60\2\u01e3\u01e4\5\u00e4s\2\u01e4\u01e5"+
		"\5\u0098M\2\u01e5\u01e6\5\u0110\u0089\2\u01e6G\3\2\2\2\u01e7\u01e8\7)"+
		"\2\2\u01e8\u01e9\5\u0098M\2\u01e9\u01ea\7\30\2\2\u01ea\u01eb\5J&\2\u01eb"+
		"I\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01ef\7)\2\2\u01ee\u01ec\3\2\2\2\u01ee"+
		"\u01ed\3\2\2\2\u01efK\3\2\2\2\u01f0\u01f1\7\"\2\2\u01f1\u01f2\5\u0098"+
		"M\2\u01f2\u01f3\7\30\2\2\u01f3\u01f4\5N(\2\u01f4M\3\2\2\2\u01f5\u01f8"+
		"\3\2\2\2\u01f6\u01f8\7\"\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8"+
		"O\3\2\2\2\u01f9\u01fa\5R*\2\u01fa\u01fb\5\\/\2\u01fbQ\3\2\2\2\u01fc\u01fd"+
		"\7]\2\2\u01fd\u01fe\5T+\2\u01fe\u01ff\7^\2\2\u01ffS\3\2\2\2\u0200\u0203"+
		"\3\2\2\2\u0201\u0203\5V,\2\u0202\u0200\3\2\2\2\u0202\u0201\3\2\2\2\u0203"+
		"U\3\2\2\2\u0204\u020d\5X-\2\u0205\u0206\5X-\2\u0206\u0207\7\u0082\2\2"+
		"\u0207\u020d\3\2\2\2\u0208\u0209\5X-\2\u0209\u020a\7\u0082\2\2\u020a\u020b"+
		"\5V,\2\u020b\u020d\3\2\2\2\u020c\u0204\3\2\2\2\u020c\u0205\3\2\2\2\u020c"+
		"\u0208\3\2\2\2\u020dW\3\2\2\2\u020e\u020f\5Z.\2\u020f\u0210\5t;\2\u0210"+
		"\u0217\3\2\2\2\u0211\u0212\5Z.\2\u0212\u0213\5\u0116\u008c\2\u0213\u0214"+
		"\7S\2\2\u0214\u0215\5t;\2\u0215\u0217\3\2\2\2\u0216\u020e\3\2\2\2\u0216"+
		"\u0211\3\2\2\2\u0217Y\3\2\2\2\u0218\u021e\3\2\2\2\u0219\u021e\7N\2\2\u021a"+
		"\u021e\7O\2\2\u021b\u021e\7@\2\2\u021c\u021e\7>\2\2\u021d\u0218\3\2\2"+
		"\2\u021d\u0219\3\2\2\2\u021d\u021a\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021c"+
		"\3\2\2\2\u021e[\3\2\2\2\u021f\u022a\5^\60\2\u0220\u0221\7C\2\2\u0221\u022a"+
		"\5t;\2\u0222\u0223\7C\2\2\u0223\u0224\5\u0118\u008d\2\u0224\u0225\7S\2"+
		"\2\u0225\u0226\5t;\2\u0226\u022a\3\2\2\2\u0227\u0228\7C\2\2\u0228\u022a"+
		"\7\u0083\2\2\u0229\u021f\3\2\2\2\u0229\u0220\3\2\2\2\u0229\u0222\3\2\2"+
		"\2\u0229\u0227\3\2\2\2\u022a]\3\2\2\2\u022b\u022c\3\2\2\2\u022c_\3\2\2"+
		"\2\u022d\u022e\7]\2\2\u022e\u022f\5\u0112\u008a\2\u022f\u0230\7^\2\2\u0230"+
		"\u0231\5b\62\2\u0231a\3\2\2\2\u0232\u0236\3\2\2\2\u0233\u0234\7C\2\2\u0234"+
		"\u0236\7\u0083\2\2\u0235\u0232\3\2\2\2\u0235\u0233\3\2\2\2\u0236c\3\2"+
		"\2\2\u0237\u023e\3\2\2\2\u0238\u023e\5f\64\2\u0239\u023e\5j\66\2\u023a"+
		"\u023e\5\u008eH\2\u023b\u023e\58\35\2\u023c\u023e\5.\30\2\u023d\u0237"+
		"\3\2\2\2\u023d\u0238\3\2\2\2\u023d\u0239\3\2\2\2\u023d\u023a\3\2\2\2\u023d"+
		"\u023b\3\2\2\2\u023d\u023c\3\2\2\2\u023ee\3\2\2\2\u023f\u0240\7L\2\2\u0240"+
		"\u0241\7\u0083\2\2\u0241\u0242\7T\2\2\u0242\u0243\5t;\2\u0243\u0244\5"+
		"h\65\2\u0244g\3\2\2\2\u0245\u024a\3\2\2\2\u0246\u0247\7q\2\2\u0247\u0248"+
		"\7\u0083\2\2\u0248\u024a\7r\2\2\u0249\u0245\3\2\2\2\u0249\u0246\3\2\2"+
		"\2\u024ai\3\2\2\2\u024b\u024c\5l\67\2\u024c\u024d\5n8\2\u024dk\3\2\2\2"+
		"\u024e\u024f\t\4\2\2\u024fm\3\2\2\2\u0250\u0251\b8\1\2\u0251\u0252\5p"+
		"9\2\u0252\u0258\3\2\2\2\u0253\u0254\f\3\2\2\u0254\u0255\7R\2\2\u0255\u0257"+
		"\5p9\2\u0256\u0253\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258"+
		"\u0259\3\2\2\2\u0259o\3\2\2\2\u025a\u0258\3\2\2\2\u025b\u025c\5\u0116"+
		"\u008c\2\u025c\u025d\5r:\2\u025dq\3\2\2\2\u025e\u025f\7S\2\2\u025f\u0269"+
		"\5t;\2\u0260\u0261\7S\2\2\u0261\u0262\5t;\2\u0262\u0263\7a\2\2\u0263\u0264"+
		"\5\u00f0y\2\u0264\u0269\3\2\2\2\u0265\u0266\7a\2\2\u0266\u0269\5\u00f0"+
		"y\2\u0267\u0269\7\u0082\2\2\u0268\u025e\3\2\2\2\u0268\u0260\3\2\2\2\u0268"+
		"\u0265\3\2\2\2\u0268\u0267\3\2\2\2\u0269s\3\2\2\2\u026a\u026b\5\u011a"+
		"\u008e\2\u026b\u026c\5v<\2\u026c\u026f\3\2\2\2\u026d\u026f\5v<\2\u026e"+
		"\u026a\3\2\2\2\u026e\u026d\3\2\2\2\u026fu\3\2\2\2\u0270\u0279\5x=\2\u0271"+
		"\u0279\5z>\2\u0272\u0279\5~@\2\u0273\u0279\5\u0080A\2\u0274\u0279\5\u0082"+
		"B\2\u0275\u0279\5\u0084C\2\u0276\u0279\5\u008aF\2\u0277\u0279\5\u010e"+
		"\u0088\2\u0278\u0270\3\2\2\2\u0278\u0271\3\2\2\2\u0278\u0272\3\2\2\2\u0278"+
		"\u0273\3\2\2\2\u0278\u0274\3\2\2\2\u0278\u0275\3\2\2\2\u0278\u0276\3\2"+
		"\2\2\u0278\u0277\3\2\2\2\u0279w\3\2\2\2\u027a\u027b\t\5\2\2\u027by\3\2"+
		"\2\2\u027c\u027d\7J\2\2\u027d\u027e\7c\2\2\u027e\u027f\5|?\2\u027f\u0280"+
		"\7d\2\2\u0280\u0287\3\2\2\2\u0281\u0282\7J\2\2\u0282\u0283\7]\2\2\u0283"+
		"\u0284\5|?\2\u0284\u0285\7^\2\2\u0285\u0287\3\2\2\2\u0286\u027c\3\2\2"+
		"\2\u0286\u0281\3\2\2\2\u0287{\3\2\2\2\u0288\u028b\5\u00f0y\2\u0289\u028b"+
		"\7Y\2\2\u028a\u0288\3\2\2\2\u028a\u0289\3\2\2\2\u028b}\3\2\2\2\u028c\u028d"+
		"\7\31\2\2\u028d\u028e\7]\2\2\u028e\u028f\5\u0114\u008b\2\u028f\u0290\7"+
		"^\2\2\u0290\177\3\2\2\2\u0291\u0292\7:\2\2\u0292\u0296\5t;\2\u0293\u0294"+
		"\7:\2\2\u0294\u0296\7\t\2\2\u0295\u0291\3\2\2\2\u0295\u0293\3\2\2\2\u0296"+
		"\u0081\3\2\2\2\u0297\u0298\7<\2\2\u0298\u0299\7]\2\2\u0299\u029a\5\u0086"+
		"D\2\u029a\u029b\7^\2\2\u029b\u0083\3\2\2\2\u029c\u029d\7M\2\2\u029d\u029e"+
		"\7]\2\2\u029e\u029f\5\u0086D\2\u029f\u02a0\7^\2\2\u02a0\u0085\3\2\2\2"+
		"\u02a1\u02aa\5\u0088E\2\u02a2\u02a3\5\u0088E\2\u02a3\u02a4\7\u0082\2\2"+
		"\u02a4\u02aa\3\2\2\2\u02a5\u02a6\5\u0088E\2\u02a6\u02a7\7\u0082\2\2\u02a7"+
		"\u02a8\5\u0086D\2\u02a8\u02aa\3\2\2\2\u02a9\u02a1\3\2\2\2\u02a9\u02a2"+
		"\3\2\2\2\u02a9\u02a5\3\2\2\2\u02aa\u0087\3\2\2\2\u02ab\u02ac\5n8\2\u02ac"+
		"\u0089\3\2\2\2\u02ad\u02ae\7\17\2\2\u02ae\u02af\5\u008cG\2\u02af\u008b"+
		"\3\2\2\2\u02b0\u02b6\5\u010e\u0088\2\u02b1\u02b6\5\u0090I\2\u02b2\u02b3"+
		"\7D\2\2\u02b3\u02b6\5> \2\u02b4\u02b6\7P\2\2\u02b5\u02b0\3\2\2\2\u02b5"+
		"\u02b1\3\2\2\2\u02b5\u02b2\3\2\2\2\u02b5\u02b4\3\2\2\2\u02b6\u008d\3\2"+
		"\2\2\u02b7\u02b8\7\65\2\2\u02b8\u02b9\7\u0083\2\2\u02b9\u02ba\5\u0092"+
		"J\2\u02ba\u02bb\5\u0090I\2\u02bb\u008f\3\2\2\2\u02bc\u02bd\5P)\2\u02bd"+
		"\u02be\5\u0094K\2\u02be\u0091\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02c2"+
		"\7T\2\2\u02c1\u02bf\3\2\2\2\u02c1\u02c0\3\2\2\2\u02c2\u0093\3\2\2\2\u02c3"+
		"\u02c9\3\2\2\2\u02c4\u02c5\7q\2\2\u02c5\u02c6\5\u0096L\2\u02c6\u02c7\7"+
		"r\2\2\u02c7\u02c9\3\2\2\2\u02c8\u02c3\3\2\2\2\u02c8\u02c4\3\2\2\2\u02c9"+
		"\u0095\3\2\2\2\u02ca\u02d3\7\16\2\2\u02cb\u02d3\7E\2\2\u02cc\u02cd\7\16"+
		"\2\2\u02cd\u02ce\7R\2\2\u02ce\u02d3\7E\2\2\u02cf\u02d0\7E\2\2\u02d0\u02d1"+
		"\7R\2\2\u02d1\u02d3\7\16\2\2\u02d2\u02ca\3\2\2\2\u02d2\u02cb\3\2\2\2\u02d2"+
		"\u02cc\3\2\2\2\u02d2\u02cf\3\2\2\2\u02d3\u0097\3\2\2\2\u02d4\u02d5\5\u009a"+
		"N\2\u02d5\u0099\3\2\2\2\u02d6\u02d7\bN\1\2\u02d7\u02d8\5\u009cO\2\u02d8"+
		"\u02de\3\2\2\2\u02d9\u02da\f\3\2\2\u02da\u02db\7\u0082\2\2\u02db\u02dd"+
		"\5\u009cO\2\u02dc\u02d9\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de\u02dc\3\2\2"+
		"\2\u02de\u02df\3\2\2\2\u02df\u009b\3\2\2\2\u02e0\u02de\3\2\2\2\u02e1\u02e7"+
		"\3\2\2\2\u02e2\u02e7\5d\63\2\u02e3\u02e7\5\u009eP\2\u02e4\u02e7\5\u00f0"+
		"y\2\u02e5\u02e7\5&\24\2\u02e6\u02e1\3\2\2\2\u02e6\u02e2\3\2\2\2\u02e6"+
		"\u02e3\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e5\3\2\2\2\u02e7\u009d\3\2"+
		"\2\2\u02e8\u02fc\5\u00a0Q\2\u02e9\u02fc\5\u00a2R\2\u02ea\u02fc\5\u00a6"+
		"T\2\u02eb\u02fc\5\u00a8U\2\u02ec\u02fc\5\u00aaV\2\u02ed\u02fc\5\u00ac"+
		"W\2\u02ee\u02fc\5\u00aeX\2\u02ef\u02fc\5\u00b0Y\2\u02f0\u02fc\5\u00b8"+
		"]\2\u02f1\u02fc\5\u00ba^\2\u02f2\u02fc\5\u00bc_\2\u02f3\u02fc\5\u00be"+
		"`\2\u02f4\u02fc\5\u00c0a\2\u02f5\u02fc\5\u00c8e\2\u02f6\u02fc\5\u00b4"+
		"[\2\u02f7\u02fc\5\u00caf\2\u02f8\u02fc\5\u00b2Z\2\u02f9\u02fc\5\u00b6"+
		"\\\2\u02fa\u02fc\5\u00d8m\2\u02fb\u02e8\3\2\2\2\u02fb\u02e9\3\2\2\2\u02fb"+
		"\u02ea\3\2\2\2\u02fb\u02eb\3\2\2\2\u02fb\u02ec\3\2\2\2\u02fb\u02ed\3\2"+
		"\2\2\u02fb\u02ee\3\2\2\2\u02fb\u02ef\3\2\2\2\u02fb\u02f0\3\2\2\2\u02fb"+
		"\u02f1\3\2\2\2\u02fb\u02f2\3\2\2\2\u02fb\u02f3\3\2\2\2\u02fb\u02f4\3\2"+
		"\2\2\u02fb\u02f5\3\2\2\2\u02fb\u02f6\3\2\2\2\u02fb\u02f7\3\2\2\2\u02fb"+
		"\u02f8\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fa\3\2\2\2\u02fc\u009f\3\2"+
		"\2\2\u02fd\u02fe\7G\2\2\u02fe\u00a1\3\2\2\2\u02ff\u0300\7I\2\2\u0300\u0301"+
		"\5\u00a4S\2\u0301\u00a3\3\2\2\2\u0302\u0308\3\2\2\2\u0303\u0304\7]\2\2"+
		"\u0304\u0305\5\u00f0y\2\u0305\u0306\7^\2\2\u0306\u0308\3\2\2\2\u0307\u0302"+
		"\3\2\2\2\u0307\u0303\3\2\2\2\u0308\u00a5\3\2\2\2\u0309\u030a\7\32\2\2"+
		"\u030a\u00a7\3\2\2\2\u030b\u030c\7.\2\2\u030c\u00a9\3\2\2\2\u030d\u030e"+
		"\7B\2\2\u030e\u00ab\3\2\2\2\u030f\u0310\7?\2\2\u0310\u00ad\3\2\2\2\u0311"+
		"\u0312\7#\2\2\u0312\u0313\5\u00f0y\2\u0313\u0314\5\u00fa~\2\u0314\u00af"+
		"\3\2\2\2\u0315\u0316\7E\2\2\u0316\u0317\5\u00f0y\2\u0317\u0318\5\u00fa"+
		"~\2\u0318\u00b1\3\2\2\2\u0319\u031a\7=\2\2\u031a\u031b\5\u00f0y\2\u031b"+
		"\u031c\5\u00fa~\2\u031c\u00b3\3\2\2\2\u031d\u031e\7\6\2\2\u031e\u031f"+
		"\7]\2\2\u031f\u0320\5\u00f0y\2\u0320\u0321\7^\2\2\u0321\u00b5\3\2\2\2"+
		"\u0322\u0323\7\5\2\2\u0323\u0324\7]\2\2\u0324\u0325\5\u00f0y\2\u0325\u0326"+
		"\7^\2\2\u0326\u00b7\3\2\2\2\u0327\u0328\7\16\2\2\u0328\u0329\5\u00f0y"+
		"\2\u0329\u032a\5\u00fa~\2\u032a\u00b9\3\2\2\2\u032b\u032c\7\24\2\2\u032c"+
		"\u032d\5\u00f0y\2\u032d\u00bb\3\2\2\2\u032e\u032f\7\n\2\2\u032f\u0330"+
		"\5\u0098M\2\u0330\u0331\7\30\2\2\u0331\u00bd\3\2\2\2\u0332\u0333\7&\2"+
		"\2\u0333\u0334\5\u00c2b\2\u0334\u0335\5\u00c6d\2\u0335\u0336\7 \2\2\u0336"+
		"\u00bf\3\2\2\2\u0337\u0338\7\25\2\2\u0338\u0339\5\u00c2b\2\u0339\u033a"+
		"\5\u00c6d\2\u033a\u033b\7\62\2\2\u033b\u00c1\3\2\2\2\u033c\u033d\bb\1"+
		"\2\u033d\u033e\5\u00c4c\2\u033e\u0344\3\2\2\2\u033f\u0340\f\3\2\2\u0340"+
		"\u0341\7`\2\2\u0341\u0343\5\u00c4c\2\u0342\u033f\3\2\2\2\u0343\u0346\3"+
		"\2\2\2\u0344\u0342\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u00c3\3\2\2\2\u0346"+
		"\u0344\3\2\2\2\u0347\u0348\5\u00f0y\2\u0348\u0349\7_\2\2\u0349\u034a\5"+
		"\u0098M\2\u034a\u00c5\3\2\2\2\u034b\u0351\3\2\2\2\u034c\u034d\7`\2\2\u034d"+
		"\u034e\7\27\2\2\u034e\u034f\7_\2\2\u034f\u0351\5\u0098M\2\u0350\u034b"+
		"\3\2\2\2\u0350\u034c\3\2\2\2\u0351\u00c7\3\2\2\2\u0352\u0353\7\35\2\2"+
		"\u0353\u0354\5\u00e6t\2\u0354\u0355\7_\2\2\u0355\u0356\5\u0098M\2\u0356"+
		"\u0357\7\7\2\2\u0357\u00c9\3\2\2\2\u0358\u0359\7(\2\2\u0359\u035a\5\u00cc"+
		"g\2\u035a\u035b\5\u00c6d\2\u035b\u035c\7/\2\2\u035c\u00cb\3\2\2\2\u035d"+
		"\u035e\bg\1\2\u035e\u035f\5\u00ceh\2\u035f\u0365\3\2\2\2\u0360\u0361\f"+
		"\3\2\2\u0361\u0362\7`\2\2\u0362\u0364\5\u00ceh\2\u0363\u0360\3\2\2\2\u0364"+
		"\u0367\3\2\2\2\u0365\u0363\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u00cd\3\2"+
		"\2\2\u0367\u0365\3\2\2\2\u0368\u0369\5\u00e4s\2\u0369\u036a\5\u00d0i\2"+
		"\u036a\u036b\5\u00d4k\2\u036b\u036c\5\u00d6l\2\u036c\u036d\7_\2\2\u036d"+
		"\u036e\5\u0098M\2\u036e\u00cf\3\2\2\2\u036f\u0370\5\u00d2j\2\u0370\u0371"+
		"\5`\61\2\u0371\u00d1\3\2\2\2\u0372\u0377\5\u010e\u0088\2\u0373\u0374\5"+
		"\u010e\u0088\2\u0374\u0375\5\u011a\u008e\2\u0375\u0377\3\2\2\2\u0376\u0372"+
		"\3\2\2\2\u0376\u0373\3\2\2\2\u0377\u00d3\3\2\2\2\u0378\u037e\3\2\2\2\u0379"+
		"\u037a\7\b\2\2\u037a\u037e\5\u00f0y\2\u037b\u037c\7H\2\2\u037c\u037e\5"+
		"\u00f0y\2\u037d\u0378\3\2\2\2\u037d\u0379\3\2\2\2\u037d\u037b\3\2\2\2"+
		"\u037e\u00d5\3\2\2\2\u037f\u0383\3\2\2\2\u0380\u0381\7\r\2\2\u0381\u0383"+
		"\5\u00f0y\2\u0382\u037f\3\2\2\2\u0382\u0380\3\2\2\2\u0383\u00d7\3\2\2"+
		"\2\u0384\u0385\7\21\2\2\u0385\u0386\5\u00dan\2\u0386\u0387\7\61\2\2\u0387"+
		"\u00d9\3\2\2\2\u0388\u0389\bn\1\2\u0389\u038a\5\u00dco\2\u038a\u0390\3"+
		"\2\2\2\u038b\u038c\f\3\2\2\u038c\u038d\7t\2\2\u038d\u038f\5\u00dco\2\u038e"+
		"\u038b\3\2\2\2\u038f\u0392\3\2\2\2\u0390\u038e\3\2\2\2\u0390\u0391\3\2"+
		"\2\2\u0391\u00db\3\2\2\2\u0392\u0390\3\2\2\2\u0393\u0394\5\u00e4s\2\u0394"+
		"\u0395\5\u00dep\2\u0395\u0396\5\u00e0q\2\u0396\u0397\5\u00e2r\2\u0397"+
		"\u00dd\3\2\2\2\u0398\u039d\bp\1\2\u0399\u039a\f\3\2\2\u039a\u039c\7\u0082"+
		"\2\2\u039b\u0399\3\2\2\2\u039c\u039f\3\2\2\2\u039d\u039b\3\2\2\2\u039d"+
		"\u039e\3\2\2\2\u039e\u00df\3\2\2\2\u039f\u039d\3\2\2\2\u03a0\u03a4\5\u00b8"+
		"]\2\u03a1\u03a4\5\u00b0Y\2\u03a2\u03a4\5\u00f0y\2\u03a3\u03a0\3\2\2\2"+
		"\u03a3\u03a1\3\2\2\2\u03a3\u03a2\3\2\2\2\u03a4\u00e1\3\2\2\2\u03a5\u03a9"+
		"\3\2\2\2\u03a6\u03a7\7_\2\2\u03a7\u03a9\5\u0098M\2\u03a8\u03a5\3\2\2\2"+
		"\u03a8\u03a6\3\2\2\2\u03a9\u00e3\3\2\2\2\u03aa\u03b0\3\2\2\2\u03ab\u03ac"+
		"\7]\2\2\u03ac\u03ad\5\u00e6t\2\u03ad\u03ae\7^\2\2\u03ae\u03b0\3\2\2\2"+
		"\u03af\u03aa\3\2\2\2\u03af\u03ab\3\2\2\2\u03b0\u00e5\3\2\2\2\u03b1\u03b2"+
		"\bt\1\2\u03b2\u03b3\5\u00e8u\2\u03b3\u03b9\3\2\2\2\u03b4\u03b5\f\3\2\2"+
		"\u03b5\u03b6\7R\2\2\u03b6\u03b8\5\u00e8u\2\u03b7\u03b4\3\2\2\2\u03b8\u03bb"+
		"\3\2\2\2\u03b9\u03b7\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u00e7\3\2\2\2\u03bb"+
		"\u03b9\3\2\2\2\u03bc\u03bd\7\u0083\2\2\u03bd\u03be\7a\2\2\u03be\u03bf"+
		"\5\u00f0y\2\u03bf\u03c0\5\u00eav\2\u03c0\u03c1\5\u00f0y\2\u03c1\u03c2"+
		"\5\u00ecw\2\u03c2\u03c3\5\u00eex\2\u03c3\u00e9\3\2\2\2\u03c4\u03c5\t\6"+
		"\2\2\u03c5\u00eb\3\2\2\2\u03c6\u03ca\3\2\2\2\u03c7\u03c8\7\r\2\2\u03c8"+
		"\u03ca\5\u00f0y\2\u03c9\u03c6\3\2\2\2\u03c9\u03c7\3\2\2\2\u03ca\u00ed"+
		"\3\2\2\2\u03cb\u03cf\3\2\2\2\u03cc\u03cd\7H\2\2\u03cd\u03cf\5\u00f0y\2"+
		"\u03ce\u03cb\3\2\2\2\u03ce\u03cc\3\2\2\2\u03cf\u00ef\3\2\2\2\u03d0\u03d1"+
		"\by\1\2\u03d1\u03d7\7\u0083\2\2\u03d2\u03d7\5\u00f2z\2\u03d3\u03d7\5\u0100"+
		"\u0081\2\u03d4\u03d7\5\u00f4{\2\u03d5\u03d7\5\u0106\u0084\2\u03d6\u03d0"+
		"\3\2\2\2\u03d6\u03d2\3\2\2\2\u03d6\u03d3\3\2\2\2\u03d6\u03d4\3\2\2\2\u03d6"+
		"\u03d5\3\2\2\2\u03d7\u044a\3\2\2\2\u03d8\u03d9\f\"\2\2\u03d9\u03da\7Z"+
		"\2\2\u03da\u0449\5\u00f0y#\u03db\u03dc\f!\2\2\u03dc\u03dd\7Y\2\2\u03dd"+
		"\u0449\5\u00f0y\"\u03de\u03df\f \2\2\u03df\u03e0\7[\2\2\u03e0\u0449\5"+
		"\u00f0y!\u03e1\u03e2\f\37\2\2\u03e2\u03e3\7,\2\2\u03e3\u0449\5\u00f0y"+
		" \u03e4\u03e5\f\36\2\2\u03e5\u03e6\7\\\2\2\u03e6\u0449\5\u00f0y\37\u03e7"+
		"\u03e8\f\35\2\2\u03e8\u03e9\7V\2\2\u03e9\u0449\5\u00f0y\36\u03ea\u03eb"+
		"\f\34\2\2\u03eb\u03ec\7X\2\2\u03ec\u0449\5\u00f0y\35\u03ed\u03ee\f\33"+
		"\2\2\u03ee\u03ef\7p\2\2\u03ef\u0449\5\u00f0y\34\u03f0\u03f1\f\32\2\2\u03f1"+
		"\u03f2\7T\2\2\u03f2\u0449\5\u00f0y\33\u03f3\u03f4\f\31\2\2\u03f4\u03f5"+
		"\7i\2\2\u03f5\u0449\5\u00f0y\32\u03f6\u03f7\f\30\2\2\u03f7\u03f8\7e\2"+
		"\2\u03f8\u0449\5\u00f0y\31\u03f9\u03fa\f\27\2\2\u03fa\u03fb\7f\2\2\u03fb"+
		"\u0449\5\u00f0y\30\u03fc\u03fd\f\26\2\2\u03fd\u03fe\7g\2\2\u03fe\u0449"+
		"\5\u00f0y\27\u03ff\u0400\f\25\2\2\u0400\u0401\7h\2\2\u0401\u0449\5\u00f0"+
		"y\26\u0402\u0403\f\24\2\2\u0403\u0404\7\b\2\2\u0404\u0449\5\u00f0y\25"+
		"\u0405\u0406\f\23\2\2\u0406\u0407\7\66\2\2\u0407\u0449\5\u00f0y\24\u0408"+
		"\u0409\f\22\2\2\u0409\u040a\7Q\2\2\u040a\u0449\5\u00f0y\23\u040b\u040c"+
		"\f\21\2\2\u040c\u040d\7u\2\2\u040d\u0449\5\u00f0y\22\u040e\u040f\f\20"+
		"\2\2\u040f\u0410\7v\2\2\u0410\u0449\5\u00f0y\21\u0411\u0412\f\17\2\2\u0412"+
		"\u0413\7b\2\2\u0413\u0449\5\u00f0y\20\u0414\u0415\f\16\2\2\u0415\u0416"+
		"\7a\2\2\u0416\u0449\5\u00f0y\17\u0417\u0418\f\r\2\2\u0418\u0419\7w\2\2"+
		"\u0419\u0449\5\u00f0y\16\u041a\u041b\f\f\2\2\u041b\u041c\7x\2\2\u041c"+
		"\u0449\5\u00f0y\r\u041d\u041e\f\13\2\2\u041e\u041f\7y\2\2\u041f\u0449"+
		"\5\u00f0y\f\u0420\u0421\f\n\2\2\u0421\u0422\7{\2\2\u0422\u0449\5\u00f0"+
		"y\13\u0423\u0424\f\t\2\2\u0424\u0425\7|\2\2\u0425\u0449\5\u00f0y\n\u0426"+
		"\u0427\f\b\2\2\u0427\u0428\7z\2\2\u0428\u0449\5\u00f0y\t\u0429\u042a\f"+
		"\7\2\2\u042a\u042b\7}\2\2\u042b\u0449\5\u00f0y\b\u042c\u042d\f\6\2\2\u042d"+
		"\u042e\7~\2\2\u042e\u0449\5\u00f0y\7\u042f\u0430\f\5\2\2\u0430\u0431\7"+
		"\177\2\2\u0431\u0449\5\u00f0y\6\u0432\u0433\f\4\2\2\u0433\u0434\7\u0080"+
		"\2\2\u0434\u0449\5\u00f0y\5\u0435\u0436\f\3\2\2\u0436\u0437\7\u0081\2"+
		"\2\u0437\u0449\5\u00f0y\4\u0438\u0439\f+\2\2\u0439\u0449\5\u00fa~\2\u043a"+
		"\u043b\f(\2\2\u043b\u0449\7U\2\2\u043c\u043d\f\'\2\2\u043d\u0449\7W\2"+
		"\2\u043e\u043f\f&\2\2\u043f\u0449\7o\2\2\u0440\u0441\f%\2\2\u0441\u0442"+
		"\7l\2\2\u0442\u0449\7\u0083\2\2\u0443\u0444\f$\2\2\u0444\u0445\7c\2\2"+
		"\u0445\u0446\5\u0120\u0091\2\u0446\u0447\7d\2\2\u0447\u0449\3\2\2\2\u0448"+
		"\u03d8\3\2\2\2\u0448\u03db\3\2\2\2\u0448\u03de\3\2\2\2\u0448\u03e1\3\2"+
		"\2\2\u0448\u03e4\3\2\2\2\u0448\u03e7\3\2\2\2\u0448\u03ea\3\2\2\2\u0448"+
		"\u03ed\3\2\2\2\u0448\u03f0\3\2\2\2\u0448\u03f3\3\2\2\2\u0448\u03f6\3\2"+
		"\2\2\u0448\u03f9\3\2\2\2\u0448\u03fc\3\2\2\2\u0448\u03ff\3\2\2\2\u0448"+
		"\u0402\3\2\2\2\u0448\u0405\3\2\2\2\u0448\u0408\3\2\2\2\u0448\u040b\3\2"+
		"\2\2\u0448\u040e\3\2\2\2\u0448\u0411\3\2\2\2\u0448\u0414\3\2\2\2\u0448"+
		"\u0417\3\2\2\2\u0448\u041a\3\2\2\2\u0448\u041d\3\2\2\2\u0448\u0420\3\2"+
		"\2\2\u0448\u0423\3\2\2\2\u0448\u0426\3\2\2\2\u0448\u0429\3\2\2\2\u0448"+
		"\u042c\3\2\2\2\u0448\u042f\3\2\2\2\u0448\u0432\3\2\2\2\u0448\u0435\3\2"+
		"\2\2\u0448\u0438\3\2\2\2\u0448\u043a\3\2\2\2\u0448\u043c\3\2\2\2\u0448"+
		"\u043e\3\2\2\2\u0448\u0440\3\2\2\2\u0448\u0443\3\2\2\2\u0449\u044c\3\2"+
		"\2\2\u044a\u0448\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u00f1\3\2\2\2\u044c"+
		"\u044a\3\2\2\2\u044d\u044e\t\7\2\2\u044e\u00f3\3\2\2\2\u044f\u0450\7\60"+
		"\2\2\u0450\u0473\5\u00f0y\2\u0451\u0452\7V\2\2\u0452\u0473\5\u00f0y\2"+
		"\u0453\u0454\7X\2\2\u0454\u0473\5\u00f0y\2\u0455\u0456\7n\2\2\u0456\u0473"+
		"\5\u00f0y\2\u0457\u0458\7s\2\2\u0458\u0473\5\u00f0y\2\u0459\u045a\7U\2"+
		"\2\u045a\u0473\5\u00f0y\2\u045b\u045c\7W\2\2\u045c\u0473\5\u00f0y\2\u045d"+
		"\u045e\5x=\2\u045e\u045f\5\u00f8}\2\u045f\u0473\3\2\2\2\u0460\u0461\7"+
		"J\2\2\u0461\u0473\5\u00f8}\2\u0462\u0463\7+\2\2\u0463\u0464\7]\2\2\u0464"+
		"\u0465\5t;\2\u0465\u0466\7^\2\2\u0466\u0473\3\2\2\2\u0467\u0468\7%\2\2"+
		"\u0468\u0469\7]\2\2\u0469\u046a\5t;\2\u046a\u046b\7^\2\2\u046b\u0473\3"+
		"\2\2\2\u046c\u046d\7-\2\2\u046d\u046e\7]\2\2\u046e\u046f\5\u011c\u008f"+
		"\2\u046f\u0470\5\u00f6|\2\u0470\u0471\7^\2\2\u0471\u0473\3\2\2\2\u0472"+
		"\u044f\3\2\2\2\u0472\u0451\3\2\2\2\u0472\u0453\3\2\2\2\u0472\u0455\3\2"+
		"\2\2\u0472\u0457\3\2\2\2\u0472\u0459\3\2\2\2\u0472\u045b\3\2\2\2\u0472"+
		"\u045d\3\2\2\2\u0472\u0460\3\2\2\2\u0472\u0462\3\2\2\2\u0472\u0467\3\2"+
		"\2\2\u0472\u046c\3\2\2\2\u0473\u00f5\3\2\2\2\u0474\u047a\5v<\2\u0475\u0476"+
		"\7D\2\2\u0476\u047a\5> \2\u0477\u0478\7\64\2\2\u0478\u047a\5\u0090I\2"+
		"\u0479\u0474\3\2\2\2\u0479\u0475\3\2\2\2\u0479\u0477\3\2\2\2\u047a\u00f7"+
		"\3\2\2\2\u047b\u047c\7]\2\2\u047c\u047d\5\u00f0y\2\u047d\u047e\7^\2\2"+
		"\u047e\u00f9\3\2\2\2\u047f\u0480\7]\2\2\u0480\u0481\5\u00fc\177\2\u0481"+
		"\u0482\7^\2\2\u0482\u00fb\3\2\2\2\u0483\u0486\3\2\2\2\u0484\u0486\5\u00fe"+
		"\u0080\2\u0485\u0483\3\2\2\2\u0485\u0484\3\2\2\2\u0486\u00fd\3\2\2\2\u0487"+
		"\u0488\b\u0080\1\2\u0488\u0489\5\u00f0y\2\u0489\u048f\3\2\2\2\u048a\u048b"+
		"\f\3\2\2\u048b\u048c\7R\2\2\u048c\u048e\5\u00f0y\2\u048d\u048a\3\2\2\2"+
		"\u048e\u0491\3\2\2\2\u048f\u048d\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u00ff"+
		"\3\2\2\2\u0491\u048f\3\2\2\2\u0492\u0493\7]\2\2\u0493\u0494\5\u0102\u0082"+
		"\2\u0494\u0495\7^\2\2\u0495\u0101\3\2\2\2\u0496\u0497\b\u0082\1\2\u0497"+
		"\u0498\5\u0104\u0083\2\u0498\u049e\3\2\2\2\u0499\u049a\f\3\2\2\u049a\u049b"+
		"\7R\2\2\u049b\u049d\5\u0104\u0083\2\u049c\u0499\3\2\2\2\u049d\u04a0\3"+
		"\2\2\2\u049e\u049c\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u0103\3\2\2\2\u04a0"+
		"\u049e\3\2\2\2\u04a1\u04a8\5\u00f0y\2\u04a2\u04a3\7c\2\2\u04a3\u04a4\5"+
		"\u00f0y\2\u04a4\u04a5\7d\2\2\u04a5\u04a6\5\u00f0y\2\u04a6\u04a8\3\2\2"+
		"\2\u04a7\u04a1\3\2\2\2\u04a7\u04a2\3\2\2\2\u04a8\u0105\3\2\2\2\u04a9\u04aa"+
		"\7\23\2\2\u04aa\u04ab\5\u0108\u0085\2\u04ab\u04ac\5\u010c\u0087\2\u04ac"+
		"\u0107\3\2\2\2\u04ad\u04ae\5\u010a\u0086\2\u04ae\u04af\5\u00fa~\2\u04af"+
		"\u0109\3\2\2\2\u04b0\u04b1\t\b\2\2\u04b1\u010b\3\2\2\2\u04b2\u04b6\3\2"+
		"\2\2\u04b3\u04b4\7\63\2\2\u04b4\u04b6\5\u00f0y\2\u04b5\u04b2\3\2\2\2\u04b5"+
		"\u04b3\3\2\2\2\u04b6\u010d\3\2\2\2\u04b7\u04bc\7\u0083\2\2\u04b8\u04b9"+
		"\7\u0083\2\2\u04b9\u04ba\7l\2\2\u04ba\u04bc\7\u0083\2\2\u04bb\u04b7\3"+
		"\2\2\2\u04bb\u04b8\3\2\2\2\u04bc\u010f\3\2\2\2\u04bd\u04be\7\30\2\2\u04be"+
		"\u04bf\5\30\r\2\u04bf\u0111\3\2\2\2\u04c0\u04c3\3\2\2\2\u04c1\u04c3\5"+
		"\u0114\u008b\2\u04c2\u04c0\3\2\2\2\u04c2\u04c1\3\2\2\2\u04c3\u0113\3\2"+
		"\2\2\u04c4\u04c5\b\u008b\1\2\u04c5\u04c6\7\u0083\2\2\u04c6\u04cc\3\2\2"+
		"\2\u04c7\u04c8\f\3\2\2\u04c8\u04c9\7R\2\2\u04c9\u04cb\7\u0083\2\2\u04ca"+
		"\u04c7\3\2\2\2\u04cb\u04ce\3\2\2\2\u04cc\u04ca\3\2\2\2\u04cc\u04cd\3\2"+
		"\2\2\u04cd\u0115\3\2\2\2\u04ce\u04cc\3\2\2\2\u04cf\u04d0\b\u008c\1\2\u04d0"+
		"\u04d1\5\u0118\u008d\2\u04d1\u04d7\3\2\2\2\u04d2\u04d3\f\3\2\2\u04d3\u04d4"+
		"\7R\2\2\u04d4\u04d6\5\u0118\u008d\2\u04d5\u04d2\3\2\2\2\u04d6\u04d9\3"+
		"\2\2\2\u04d7\u04d5\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u0117\3\2\2\2\u04d9"+
		"\u04d7\3\2\2\2\u04da\u04de\7\u0083\2\2\u04db\u04dc\7\u0083\2\2\u04dc\u04de"+
		"\5\u011a\u008e\2\u04dd\u04da\3\2\2\2\u04dd\u04db\3\2\2\2\u04de\u0119\3"+
		"\2\2\2\u04df\u04e4\5\u011e\u0090\2\u04e0\u04e1\5\u011e\u0090\2\u04e1\u04e2"+
		"\5\u011a\u008e\2\u04e2\u04e4\3\2\2\2\u04e3\u04df\3\2\2\2\u04e3\u04e0\3"+
		"\2\2\2\u04e4\u011b\3\2\2\2\u04e5\u04e8\3\2\2\2\u04e6\u04e8\5\u011a\u008e"+
		"\2\u04e7\u04e5\3\2\2\2\u04e7\u04e6\3\2\2\2\u04e8\u011d\3\2\2\2\u04e9\u04ea"+
		"\7c\2\2\u04ea\u04eb\5\u0120\u0091\2\u04eb\u04ec\7d\2\2\u04ec\u011f\3\2"+
		"\2\2\u04ed\u04ee\b\u0091\1\2\u04ee\u04ef\5\u0122\u0092\2\u04ef\u04f5\3"+
		"\2\2\2\u04f0\u04f1\f\3\2\2\u04f1\u04f2\7R\2\2\u04f2\u04f4\5\u0122\u0092"+
		"\2\u04f3\u04f0\3\2\2\2\u04f4\u04f7\3\2\2\2\u04f5\u04f3\3\2\2\2\u04f5\u04f6"+
		"\3\2\2\2\u04f6\u0121\3\2\2\2\u04f7\u04f5\3\2\2\2\u04f8\u04fe\5\u0124\u0093"+
		"\2\u04f9\u04fa\5\u0124\u0093\2\u04fa\u04fb\7S\2\2\u04fb\u04fc\5\u0124"+
		"\u0093\2\u04fc\u04fe\3\2\2\2\u04fd\u04f8\3\2\2\2\u04fd\u04f9\3\2\2\2\u04fe"+
		"\u0123\3\2\2\2\u04ff\u0502\5\u00f0y\2\u0500\u0502\7Y\2\2\u0501\u04ff\3"+
		"\2\2\2\u0501\u0500\3\2\2\2\u0502\u0125\3\2\2\2O\u0129\u012e\u014c\u0150"+
		"\u015b\u0165\u016b\u0175\u017c\u0184\u0189\u0199\u01ab\u01b5\u01b9\u01c6"+
		"\u01d2\u01ee\u01f7\u0202\u020c\u0216\u021d\u0229\u0235\u023d\u0249\u0258"+
		"\u0268\u026e\u0278\u0286\u028a\u0295\u02a9\u02b5\u02c1\u02c8\u02d2\u02de"+
		"\u02e6\u02fb\u0307\u0344\u0350\u0365\u0376\u037d\u0382\u0390\u039d\u03a3"+
		"\u03a8\u03af\u03b9\u03c9\u03ce\u03d6\u0448\u044a\u0472\u0479\u0485\u048f"+
		"\u049e\u04a7\u04b5\u04bb\u04c2\u04cc\u04d7\u04dd\u04e3\u04e7\u04f5\u04fd"+
		"\u0501";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}