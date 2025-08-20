package AST.Classes;

public class AccessModifier {
    /*

accessModifier
    : PRIVATE
    | PUBLIC
    | PROTECTED
    ;
     */
    private  String PRIVATE;
    private  String PUBLIC;
    private  String PROTECTED;

    public String getPRIVATE() {
        return PRIVATE;
    }

    public void setPRIVATE(String PRIVATE) {
        this.PRIVATE = PRIVATE;
    }

    public String getPUBLIC() {
        return PUBLIC;
    }

    public void setPUBLIC(String PUBLIC) {
        this.PUBLIC = PUBLIC;
    }

    public String getPROTECTED() {
        return PROTECTED;
    }

    public void setPROTECTED(String PROTECTED) {
        this.PROTECTED = PROTECTED;
    }
}
