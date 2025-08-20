package AST.Classes;
import java.util.List;

/*

argumentList
    : assignmentExpression (COMMA assignmentExpression)* COMMA?
    ;
 */
public class ArgumentList extends Node {
    private List<AssignmentExpression> arguments; // كل عنصر هنا هو assignmentExpression

    public ArgumentList(List<AssignmentExpression> arguments) {
        this.arguments = arguments;
    }

    public List<AssignmentExpression> getArguments() {
        return arguments;
    }

    public void setArguments(List<AssignmentExpression> arguments) {
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < arguments.size(); i++) {
            sb.append(arguments.get(i).toString());
            if (i < arguments.size() - 1) sb.append(", ");
        }
        sb.append(")");
        return sb.toString();
    }
}

