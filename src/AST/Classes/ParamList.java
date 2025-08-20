package AST.Classes;

import java.util.ArrayList;
import java.util.List;

public class ParamList {
    /*

paramList
    : param (COMMA param)*
    ;
     */
    private List<Param>param=new ArrayList<>();
    private List<String>COMMA;

    public List<Param> getParam() {
        return param;
    }

    public void setParam(List<Param> param) {
        this.param = param;
    }

    public List<String> getCOMMA() {
        return COMMA;
    }

    public void setCOMMA(List<String> COMMA) {
        this.COMMA = COMMA;
    }
}
