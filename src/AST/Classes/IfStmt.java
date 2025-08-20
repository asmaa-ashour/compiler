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

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public List<Statement> getThenBlock() {
        return thenBlock;
    }

    public void setThenBlock(List<Statement> thenBlock) {
        this.thenBlock = thenBlock;
    }

    public List<Statement> getElseBlock() {
        return elseBlock;
    }

    public void setElseBlock(List<Statement> elseBlock) {
        this.elseBlock = elseBlock;
    }

    @Override
    public String toString() {
        return "IfStmt(condition=" + condition + ", then=" + thenBlock + ", else=" + elseBlock + ")";
    }
}
