package Classes;

public class decorator {
    dottedName dottedName;
    args args;

    public dottedName getDottedName() {
        return dottedName;
    }

    public void setDottedName(dottedName dottedName) {
        this.dottedName = dottedName;
    }

    public args getArgs() {
        return args;
    }

    public void setArgs(args args) {
        this.args = args;
    }

    @Override
    public String toString() {
        return "decorator{" +
                "dottedName=" + dottedName +
                ", args=" + args +
                '}';
    }
}
