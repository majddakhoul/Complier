// Generated from C:/Users/asus/IdeaProjects/init/src/Jinja2Parser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Jinja2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Jinja2ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Jinja2Parser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(Jinja2Parser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2Parser#text_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_block(Jinja2Parser.Text_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2Parser#var_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_block(Jinja2Parser.Var_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2Parser#stmt_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_block(Jinja2Parser.Stmt_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Jinja2Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2Parser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(Jinja2Parser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2Parser#for_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_body(Jinja2Parser.For_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2Parser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(Jinja2Parser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2Parser#if_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_body(Jinja2Parser.If_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2Parser#elif_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif_body(Jinja2Parser.Elif_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2Parser#else_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_body(Jinja2Parser.Else_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2Parser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(Jinja2Parser.Block_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2Parser#block_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_body(Jinja2Parser.Block_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2Parser#extends_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtends_statement(Jinja2Parser.Extends_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2Parser#include_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude_statement(Jinja2Parser.Include_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2Parser#set_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_statement(Jinja2Parser.Set_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2Parser#macro_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro_statement(Jinja2Parser.Macro_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2Parser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(Jinja2Parser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2Parser#macro_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro_body(Jinja2Parser.Macro_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2Parser#expr_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_statement(Jinja2Parser.Expr_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(Jinja2Parser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2Parser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(Jinja2Parser.FilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2Parser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(Jinja2Parser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2Parser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(Jinja2Parser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2Parser#context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContext(Jinja2Parser.ContextContext ctx);
	/**
	 * Visit a parse tree produced by {@link Jinja2Parser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(Jinja2Parser.PairContext ctx);
}