package Classes;

public class Attribute {
    String ID;
    attr_value attr_value;

    public attr_value getAttr_value() {
        return attr_value;
    }

    public void setAttr_value(attr_value attr_value) {
        this.attr_value = attr_value;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Attribute{" +
                "attr_value=" + attr_value +
                ", ID='" + ID + '\'' +
                '}';
    }
}
