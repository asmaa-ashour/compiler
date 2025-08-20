package AST.Classes;

/*
decorator
    : AT IDENTIFIER LPAREN objectLiteral RPAREN
    ;
 */
class DecoratorStmt extends Statement {
    private Decorator  decorator;
    private ExportStmt exportStatement;

    public DecoratorStmt(Decorator  decorator, ExportStmt exportStatement) {
        this.decorator = decorator;
        this.exportStatement = exportStatement;
    }

    @Override
    public String toString() {
        return "DecoratorStmt(" + decorator + ", " + exportStatement.toString() + ")";
    }
}
