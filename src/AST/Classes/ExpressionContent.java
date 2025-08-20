package AST.Classes;

public class ExpressionContent extends HtmlContent {
    private Expression expression;

    public ExpressionContent(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "ExpressionContent(" + expression + ")";
    }
}
