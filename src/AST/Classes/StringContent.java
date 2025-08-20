package AST.Classes;


public class StringContent extends HtmlContent {
    private String value;

    public StringContent(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "StringContent(\"" + value + "\")";
    }
}