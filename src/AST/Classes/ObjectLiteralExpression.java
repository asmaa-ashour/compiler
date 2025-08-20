package AST.Classes;

public class ObjectLiteralExpression extends PrimaryExpression {
    private ObjectLiteral value;

    public ObjectLiteralExpression(ObjectLiteral value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}