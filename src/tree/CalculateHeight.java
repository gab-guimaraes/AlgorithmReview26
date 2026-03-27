package tree;

import com.sun.source.tree.Tree;

public class CalculateHeight {
    // N + (...)
    public static  int heightTree(TreeNode node) {
        if (node != null) {
            return 1 + Math.max(heightTree(node.left),
                    heightTree(node.right));
        } else {
            return 0;
        }
    }

    public static  int countNodes(TreeNode node) {
        if (node != null) {
            return 1 +
                    countNodes(node.left) +
                    countNodes(node.right);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        TreeNode threeNodeSecond = new TreeNode(3);
        treeNode.left = threeNodeSecond;
        threeNodeSecond.left = new TreeNode(2);
        threeNodeSecond.right = new TreeNode(4);
        System.out.println(heightTree(treeNode));
        System.out.println(countNodes(treeNode));
    }

}

class TreeNode {
    int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}