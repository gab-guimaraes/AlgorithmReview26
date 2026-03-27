package recursion;

/* “We visit each node exactly once, so the time complexity is O(n).
   The space complexity is O(h), where h is the height of the tree due to the recursion stack */
public class SumTree {
    private static TreeNode treeNode;

    private static int sum(TreeNode treeNode) {
        if (treeNode == null) return 0;
        return treeNode.val +
                sum(treeNode.left) + sum(treeNode.right);
    }

    public static void main(String[] args) {
        treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(3);
        treeNode.right = new TreeNode(8);
        int total = sum(treeNode);
        System.out.println(total);
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}