package Classes;

import java.util.List;

public class dottedName {

    String ID;
    List<String> IDs ;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public List<String> getIDs() {
        return IDs;
    }

    public void setIDs(List<String> IDs) {
        this.IDs = IDs;
    }

    @Override
    public String toString() {
        return "dottedName{" +
                "ID='" + ID + '\'' +
                ", IDs=" + IDs +
                '}';
    }
}
