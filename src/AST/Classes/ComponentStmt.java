package AST.Classes;
/*
componentDefinition
    : COMPONENT LPAREN componentMetadata RPAREN classDeclaration?
    ;
 */
class ComponentStmt extends Statement {
    private ComponentMetadata metadata;
    private ClassDeclaration classDeclaration; // optional

    public ComponentStmt(ComponentMetadata metadata, ClassDeclaration classDeclaration) {
        this.metadata = metadata;
        this.classDeclaration = classDeclaration;
    }

    public ComponentMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(ComponentMetadata metadata) {
        this.metadata = metadata;
    }

    public ClassDeclaration getClassDeclaration() {
        return classDeclaration;
    }

    public void setClassDeclaration(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    @Override
    public String toString() {
        String result = "ComponentStmt(\n" + metadata.toString() + "\n)";
        if (classDeclaration != null) {
            result += "\n" + classDeclaration.toString();
        }
        return result;
    }
}
