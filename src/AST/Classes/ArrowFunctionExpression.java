package AST.Classes;

public class ArrowFunctionExpression extends Expression {
    private ArrowFunction value;

    public ArrowFunctionExpression(ArrowFunction value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
