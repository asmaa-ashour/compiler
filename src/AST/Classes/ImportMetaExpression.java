package AST.Classes;

public class ImportMetaExpression extends PrimaryExpression {
    private String identifier;

    public ImportMetaExpression(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "import.meta." + identifier;
    }
}