package AST.Classes;

public class IdentifierExpression extends PrimaryExpression {
    private String name;

    public IdentifierExpression(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
