public class InvertBinaryTree {

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

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        invert(root);
        return root;
    }

    private static void invert(TreeNode current) {
        if (current == null) {
            return;
        }
        TreeNode left = current.left;
        current.left = current.right;
        current.right = left;
        invert(current.left);
        invert(current.right);
    }
}
