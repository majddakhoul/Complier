package Classes;

public class Content {
Element element;
Jinja jinja;

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public Jinja getJinja() {
        return jinja;
    }

    public void setJinja(Jinja jinja) {
        this.jinja = jinja;
    }

    @Override
    public String toString() {
        return "Content{" +
                "element=" + element +
                ", jinja=" + jinja +
                '}';
    }
}
