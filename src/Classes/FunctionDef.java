package Classes;

import java.util.List;

public class FunctionDef {
  String ID;
  params params;
  block block;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public params getParams() {
        return params;
    }

    public void setParams(params params) {
        this.params = params;
    }

    public block getBlock() {
        return block;
    }

    @Override
    public String toString() {
        return "FunctionDef{" +
                "ID='" + ID + '\'' +
                ", params=" + params +
                ", block=" + block +
                '}';
    }

    public void setBlock(block block) {
        this.block = block;
    }
}
