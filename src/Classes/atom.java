package Classes;

import java.util.List;

public class atom {
String name;
List <dottedName>dottedNameList;

    public List<dottedName> getDottedNameList() {
        return dottedNameList;
    }

    public void setDottedNameList(List<dottedName> dottedNameList) {
        this.dottedNameList = dottedNameList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "atom{" +
                "dottedNameList=" + dottedNameList +
                ", name='" + name + '\'' +
                '}';
    }
}
