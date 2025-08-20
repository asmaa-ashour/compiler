package AST.Classes;
/*
objectProperty
    : IDENTIFIER COLON expression
    | SPREAD expression
    ;
 */
public class ObjectProperty extends Node{
    private String name;      // اسم property لو كانت IDENTIFIER COLON expression
    private Expression value;       // القيمة المرتبطة بالـ property أو الـ spread
    private boolean isSpread; // لتحديد إذا كان SPREAD

    // Constructor للـ property العادي
    public ObjectProperty(String name, Expression value) {
        this.name = name;
        this.value = value;
        this.isSpread = false;
    }

    // Constructor للـ spread
    public ObjectProperty(Expression value) {
        this.value = value;
        this.isSpread = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Expression getValue() {
        return value;
    }

    public void setValue(Expression value) {
        this.value = value;
    }

    public boolean isSpread() {
        return isSpread;
    }

    public void setSpread(boolean spread) {
        isSpread = spread;
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
