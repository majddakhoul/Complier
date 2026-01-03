import gen.PythonParser;
import gen.PythonParserBaseVisitor;
import gen.PythonParser;
import gen.PythonParserBaseVisitor;
import Classes.*;
import java.util.ArrayList;

public class PythonBaseVisitor extends PythonParserBaseVisitor<Object> {

    SymboleTable symboleTable = new SymboleTable();

    @Override
    public Object visitProgram(PythonParser.ProgramContext ctx) {
        program programObj = new program();
        programObj.setStatements(new ArrayList<statement>());

        for (int i = 0; i < ctx.statement().size(); i++) {
            programObj.getStatements().add((statement) visitStatement(ctx.statement(i)));
        }

        // طباعة جدول الرموز أولاً
        System.out.println(" Python Symbol Table \n");
        System.out.println("Type\t\t\t\tValue");
        System.out.println("----\t\t\t\t-----");
        this.symboleTable.print();

        System.out.println("\n Python AST Built \n");
        return programObj;
    }

    @Override
    public Object visitStatement(PythonParser.StatementContext ctx) {
        statement stmt = new statement();

        if (ctx.importStmt() != null) {
            stmt.setImportStmt((ImportStmt) visitImportStmt(ctx.importStmt()));
        } else if (ctx.assignment() != null) {
            stmt.setAssignment((Assignment) visitAssignment(ctx.assignment()));
        } else if (ctx.ifStmt() != null) {
            stmt.setIfStmt((IfStmt) visitIfStmt(ctx.ifStmt()));
        } else if (ctx.funcDef() != null) {
            stmt.setFunctionDef((FunctionDef) visitFuncDef(ctx.funcDef()));
        } else if (ctx.returnStmt() != null) {
            stmt.setReturnStmt((ReturnStmt) visitReturnStmt(ctx.returnStmt()));
        } else if (ctx.expr() != null) {
            stmt.setExpr((expr) visitExpr(ctx.expr()));
        }

        return stmt;
    }

    @Override
    public Object visitImportStmt(PythonParser.ImportStmtContext ctx) {
        ImportStmt importStmt = new ImportStmt();
        importStmt.setImportItems(new ArrayList<importItem>());

        if (ctx.FROM() != null) {
            importStmt.setFromImport(true);
            importStmt.setFromModule(ctx.dottedName(0).getText());

            Symbole s = new Symbole();
            s.setType("Import (From)");
            s.setValue(ctx.dottedName(0).getText());
            this.symboleTable.getSymboles().add(s);
        } else {
            importStmt.setFromImport(false);
        }

        for (PythonParser.ImportItemContext itemCtx : ctx.importItem()) {
            importStmt.getImportItems().add((importItem) visitImportItem(itemCtx));
        }

        return importStmt;
    }

    @Override
    public Object visitAssignment(PythonParser.AssignmentContext ctx) {
        Assignment assignment = new Assignment();
        assignment.setExprleft((expr) visitExpr(ctx.expr(0)));
        assignment.setExprright((expr) visitExpr(ctx.expr(1)));

        // تسجيل المتغير (الطرف الأيسر) في جدول الرموز
        Symbole s = new Symbole();
        s.setType("Variable Assignment");
        s.setValue(ctx.expr(0).getText());
        this.symboleTable.getSymboles().add(s);

        return assignment;
    }

    @Override
    public Object visitIfStmt(PythonParser.IfStmtContext ctx) {
        IfStmt ifStmt = new IfStmt();
        ifStmt.setExpr((expr) visitExpr(ctx.expr()));

        // بناءً على كلاسك List<block>
        ArrayList<block> blocks = new ArrayList<>();
        blocks.add((block) visitBlock(ctx.block()));
        ifStmt.setBlockList(blocks);

        return ifStmt;
    }

    @Override
    public Object visitFuncDef(PythonParser.FuncDefContext ctx) {
        FunctionDef func = new FunctionDef();
        String funcName = ctx.ID().getText();
        func.setID(funcName);

        // تسجيل الدالة في جدول الرموز
        Symbole s = new Symbole();
        s.setType("Function Definition");
        s.setValue(funcName);
        this.symboleTable.getSymboles().add(s);

        if (ctx.params() != null) {
            func.setParams((params) visitParams(ctx.params()));
        }
        func.setBlock((block) visitBlock(ctx.block()));

        return func;
    }

    @Override
    public Object visitBlock(PythonParser.BlockContext ctx) {
        block blockObj = new block();
        blockObj.setStatementList(new ArrayList<statement>());
        for (PythonParser.StatementContext stmtCtx : ctx.statement()) {
            blockObj.getStatementList().add((statement) visitStatement(stmtCtx));
        }
        return blockObj;
    }

    @Override
    public Object visitExpr(PythonParser.ExprContext ctx) {
        expr expression = new expr();

        // في حال كانت عملية ثنائية (مثل PLUS أو EQ_DOUBLE)
        if (ctx.expr().size() == 2) {
            expression.setLeft((expr) visitExpr(ctx.expr(0)));
            expression.setRight((expr) visitExpr(ctx.expr(1)));
            if (ctx.PLUS() != null) expression.setOperator("+");
            else if (ctx.EQ_DOUBLE() != null) expression.setOperator("==");
        } else {
            // التعامل مع الـ atom أو الاستدعاءات
            expression.setOperator("atom/call");
        }

        return expression;
    }

    @Override
    public Object visitParams(PythonParser.ParamsContext ctx) {
        params p = new params();
        p.setID(ctx.ID(0).getText());
        if (ctx.ID().size() > 1) {
            p.setID2(ctx.ID(1).getText());
        }

        // تسجيل البارامترات
        for (int i = 0; i < ctx.ID().size(); i++) {
            Symbole s = new Symbole();
            s.setType("Parameter");
            s.setValue(ctx.ID(i).getText());
            this.symboleTable.getSymboles().add(s);
        }

        return p;
    }

    @Override
    public Object visitReturnStmt(PythonParser.ReturnStmtContext ctx) {
        ReturnStmt ret = new ReturnStmt();
        ret.setValue(ctx.expr().getText());
        return ret;
    }

    @Override
    public Object visitImportItem(PythonParser.ImportItemContext ctx) {
        importItem item = new importItem();
        item.setImportItemName(ctx.getText());

        Symbole s = new Symbole();
        s.setType("Import Item");
        s.setValue(ctx.getText());
        this.symboleTable.getSymboles().add(s);

        return item;
    }
}