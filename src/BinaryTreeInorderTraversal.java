import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    //Definition for a binary tree node.
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
        System.out.println(inorderTraversal(fill()));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        if (root.left == null && root.right == null) {
            return List.of(root.val);
        }

        List<Integer> linkedList = new LinkedList<>();
        inorderTraversal(linkedList, root);

        return linkedList;
    }

    //       1
    //   2   |   3
    // 4 | 5   8 | n
    // 4,2,5,1,8,3

    private static void inorderTraversal(List<Integer> list, TreeNode treeNode) {
        if (treeNode != null) {
            inorderTraversal(list, treeNode.left);
            list.add(treeNode.val);
            inorderTraversal(list, treeNode.right);
        }
    }

    private static void writeList(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.left != null) {
            list.add(root.left.val);
        }
        list.add(root.val);
        if (root.right != null) {
            list.add(root.right.val);
        }
    }

    public static TreeNode fill() {
        return new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(8), null));
    }
}
