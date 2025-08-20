package AST.Classes;
import java.util.List;

/*
block
    : LBRACE statementInside* RBRACE
    ;
 */
public class BlockStmt {

    private List<Statement> statements;

    public BlockStmt(List<Statement> statements) {
        this.statements = statements;
    }

    public List<Statement> getStatements() { return statements; }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        return "{ " + statements + " }";
    }
}
