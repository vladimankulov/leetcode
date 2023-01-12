package HundredEasySolvedProblems;

import java.util.List;

public class SortedArrayToBinaryTree {

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
        TreeNode root = sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
        TreeNode rootQ = sortedArrayToBSTq(new int[]{-10, -3, 0, 5, 9});
        TreeNode rootW = sortedArrayToBSTw(new int[]{-10, -3, 0, 5, 9});
//        TreeNode root = sortedArrayToBST(new int[]{1, 3});
        System.out.println(root);
        System.out.println(rootQ);
        System.out.println(rootW);
    }

    public static TreeNode sortedArrayToBSTw(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        int mid = nums.length / 2;
        TreeNode node = new TreeNode(mid);
        node.left = new TreeNode();
        node.right = new TreeNode();
        fillLeft(nums, mid - 1, node.left);
        fillRight(nums, mid + 1, node.right);
        return node;
    }

    public static void fillLeft(int[] nums, int i, TreeNode node) {
        if (i < 0 || i > nums.length - 1) {
            return;
        }
        node = new TreeNode(nums[i]);
        fillLeft(nums, --i, node.left);
    }

    public static void fillRight(int[] nums, int i, TreeNode node) {
        if (i < 0 || i > nums.length - 1) {
            return;
        }
        node = new TreeNode(nums[i]);
        node.right = new TreeNode();
        fillRight(nums, ++i, node.right);
    }

    public static TreeNode sortedArrayToBSTq(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return fill(nums, 0, nums.length - 1);
    }

    private static TreeNode fill(int[] nums, int low, int high) {
        if (low > high) {
            return null;
        }
        int mid = (low + high) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = fill(nums, low, mid - 1);
        root.right = fill(nums, mid + 1, high);
        return root;
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        int pivot = nums.length / 2;
        TreeNode root = new TreeNode(nums[pivot]);
        TreeNode left = new TreeNode();
        TreeNode right = new TreeNode();
        int i = 0;
        while (i < nums.length) {
            if (i < pivot) {
                left.val = nums[i];
                TreeNode current = left;
                left = new TreeNode();
                left.left = current;
            }
            if (i > pivot) {
                right.val = nums[i];
                TreeNode current = right;
                right = new TreeNode();
                right.right = current;
            }
            i++;
        }
        root.left = left.left;
        root.right = right.right;
        return root;
    }

    private static void inorderTraversal(List<Integer> list, TreeNode treeNode) {
        if (treeNode != null) {
            inorderTraversal(list, treeNode.left);
            list.add(treeNode.val);
            inorderTraversal(list, treeNode.right);
        }
    }
}
