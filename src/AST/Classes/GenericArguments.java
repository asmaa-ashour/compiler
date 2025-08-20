package AST.Classes;
/*
genericArguments
    : LT genericTypeList GT
    ;
 */
public class GenericArguments extends Node {
    private GenericTypeList typeList;

    public GenericArguments(GenericTypeList typeList) {
        this.typeList = typeList;
    }

    public GenericTypeList getTypeList() {
        return typeList;
    }

    @Override
    public String toString() {
        return "<" + typeList.toString() + ">";
    }
}

