// Generated from C:/Users/asus/IdeaProjects/init/src/Jinja2Parser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Jinja2Parser}.
 */
public interface Jinja2ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Jinja2Parser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(Jinja2Parser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2Parser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(Jinja2Parser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2Parser#text_block}.
	 * @param ctx the parse tree
	 */
	void enterText_block(Jinja2Parser.Text_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2Parser#text_block}.
	 * @param ctx the parse tree
	 */
	void exitText_block(Jinja2Parser.Text_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2Parser#var_block}.
	 * @param ctx the parse tree
	 */
	void enterVar_block(Jinja2Parser.Var_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2Parser#var_block}.
	 * @param ctx the parse tree
	 */
	void exitVar_block(Jinja2Parser.Var_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2Parser#stmt_block}.
	 * @param ctx the parse tree
	 */
	void enterStmt_block(Jinja2Parser.Stmt_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2Parser#stmt_block}.
	 * @param ctx the parse tree
	 */
	void exitStmt_block(Jinja2Parser.Stmt_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Jinja2Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Jinja2Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2Parser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(Jinja2Parser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2Parser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(Jinja2Parser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2Parser#for_body}.
	 * @param ctx the parse tree
	 */
	void enterFor_body(Jinja2Parser.For_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2Parser#for_body}.
	 * @param ctx the parse tree
	 */
	void exitFor_body(Jinja2Parser.For_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2Parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(Jinja2Parser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2Parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(Jinja2Parser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2Parser#if_body}.
	 * @param ctx the parse tree
	 */
	void enterIf_body(Jinja2Parser.If_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2Parser#if_body}.
	 * @param ctx the parse tree
	 */
	void exitIf_body(Jinja2Parser.If_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2Parser#elif_body}.
	 * @param ctx the parse tree
	 */
	void enterElif_body(Jinja2Parser.Elif_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2Parser#elif_body}.
	 * @param ctx the parse tree
	 */
	void exitElif_body(Jinja2Parser.Elif_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2Parser#else_body}.
	 * @param ctx the parse tree
	 */
	void enterElse_body(Jinja2Parser.Else_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2Parser#else_body}.
	 * @param ctx the parse tree
	 */
	void exitElse_body(Jinja2Parser.Else_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2Parser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(Jinja2Parser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2Parser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(Jinja2Parser.Block_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2Parser#block_body}.
	 * @param ctx the parse tree
	 */
	void enterBlock_body(Jinja2Parser.Block_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2Parser#block_body}.
	 * @param ctx the parse tree
	 */
	void exitBlock_body(Jinja2Parser.Block_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2Parser#extends_statement}.
	 * @param ctx the parse tree
	 */
	void enterExtends_statement(Jinja2Parser.Extends_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2Parser#extends_statement}.
	 * @param ctx the parse tree
	 */
	void exitExtends_statement(Jinja2Parser.Extends_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2Parser#include_statement}.
	 * @param ctx the parse tree
	 */
	void enterInclude_statement(Jinja2Parser.Include_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2Parser#include_statement}.
	 * @param ctx the parse tree
	 */
	void exitInclude_statement(Jinja2Parser.Include_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2Parser#set_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_statement(Jinja2Parser.Set_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2Parser#set_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_statement(Jinja2Parser.Set_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2Parser#macro_statement}.
	 * @param ctx the parse tree
	 */
	void enterMacro_statement(Jinja2Parser.Macro_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2Parser#macro_statement}.
	 * @param ctx the parse tree
	 */
	void exitMacro_statement(Jinja2Parser.Macro_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2Parser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(Jinja2Parser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2Parser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(Jinja2Parser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2Parser#macro_body}.
	 * @param ctx the parse tree
	 */
	void enterMacro_body(Jinja2Parser.Macro_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2Parser#macro_body}.
	 * @param ctx the parse tree
	 */
	void exitMacro_body(Jinja2Parser.Macro_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2Parser#expr_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpr_statement(Jinja2Parser.Expr_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2Parser#expr_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpr_statement(Jinja2Parser.Expr_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Jinja2Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Jinja2Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2Parser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(Jinja2Parser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2Parser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(Jinja2Parser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2Parser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(Jinja2Parser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2Parser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(Jinja2Parser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2Parser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(Jinja2Parser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2Parser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(Jinja2Parser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2Parser#context}.
	 * @param ctx the parse tree
	 */
	void enterContext(Jinja2Parser.ContextContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2Parser#context}.
	 * @param ctx the parse tree
	 */
	void exitContext(Jinja2Parser.ContextContext ctx);
	/**
	 * Enter a parse tree produced by {@link Jinja2Parser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(Jinja2Parser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link Jinja2Parser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(Jinja2Parser.PairContext ctx);
}