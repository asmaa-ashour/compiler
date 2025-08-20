package AST.Classes;
/*

expressionStatement
    : expression SEMI_Q?
    ;
 */
public class ExprStmt extends Statement {
    private Expression expression;

    public ExprStmt(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "ExprStmt(" + expression + ")";
    }
}

