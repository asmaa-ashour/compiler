package AST.Classes;

public class ArrowFunction extends Expression {
    private ArrowParameters parameters;
    private Node body; // يمكن أن يكون Expression أو Block، بما أن كلاهما يمتد من Node

    public ArrowFunction(ArrowParameters parameters, Node body) {
        this.parameters = parameters;
        this.body = body;
    }

    public ArrowParameters getParameters() {
        return parameters;
    }

    public void setParameters(ArrowParameters parameters) {
        this.parameters = parameters;
    }

    public Node getBody() {
        return body;
    }

    public void setBody(Node body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "ArrowFunction(" + parameters + " => " + body + ")";
    }
}
