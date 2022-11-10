public class MaximumDepthOfBinaryTree {


    //     Definition for a binary tree node.
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
        System.out.println(maxDepth(fill()));
    }

    public static TreeNode fill() {
     return new TreeNode(3, new TreeNode(4, new TreeNode(6), new TreeNode(7)), new TreeNode(5, new TreeNode(6), new TreeNode(7)));
    }

    //        3
    //     /    \
    //    4      5
    //   / \    / \
    //  6   7  6   7

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        return findMaxDepth(root) + 1;
    }
    public static int findMaxDepth(TreeNode node) {
        if (node == null || (node.left == null && node.right == null)) {
            return 0;
        }

        int left = findMaxDepth(node.left);
        int right = findMaxDepth(node.right);
        return Math.max(left, right) + 1;
    }
}
