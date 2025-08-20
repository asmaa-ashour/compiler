package AST.Classes;
import java.util.List;
/*

genericTypeList
    : typeAnnotationWithArray (COMMA typeAnnotationWithArray)*
    ;
 */
public class GenericTypeList extends Node {
    private List<TypeAnnotationWithArray> types;

    public GenericTypeList(List<TypeAnnotationWithArray> types) {
        this.types = types;
    }

    public List<TypeAnnotationWithArray> getTypes() {
        return types;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < types.size(); i++) {
            sb.append(types.get(i).toString());
            if (i < types.size() - 1) sb.append(", ");
        }
        return sb.toString();
    }
}

