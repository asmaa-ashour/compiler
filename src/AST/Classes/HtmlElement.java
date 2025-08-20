package AST.Classes;

import java.util.List;
/*
htmlElement
    : LT htmlTagName attribute* GT htmlContent* LT SLASH htmlTagName GT
    | LT htmlTagName attribute* GT
    | LT htmlTagName attribute* SLASH GT
    ;
 */
public class HtmlElement extends Node {
    private HtmlTagName tagName;
    private List<Attribute> attributes;
    private List<HtmlContent> contents;
    private HtmlTagName closingTagName; // يمكن أن يكون null في حالة self-closing

    public HtmlElement(HtmlTagName tagName, List<Attribute> attributes, List<HtmlContent> contents, HtmlTagName closingTagName) {
        this.tagName = tagName;
        this.attributes = attributes;
        this.contents = contents;
        this.closingTagName = closingTagName;
    }

    @Override
    public String toString() {
        return "HtmlElement(tag=" + tagName + ", attrs=" + attributes + ", contents=" + contents + ")";
    }
}
