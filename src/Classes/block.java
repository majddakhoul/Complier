package Classes;

import java.util.List;

public class block {
    List<statement> statementList;

    public List<statement> getStatementList() {
        return statementList;
    }

    public void setStatementList(List<statement> statementList) {
        this.statementList = statementList;
    }

    @Override
    public String toString() {
        return "block{" +
                "statementList=" + statementList +
                '}';
    }
}
