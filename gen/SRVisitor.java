// Generated from C:/Users/corre/OneDrive/Documentos/2019-02/Lenguajes de programacion/Traductor_Lenguajes_v2/gramar\SR.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SRParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SRVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SRParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(SRParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(SRParser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#spec_component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpec_component(SRParser.Spec_componentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#combined_component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombined_component(SRParser.Combined_componentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#combined_specpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombined_specpart(SRParser.Combined_specpartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#comp_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_label(SRParser.Comp_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#comp_kwd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_kwd(SRParser.Comp_kwdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#spec_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpec_body(SRParser.Spec_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#maybe_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaybe_params(SRParser.Maybe_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#comp_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_params(SRParser.Comp_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#separate_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeparate_body(SRParser.Separate_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#id_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_opt(SRParser.Id_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#spec_stmt_ls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpec_stmt_ls(SRParser.Spec_stmt_lsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#spec_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpec_stmt(SRParser.Spec_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#body_stmt_ls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_stmt_ls(SRParser.Body_stmt_lsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#body_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_stmt(SRParser.Body_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#body_only}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_only(SRParser.Body_onlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#common_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_stmt(SRParser.Common_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#import_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_clause(SRParser.Import_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#extend_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtend_clause(SRParser.Extend_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#import_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_list(SRParser.Import_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#import_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_name(SRParser.Import_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#op_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_decl(SRParser.Op_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#op_or_ext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_or_ext(SRParser.Op_or_extContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#oper_def_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper_def_lp(SRParser.Oper_def_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#oper_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper_def(SRParser.Oper_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#colon_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColon_opt(SRParser.Colon_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#sem_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSem_decl(SRParser.Sem_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#sem_def_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSem_def_lp(SRParser.Sem_def_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#sem_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSem_def(SRParser.Sem_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#sem_proto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSem_proto(SRParser.Sem_protoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#sem_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSem_init(SRParser.Sem_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#proc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc(SRParser.ProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(SRParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcess(SRParser.ProcessContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#initial_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial_block(SRParser.Initial_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#initial_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial_opt(SRParser.Initial_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#final_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinal_block(SRParser.Final_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#final_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinal_opt(SRParser.Final_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#prototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrototype(SRParser.PrototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(SRParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#param_spec_ls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_spec_ls(SRParser.Param_spec_lsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#param_spec_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_spec_lp(SRParser.Param_spec_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#param_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_spec(SRParser.Param_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#param_kind_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_kind_opt(SRParser.Param_kind_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#return_spec_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_spec_opt(SRParser.Return_spec_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#return_spec_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_spec_null(SRParser.Return_spec_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#param_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_names(SRParser.Param_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#return_name_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_name_opt(SRParser.Return_name_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(SRParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#type_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_decl(SRParser.Type_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#type_restriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_restriction(SRParser.Type_restrictionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#obj_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj_decl(SRParser.Obj_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#var_or_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_or_const(SRParser.Var_or_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#var_def_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def_lp(SRParser.Var_def_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#var_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def(SRParser.Var_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#var_att}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_att(SRParser.Var_attContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SRParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#unsub_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsub_type(SRParser.Unsub_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#basic_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_type(SRParser.Basic_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#string_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_def(SRParser.String_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#string_lim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_lim(SRParser.String_limContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#enum_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_def(SRParser.Enum_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#pointer_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer_def(SRParser.Pointer_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#record_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_def(SRParser.Record_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#union_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_def(SRParser.Union_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#field_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_lp(SRParser.Field_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(SRParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#capability_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapability_def(SRParser.Capability_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#cap_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCap_for(SRParser.Cap_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#optype_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptype_decl(SRParser.Optype_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#op_prototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_prototype(SRParser.Op_prototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#eq_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_opt(SRParser.Eq_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#op_restriction_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_restriction_opt(SRParser.Op_restriction_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#op_restriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_restriction(SRParser.Op_restrictionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SRParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#block_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_items(SRParser.Block_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#block_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_item(SRParser.Block_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(SRParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#skip_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip_stmt(SRParser.Skip_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#stop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStop_stmt(SRParser.Stop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#exit_code_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_code_opt(SRParser.Exit_code_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#exit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_stmt(SRParser.Exit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#next_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext_stmt(SRParser.Next_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(SRParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#reply_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReply_stmt(SRParser.Reply_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#forward_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForward_stmt(SRParser.Forward_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#send_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSend_stmt(SRParser.Send_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#receive_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceive_stmt(SRParser.Receive_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#v_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitV_stmt(SRParser.V_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#p_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_stmt(SRParser.P_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#explicit_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_call(SRParser.Explicit_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#destroy_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestroy_stmt(SRParser.Destroy_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#begin_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_end(SRParser.Begin_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(SRParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#do_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_stmt(SRParser.Do_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#guarded_cmd_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuarded_cmd_lp(SRParser.Guarded_cmd_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#guarded_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuarded_cmd(SRParser.Guarded_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#else_cmd_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_cmd_opt(SRParser.Else_cmd_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#for_all_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_all_stmt(SRParser.For_all_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#input_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_stmt(SRParser.Input_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#in_cmd_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_cmd_lp(SRParser.In_cmd_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#in_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_cmd(SRParser.In_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#in_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_spec(SRParser.In_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#in_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_op(SRParser.In_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#sync_expr_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSync_expr_opt(SRParser.Sync_expr_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#sched_expr_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSched_expr_opt(SRParser.Sched_expr_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#concurrent_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrent_stmt(SRParser.Concurrent_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#concurrent_cmd_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrent_cmd_lp(SRParser.Concurrent_cmd_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#concurrent_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrent_cmd(SRParser.Concurrent_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#separator_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeparator_opt(SRParser.Separator_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#concurrent_invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrent_invocation(SRParser.Concurrent_invocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#post_processing_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPost_processing_opt(SRParser.Post_processing_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#quantifiers_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifiers_opt(SRParser.Quantifiers_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#quantifier_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier_lp(SRParser.Quantifier_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier(SRParser.QuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection(SRParser.DirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#step_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep_opt(SRParser.Step_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#such_that_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuch_that_opt(SRParser.Such_that_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SRParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SRParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#prefix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_expr(SRParser.Prefix_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#new_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_item(SRParser.New_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#paren_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen_expr(SRParser.Paren_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#paren_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen_list(SRParser.Paren_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#paren_item_ls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen_item_ls(SRParser.Paren_item_lsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#expr_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_lp(SRParser.Expr_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(SRParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#constr_item_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstr_item_lp(SRParser.Constr_item_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#constr_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstr_item(SRParser.Constr_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#create_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_expr(SRParser.Create_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#create_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_call(SRParser.Create_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#rsrc_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRsrc_name(SRParser.Rsrc_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#location_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation_opt(SRParser.Location_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#qualified_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_id(SRParser.Qualified_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#end_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_id(SRParser.End_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#id_ls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_ls(SRParser.Id_lsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#id_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_lp(SRParser.Id_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#id_subs_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_subs_lp(SRParser.Id_subs_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#id_subs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_subs(SRParser.Id_subsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#subscripts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscripts(SRParser.SubscriptsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#subscripts_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscripts_opt(SRParser.Subscripts_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#bracketed_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketed_list(SRParser.Bracketed_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#bound_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBound_lp(SRParser.Bound_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#bounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBounds(SRParser.BoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SRParser#bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBound(SRParser.BoundContext ctx);
}