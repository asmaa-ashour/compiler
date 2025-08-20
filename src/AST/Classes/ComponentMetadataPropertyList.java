package AST.Classes;

import java.util.ArrayList;
import java.util.List;

public class ComponentMetadataPropertyList {
    /*
    componentMetadataPropertyList
    : componentMetadataProperty (COMMA componentMetadataProperty)* COMMA?
    ;
     */
    private List<ComponentMetadataProperty>componentMetadataProperty=new ArrayList<>();
    private List<String>COMMA;

    public List<ComponentMetadataProperty> getComponentMetadataProperty() {
        return componentMetadataProperty;
    }

    public void setComponentMetadataProperty(List<ComponentMetadataProperty> componentMetadataProperty) {
        this.componentMetadataProperty = componentMetadataProperty;
    }

    public List<String> getCOMMA() {
        return COMMA;
    }

    public void setCOMMA(List<String> COMMA) {
        this.COMMA = COMMA;
    }
}
