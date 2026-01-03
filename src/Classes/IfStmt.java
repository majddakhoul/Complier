package Classes;

import java.util.List;

public class IfStmt {
    expr expr;
    List<block>blockList;

    public List<block> getBlockList() {
        return blockList;
    }

    public void setBlockList(List<block> blockList) {
        this.blockList = blockList;
    }

    public expr getExpr() {
        return expr;
    }

    public void setExpr(expr expr) {
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "IfStmt{" +
                "blockList=" + blockList +
                ", expr=" + expr +
                '}';
    }
}