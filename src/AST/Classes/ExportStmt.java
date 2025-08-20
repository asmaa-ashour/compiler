package AST.Classes;
/*

exportStatement
    : EXPORT (classDeclaration | variableDeclaration)
    ;
 */
class ExportStmt extends Statement {
    private String exportName;

    public ExportStmt(String exportName) {
        this.exportName = exportName;
    }

    public String getExportName() {
        return exportName;
    }

    public void setExportName(String exportName) {
        this.exportName = exportName;
    }

    @Override
    public String toString() {
        return "ExportStmt(" + exportName + ")";
    }
}

