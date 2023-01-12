package HundredEasySolvedProblems;

public class SameTree {
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
        System.out.println(isSameTree(fill(), f()));
    }

    public static TreeNode fill() {
        return new TreeNode(1, new TreeNode(2), new TreeNode(3));
    }

    public static TreeNode f() {
        return new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(1), null));
    }


    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        return compareInOrder(p, q);
    }

    private static boolean compareInOrder(TreeNode p, TreeNode q) {
        if (p != null && q != null) {
            boolean leftCompare = compareInOrder(p.left, q.left);

            if (leftCompare) {
                boolean rootCompare = p.val == q.val;

                if (rootCompare) {
                    return compareInOrder(p.right, q.right);
                }
            }
            return false;

        }
        if (q != null && p == null) {
            return false;
        }
        if (p != null && q == null) {
            return false;
        }
        return true;
    }
}
