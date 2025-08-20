package AST.Classes;
import java.util.List;


class IfStmt extends Statement {
    private String condition; // أو Expression
    private List<Statement> thenBlock;
    private List<Statement> elseBlock; // optional

    public IfStmt(String condition, List<Statement> thenBlock, List<Statement> elseBlock) {
        this.condition = condition;
        this.thenBlock = thenBlock;
        this.elseBlock = elseBlock;
    }

    @Override
    public String toString() {
        return "IfStmt(condition=" + condition + ", then=" + thenBlock + ", else=" + elseBlock + ")";
    }
}
