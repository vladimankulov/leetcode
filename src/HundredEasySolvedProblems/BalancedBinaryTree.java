package HundredEasySolvedProblems;

public class BalancedBinaryTree {

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
//        TreeNode node = new TreeNode(3, new TreeNode(4, new TreeNode(5, new TreeNode(7), null), new TreeNode(6)), new TreeNode(7));
        TreeNode node = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), null), null), new TreeNode(2, new TreeNode(3, new TreeNode(4), null), null));
        boolean isBalanced = isBalanced(node);
        System.out.println(isBalanced);
    }


    //  3
    // 4 5


    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int left = high(root.left);
        int right = high(root.right);

        return !(Math.abs(left - right) > 1);
    }

    //  4
    // 6 n

    //     3
    //    4 5
    //   6   7
    //      8
    private static int high(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = high(node.left);
        int right = high(node.right);
        return Math.max(left, right) + 1;
    }
}
