// Generated from C:/Users/asus/IdeaProjects/init/src/HTMLParser.g4 by ANTLR 4.13.2
package src\gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLParser}.
 */
public interface HTMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HTMLParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtml(HTMLParser.HtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtml(HTMLParser.HtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(HTMLParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(HTMLParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(HTMLParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(HTMLParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(HTMLParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(HTMLParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#attr_value}.
	 * @param ctx the parse tree
	 */
	void enterAttr_value(HTMLParser.Attr_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#attr_value}.
	 * @param ctx the parse tree
	 */
	void exitAttr_value(HTMLParser.Attr_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#misc}.
	 * @param ctx the parse tree
	 */
	void enterMisc(HTMLParser.MiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#misc}.
	 * @param ctx the parse tree
	 */
	void exitMisc(HTMLParser.MiscContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#jinja}.
	 * @param ctx the parse tree
	 */
	void enterJinja(HTMLParser.JinjaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#jinja}.
	 * @param ctx the parse tree
	 */
	void exitJinja(HTMLParser.JinjaContext ctx);
}