package Classes;



public class Assignment {
    expr exprleft;
    expr exprright;

    public expr getExprleft() {
        return exprleft;
    }

    public void setExprleft(expr exprleft) {
        this.exprleft = exprleft;
    }

    public expr getExprright() {
        return exprright;
    }

    public void setExprright(expr exprright) {
        this.exprright = exprright;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "exprleft=" + exprleft +
                ", exprright=" + exprright +
                '}';
    }
}
