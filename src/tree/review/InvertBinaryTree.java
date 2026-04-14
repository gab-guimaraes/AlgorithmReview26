package tree.review;

import tree.TreeNode;

public class InvertBinaryTree {

    public static void callInvert() {

    }

    public TreeNode invert(TreeNode root) {
        //caso base
       if (root == null) return null;

       TreeNode temp = root.left;
       root.left = root.right;
       root.right = temp;

       invert(root.left);
       invert(root.right);

       return root;
    }
}
