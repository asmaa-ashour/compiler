package AST.Classes;

/*
htmlContent
    : htmlElement
    | expression
    | STRING
    | IDENTIFIER
    ;
 */
public class HtmlContent extends Node {
    private Node content; // يمكن أن يكون HtmlElement، Expression، STRING أو IDENTIFIER

    public HtmlContent(Node content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return content.toString();
    }
}

