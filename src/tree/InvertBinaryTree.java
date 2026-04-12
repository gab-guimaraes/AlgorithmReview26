package tree;

/*
    Time complexity O(N) visita cada nó uma vez
    Space complexity O(H) altura da arvore
 */
public class InvertBinaryTree {
    public static TreeNode invertBinaryTree(TreeNode root) {
        //caso base == null
        if (root == null) return null;

        TreeNode aux = root.left;
        root.left = root.right;
        root.right = aux;

        invertBinaryTree(root.left);
        invertBinaryTree(root.right);

        return root;
    }
}
