package Classes;

import java.util.List;

public class Element {

    String tagName;
    List<Attribute> attributes;
    List<Content> children;

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public List<Content> getChildren() {
        return children;
    }

    public void setChildren(List<Content> children) {
        this.children = children;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        return "Element{" +
                "attributes=" + attributes +
                ", tagName='" + tagName + '\'' +
                ", children=" + children +
                '}';
    }
}
