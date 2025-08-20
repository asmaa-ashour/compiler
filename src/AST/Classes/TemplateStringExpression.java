package AST.Classes;

public class TemplateStringExpression extends PrimaryExpression {
    private String value;

    public TemplateStringExpression(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "`" + value + "`";
    }
}