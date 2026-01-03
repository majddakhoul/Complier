// Generated from C:/Users/asus/IdeaProjects/init/src/PythonParser.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by {@link PythonParser#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def(PythonParser.Function_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def(PythonParser.Function_defContext ctx);
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
	 * Enter a parse tree produced by {@link PythonParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(PythonParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(PythonParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(PythonParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(PythonParser.For_statementContext ctx);
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
	 * Enter a parse tree produced by {@link PythonParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_statement(PythonParser.Simple_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_statement(PythonParser.Simple_statementContext ctx);
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
	 * Enter a parse tree produced by {@link PythonParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(PythonParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(PythonParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#import_statement}.
	 * @param ctx the parse tree
	 */
	void enterImport_statement(PythonParser.Import_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#import_statement}.
	 * @param ctx the parse tree
	 */
	void exitImport_statement(PythonParser.Import_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_name(PythonParser.Dotted_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_name(PythonParser.Dotted_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_names(PythonParser.Import_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_names(PythonParser.Import_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_name(PythonParser.Import_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_name(PythonParser.Import_as_nameContext ctx);
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
	 * Enter a parse tree produced by {@link PythonParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(PythonParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(PythonParser.ArgsContext ctx);
}