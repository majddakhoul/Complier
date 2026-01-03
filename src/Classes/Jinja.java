package Classes;

public class Jinja {



    String expression;
    boolean isStatement;

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public boolean isStatement() {
        return isStatement;
    }

    public void setStatement(boolean statement) {
        isStatement = statement;
    }

    @Override
    public String toString() {
        return "JinjaBlock{" +
                "expression='" + expression + '\'' +
                ", isStatement=" + isStatement +
                '}';
    }
}
