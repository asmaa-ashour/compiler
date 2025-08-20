package AST.Classes;


import java.util.List;

public class HtmlDocument extends Node { // Node أو ASTNode مجرد superclass عام
    private String doctype;           // اختياري
    private List<HtmlElement> elements; // قائمة العناصر داخل المستند

    public HtmlDocument(String doctype, List<HtmlElement> elements) {
        this.doctype = doctype;
        this.elements = elements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (doctype != null) {
            sb.append("DOCTYPE ").append(doctype).append("\n");
        }
        for (HtmlElement el : elements) {
            sb.append(el.toString()).append("\n");
        }
        return "HtmlDocument(\n" + sb.toString() + ")";
    }
}
