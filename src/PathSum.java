public class PathSum {

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
//        TreeNode node =
//                new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4, new TreeNode(5), null), null), null), null);
//        TreeNode node1 = new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5)))));
//        TreeNode node2 = new TreeNode(1, new TreeNode(2), null);
//        TreeNode node3 = new TreeNode(1, new TreeNode(2,
//                new TreeNode(4), new TreeNode(5)),
//                new TreeNode(3,
//                        new TreeNode(8), null));
        TreeNode node = new TreeNode(5, new TreeNode(4,new TreeNode(11, new TreeNode(7), new TreeNode(2)) ,null), new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));
        System.out.println(hasPathSum(node, 22));
    }


    //       1
    //   2   |   3
    // 4 | 5   8 | n

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return (targetSum - root.val) == 0;
        }
//        if (root.left != null && root.right == null) {
//            int diff = targetSum - root.val;
//            return pathSum(root.left, diff);
//        }
//        if (root.left == null) {
//            int diff = targetSum - root.val;
//            return pathSum(root.right, diff);
//        }
        return pathSums(root, targetSum);
    }

    //2
    //3 4
    public static boolean pathSums(TreeNode node, int target) {
        if (node == null) {
            return false;
        }
        if (node.left == null && node.right == null) {
            return target - node.val == 0;
        }
        int diff = target - node.val;
        boolean leftDiff = pathSums(node.left, diff);
        if (leftDiff) {
            return true;
        }
        return pathSums(node.right, diff);
    }

    public static boolean pathSum(TreeNode node, int target) {
        if (node == null) {
            return target == 0;
        }
        int diff = target - node.val;
        boolean leftDiff = pathSum(node.left, diff);
        if (leftDiff) {
            return true;
        }
        if (node.right == null) {
            return false;
        }

        return pathSum(node.right, diff);
    }
}
