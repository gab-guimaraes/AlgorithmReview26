package tree;

public class TreeAgain {
    private TreeNodee root;

    public TreeAgain(TreeNodee root) {
        this.root = root;
    }

    public static void traverse(TreeNodee node) {
        if (node == null) return;
        System.out.println(node.getVal());
        traverse(node.left);
        traverse(node.right);
    }

    public static void main(String[] args) {
        TreeNodee treeNodee = new TreeNodee("Voldemord");
        treeNodee.right = new TreeNodee("Belatrix");
        treeNodee.left = new TreeNodee("Lucius Malfoy");
        traverse(treeNodee);
    }

}


class TreeNodee {
    private String val;
    public TreeNodee left;
    public TreeNodee right;

    public TreeNodee(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
