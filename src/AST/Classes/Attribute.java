package AST.Classes;

/*
attribute
                : IDENTIFIER
                | IDENTIFIER ASSIGN ( IDENTIFIER| NUMBER | BOOLEAN_LITERAL |STRING )
                ;
 */
public class Attribute extends Node {
    private String name;
    private Node value; // يمكن أن يكون null، IDENTIFIER، NUMBER، BOOLEAN_LITERAL أو STRING

    public Attribute(String name, Node value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        if (value != null) {
            return name + "=" + value.toString();
        }
        return name;
    }
}

