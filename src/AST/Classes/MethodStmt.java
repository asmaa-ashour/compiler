package AST.Classes;


public class MethodStmt extends Statement {
    private MethodDeclaration methodDecl;

    public MethodStmt(MethodDeclaration methodDecl) {
        this.methodDecl = methodDecl;
    }

    @Override
    public String toString() {
        return "MethodStmt(" + methodDecl + ")";
    }
}
