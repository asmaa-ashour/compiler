package AST.Classes;
/*

exportDefault
    : EXPORT DEFAULT expression SEMI_Q?
    ;

 */
class ExportDefaultStmt extends Statement {
    private Expression defaultValue;

    public ExportDefaultStmt(Expression defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Expression getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Expression defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Override
    public String toString() {
        return "ExportDefaultStmt(" + defaultValue + ")";
    }

}
