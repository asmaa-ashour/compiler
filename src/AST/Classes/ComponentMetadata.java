package AST.Classes;

import java.util.List;

public class ComponentMetadata {
    private List<ComponentMetadataProperty> properties;

    public ComponentMetadata(List<ComponentMetadataProperty> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        if (properties == null || properties.isEmpty()) return "{}";
        return "{" + String.join(", ", properties.stream().map(Object::toString).toList()) + "}";
    }
}
