package tree.review;

import tree.TreeNode;

public class ValidateBST {

    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode node, long min, long max) {
        if (node == null) return true;

        if (node.data <= min || node.data >= max) return false;

        return validate(node.left, min, node.data) &&
                validate(node.right, node.data, max);
    }
}
