package AST.Classes;

public class ParenExpression extends PrimaryExpression {
    private Expression inner;

    public ParenExpression(Expression inner) {
        this.inner = inner;
    }

    @Override
    public String toString() {
        return "(" + inner.toString() + ")";
    }
}