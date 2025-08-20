package AST.Classes;
import java.util.List;
/*

methodDeclaration
    : accessModifier? IDENTIFIER LPAREN paramList? RPAREN (COLON typeAnnotation)? block
    ;

 */
public class MethodDeclaration {
    private String accessModifier;
    private String name;
    private List<Parameter> parameters;
    private TypeAnnotation returnType;   // 👈 صار كائن بدل String
    private BlockStmt body;

    public MethodDeclaration(String accessModifier, String name,
                             List<Parameter> parameters, TypeAnnotation returnType,
                             BlockStmt body) {
        this.accessModifier = accessModifier;
        this.name = name;
        this.parameters = parameters;
        this.returnType = returnType;
        this.body = body;
    }

    public TypeAnnotation getReturnType() { return returnType; }

    @Override
    public String toString() {
        return "MethodDeclaration(" +
                (accessModifier != null ? accessModifier + " " : "") +
                name + "(" + parameters + ")" +
                (returnType != null ? ": " + returnType : "") +
                " " + body +
                ")";
    }
}

