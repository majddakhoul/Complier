package Classes;

import java.util.List;

public class rule {
    selector selector;
    List<declaration> declarationsList;

    public selector getSelector() {
        return selector;
    }

    public void setSelector(selector selector) {
        this.selector = selector;
    }

    public List<declaration> getDeclarationsList() {
        return declarationsList;
    }

    public void setDeclarationsList(List<declaration> declarationsList) {
        this.declarationsList = declarationsList;
    }

    @Override
    public String toString() {
        return "rule{" +
                "selector=" + selector +
                ", declarationsList=" + declarationsList +
                '}';
    }
}
