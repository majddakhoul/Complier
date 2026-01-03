package Classes;

import java.util.List;

public class stylesheet {
    List<rule> rule;

    public List<rule> getRule() {
        return rule;
    }

    public void setRule(List<rule> rule) {
        this.rule = rule;
    }

    @Override
    public String toString() {
        return "stylesheet{" +
                "rule=" + rule +
                '}';
    }
}
