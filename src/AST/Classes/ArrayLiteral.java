package AST.Classes;

import java.util.List;

/*
arrayLiteral
    : LBRACK (expression (COMMA expression)* | SPREAD expression (COMMA expression)*)* RBRACK
    ;
*/
public class ArrayLiteral extends Expression {

    private List<Expression> elements;
    private List<Boolean> spreads; // نفس طول elements, true إذا العنصر spread

    public ArrayLiteral(List<Expression> elements, List<Boolean> spreads) {
        this.elements = elements;
        this.spreads = spreads;
    }

    public List<Expression> getElements() {
        return elements;
    }

    public List<Boolean> getSpreads() {
        return spreads;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ArrayLiteral([");
        for (int i = 0; i < elements.size(); i++) {
            if (spreads.get(i)) {
                sb.append("..."); // spread
            }
            sb.append(elements.get(i).toString());
            if (i < elements.size() - 1) sb.append(", ");
        }
        sb.append("])");
        return sb.toString();
    }
}
