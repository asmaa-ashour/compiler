package AST.Classes;

public class HtmlElementContent extends HtmlContent {
    private HtmlElement element;

    public HtmlElementContent(HtmlElement element) {
        this.element = element;
    }

    public HtmlElement getElement() {
        return element;
    }

    public void setElement(HtmlElement element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "HtmlElementContent(" + element + ")";
    }
}
