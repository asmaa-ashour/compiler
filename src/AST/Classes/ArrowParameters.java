package AST.Classes;

public class ArrowParameters extends Node {
    private enum Type { SINGLE, EMPTY, LIST }
    private Type type;

    private String identifier;           // للحالة SINGLE
    private ParameterList parameterList; // للحالة LIST

    // Constructor لمعرف واحد
    public ArrowParameters(String identifier) {
        this.type = Type.SINGLE;
        this.identifier = identifier;
    }

    // Constructor لأقواس فارغة
    public ArrowParameters() {
        this.type = Type.EMPTY;
    }

    // Constructor لقائمة معاملات
    public ArrowParameters(ParameterList parameterList) {
        this.type = Type.LIST;
        this.parameterList = parameterList;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    @Override
    public String toString() {
        switch (type) {
            case SINGLE: return identifier;
            case EMPTY: return "()";
            case LIST: return "(" + parameterList.toString() + ")";
            default: return "";
        }
    }
}

