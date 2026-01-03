package Classes;

public class params {
    String ID;
    String ID2;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID2() {
        return ID2;
    }

    public void setID2(String ID2) {
        this.ID2 = ID2;
    }

    @Override
    public String toString() {
        return "params{" +
                "ID='" + ID + '\'' +
                ", ID2='" + ID2 + '\'' +
                '}';
    }
}
