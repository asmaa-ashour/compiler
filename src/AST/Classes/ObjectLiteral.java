package AST.Classes;

import java.util.List;

/*

objectLiteral
    : LBRACE (objectProperty (COMMA | SEMI_Q)?)* COMMA? RBRACE
    ;
 */
public class ObjectLiteral extends Node{

    private List<ObjectProperty> properties;

    public ObjectLiteral(List<ObjectProperty> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < properties.size(); i++) {
            sb.append(properties.get(i).toString());
            if (i < properties.size() - 1) sb.append(", ");
        }
        sb.append("}");
        return sb.toString();
    }
}
