package Classes;

import java.util.List;

public class HtmlDocument {
    List<Content> elements;

    public List<Content> getElements() {
        return elements;
    }

    public void setElements(List<Content> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "HtmlDocument{" +
                "elements=" + elements +
                '}';
    }
}
