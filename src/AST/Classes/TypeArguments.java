package AST.Classes;
import java.util.List;
/*

typeArguments
    : typeAnnotationWithArray (COMMA typeAnnotationWithArray)*
    ;
 */

public class TypeArguments extends Node {
    private List<TypeAnnotationWithArray> arguments;

    public TypeArguments(List<TypeAnnotationWithArray> arguments) {
        this.arguments = arguments;
    }

    public List<TypeAnnotationWithArray> getArguments() {
        return arguments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        for (int i = 0; i < arguments.size(); i++) {
            sb.append(arguments.get(i).toString());
            if (i < arguments.size() - 1) sb.append(", ");
        }
        sb.append(">");
        return sb.toString();
    }
}

