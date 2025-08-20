package AST.Classes;

public class ConstructorDeclaration extends Node{
    /*
    constructorDeclaration
    : CONSTRUCTOR LPAREN paramList? RPAREN block
    ;

     */

    private String CONSTRUCTOR;

    private String LPAREN;
    private  String RPAREN;
    private ParamList paramList;
    private  BlockStmt block;

    public String getCONSTRUCTOR() {
        return CONSTRUCTOR;
    }

    public void setCONSTRUCTOR(String CONSTRUCTOR) {
        this.CONSTRUCTOR = CONSTRUCTOR;
    }

    public String getLPAREN() {
        return LPAREN;
    }

    public void setLPAREN(String LPAREN) {
        this.LPAREN = LPAREN;
    }

    public String getRPAREN() {
        return RPAREN;
    }

    public void setRPAREN(String RPAREN) {
        this.RPAREN = RPAREN;
    }

    public ParamList getParamList() {
        return paramList;
    }

    public void setParamList(ParamList paramList) {
        this.paramList = paramList;
    }

    public BlockStmt getBlock() {
        return block;
    }

    public void setBlock(BlockStmt block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "";
    }
}
