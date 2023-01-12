package HundredEasySolvedProblems;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BinaryPreOrderTraversal {
    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        if (root.left == null && root.right == null) {
            return List.of(root.val);
        }
        List<Integer> list = new LinkedList<>();
        return preOrder(root, list);
    }

    public static List<Integer> preOrder(TreeNode node, List<Integer> list) {
        if (node != null) {
            list.add(node.val);
            preOrder(node.left, list);
            preOrder(node.right, list);
        }
        return list;
    }
}
