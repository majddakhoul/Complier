package Classes;

public class expr {

    expr left;

    String operator;

    expr right;

    public expr getLeft() {
        return left;
    }

    public void setLeft(expr left) {
        this.left = left;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public expr getRight() {
        return right;
    }

    public void setRight(expr right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Expressions{" +
                "left=" + left +
                ", operator='" + operator + '\'' +
                ", right=" + right +
                '}';
    }
}
