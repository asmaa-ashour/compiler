package AST.Classes;

public class ArrayLiteralExpression extends Expression {
    private ArrayLiteral value;

    public ArrayLiteralExpression(ArrayLiteral value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}