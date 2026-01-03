package Classes;

import java.util.List;

public class program {
    List<statement> statements;

    public List<statement> getStatements() {
        return statements;
    }

    public void setStatements(List<statement> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        return "program{" +
                "statements=" + statements +
                '}';
    }
}
