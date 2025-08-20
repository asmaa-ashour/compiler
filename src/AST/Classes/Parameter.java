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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return name + (type != null ? ": " + type : "");
    }
}

