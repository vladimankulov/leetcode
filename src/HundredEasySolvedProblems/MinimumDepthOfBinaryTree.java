package HundredEasySolvedProblems;

import java.util.LinkedList;
import java.util.List;

public class MinimumDepthOfBinaryTree {


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
        TreeNode node =
//                new TreeNode(-9,
//                        new TreeNode(-3,
//                                null, new TreeNode(4,
//                                new TreeNode(6), null)),
//                        new TreeNode(2,
//                                new TreeNode(4,
//                                        new TreeNode(-5), null),
//                                new TreeNode(0)));
                new TreeNode(1,
                        new TreeNode(2,
                                new TreeNode(4), null),
                        new TreeNode(3,
                                null, new TreeNode(5)));
        int min = minDepth(node);
        System.out.println(min);
    }

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        if (root.left != null && root.right == null) {
            return findLeaf(root.left) + 1;
        }
        if (root.left == null) {
            return findLeaf(root.right) + 1;
        }

        int left = findLeaf(root.left);
        int right = findLeaf(root.right);

        return Math.min(left, right) + 1;
    }


    // 3
    //2 3
    //   5
    public static int findLeaf(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = findLeaf(node.left);
        int right = findLeaf(node.right);

        if (node.left != null && node.right != null) {
            return Math.min(left, right) + 1;
        }
        return Math.max(left, right) + 1;
    }
}
