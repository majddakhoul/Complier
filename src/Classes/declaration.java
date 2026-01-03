package Classes;

public class declaration {
    String id;
    value value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public value getValue() {
        return value;
    }

    public void setValue(value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "declaration{" +
                "id='" + id + '\'' +
                ", value=" + value +
                '}';
    }
}
