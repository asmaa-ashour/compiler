package AST.Classes;

class ClassStmt extends Statement {
    private ClassDeclaration classDeclaration;

    public ClassStmt(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    public ClassDeclaration getClassDeclaration() {
        return classDeclaration;
    }

    public void setClassDeclaration(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    @Override
    public String toString() {
        return "ClassStmt(" + classDeclaration.toString() + ")";
    }

}
