import java.util.List;

public class ListenerTranslator extends SRBaseListener {

    @Override public void exitObj_decl(SRParser.Obj_declContext ctx) {
        String tipoSR;
        String const_var = ctx.var_or_const().getText();
        String nombres = ctx.var_def_lp().var_def().id_subs_lp().getText();
        if (ctx.var_def_lp().var_def().var_att().type() != null){
            tipoSR = ctx.var_def_lp().var_def().var_att().type().unsub_type().basic_type().getText();
        }else{
            tipoSR = "int";
        }
        String tipoC;
        String var_const;
        if(const_var.equals("const")) {
            var_const = const_var + " ";
        } else{
            var_const = "";
        }
        if(tipoSR.equals("real")) {
            tipoC = "float";
        } else{
            tipoC = tipoSR;
        }
        String salida = var_const + tipoC + " " + nombres + ";";
        System.out.printf(salida + "\n");
    }

    @Override public void exitBody_stmt(SRParser.Body_stmtContext ctx) {
        String salida="";
        if(ctx.expr() != null){
            String expresion = ctx.expr().getText();
            salida = expresion.replaceAll(":=","=");
            salida = expresion.replaceAll("mod","MOD");

            if(ctx.expr().TK_SWAP() == null){
                System.out.printf(salida + ";" + "\n");
            }
        }
    }

    @Override public void exitBlock_item(SRParser.Block_itemContext ctx) {
        String salida="";
        if(ctx.expr() != null){
            String expresion = ctx.expr().getText();
            salida = expresion.replaceAll(":=","=");
            salida = expresion.replaceAll("mod","MOD");

            if(ctx.expr().TK_SWAP() == null){
                System.out.printf(salida + ";" + "\n");
            }
        }

    }

    @Override public void exitExpr(SRParser.ExprContext ctx) {
        String expresion = ctx.getText();
        String salida;
        if (ctx.TK_NE() != null | ctx.TK_GE() != null | ctx.TK_GT() != null | ctx.TK_EQ() != null | ctx.TK_LT() != null | ctx.TK_LE() != null){
            if (ctx.TK_EQ() != null){
                salida = expresion.replaceAll("=","==");
            }else {
                salida = expresion;
            }
            System.out.printf("(" + salida + ")");
        }
    }

    @Override public void enterDo_stmt(SRParser.Do_stmtContext ctx) {
        String salida;
        salida = "while" + " ";
        System.out.printf(salida);
    }

    @Override public void enterIf_stmt(SRParser.If_stmtContext ctx) {
        String salida;
        salida = "if" + " ";
        System.out.printf(salida);
    }

    @Override public void enterElse_cmd_opt(SRParser.Else_cmd_optContext ctx) {
        String salida;
        if (ctx.TK_SQUARE() != null){
            salida = "else" + " ";
            System.out.printf(salida);
        }
    }

    @Override public void enterBlock(SRParser.BlockContext ctx) {
        System.out.printf("{" + "\n");
    }

    @Override public void exitBlock(SRParser.BlockContext ctx) {
        System.out.printf("}" + "\n");
    }

    @Override public void enterCombined_component(SRParser.Combined_componentContext ctx) {
        String salida;
        salida = "int" + " ";
        System.out.printf(salida);
    }

    @Override public void enterSpec_component(SRParser.Spec_componentContext ctx) {
        String salida;
        salida = "int" + " ";
        System.out.printf(salida);
    }

    @Override public void exitSpec_component(SRParser.Spec_componentContext ctx) {
        String salida;
        salida = "return 0" + "\n" + "}"+ "\n";
        System.out.printf(salida);
    }

    @Override public void exitCombined_component(SRParser.Combined_componentContext ctx) {
        String salida;
        salida = "return 0" + "\n" + "}" + "\n";
        System.out.printf(salida);
    }

    @Override public void exitComp_label(SRParser.Comp_labelContext ctx) {
        String salida;
        if (ctx.parent.getRuleIndex() == SRParser.RULE_spec_component){
            salida = ctx.TK_ID().getText() + "()" + "{" + "\n";
        }else{
            salida = ctx.TK_ID().getText();
        }
        System.out.printf(salida);
    }

    @Override public void exitComp_params(SRParser.Comp_paramsContext ctx) {
        String salida = ctx.getText();
        System.out.printf(salida + "{" + "\n");
    }

    @Override public void exitQuantifier(SRParser.QuantifierContext ctx) {
        String salida;
        String incremento = "";
        String id = ctx.TK_ID().getText();
        if (ctx.step_opt().start.getText().equals("by")){
            incremento = ctx.step_opt().expr().getText();
        }
        else{
            incremento = id + "++";
        }
        List<SRParser.ExprContext> expresiones = ctx.expr();
        String expresion1 = expresiones.get(0).getText();
        String expresion2 = expresiones.get(1).getText();
        salida = "for ("+ id + "=" + expresion1 + ";" + id + "=" + expresion2 + ";" + incremento + ") {"+ "\n" ;
        System.out.printf(salida);
    }

    @Override public void exitFor_all_stmt(SRParser.For_all_stmtContext ctx) {
        String text = ctx.quantifier_lp().getText();
        Long numberOfLoops = text.chars().filter(ch -> ch == ',').count();
        for (int i = 0; i < numberOfLoops + 1; i++){
            System.out.printf("}"+ "\n" );
        }
    }
}