// Generated from C:/Users/asus/IdeaProjects/init/src/HTMLParser.g4 by ANTLR 4.13.2
package genhtml;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLParser}.
 */
public interface HTMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
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
	 * Enter a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(HTMLParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(HTMLParser.TagNameContext ctx);
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
	 * Enter a parse tree produced by {@link HTMLParser#jinjaExpr}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpr(HTMLParser.JinjaExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#jinjaExpr}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpr(HTMLParser.JinjaExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlock(HTMLParser.JinjaBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlock(HTMLParser.JinjaBlockContext ctx);
}