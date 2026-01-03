package Classes;

public class attr_value {
    String name;
    String ID;
    Jinja jinja;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Jinja getJinja() {
        return jinja;
    }

    public void setJinja(Jinja jinja) {
        this.jinja = jinja;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "attr_value{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", jinja=" + jinja +
                '}';
    }
}
