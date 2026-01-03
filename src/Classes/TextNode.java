package Classes;

public class TextNode {
    String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "TextNode{" +
                "text='" + text + '\'' +
                '}';
    }
}
