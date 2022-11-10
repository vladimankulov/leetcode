public class SymmetricTree {

    /**
     * Definition for a binary tree node.
     */
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
        System.out.println(isSymmetric(fill()));
    }

    //       1
    //     2   2
    //    3 4 4 3
    public static TreeNode fill() {
        return new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(3)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (root.left == null && root.right == null) {
            return true;
        }
        return preOrderCompare(root.left, root.right);
    }

    private static boolean preOrderCompare(TreeNode p, TreeNode q) {
        if (p != null && q != null) {
            boolean compare = preOrderCompare(p.left, q.right);
            if (compare) {
                boolean valCompare = p.val == q.val;
                if (valCompare) {
                    return preOrderCompare(p.right, q.left);
                }
            }
            return false;
        }

        if (p == null && q != null) {
            return false;
        }

        return p == null;
    }
}
