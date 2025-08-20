package AST.Classes;

import java.util.List;

public class ImportClause {
/*

importClause
    : IDENTIFIER
    | LBRACE importItems RBRACE
    ;

 */
    private String singleIdentifier;         // في حالة كان import باسم واحد
    private List<ImportItems> importItems;        // في حالة {}

    // الحالة الأولى: import React from "react";
    public ImportClause(String singleIdentifier) {
        this.singleIdentifier = singleIdentifier;
        this.importItems = null;
    }

    // الحالة الثانية: import { Component, OnInit } from "angular";
    public ImportClause(List<ImportItems> importItems) {
        this.singleIdentifier = null;
        this.importItems = importItems;
    }

    public String getSingleIdentifier() {
        return singleIdentifier;
    }

    public void setSingleIdentifier(String singleIdentifier) {
        this.singleIdentifier = singleIdentifier;
    }

    public List<ImportItems> getImportItems() {
        return importItems;
    }

    public void setImportItems(List<ImportItems> importItems) {
        this.importItems = importItems;
    }

    @Override
    public String toString() {
        if (singleIdentifier != null) {
            return singleIdentifier;
        } else {
            return "{" + ", "+ importItems + "}";
        }
    }
}
