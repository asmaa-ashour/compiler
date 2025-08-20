package AST.Classes;

public class IdentifierContent extends HtmlContent {
    private String name;

    public IdentifierContent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "IdentifierContent(" + name + ")";
    }
}
