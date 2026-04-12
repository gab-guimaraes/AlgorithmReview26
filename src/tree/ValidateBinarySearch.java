package tree;

public class ValidateBinarySearch {
    public boolean validateBinarySearch(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean validate(TreeNode tree, long min, long max) {
        if (tree == null) return true;
        if (tree.val <= min || tree.val >= max ) {
            return false;
        }
        return validate(tree.left, min, tree.val) &&
                validate(tree.right, tree.val, max);
    }
}
