package AST.Classes;
/*
objectProperty
    : IDENTIFIER COLON expression
    | SPREAD expression
    ;
 */
public class ObjectProperty extends Node{
    private String name;      // اسم property لو كانت IDENTIFIER COLON expression
    private Node value;       // القيمة المرتبطة بالـ property أو الـ spread
    private boolean isSpread; // لتحديد إذا كان SPREAD

    // Constructor للـ property العادي
    public ObjectProperty(String name, Node value) {
        this.name = name;
        this.value = value;
        this.isSpread = false;
    }

    // Constructor للـ spread
    public ObjectProperty(Node value) {
        this.value = value;
        this.isSpread = true;
    }

    @Override
    public String toString() {
        if (isSpread) {
            return "..." + value.toString();
        } else {
            return name + ": " + value.toString();
        }
    }
}
