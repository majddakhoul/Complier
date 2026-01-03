import gen.CSSParser;
import gen.CSSParserBaseVisitor;
import Classes.*;
import java.util.ArrayList;

public class CSSBaseVisitor extends CSSParserBaseVisitor<Object> {

    // إنشاء نسخة من جدول الرموز
    SymboleTable symboleTable = new SymboleTable();

    @Override
    public Object visitStylesheet(CSSParser.StylesheetContext ctx) {
        stylesheet stylesheetObj = new stylesheet();
        stylesheetObj.setRule(new ArrayList<rule>());

        for (int i = 0; i < ctx.rule_().size(); i++) {
            stylesheetObj.getRule().add((rule) visitRule(ctx.rule_(i)));
        }

        // طباعة جدول الرموز بعد الانتهاء من بناء الشجرة كما في مثالك السابق
        System.out.println("****************************** Symbol Table  ******************************\n");
        System.out.println("Type\t\t\t\tValue");
        System.out.println("----\t\t\t\t-----");
        this.symboleTable.print();
        System.out.println("\n****************************** CSS AST Built   ******************************\n");

        return stylesheetObj;
    }

    @Override
    public Object visitRule(CSSParser.RuleContext ctx) {
        rule ruleObj = new rule();
        ruleObj.setSelector((selector) visitSelector(ctx.selector()));

        ruleObj.setDeclarationsList(new ArrayList<declaration>());
        for (int i = 0; i < ctx.declaration().size(); i++) {
            ruleObj.getDeclarationsList().add((declaration) visitDeclaration(ctx.declaration(i)));
        }

        return ruleObj;
    }

    @Override
    public Object visitSelector(CSSParser.SelectorContext ctx) {
        selector selectorObj = new selector();
        Symbole s = new Symbole(); // إنشاء رمز لتخزينه في الجدول

        if (ctx.DOT() != null) {
            selectorObj.setType("class");
            selectorObj.setId(ctx.ID(0).getText());

            s.setType("Selector (Class)");
            s.setValue(ctx.ID(0).getText());
        } else if (ctx.COLON() != null) {
            selectorObj.setType("pseudo");
            selectorObj.setId(ctx.ID(0).getText());
            selectorObj.setId2(ctx.ID(1).getText());

            s.setType("Selector (Pseudo)");
            s.setValue(ctx.ID(0).getText() + ":" + ctx.ID(1).getText());
        } else {
            selectorObj.setType("element");
            selectorObj.setId(ctx.ID(0).getText());

            s.setType("Selector (Element)");
            s.setValue(ctx.ID(0).getText());
        }

        // إضافة الرمز المكتشف إلى جدول الرموز
        this.symboleTable.getSymboles().add(s);
        return selectorObj;
    }

    @Override
    public Object visitDeclaration(CSSParser.DeclarationContext ctx) {
        declaration declObj = new declaration();

        if (ctx.ID() != null) {
            String propertyName = ctx.ID().getText();
            declObj.setId(propertyName);

            // إضافة خاصية الـ CSS كرمز في الجدول
            Symbole s = new Symbole();
            s.setType("CSS Property");
            s.setValue(propertyName);
            this.symboleTable.getSymboles().add(s);
        }

        if (ctx.value() != null) {
            declObj.setValue((value) visitValue(ctx.value()));
        }

        return declObj;
    }

    @Override
    public Object visitValue(CSSParser.ValueContext ctx) {
        value valueObj = new value();
        String valText = ctx.getText();
        valueObj.setValue(valText);

        // إضافة القيمة كرمز في الجدول
        Symbole s = new Symbole();
        s.setType("CSS Value");
        s.setValue(valText);
        this.symboleTable.getSymboles().add(s);

        return valueObj;
    }
}