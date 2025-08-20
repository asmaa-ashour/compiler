package AST.Classes;


public class HtmlTagName extends Node {
    private String name;

    public HtmlTagName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

