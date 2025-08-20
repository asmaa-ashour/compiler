package AST.Classes;

public class LiteralExpression extends PrimaryExpression {
    private Literal value;

    public LiteralExpression(Literal value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
