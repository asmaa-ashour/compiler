package AST.Classes;

public class AssignmentExpression extends Expression {
    private Expression left;   // عادة IdentifierExpression أو شيء مشابه
    private Expression right;  // يمكن أن يكون أي Expression (حتى AssignmentExpression نفسه)

    public AssignmentExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "AssignExpr(" + left + " = " + right + ")";
    }
}

