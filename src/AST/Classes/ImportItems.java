package AST.Classes;

import java.util.ArrayList;
import java.util.List;

public class ImportItems extends Node{
    /*
    importItems
    : IDENTIFIER (COMMA IDENTIFIER)* COMMA?
    ;

     */
    private String name;

    public ImportItems(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
