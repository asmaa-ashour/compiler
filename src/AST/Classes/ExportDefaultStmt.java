package AST.Classes;
/*

exportDefault
    : EXPORT DEFAULT expression SEMI_Q?
    ;

 */
class ExportDefaultStmt extends Statement {
    private String defaultValue;

    public ExportDefaultStmt(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Override
    public String toString() {
        return "ExportDefaultStmt(" + defaultValue + ")";
    }
}
