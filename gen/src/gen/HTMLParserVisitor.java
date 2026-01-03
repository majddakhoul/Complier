// Generated from C:/Users/asus/IdeaProjects/init/src/HTMLParser.g4 by ANTLR 4.13.2
package src\gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HTMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HTMLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HTMLParser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml(HTMLParser.HtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(HTMLParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(HTMLParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(HTMLParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#attr_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_value(HTMLParser.Attr_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#misc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMisc(HTMLParser.MiscContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#jinja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja(HTMLParser.JinjaContext ctx);
}