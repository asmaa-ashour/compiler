package AST.Classes;
/*

decorator
    : AT IDENTIFIER LPAREN objectLiteral RPAREN
    ;

 */
public class Decorator extends Node{
    private String name;         // الـ IDENTIFIER بعد الـ @
    private ObjectLiteral value; // الـ objectLiteral داخل الأقواس

    public Decorator(String name, ObjectLiteral value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "@" + name + "(" + value.toString() + ")";
    }
}
