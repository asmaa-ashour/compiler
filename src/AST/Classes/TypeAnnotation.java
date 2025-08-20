package AST.Classes;
public class TypeAnnotation {
    private String name; // مثلاً "string" أو "int" أو "void"
    // لاحقاً ممكن نضيف دعم لـ arrayType, genericType ...

    public TypeAnnotation(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

