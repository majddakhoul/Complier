import gen.HTMLParser;
import gen.HTMLParserBaseVisitor;
import Classes.*;
import java.util.ArrayList;

public class HTMLBaseVisitor extends HTMLParserBaseVisitor<Object> {

    SymboleTable symboleTable = new SymboleTable();

    @Override
    public Object visitHtml(HTMLParser.HtmlContext ctx) {
        HtmlDocument doc = new HtmlDocument();
        doc.setElements(new ArrayList<Content>());

        // الجذر يحتوي على قائمة من الـ Content
        for (int i = 0; i < ctx.content().size(); i++) {
            doc.getElements().add((Content) visitContent(ctx.content(i)));
        }

        // طباعة جدول الرموز
        System.out.println("****************************** HTML Symbol Table ******************************\n");
        System.out.println("Type\t\t\t\tValue");
        System.out.println("----\t\t\t\t-----");
        this.symboleTable.print();

        System.out.println("\n****************************** HTML AST Built ******************************\n");
        return doc;
    }

    @Override
    public Object visitContent(HTMLParser.ContentContext ctx) {
        Content contentObj = new Content();

        if (ctx.element() != null) {
            contentObj.setElement((Element) visitElement(ctx.element()));
        } else if (ctx.jinja() != null) {
            contentObj.setJinja((Jinja) visitJinja(ctx.jinja()));
        } else if (ctx.misc() != null) {
            // إضافة النصوص والرموز (Misc) إلى جدول الرموز
            Symbole s = new Symbole();
            s.setType("Misc/Text");
            s.setValue(ctx.misc().getText());
            this.symboleTable.getSymboles().add(s);
        }

        return contentObj;
    }

    @Override
    public Object visitElement(HTMLParser.ElementContext ctx) {
        Element elementObj = new Element();

        // جلب اسم الوسم (Tag Name)
        String tagName = ctx.ID(0).getText();
        elementObj.setTagName(tagName);

        // تسجيل الوسم في جدول الرموز
        Symbole s = new Symbole();
        s.setType("HTML Tag");
        s.setValue("<" + tagName + ">");
        this.symboleTable.getSymboles().add(s);

        // معالجة السمات (Attributes)
        elementObj.setAttributes(new ArrayList<Attribute>());
        for (HTMLParser.AttributeContext attrCtx : ctx.attribute()) {
            elementObj.getAttributes().add((Attribute) visitAttribute(attrCtx));
        }

        // معالجة الأبناء (Children) - الآن أصبحت List<Content> بشكل صحيح
        elementObj.setChildren(new ArrayList<Content>());
        for (HTMLParser.ContentContext childCtx : ctx.content()) {
            elementObj.getChildren().add((Content) visitContent(childCtx));
        }

        return elementObj;
    }

    @Override
    public Object visitAttribute(HTMLParser.AttributeContext ctx) {
        Attribute attrObj = new Attribute();
        String attrName = ctx.ID().getText();
        attrObj.setID(attrName);

        // تسجيل اسم السمة في الجدول
        Symbole s = new Symbole();
        s.setType("Attribute Name");
        s.setValue(attrName);
        this.symboleTable.getSymboles().add(s);

        if (ctx.attr_value() != null) {
            attrObj.setAttr_value((attr_value) visitAttr_value(ctx.attr_value()));
        }

        return attrObj;
    }

    @Override
    public Object visitAttr_value(HTMLParser.Attr_valueContext ctx) {
        attr_value valObj = new attr_value();
        String valText = ctx.getText();

        valObj.setName(valText);

        if (ctx.ID() != null) valObj.setID(ctx.ID().getText());
        if (ctx.jinja() != null) valObj.setJinja((Jinja) visitJinja(ctx.jinja()));

        // تسجيل قيمة السمة في الجدول
        Symbole s = new Symbole();
        s.setType("Attribute Value");
        s.setValue(valText);
        this.symboleTable.getSymboles().add(s);

        return valObj;
    }

    @Override
    public Object visitJinja(HTMLParser.JinjaContext ctx) {
        Jinja jinjaObj = new Jinja();
        String content = ctx.getText();

        jinjaObj.setExpression(content);
        jinjaObj.setStatement(content.startsWith("{%")); // تحديد إذا كان Statement أو Expression

        // تسجيل كود جينجا في الجدول
        Symbole s = new Symbole();
        s.setType("Jinja Block");
        s.setValue(content);
        this.symboleTable.getSymboles().add(s);

        return jinjaObj;
    }
}