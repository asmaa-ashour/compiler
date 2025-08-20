package AST.Classes;
/*

typeAnnotationWithArray
    : typeAnnotation (LBRACK RBRACK)?
    ;
 */
public class TypeAnnotationWithArray extends Node {
    private TypeAnnotation type;  // النوع الأساسي
    private boolean isArray;      // هل هو مصفوفة أم لا

    public TypeAnnotationWithArray(TypeAnnotation type, boolean isArray) {
        this.type = type;
        this.isArray = isArray;
    }

    public TypeAnnotation getType() {
        return type;
    }

    public boolean isArray() {
        return isArray;
    }

    @Override
    public String toString() {
        return type.toString() + (isArray ? "[]" : "");
    }
}
