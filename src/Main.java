import Classes.stylesheet;
import Classes.HtmlDocument;
import Classes.program;

import gen.CSSLexer;
import gen.CSSParser;

import gen.HTMLLexer;
import gen.HTMLParser;

import gen.PythonLexer;
import gen.PythonParser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("CSS");
        String soure = "src/style.txt";
        CharStream cs = CharStreams.fromFileName(soure);
        CSSLexer lexer = new CSSLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        CSSParser parser = new CSSParser(token);
        CSSParser.StylesheetContext tree = parser.stylesheet();
        stylesheet doc = (stylesheet) (new CSSBaseVisitor().visit(tree));
        System.out.println(doc);

        // HTML
        System.out.println("HTML");
        String soureHtml = "src/products.txt";
        CharStream csHtml = CharStreams.fromFileName(soureHtml);
        HTMLLexer lexerHtml = new HTMLLexer(csHtml);
        CommonTokenStream tokenHtml = new CommonTokenStream(lexerHtml);
        HTMLParser parserHtml = new HTMLParser(tokenHtml);
        HTMLParser.HtmlContext treeHtml = parserHtml.html();
        HtmlDocument dochtml = (HtmlDocument) (new HTMLBaseVisitor().visit(treeHtml));
        System.out.println(dochtml);

        // Python
        System.out.println("Python");
        String sourepython = "src/app.txt";
        CharStream cspython = CharStreams.fromFileName(sourepython);
        PythonLexer lexerpython = new PythonLexer(cspython);
        CommonTokenStream tokenpython = new CommonTokenStream(lexerpython);
        PythonParser parserpython = new PythonParser(tokenpython);
        PythonParser.ProgramContext treepython = parserpython.program();
        program docpython = (program) (new PythonBaseVisitor().visit(treepython));
        System.out.println(docpython);
    }
}