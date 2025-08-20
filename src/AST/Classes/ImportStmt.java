package AST.Classes;
/*
importStatement
    : IMPORT importClause FROM STRING SEMI_Q?
    ;
 */
public class ImportStmt extends Statement{
    private ImportClause importClause; // أو Object لو عندك class خاص
    private String fromModule;

    public ImportStmt(ImportClause importClause, String fromModule) {
        this.importClause = importClause;
        this.fromModule = fromModule;
    }

    public ImportClause getImportClause() {
        return importClause;
    }

    public void setImportClause(ImportClause importClause) {
        this.importClause = importClause;
    }

    public String getFromModule() {
        return fromModule;
    }

    public void setFromModule(String fromModule) {
        this.fromModule = fromModule;
    }

    @Override
    public String toString() {
        return "ImportStmt(" + importClause + " from " + fromModule + ")";
    }
}
