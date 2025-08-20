package AST.Classes;


/*
variableDeclaration
    : (LET | CONST)
      (IDENTIFIER | HTML | HEAD | BODY | META | TITLE | BASE | LINK)
      (COLON typeAnnotation)?
      ASSIGN expression
      SEMI_Q?
    | (LET | CONST) destructuringAssignment ASSIGN expression SEMI_Q?
    ;
 */
public class VarStmt extends Statement {
    private String name;
    private Expression initializer; // ممكن يكون null

    public VarStmt(String name, Expression initializer) {
        this.name = name;
        this.initializer = initializer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Expression getInitializer() {
        return initializer;
    }

    public void setInitializer(Expression initializer) {
        this.initializer = initializer;
    }

    @Override
    public String toString() {
        return "VarStmt(" + name + (initializer != null ? " = " + initializer : "") + ")";
    }
}
