// Generated from C:/Users/asus/IdeaProjects/init/src/PythonParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonParser}.
 */
public interface PythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PythonParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PythonParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PythonParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PythonParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void enterImportStmt(PythonParser.ImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void exitImportStmt(PythonParser.ImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#importItem}.
	 * @param ctx the parse tree
	 */
	void enterImportItem(PythonParser.ImportItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#importItem}.
	 * @param ctx the parse tree
	 */
	void exitImportItem(PythonParser.ImportItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dottedName}.
	 * @param ctx the parse tree
	 */
	void enterDottedName(PythonParser.DottedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dottedName}.
	 * @param ctx the parse tree
	 */
	void exitDottedName(PythonParser.DottedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PythonParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PythonParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(PythonParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(PythonParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(PythonParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(PythonParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(PythonParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(PythonParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(PythonParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(PythonParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PythonParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PythonParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PythonParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PythonParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(PythonParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(PythonParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(PythonParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(PythonParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(PythonParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(PythonParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(PythonParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(PythonParser.ArgContext ctx);
}