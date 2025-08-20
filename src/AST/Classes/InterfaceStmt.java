package AST.Classes;
import java.util.List;

class InterfaceStmt extends Statement {
    private String interfaceName;
    private List<String> members; // أو List<Member> لو عندك class

    public InterfaceStmt(String interfaceName, List<String> members) {
        this.interfaceName = interfaceName;
        this.members = members;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "InterfaceStmt(" + interfaceName + ", members=" + members + ")";
    }
}
