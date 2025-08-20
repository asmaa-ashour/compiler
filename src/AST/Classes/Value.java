package AST.Classes;

public class Value extends Node {
    private Object value; // يمكن يكون Expression أو ArrayLiteral أو String

    public Value(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (value instanceof String) {
            return "\"" + value + "\""; // لو TEMPLATE_STR
        } else {
            return value.toString();    // لو Expression أو ArrayLiteral
        }
    }
}
