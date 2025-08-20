package AST.Classes;

    /*
    componentMetadataProperty
    : SELECTOR COLON STRING
    | STANDALONE COLON BOOLEAN_LITERAL
    | IMPORTS COLON value
    | TEMPLATE COLON TEMPLATE_STR
    | STYLE_URLS COLON arrayLiteral
    | IDENTIFIER COLON value
    ;
     */
    public class ComponentMetadataProperty extends Node{
        private String name; // selector, standalone, imports, template, styleUrls, أو أي IDENTIFIER
        private Object value; // نوعه حسب الخصائص (String, Boolean, List, Value, ...)

        public ComponentMetadataProperty(String name, Object value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return name + ": " + value;
        }
    }

