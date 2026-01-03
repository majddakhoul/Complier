package Classes;

import java.util.List;

public class args {
    arg arg;
    List<arg> argList;

    public arg getArg() {
        return arg;
    }

    public void setArg(arg arg) {
        this.arg = arg;
    }

    public List<arg> getArgList() {
        return argList;
    }

    public void setArgList(List<arg> argList) {
        this.argList = argList;
    }

    @Override
    public String toString() {
        return "args{" +
                "arg=" + arg +
                ", argList=" + argList +
                '}';
    }
}
