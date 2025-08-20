package AST.Classes;
import java.util.List;
/*

classDeclaration
    : CLASS IDENTIFIER (EXTENDS IDENTIFIER)? (IMPLEMENTS IDENTIFIER (COMMA IDENTIFIER)*)? LBRACE classBody RBRACE
    ;

*/
public class ClassDeclaration {
    private String identifier;
    private String extendsIdentifier; // nullable
    private List<String> implementsList; // قائمة واجهات
    private ClassBody classBody;

    public ClassDeclaration(String identifier, String extendsIdentifier, List<String> implementsList, ClassBody classBody) {
        this.identifier = identifier;
        this.extendsIdentifier = extendsIdentifier;
        this.implementsList = implementsList;
        this.classBody = classBody;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getExtendsIdentifier() {
        return extendsIdentifier;
    }

    public void setExtendsIdentifier(String extendsIdentifier) {
        this.extendsIdentifier = extendsIdentifier;
    }

    public List<String> getImplementsList() {
        return implementsList;
    }

    public void setImplementsList(List<String> implementsList) {
        this.implementsList = implementsList;
    }

    public ClassBody getClassBody() {
        return classBody;
    }

    public void setClassBody(ClassBody classBody) {
        this.classBody = classBody;
    }

    @Override
    public String toString() {
        return "ClassDeclaration(identifier=" + identifier
                + (extendsIdentifier != null ? ", extends=" + extendsIdentifier : "")
                + (implementsList != null && !implementsList.isEmpty() ? ", implements=" + implementsList : "")
                + ", body=" + classBody + ")";
    }
}
