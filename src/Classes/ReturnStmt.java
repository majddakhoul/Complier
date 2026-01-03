package Classes;



public class ReturnStmt {
    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ReturnStmt{" +
                "value='" + value + '\'' +
                '}';
    }
}
