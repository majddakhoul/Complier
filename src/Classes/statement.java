package Classes;

public class statement {
    ImportStmt importStmt;
     Assignment assignment;
     IfStmt ifStmt;
     ReturnStmt returnStmt;
     decorator decorator;
     FunctionDef functionDef;
     expr expr;

    public ImportStmt getImportStmt() {
        return importStmt;
    }

    public void setImportStmt(ImportStmt importStmt) {
        this.importStmt = importStmt;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public IfStmt getIfStmt() {
        return ifStmt;
    }

    public void setIfStmt(IfStmt ifStmt) {
        this.ifStmt = ifStmt;
    }

    public ReturnStmt getReturnStmt() {
        return returnStmt;
    }

    public void setReturnStmt(ReturnStmt returnStmt) {
        this.returnStmt = returnStmt;
    }

    public decorator getDecorator() {
        return decorator;
    }

    public void setDecorator(decorator decorator) {
        this.decorator = decorator;
    }

    public FunctionDef getFunctionDef() {
        return functionDef;
    }

    public void setFunctionDef(FunctionDef functionDef) {
        this.functionDef = functionDef;
    }

    public expr getExpr() {
        return expr;
    }

    public void setExpr(expr expr) {
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "statement{" +
                "importStmt=" + importStmt +
                ", assignment=" + assignment +
                ", ifStmt=" + ifStmt +
                ", returnStmt=" + returnStmt +
                ", decorator=" + decorator +
                ", functionDef=" + functionDef +
                ", expr=" + expr +
                '}';
    }
}
