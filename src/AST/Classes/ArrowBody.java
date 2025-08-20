package AST.Classes;

public class ArrowBody extends Node {
    private Expression expression;
    private BlockStmt block;

    // Constructor للجسم من نوع Expression
    public ArrowBody(Expression expression) {
        this.expression = expression;
        this.block = null;
    }

    // Constructor للجسم من نوع Block
    public ArrowBody(BlockStmt block) {
        this.block = block;
        this.expression = null;
    }

    @Override
    public String toString() {
        if (expression != null) {
            return "ArrowBody(Expression: " + expression + ")";
        } else {
            return "ArrowBody(Block: " + block + ")";
        }
    }
}

