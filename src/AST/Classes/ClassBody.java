package AST.Classes;
import java.util.List;
/*
  classBody
  : classElement*
  ;
   */
public class ClassBody {

    private List<ClassElement> elements;

    public ClassBody(List<ClassElement> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}
