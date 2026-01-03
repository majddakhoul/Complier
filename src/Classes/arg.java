package Classes;

public class arg {
    expr expr;

    public expr getExpr() {
        return expr;
    }

    public void setExpr(expr expr) {
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "arg{" +
                "expr=" + expr +
                '}';
    }
}
