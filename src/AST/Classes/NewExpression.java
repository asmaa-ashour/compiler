package AST.Classes;

public class NewExpression extends PrimaryExpression {
    private String className;
    private GenericArguments genericArgs;
    private ArgumentList args;

    public NewExpression(String className, GenericArguments genericArgs, ArgumentList args) {
        this.className = className;
        this.genericArgs = genericArgs;
        this.args = args;
    }

    @Override
    public String toString() {
        return "new " + className +
                (genericArgs != null ? genericArgs.toString() : "") +
                "(" + (args != null ? args.toString() : "") + ")";
    }
}
