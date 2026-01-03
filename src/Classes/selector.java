package Classes;

public class selector {
    String id;
    String type;
    String id2;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId2() {
        return id2;
    }

    public void setId2(String id2) {
        this.id2 = id2;
    }

    @Override
    public String toString() {
        return "selector{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", id2='" + id2 + '\'' +
                '}';
    }
}
