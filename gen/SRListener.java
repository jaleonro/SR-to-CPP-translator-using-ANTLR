// Generated from C:/Users/corre/OneDrive/Documentos/2019-02/Lenguajes de programacion/Traductor_Lenguajes_v2/gramar\SR.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SRParser}.
 */
public interface SRListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SRParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(SRParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(SRParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(SRParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(SRParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#spec_component}.
	 * @param ctx the parse tree
	 */
	void enterSpec_component(SRParser.Spec_componentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#spec_component}.
	 * @param ctx the parse tree
	 */
	void exitSpec_component(SRParser.Spec_componentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#combined_component}.
	 * @param ctx the parse tree
	 */
	void enterCombined_component(SRParser.Combined_componentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#combined_component}.
	 * @param ctx the parse tree
	 */
	void exitCombined_component(SRParser.Combined_componentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#combined_specpart}.
	 * @param ctx the parse tree
	 */
	void enterCombined_specpart(SRParser.Combined_specpartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#combined_specpart}.
	 * @param ctx the parse tree
	 */
	void exitCombined_specpart(SRParser.Combined_specpartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#comp_label}.
	 * @param ctx the parse tree
	 */
	void enterComp_label(SRParser.Comp_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#comp_label}.
	 * @param ctx the parse tree
	 */
	void exitComp_label(SRParser.Comp_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#comp_kwd}.
	 * @param ctx the parse tree
	 */
	void enterComp_kwd(SRParser.Comp_kwdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#comp_kwd}.
	 * @param ctx the parse tree
	 */
	void exitComp_kwd(SRParser.Comp_kwdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#spec_body}.
	 * @param ctx the parse tree
	 */
	void enterSpec_body(SRParser.Spec_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#spec_body}.
	 * @param ctx the parse tree
	 */
	void exitSpec_body(SRParser.Spec_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#maybe_params}.
	 * @param ctx the parse tree
	 */
	void enterMaybe_params(SRParser.Maybe_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#maybe_params}.
	 * @param ctx the parse tree
	 */
	void exitMaybe_params(SRParser.Maybe_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#comp_params}.
	 * @param ctx the parse tree
	 */
	void enterComp_params(SRParser.Comp_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#comp_params}.
	 * @param ctx the parse tree
	 */
	void exitComp_params(SRParser.Comp_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#separate_body}.
	 * @param ctx the parse tree
	 */
	void enterSeparate_body(SRParser.Separate_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#separate_body}.
	 * @param ctx the parse tree
	 */
	void exitSeparate_body(SRParser.Separate_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#id_opt}.
	 * @param ctx the parse tree
	 */
	void enterId_opt(SRParser.Id_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#id_opt}.
	 * @param ctx the parse tree
	 */
	void exitId_opt(SRParser.Id_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#spec_stmt_ls}.
	 * @param ctx the parse tree
	 */
	void enterSpec_stmt_ls(SRParser.Spec_stmt_lsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#spec_stmt_ls}.
	 * @param ctx the parse tree
	 */
	void exitSpec_stmt_ls(SRParser.Spec_stmt_lsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#spec_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSpec_stmt(SRParser.Spec_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#spec_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSpec_stmt(SRParser.Spec_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#body_stmt_ls}.
	 * @param ctx the parse tree
	 */
	void enterBody_stmt_ls(SRParser.Body_stmt_lsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#body_stmt_ls}.
	 * @param ctx the parse tree
	 */
	void exitBody_stmt_ls(SRParser.Body_stmt_lsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#body_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBody_stmt(SRParser.Body_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#body_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBody_stmt(SRParser.Body_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#body_only}.
	 * @param ctx the parse tree
	 */
	void enterBody_only(SRParser.Body_onlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#body_only}.
	 * @param ctx the parse tree
	 */
	void exitBody_only(SRParser.Body_onlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#common_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCommon_stmt(SRParser.Common_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#common_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCommon_stmt(SRParser.Common_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#import_clause}.
	 * @param ctx the parse tree
	 */
	void enterImport_clause(SRParser.Import_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#import_clause}.
	 * @param ctx the parse tree
	 */
	void exitImport_clause(SRParser.Import_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#extend_clause}.
	 * @param ctx the parse tree
	 */
	void enterExtend_clause(SRParser.Extend_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#extend_clause}.
	 * @param ctx the parse tree
	 */
	void exitExtend_clause(SRParser.Extend_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#import_list}.
	 * @param ctx the parse tree
	 */
	void enterImport_list(SRParser.Import_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#import_list}.
	 * @param ctx the parse tree
	 */
	void exitImport_list(SRParser.Import_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#import_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_name(SRParser.Import_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#import_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_name(SRParser.Import_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#op_decl}.
	 * @param ctx the parse tree
	 */
	void enterOp_decl(SRParser.Op_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#op_decl}.
	 * @param ctx the parse tree
	 */
	void exitOp_decl(SRParser.Op_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#op_or_ext}.
	 * @param ctx the parse tree
	 */
	void enterOp_or_ext(SRParser.Op_or_extContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#op_or_ext}.
	 * @param ctx the parse tree
	 */
	void exitOp_or_ext(SRParser.Op_or_extContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#oper_def_lp}.
	 * @param ctx the parse tree
	 */
	void enterOper_def_lp(SRParser.Oper_def_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#oper_def_lp}.
	 * @param ctx the parse tree
	 */
	void exitOper_def_lp(SRParser.Oper_def_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#oper_def}.
	 * @param ctx the parse tree
	 */
	void enterOper_def(SRParser.Oper_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#oper_def}.
	 * @param ctx the parse tree
	 */
	void exitOper_def(SRParser.Oper_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#colon_opt}.
	 * @param ctx the parse tree
	 */
	void enterColon_opt(SRParser.Colon_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#colon_opt}.
	 * @param ctx the parse tree
	 */
	void exitColon_opt(SRParser.Colon_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#sem_decl}.
	 * @param ctx the parse tree
	 */
	void enterSem_decl(SRParser.Sem_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#sem_decl}.
	 * @param ctx the parse tree
	 */
	void exitSem_decl(SRParser.Sem_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#sem_def_lp}.
	 * @param ctx the parse tree
	 */
	void enterSem_def_lp(SRParser.Sem_def_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#sem_def_lp}.
	 * @param ctx the parse tree
	 */
	void exitSem_def_lp(SRParser.Sem_def_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#sem_def}.
	 * @param ctx the parse tree
	 */
	void enterSem_def(SRParser.Sem_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#sem_def}.
	 * @param ctx the parse tree
	 */
	void exitSem_def(SRParser.Sem_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#sem_proto}.
	 * @param ctx the parse tree
	 */
	void enterSem_proto(SRParser.Sem_protoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#sem_proto}.
	 * @param ctx the parse tree
	 */
	void exitSem_proto(SRParser.Sem_protoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#sem_init}.
	 * @param ctx the parse tree
	 */
	void enterSem_init(SRParser.Sem_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#sem_init}.
	 * @param ctx the parse tree
	 */
	void exitSem_init(SRParser.Sem_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#proc}.
	 * @param ctx the parse tree
	 */
	void enterProc(SRParser.ProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#proc}.
	 * @param ctx the parse tree
	 */
	void exitProc(SRParser.ProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(SRParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(SRParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#process}.
	 * @param ctx the parse tree
	 */
	void enterProcess(SRParser.ProcessContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#process}.
	 * @param ctx the parse tree
	 */
	void exitProcess(SRParser.ProcessContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#initial_block}.
	 * @param ctx the parse tree
	 */
	void enterInitial_block(SRParser.Initial_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#initial_block}.
	 * @param ctx the parse tree
	 */
	void exitInitial_block(SRParser.Initial_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#initial_opt}.
	 * @param ctx the parse tree
	 */
	void enterInitial_opt(SRParser.Initial_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#initial_opt}.
	 * @param ctx the parse tree
	 */
	void exitInitial_opt(SRParser.Initial_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#final_block}.
	 * @param ctx the parse tree
	 */
	void enterFinal_block(SRParser.Final_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#final_block}.
	 * @param ctx the parse tree
	 */
	void exitFinal_block(SRParser.Final_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#final_opt}.
	 * @param ctx the parse tree
	 */
	void enterFinal_opt(SRParser.Final_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#final_opt}.
	 * @param ctx the parse tree
	 */
	void exitFinal_opt(SRParser.Final_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#prototype}.
	 * @param ctx the parse tree
	 */
	void enterPrototype(SRParser.PrototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#prototype}.
	 * @param ctx the parse tree
	 */
	void exitPrototype(SRParser.PrototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(SRParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(SRParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#param_spec_ls}.
	 * @param ctx the parse tree
	 */
	void enterParam_spec_ls(SRParser.Param_spec_lsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#param_spec_ls}.
	 * @param ctx the parse tree
	 */
	void exitParam_spec_ls(SRParser.Param_spec_lsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#param_spec_lp}.
	 * @param ctx the parse tree
	 */
	void enterParam_spec_lp(SRParser.Param_spec_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#param_spec_lp}.
	 * @param ctx the parse tree
	 */
	void exitParam_spec_lp(SRParser.Param_spec_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#param_spec}.
	 * @param ctx the parse tree
	 */
	void enterParam_spec(SRParser.Param_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#param_spec}.
	 * @param ctx the parse tree
	 */
	void exitParam_spec(SRParser.Param_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#param_kind_opt}.
	 * @param ctx the parse tree
	 */
	void enterParam_kind_opt(SRParser.Param_kind_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#param_kind_opt}.
	 * @param ctx the parse tree
	 */
	void exitParam_kind_opt(SRParser.Param_kind_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#return_spec_opt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_spec_opt(SRParser.Return_spec_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#return_spec_opt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_spec_opt(SRParser.Return_spec_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#return_spec_null}.
	 * @param ctx the parse tree
	 */
	void enterReturn_spec_null(SRParser.Return_spec_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#return_spec_null}.
	 * @param ctx the parse tree
	 */
	void exitReturn_spec_null(SRParser.Return_spec_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#param_names}.
	 * @param ctx the parse tree
	 */
	void enterParam_names(SRParser.Param_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#param_names}.
	 * @param ctx the parse tree
	 */
	void exitParam_names(SRParser.Param_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#return_name_opt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_name_opt(SRParser.Return_name_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#return_name_opt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_name_opt(SRParser.Return_name_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(SRParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(SRParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void enterType_decl(SRParser.Type_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void exitType_decl(SRParser.Type_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#type_restriction}.
	 * @param ctx the parse tree
	 */
	void enterType_restriction(SRParser.Type_restrictionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#type_restriction}.
	 * @param ctx the parse tree
	 */
	void exitType_restriction(SRParser.Type_restrictionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#obj_decl}.
	 * @param ctx the parse tree
	 */
	void enterObj_decl(SRParser.Obj_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#obj_decl}.
	 * @param ctx the parse tree
	 */
	void exitObj_decl(SRParser.Obj_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#var_or_const}.
	 * @param ctx the parse tree
	 */
	void enterVar_or_const(SRParser.Var_or_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#var_or_const}.
	 * @param ctx the parse tree
	 */
	void exitVar_or_const(SRParser.Var_or_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#var_def_lp}.
	 * @param ctx the parse tree
	 */
	void enterVar_def_lp(SRParser.Var_def_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#var_def_lp}.
	 * @param ctx the parse tree
	 */
	void exitVar_def_lp(SRParser.Var_def_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#var_def}.
	 * @param ctx the parse tree
	 */
	void enterVar_def(SRParser.Var_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#var_def}.
	 * @param ctx the parse tree
	 */
	void exitVar_def(SRParser.Var_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#var_att}.
	 * @param ctx the parse tree
	 */
	void enterVar_att(SRParser.Var_attContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#var_att}.
	 * @param ctx the parse tree
	 */
	void exitVar_att(SRParser.Var_attContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SRParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SRParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#unsub_type}.
	 * @param ctx the parse tree
	 */
	void enterUnsub_type(SRParser.Unsub_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#unsub_type}.
	 * @param ctx the parse tree
	 */
	void exitUnsub_type(SRParser.Unsub_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#basic_type}.
	 * @param ctx the parse tree
	 */
	void enterBasic_type(SRParser.Basic_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#basic_type}.
	 * @param ctx the parse tree
	 */
	void exitBasic_type(SRParser.Basic_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#string_def}.
	 * @param ctx the parse tree
	 */
	void enterString_def(SRParser.String_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#string_def}.
	 * @param ctx the parse tree
	 */
	void exitString_def(SRParser.String_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#string_lim}.
	 * @param ctx the parse tree
	 */
	void enterString_lim(SRParser.String_limContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#string_lim}.
	 * @param ctx the parse tree
	 */
	void exitString_lim(SRParser.String_limContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#enum_def}.
	 * @param ctx the parse tree
	 */
	void enterEnum_def(SRParser.Enum_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#enum_def}.
	 * @param ctx the parse tree
	 */
	void exitEnum_def(SRParser.Enum_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#pointer_def}.
	 * @param ctx the parse tree
	 */
	void enterPointer_def(SRParser.Pointer_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#pointer_def}.
	 * @param ctx the parse tree
	 */
	void exitPointer_def(SRParser.Pointer_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#record_def}.
	 * @param ctx the parse tree
	 */
	void enterRecord_def(SRParser.Record_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#record_def}.
	 * @param ctx the parse tree
	 */
	void exitRecord_def(SRParser.Record_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#union_def}.
	 * @param ctx the parse tree
	 */
	void enterUnion_def(SRParser.Union_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#union_def}.
	 * @param ctx the parse tree
	 */
	void exitUnion_def(SRParser.Union_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#field_lp}.
	 * @param ctx the parse tree
	 */
	void enterField_lp(SRParser.Field_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#field_lp}.
	 * @param ctx the parse tree
	 */
	void exitField_lp(SRParser.Field_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(SRParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(SRParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#capability_def}.
	 * @param ctx the parse tree
	 */
	void enterCapability_def(SRParser.Capability_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#capability_def}.
	 * @param ctx the parse tree
	 */
	void exitCapability_def(SRParser.Capability_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#cap_for}.
	 * @param ctx the parse tree
	 */
	void enterCap_for(SRParser.Cap_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#cap_for}.
	 * @param ctx the parse tree
	 */
	void exitCap_for(SRParser.Cap_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#optype_decl}.
	 * @param ctx the parse tree
	 */
	void enterOptype_decl(SRParser.Optype_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#optype_decl}.
	 * @param ctx the parse tree
	 */
	void exitOptype_decl(SRParser.Optype_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#op_prototype}.
	 * @param ctx the parse tree
	 */
	void enterOp_prototype(SRParser.Op_prototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#op_prototype}.
	 * @param ctx the parse tree
	 */
	void exitOp_prototype(SRParser.Op_prototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#eq_opt}.
	 * @param ctx the parse tree
	 */
	void enterEq_opt(SRParser.Eq_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#eq_opt}.
	 * @param ctx the parse tree
	 */
	void exitEq_opt(SRParser.Eq_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#op_restriction_opt}.
	 * @param ctx the parse tree
	 */
	void enterOp_restriction_opt(SRParser.Op_restriction_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#op_restriction_opt}.
	 * @param ctx the parse tree
	 */
	void exitOp_restriction_opt(SRParser.Op_restriction_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#op_restriction}.
	 * @param ctx the parse tree
	 */
	void enterOp_restriction(SRParser.Op_restrictionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#op_restriction}.
	 * @param ctx the parse tree
	 */
	void exitOp_restriction(SRParser.Op_restrictionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SRParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SRParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#block_items}.
	 * @param ctx the parse tree
	 */
	void enterBlock_items(SRParser.Block_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#block_items}.
	 * @param ctx the parse tree
	 */
	void exitBlock_items(SRParser.Block_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#block_item}.
	 * @param ctx the parse tree
	 */
	void enterBlock_item(SRParser.Block_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#block_item}.
	 * @param ctx the parse tree
	 */
	void exitBlock_item(SRParser.Block_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SRParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SRParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#skip_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSkip_stmt(SRParser.Skip_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#skip_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSkip_stmt(SRParser.Skip_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#stop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterStop_stmt(SRParser.Stop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#stop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitStop_stmt(SRParser.Stop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#exit_code_opt}.
	 * @param ctx the parse tree
	 */
	void enterExit_code_opt(SRParser.Exit_code_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#exit_code_opt}.
	 * @param ctx the parse tree
	 */
	void exitExit_code_opt(SRParser.Exit_code_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#exit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExit_stmt(SRParser.Exit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#exit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExit_stmt(SRParser.Exit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#next_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNext_stmt(SRParser.Next_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#next_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNext_stmt(SRParser.Next_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(SRParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(SRParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#reply_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReply_stmt(SRParser.Reply_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#reply_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReply_stmt(SRParser.Reply_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#forward_stmt}.
	 * @param ctx the parse tree
	 */
	void enterForward_stmt(SRParser.Forward_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#forward_stmt}.
	 * @param ctx the parse tree
	 */
	void exitForward_stmt(SRParser.Forward_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#send_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSend_stmt(SRParser.Send_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#send_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSend_stmt(SRParser.Send_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#receive_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReceive_stmt(SRParser.Receive_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#receive_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReceive_stmt(SRParser.Receive_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#v_stmt}.
	 * @param ctx the parse tree
	 */
	void enterV_stmt(SRParser.V_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#v_stmt}.
	 * @param ctx the parse tree
	 */
	void exitV_stmt(SRParser.V_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#p_stmt}.
	 * @param ctx the parse tree
	 */
	void enterP_stmt(SRParser.P_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#p_stmt}.
	 * @param ctx the parse tree
	 */
	void exitP_stmt(SRParser.P_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#explicit_call}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_call(SRParser.Explicit_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#explicit_call}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_call(SRParser.Explicit_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#destroy_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDestroy_stmt(SRParser.Destroy_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#destroy_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDestroy_stmt(SRParser.Destroy_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#begin_end}.
	 * @param ctx the parse tree
	 */
	void enterBegin_end(SRParser.Begin_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#begin_end}.
	 * @param ctx the parse tree
	 */
	void exitBegin_end(SRParser.Begin_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(SRParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(SRParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#do_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDo_stmt(SRParser.Do_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#do_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDo_stmt(SRParser.Do_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#guarded_cmd_lp}.
	 * @param ctx the parse tree
	 */
	void enterGuarded_cmd_lp(SRParser.Guarded_cmd_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#guarded_cmd_lp}.
	 * @param ctx the parse tree
	 */
	void exitGuarded_cmd_lp(SRParser.Guarded_cmd_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#guarded_cmd}.
	 * @param ctx the parse tree
	 */
	void enterGuarded_cmd(SRParser.Guarded_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#guarded_cmd}.
	 * @param ctx the parse tree
	 */
	void exitGuarded_cmd(SRParser.Guarded_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#else_cmd_opt}.
	 * @param ctx the parse tree
	 */
	void enterElse_cmd_opt(SRParser.Else_cmd_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#else_cmd_opt}.
	 * @param ctx the parse tree
	 */
	void exitElse_cmd_opt(SRParser.Else_cmd_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#for_all_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_all_stmt(SRParser.For_all_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#for_all_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_all_stmt(SRParser.For_all_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#input_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInput_stmt(SRParser.Input_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#input_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInput_stmt(SRParser.Input_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#in_cmd_lp}.
	 * @param ctx the parse tree
	 */
	void enterIn_cmd_lp(SRParser.In_cmd_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#in_cmd_lp}.
	 * @param ctx the parse tree
	 */
	void exitIn_cmd_lp(SRParser.In_cmd_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#in_cmd}.
	 * @param ctx the parse tree
	 */
	void enterIn_cmd(SRParser.In_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#in_cmd}.
	 * @param ctx the parse tree
	 */
	void exitIn_cmd(SRParser.In_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#in_spec}.
	 * @param ctx the parse tree
	 */
	void enterIn_spec(SRParser.In_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#in_spec}.
	 * @param ctx the parse tree
	 */
	void exitIn_spec(SRParser.In_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#in_op}.
	 * @param ctx the parse tree
	 */
	void enterIn_op(SRParser.In_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#in_op}.
	 * @param ctx the parse tree
	 */
	void exitIn_op(SRParser.In_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#sync_expr_opt}.
	 * @param ctx the parse tree
	 */
	void enterSync_expr_opt(SRParser.Sync_expr_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#sync_expr_opt}.
	 * @param ctx the parse tree
	 */
	void exitSync_expr_opt(SRParser.Sync_expr_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#sched_expr_opt}.
	 * @param ctx the parse tree
	 */
	void enterSched_expr_opt(SRParser.Sched_expr_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#sched_expr_opt}.
	 * @param ctx the parse tree
	 */
	void exitSched_expr_opt(SRParser.Sched_expr_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#concurrent_stmt}.
	 * @param ctx the parse tree
	 */
	void enterConcurrent_stmt(SRParser.Concurrent_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#concurrent_stmt}.
	 * @param ctx the parse tree
	 */
	void exitConcurrent_stmt(SRParser.Concurrent_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#concurrent_cmd_lp}.
	 * @param ctx the parse tree
	 */
	void enterConcurrent_cmd_lp(SRParser.Concurrent_cmd_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#concurrent_cmd_lp}.
	 * @param ctx the parse tree
	 */
	void exitConcurrent_cmd_lp(SRParser.Concurrent_cmd_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#concurrent_cmd}.
	 * @param ctx the parse tree
	 */
	void enterConcurrent_cmd(SRParser.Concurrent_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#concurrent_cmd}.
	 * @param ctx the parse tree
	 */
	void exitConcurrent_cmd(SRParser.Concurrent_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#separator_opt}.
	 * @param ctx the parse tree
	 */
	void enterSeparator_opt(SRParser.Separator_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#separator_opt}.
	 * @param ctx the parse tree
	 */
	void exitSeparator_opt(SRParser.Separator_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#concurrent_invocation}.
	 * @param ctx the parse tree
	 */
	void enterConcurrent_invocation(SRParser.Concurrent_invocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#concurrent_invocation}.
	 * @param ctx the parse tree
	 */
	void exitConcurrent_invocation(SRParser.Concurrent_invocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#post_processing_opt}.
	 * @param ctx the parse tree
	 */
	void enterPost_processing_opt(SRParser.Post_processing_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#post_processing_opt}.
	 * @param ctx the parse tree
	 */
	void exitPost_processing_opt(SRParser.Post_processing_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#quantifiers_opt}.
	 * @param ctx the parse tree
	 */
	void enterQuantifiers_opt(SRParser.Quantifiers_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#quantifiers_opt}.
	 * @param ctx the parse tree
	 */
	void exitQuantifiers_opt(SRParser.Quantifiers_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#quantifier_lp}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier_lp(SRParser.Quantifier_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#quantifier_lp}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier_lp(SRParser.Quantifier_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier(SRParser.QuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier(SRParser.QuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(SRParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(SRParser.DirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#step_opt}.
	 * @param ctx the parse tree
	 */
	void enterStep_opt(SRParser.Step_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#step_opt}.
	 * @param ctx the parse tree
	 */
	void exitStep_opt(SRParser.Step_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#such_that_opt}.
	 * @param ctx the parse tree
	 */
	void enterSuch_that_opt(SRParser.Such_that_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#such_that_opt}.
	 * @param ctx the parse tree
	 */
	void exitSuch_that_opt(SRParser.Such_that_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SRParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SRParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SRParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SRParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#prefix_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_expr(SRParser.Prefix_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#prefix_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_expr(SRParser.Prefix_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#new_item}.
	 * @param ctx the parse tree
	 */
	void enterNew_item(SRParser.New_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#new_item}.
	 * @param ctx the parse tree
	 */
	void exitNew_item(SRParser.New_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#paren_expr}.
	 * @param ctx the parse tree
	 */
	void enterParen_expr(SRParser.Paren_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#paren_expr}.
	 * @param ctx the parse tree
	 */
	void exitParen_expr(SRParser.Paren_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#paren_list}.
	 * @param ctx the parse tree
	 */
	void enterParen_list(SRParser.Paren_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#paren_list}.
	 * @param ctx the parse tree
	 */
	void exitParen_list(SRParser.Paren_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#paren_item_ls}.
	 * @param ctx the parse tree
	 */
	void enterParen_item_ls(SRParser.Paren_item_lsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#paren_item_ls}.
	 * @param ctx the parse tree
	 */
	void exitParen_item_ls(SRParser.Paren_item_lsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#expr_lp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_lp(SRParser.Expr_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#expr_lp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_lp(SRParser.Expr_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(SRParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(SRParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#constr_item_lp}.
	 * @param ctx the parse tree
	 */
	void enterConstr_item_lp(SRParser.Constr_item_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#constr_item_lp}.
	 * @param ctx the parse tree
	 */
	void exitConstr_item_lp(SRParser.Constr_item_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#constr_item}.
	 * @param ctx the parse tree
	 */
	void enterConstr_item(SRParser.Constr_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#constr_item}.
	 * @param ctx the parse tree
	 */
	void exitConstr_item(SRParser.Constr_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#create_expr}.
	 * @param ctx the parse tree
	 */
	void enterCreate_expr(SRParser.Create_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#create_expr}.
	 * @param ctx the parse tree
	 */
	void exitCreate_expr(SRParser.Create_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#create_call}.
	 * @param ctx the parse tree
	 */
	void enterCreate_call(SRParser.Create_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#create_call}.
	 * @param ctx the parse tree
	 */
	void exitCreate_call(SRParser.Create_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#rsrc_name}.
	 * @param ctx the parse tree
	 */
	void enterRsrc_name(SRParser.Rsrc_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#rsrc_name}.
	 * @param ctx the parse tree
	 */
	void exitRsrc_name(SRParser.Rsrc_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#location_opt}.
	 * @param ctx the parse tree
	 */
	void enterLocation_opt(SRParser.Location_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#location_opt}.
	 * @param ctx the parse tree
	 */
	void exitLocation_opt(SRParser.Location_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#qualified_id}.
	 * @param ctx the parse tree
	 */
	void enterQualified_id(SRParser.Qualified_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#qualified_id}.
	 * @param ctx the parse tree
	 */
	void exitQualified_id(SRParser.Qualified_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#end_id}.
	 * @param ctx the parse tree
	 */
	void enterEnd_id(SRParser.End_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#end_id}.
	 * @param ctx the parse tree
	 */
	void exitEnd_id(SRParser.End_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#id_ls}.
	 * @param ctx the parse tree
	 */
	void enterId_ls(SRParser.Id_lsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#id_ls}.
	 * @param ctx the parse tree
	 */
	void exitId_ls(SRParser.Id_lsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#id_lp}.
	 * @param ctx the parse tree
	 */
	void enterId_lp(SRParser.Id_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#id_lp}.
	 * @param ctx the parse tree
	 */
	void exitId_lp(SRParser.Id_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#id_subs_lp}.
	 * @param ctx the parse tree
	 */
	void enterId_subs_lp(SRParser.Id_subs_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#id_subs_lp}.
	 * @param ctx the parse tree
	 */
	void exitId_subs_lp(SRParser.Id_subs_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#id_subs}.
	 * @param ctx the parse tree
	 */
	void enterId_subs(SRParser.Id_subsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#id_subs}.
	 * @param ctx the parse tree
	 */
	void exitId_subs(SRParser.Id_subsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#subscripts}.
	 * @param ctx the parse tree
	 */
	void enterSubscripts(SRParser.SubscriptsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#subscripts}.
	 * @param ctx the parse tree
	 */
	void exitSubscripts(SRParser.SubscriptsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#subscripts_opt}.
	 * @param ctx the parse tree
	 */
	void enterSubscripts_opt(SRParser.Subscripts_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#subscripts_opt}.
	 * @param ctx the parse tree
	 */
	void exitSubscripts_opt(SRParser.Subscripts_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#bracketed_list}.
	 * @param ctx the parse tree
	 */
	void enterBracketed_list(SRParser.Bracketed_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#bracketed_list}.
	 * @param ctx the parse tree
	 */
	void exitBracketed_list(SRParser.Bracketed_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#bound_lp}.
	 * @param ctx the parse tree
	 */
	void enterBound_lp(SRParser.Bound_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#bound_lp}.
	 * @param ctx the parse tree
	 */
	void exitBound_lp(SRParser.Bound_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#bounds}.
	 * @param ctx the parse tree
	 */
	void enterBounds(SRParser.BoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#bounds}.
	 * @param ctx the parse tree
	 */
	void exitBounds(SRParser.BoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SRParser#bound}.
	 * @param ctx the parse tree
	 */
	void enterBound(SRParser.BoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link SRParser#bound}.
	 * @param ctx the parse tree
	 */
	void exitBound(SRParser.BoundContext ctx);
}