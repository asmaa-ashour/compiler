package AST.Classes;
import java.util.List;

/*

parameterList
: parameter (COMMA parameter)*
;

 */
public class ParameterList {

    private List<Parameter> parameters;

    public void ParameterList(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parameters.size(); i++) {
            sb.append(parameters.get(i).toString());
            if (i < parameters.size() - 1) sb.append(", ");
        }
        return sb.toString();
    }

}
