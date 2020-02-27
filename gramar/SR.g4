grammar SR;

inicio:
	component+;
component:
    spec_component
	|   combined_component
	|   separate_body
	;
spec_component:
	    comp_label spec_stmt_ls spec_body
	;
combined_component:
	    combined_specpart body_stmt_ls end_id
	;
combined_specpart:
	    comp_label comp_params
	;
comp_label:
	    comp_kwd TK_ID
	;
comp_kwd:
	    TK_GLOBAL
	|   TK_RESOURCE
	;
spec_body:
	    end_id
	|   TK_BODY TK_ID maybe_params body_stmt_ls end_id
	|   TK_BODY TK_ID maybe_params TK_SEPARATE
	;
maybe_params:
	    comp_params
	|
	;
comp_params:
	    parameters
	;
separate_body:
	    TK_BODY TK_ID body_stmt_ls end_id
	;
id_opt:
	|   TK_ID
	;
spec_stmt_ls:
	    spec_stmt
	|   spec_stmt_ls TK_SEPARATOR spec_stmt
	;
spec_stmt:
	    common_stmt
	|   extend_clause
	|   body_only
	;
body_stmt_ls:
	    body_stmt
	|   body_stmt_ls TK_SEPARATOR body_stmt
	;
body_stmt:
	    common_stmt
	|   expr
	|   body_only
	|   extend_clause
	;
body_only:
	    stmt
	|   proc
	|   process
	|   procedure
	|   initial_block
	|   final_block
	;
common_stmt:
	|   decl
	|   import_clause
	;
import_clause:
	    TK_IMPORT import_list
	;

extend_clause:
	    TK_EXTEND import_list
	;

import_list:
	    import_name
	|   import_list TK_COMMA import_name
	;
import_name:
	    TK_ID
	;
op_decl:
	    op_or_ext oper_def_lp
	;

op_or_ext:
	    TK_OP
	|   TK_EXTERNAL
	;

oper_def_lp:
	    oper_def
	|   oper_def_lp TK_COMMA oper_def
	;

oper_def:
	    id_subs_lp op_prototype
	|   id_subs_lp colon_opt qualified_id
	;

colon_opt:
	|   TK_COLON
	;
sem_decl:
	    TK_SEM sem_def_lp
	;
sem_def_lp:
	    sem_def
	|   sem_def_lp TK_COMMA sem_def
	;

sem_def:
	    id_subs sem_proto sem_init
	;

sem_proto:
	    return_spec_null
	;

sem_init:
	|   TK_ASSIGN expr
	;
proc:
	    TK_PROC TK_ID param_names
	        block
	    end_id
	;
procedure:
	    TK_PROCEDURE TK_ID prototype
		block
	    end_id
	;
process:
	    TK_PROCESS TK_ID return_spec_null quantifiers_opt
		block
	    end_id
	;


initial_block:
	    TK_INITIAL
		block
	    TK_END initial_opt
	;

initial_opt:
	|   TK_INITIAL
	;
final_block:
	    TK_FINAL
	        block
	    TK_END final_opt
	;
final_opt:
	|   TK_FINAL
	;
prototype:
	    parameters return_spec_opt
	;

parameters:
	    TK_LPAREN param_spec_ls TK_RPAREN
	;

param_spec_ls:
	|   param_spec_lp
	;

param_spec_lp:
	    param_spec
	|   param_spec TK_SEPARATOR
	|   param_spec TK_SEPARATOR param_spec_lp
	;

param_spec:
	    param_kind_opt type
	|   param_kind_opt id_subs_lp TK_COLON type
	;
param_kind_opt:
	|   TK_VAL
	|   TK_VAR
	|   TK_RES
	|   TK_REF
	;
return_spec_opt:
	    return_spec_null
	|   TK_RETURNS type
	|   TK_RETURNS id_subs TK_COLON type
	|   TK_RETURNS TK_ID
	;
return_spec_null:
	    /* epsilon */
	;
param_names:
	    TK_LPAREN id_ls TK_RPAREN return_name_opt
	;

return_name_opt:
	|   TK_RETURNS TK_ID
	;
decl:
	|   type_decl
	|   obj_decl
	|   optype_decl
	|   sem_decl
	|   op_decl
	;
type_decl:
	    TK_TYPE TK_ID TK_EQ type type_restriction
	;

type_restriction:
	|   TK_LBRACE TK_ID TK_RBRACE
	;

obj_decl:
	    var_or_const var_def_lp
	;
var_or_const:
	    TK_VAR
	|   TK_CONST
	;
var_def_lp:
	    var_def
	|   var_def_lp TK_COMMA var_def
	;
var_def:
	    id_subs_lp var_att
	;
var_att:
	    TK_COLON type
	|   TK_COLON type TK_ASSIGN expr
	|                 TK_ASSIGN expr
	|   TK_SEPARATOR
	;
type:
	    subscripts unsub_type
	|   unsub_type
	;

unsub_type:
	    basic_type
	|   string_def
	|   enum_def
	|   pointer_def
	|   record_def
	|   union_def
	|   capability_def
	|   qualified_id
	;

basic_type:
	    TK_BOOL
	|   TK_CHAR
	|   TK_INT
	|   TK_FILE
	|   TK_REAL
	;
string_def:
	    TK_STRING TK_LBRACKET string_lim TK_RBRACKET
	|   TK_STRING TK_LPAREN string_lim TK_RPAREN
	;
string_lim:
	    expr
	|   TK_ASTER
	;
enum_def:
	    TK_ENUM TK_LPAREN id_lp TK_RPAREN
	;
pointer_def:
	    TK_PTR type
	|   TK_PTR TK_ANY
	;
record_def:
	    TK_REC TK_LPAREN field_lp TK_RPAREN
	;
union_def:
	    TK_UNION TK_LPAREN field_lp TK_RPAREN
	;
field_lp:
	    field
	|   field TK_SEPARATOR
	|   field TK_SEPARATOR field_lp
	;
field:
	    var_def_lp
	;
capability_def:
	   TK_CAP cap_for
	;
cap_for:
	    qualified_id
	|   op_prototype
	|   TK_SEM sem_proto
	|   TK_VM
	;
optype_decl:
	    TK_OPTYPE TK_ID eq_opt op_prototype
	;
op_prototype:
	    prototype op_restriction_opt
	;
eq_opt:
	|   TK_EQ
	;
op_restriction_opt:
	|   TK_LBRACE op_restriction TK_RBRACE
	;
op_restriction:
	    TK_CALL
	|   TK_SEND
	|   TK_CALL TK_COMMA TK_SEND
	|   TK_SEND TK_COMMA TK_CALL
	;
block:
	    block_items
	;
block_items:
	    block_item
	|   block_items TK_SEPARATOR block_item
	;
block_item:
	|   decl
	|   stmt
	|   expr
	|   import_clause
	;
stmt:
	    skip_stmt
	|   stop_stmt
	|   exit_stmt
	|   next_stmt
	|   return_stmt
	|   reply_stmt
	|   forward_stmt
	|   send_stmt
	|   explicit_call
	|   destroy_stmt
	|   begin_end
	|   if_stmt
	|   do_stmt
	|   for_all_stmt
	|   v_stmt
	|   input_stmt
	|   receive_stmt
	|   p_stmt
	|   concurrent_stmt
	;
skip_stmt:
	    TK_SKIP
	;
stop_stmt:
	    TK_STOP exit_code_opt
	;
exit_code_opt:
	|   TK_LPAREN expr TK_RPAREN
	;
exit_stmt:
	    TK_EXIT
	;
next_stmt:
	    TK_NEXT
	;
return_stmt:
	    TK_RETURN
	;
reply_stmt:
	    TK_REPLY
	;
forward_stmt:
	    TK_FORWARD expr paren_list
	;
send_stmt:
	    TK_SEND expr paren_list
	;
receive_stmt:
	    TK_RECEIVE expr paren_list
	;
v_stmt:
	    TK_V TK_LPAREN expr TK_RPAREN
	;
p_stmt:
	    TK_P TK_LPAREN expr TK_RPAREN
	;
explicit_call:
	    TK_CALL expr paren_list
	;
destroy_stmt:
	    TK_DESTROY expr
	;
begin_end:
	    TK_BEGIN block TK_END
	;
if_stmt:
	    TK_IF guarded_cmd_lp else_cmd_opt TK_FI
	;
do_stmt:
	    TK_DO guarded_cmd_lp else_cmd_opt TK_OD
	;
guarded_cmd_lp:
	    guarded_cmd
	|   guarded_cmd_lp TK_SQUARE guarded_cmd
	;
guarded_cmd:
	    expr TK_ARROW block
	;
else_cmd_opt:
	|   TK_SQUARE TK_ELSE TK_ARROW block
	;
for_all_stmt:
	    TK_FA quantifier_lp TK_ARROW block TK_AF
	;
input_stmt:
	    TK_IN in_cmd_lp else_cmd_opt TK_NI
	;
in_cmd_lp:
	    in_cmd
	|   in_cmd_lp TK_SQUARE in_cmd
	;
in_cmd:
	    quantifiers_opt in_spec sync_expr_opt sched_expr_opt TK_ARROW block
	;
in_spec:
	    in_op param_names
	;
in_op:
	    qualified_id
	|   qualified_id subscripts
	;
sync_expr_opt:
	|   TK_AND expr
	|   TK_SUCHTHAT expr
	;
sched_expr_opt:
	|   TK_BY expr
	;
concurrent_stmt:
	    TK_CO concurrent_cmd_lp TK_OC
	;
concurrent_cmd_lp:
	    concurrent_cmd
	|   concurrent_cmd_lp TK_PARALLEL concurrent_cmd
	;
concurrent_cmd:
	quantifiers_opt separator_opt concurrent_invocation post_processing_opt
	;
separator_opt:
	|   separator_opt TK_SEPARATOR
	;
concurrent_invocation:
	    explicit_call
	|   send_stmt
	|   expr
	;
post_processing_opt:
	|   TK_ARROW block
	;
quantifiers_opt:
	|   TK_LPAREN quantifier_lp TK_RPAREN
	;
quantifier_lp:
	    quantifier
	|   quantifier_lp TK_COMMA quantifier
	;
quantifier:
	    TK_ID TK_ASSIGN expr direction expr step_opt such_that_opt
	;
direction:
	    TK_TO
	|   TK_DOWNTO
	;
step_opt:
	|   TK_BY expr
	;
such_that_opt:
	|   TK_SUCHTHAT expr
	;
expr:
	    TK_ID
	|   literal
    |   expr paren_list
	|   constructor
	|   prefix_expr
	|   expr TK_INCR
	|   expr TK_DECR
	|   expr TK_HAT
	|   expr TK_PERIOD TK_ID
	|   expr TK_LBRACKET bound_lp TK_RBRACKET
	|   create_expr
	|   expr TK_EXPON	expr
	|   expr TK_ASTER	expr
	|   expr TK_DIV		expr
	|   expr TK_MOD		expr
	|   expr TK_REMDR	expr
	|   expr TK_PLUS	expr
	|   expr TK_MINUS	expr
	|   expr TK_CONCAT	expr
	|   expr TK_EQ		expr
	|   expr TK_NE		expr
	|   expr TK_GE		expr
	|   expr TK_LE		expr
	|   expr TK_GT		expr
	|   expr TK_LT		expr
	|   expr TK_AND		expr
	|   expr TK_OR		expr
	|   expr TK_XOR		expr
	|   expr TK_RSHIFT	expr
	|   expr TK_LSHIFT	expr
	|   expr TK_SWAP	expr
	|   expr TK_ASSIGN	expr
	|   expr TK_AUG_PLUS	expr
	|   expr TK_AUG_MINUS	expr
	|   expr TK_AUG_ASTER	expr
	|   expr TK_AUG_DIV	expr
	|   expr TK_AUG_REMDR	expr
	|   expr TK_AUG_EXPON	expr
	|   expr TK_AUG_OR	expr
	|   expr TK_AUG_AND	expr
	|   expr TK_AUG_CONCAT	expr
	|   expr TK_AUG_RSHIFT	expr
	|   expr TK_AUG_LSHIFT	expr
	;
literal:
	    TK_NUM
	|   TK_FALSE
	|   TK_TRUE
	|   TK_TEXT
	|   TK_NULL
	|   TK_NOOP
	;
prefix_expr:
	    TK_NOT	expr
	|   TK_PLUS	expr
	|   TK_MINUS	expr
	|   TK_ADDR	expr
	|   TK_QMARK	expr
	|   TK_INCR expr
	|   TK_DECR expr
	|   basic_type paren_expr
	|   TK_STRING paren_expr
	|   TK_LOW  TK_LPAREN type TK_RPAREN
	|   TK_HIGH TK_LPAREN type TK_RPAREN
	|   TK_NEW  TK_LPAREN subscripts_opt new_item TK_RPAREN
	;
new_item:
	    unsub_type
	|   TK_SEM sem_proto
	|   TK_OP op_prototype
	;
paren_expr:
	    TK_LPAREN expr TK_RPAREN
	;
paren_list:
	    TK_LPAREN paren_item_ls TK_RPAREN
	;
paren_item_ls:
	|   expr_lp
	;
expr_lp:
	    expr
	|   expr_lp TK_COMMA expr
	;
constructor:
	    TK_LPAREN constr_item_lp TK_RPAREN
	;
constr_item_lp:
	    constr_item
	|   constr_item_lp TK_COMMA constr_item
	;
constr_item:
	    expr
	|   TK_LBRACKET expr TK_RBRACKET expr
	;
create_expr:
	    TK_CREATE create_call location_opt
	;
create_call:
	    rsrc_name paren_list
	;
rsrc_name:
	    TK_ID
	|   TK_VM
	;
location_opt:
	|   TK_ON expr
	;
qualified_id:
	    TK_ID
	|   TK_ID TK_PERIOD TK_ID
	;
end_id:
	    TK_END id_opt
	;
id_ls:
	|   id_lp
	;
id_lp:
	    TK_ID
	|   id_lp TK_COMMA TK_ID
	;
id_subs_lp:
	    id_subs
	|   id_subs_lp TK_COMMA id_subs
	;
id_subs:
	    TK_ID
	|   TK_ID subscripts
	;
subscripts:
	    bracketed_list
	|   bracketed_list subscripts
	;
subscripts_opt:
	|   subscripts
	;
bracketed_list:
	    TK_LBRACKET bound_lp TK_RBRACKET
	;
bound_lp:
	    bounds
	|   bound_lp TK_COMMA bounds
	;
bounds:
	    bound
	|   bound TK_COLON bound
	;
bound:
	    expr
	|   TK_ASTER
	;


TK_NOOP :   'noop' ;
TK_NULL :   'null' ;
TK_P :   'P' ;
TK_V :   'V' ;
TK_AF :   'af' ;
TK_AND :   'and' ;
TK_ANY :   'any' ;
TK_BEGIN :   'begin' ;
TK_BODY :   'body' ;
TK_BOOL :   'bool' ;
TK_BY :   'by' ;
TK_CALL :   'call' ;
TK_CAP :   'cap' ;
TK_CHAR :   'char' ;
TK_CO :   'co' ;
TK_CONST :   'const' ;
TK_CREATE :   'create' ;
TK_DESTROY :   'destroy' ;
TK_DO :   'do' ;
TK_DOWNTO :   'downto' ;
TK_ELSE :   'else' ;
TK_END :   'end' ;
TK_ENUM :   'enum' ;
TK_EXIT :   'exit' ;
TK_EXTEND :   'extend' ;
TK_EXTERNAL :   'external' ;
TK_FA :   'fa' ;
TK_FALSE :   'false' ;
TK_TRUE :   'true' ;
TK_FI :   'fi' ;
TK_FILE :   'file' ;
TK_FINAL :   'final' ;
TK_FORWARD :   'forward' ;
TK_GLOBAL :   'global' ;
TK_HIGH :   'high' ;
TK_IF :   'if' ;
TK_IMPORT :   'import' ;
TK_IN :   'in' ;
TK_INITIAL :   'initial' ;
TK_INT :   'int' ;
TK_LOW :   'low' ;
TK_MOD :   'mod' ;
TK_NEW :   'new' ;
TK_NEXT :   'next' ;
TK_NI :   'ni' ;
TK_NOT :   'not' ;
TK_OC :   'oc' ;
TK_OD :   'od' ;
TK_ON :   'on' ;
TK_OP :   'op' ;
TK_OPTYPE :   'optype' ;
TK_OR :   'or' ;
TK_PROC :   'proc' ;
TK_PROCEDURE :   'procedure' ;
TK_PROCESS :   'process' ;
TK_PTR :   'ptr' ;
TK_REAL :   'real' ;
TK_REC :   'rec' ;
TK_RECEIVE :   'receive' ;
TK_REF :   'ref' ;
TK_REPLY :   'reply' ;
TK_RES :   'res' ;
TK_RESOURCE :   'resource' ;
TK_RETURN :   'return' ;
TK_RETURNS :   'returns' ;
TK_SEM :   'sem' ;
TK_SEND :   'send' ;
TK_SEPARATE :   'separate' ;
TK_SKIP :   'skip' ;
TK_SUCHTHAT :   'st' ;
TK_STOP :   'stop' ;
TK_STRING :   'string' ;
TK_TO :   'to' ;
TK_TYPE :   'type' ;
TK_UNION :   'union' ;
TK_VAL :   'val' ;
TK_VAR :   'var' ;
TK_VM :   'vm' ;
TK_XOR :   'xor' ;

TK_COMMA :   ',' ;
TK_COLON :   ':' ;
TK_EQ :   '=' ;
TK_INCR :   '++' ;
TK_PLUS :   '+' ;
TK_DECR :   '--' ;
TK_MINUS :   '-' ;
TK_ASTER :   '*' ;
TK_EXPON :   '**' ;

TK_DIV :   '/' ;
TK_REMDR :   '%' ;
TK_LPAREN :   '(' ;
TK_RPAREN :   ')' ;
TK_ARROW :   '->' ;
TK_SQUARE :   '[]' ;
TK_ASSIGN :   ':=' ;
TK_SWAP :   ':=:' ;

TK_LBRACKET :   '[' ;
TK_RBRACKET :   ']' ;
TK_GE :   '>=' ;
TK_LE :   '<=' ;
TK_GT :   '>' ;
TK_LT :   '<' ;
TK_NE :   '!=' ;
TK_OR_OP :   '|' ;
TK_AND_OP :   '&' ;
TK_PERIOD :   '.' ;
TK_NOT_OP :   '~' ;
TK_ADDR :   '@' ;
TK_HAT :   '^' ;
TK_CONCAT :   '||' ;
TK_LBRACE :   '{' ;
TK_RBRACE :   '}' ;
TK_QMARK :   '?' ;
TK_PARALLEL :   '//' ;
TK_RSHIFT :   '>>' ;
TK_LSHIFT :   '<<' ;
TK_AUG_PLUS :   '+:=' ;
TK_AUG_MINUS :   '-:=' ;
TK_AUG_ASTER :   '*:=' ;
TK_AUG_EXPON :   '**:=' ;
TK_AUG_DIV :   '/:=' ;
TK_AUG_REMDR :   '%:=' ;
TK_AUG_OR :   '|:=' ;
TK_AUG_AND :   '&:=' ;
TK_AUG_CONCAT :   '||:=' ;
TK_AUG_RSHIFT :   '>>:=' ;
TK_AUG_LSHIFT :   '<<:=' ;
TK_SEPARATOR :   ';' ;


TK_ID :   [A-Za-z][A-Za-z0-9_]* ;
fragment
D :	[0-9];
fragment
E :	[eE][+-]?D+;
TK_NUM :   D+ '.' D*E?
            | '.' D+E?
            | [-+]?D+E?;
TK_TEXT :   '"' ( '""' | ~["] )* '"'
            | '.?';

LINE_COMMENT :	'#' ~[\r\n]* -> skip;
BLOCK_COMMENT :	'/*' .*? '*/' -> skip;
WHITE_SPACE :	[ \t\f]+ -> skip;
NEW_LINE : ('\r' '\n'?
		    | '\n') -> skip;


