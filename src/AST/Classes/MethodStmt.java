package AST.Classes;


public class MethodStmt extends Statement {
    private MethodDeclaration methodDecl;

    public MethodStmt(MethodDeclaration methodDecl) {
        this.methodDecl = methodDecl;
    }

    public MethodDeclaration getMethodDecl() {
        return methodDecl;
    }

    public void setMethodDecl(MethodDeclaration methodDecl) {
        this.methodDecl = methodDecl;
    }

    @Override
    public String toString() {
        return "MethodStmt(" + methodDecl + ")";
    }
}
