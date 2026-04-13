package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class TreeNode {
    int data;
    public TreeNode left;
    public TreeNode right;

    public void insert(int value) {
        if (value == data) return;
        if (value < data) {
            if (left == null) {
                left = new TreeNode(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new TreeNode(value);
            } else {
                right.insert(value);
            }
        }
    }

    /* traverse in order, ou seja, vai no da esquerda, imprime o do meio
    e vai para a direita */
    public void traverseInOrder(TreeNode tree) {
        if (tree == null) return;
        traverseInOrder(tree.left);
        System.out.println(tree.data);
        traverseInOrder(tree.right);
    }

    public void traversePreOrder(TreeNode tree) {
        if (tree == null) return;
        System.out.println(tree.data);
        traversePreOrder(tree.left);
        traversePreOrder(tree.right);
    }

    public void traversePostOrder(TreeNode tree) {
        if (tree == null) return;
        traversePostOrder(tree.left);
        traversePostOrder(tree.right);
        System.out.println(tree.data);
    }

    public void traverseLevelOrder(TreeNode tree) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(tree);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.println(current.data);
            if (current.left != null) queue.offer(current.left);
            if (current.right != null) queue.offer(current.right);
        }
    }

    public boolean checkBinaryTree(TreeNode tree) {
        return checkNode(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);

    }

    private boolean checkNode(TreeNode tree, int low, int high) {
        if (tree == null) return true;
        if (tree.data <= low || tree.data >= high) return false;
        boolean leftValid = checkNode(tree.left, Integer.MIN_VALUE, tree.data);
        boolean rightValid = checkNode(tree.right, tree.data, Integer.MAX_VALUE);
        return leftValid && rightValid;
    }

    public static ArrayList<Integer> rightmost(TreeNode treeNode) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        ArrayList<Integer> rightmost = new ArrayList<>();
        queue.offer(treeNode);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize;i++) {
                TreeNode current = queue.poll();
                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
                // ex: 2, 3, 4, 5
                // level size = 4
                if (i == levelSize - 1) rightmost.add(current.data);
            }
        }
        return rightmost;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(25);
        root.insert(20);
        root.insert(27);
        root.insert(15);
        root.insert(22);
        root.insert(26);
        root.insert(30);
        root.insert(29);
        root.insert(32);
        root.traverseLevelOrder(root);
        System.out.println("testing rightmost...");
        TreeNode root2 = new TreeNode(10);
        root2.insert(5);
        root2.insert(15);
        root2.insert(3);
        root2.insert(7);
        root2.insert(12);
        root2.insert(20);
        System.out.println(rightmost(root2));
    }

    public TreeNode(int data) {
        this.data = data;
    }
}