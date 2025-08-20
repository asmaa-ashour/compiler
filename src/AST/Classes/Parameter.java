package AST.Classes;

/*

parameter
    : IDENTIFIER (COLON typeAnnotation)?
    ;
 */
public class Parameter {
    private String name;
    private String type; // ممكن null إذا ما كان في typeAnnotation

    public Parameter(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name + (type != null ? ": " + type : "");
    }
}

