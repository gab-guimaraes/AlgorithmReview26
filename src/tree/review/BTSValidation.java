package tree.review;

import tree.TreeNode;

public class BTSValidation {

    //usar 2 variaveis como interval para saber os limites dos filhos.
    //se zuar retornar -1 como problema e propagar acima
    public static boolean checkBTS(TreeNode treeNode) {
        return verifyIntervals(treeNode, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean verifyIntervals(TreeNode treeNode, long min, long max) {
        if (treeNode == null) return true;
        if (treeNode.data < min || treeNode.data > max) {
            return false;
        }
        boolean left = verifyIntervals(treeNode.left, min, treeNode.data);
        boolean right = verifyIntervals(treeNode.right, treeNode.data, max);
        return left && right;
    }
}
