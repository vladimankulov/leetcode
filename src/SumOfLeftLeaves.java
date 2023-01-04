

/**
 * Given the root of a binary tree, return the sum of all left leaves. A leaf is a node with no
 * children. A left leaf is a leaf that is the left child of another node.
 */

public class SumOfLeftLeaves {

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
    TreeNode node = new TreeNode(3, new TreeNode(9),
        new TreeNode(20, new TreeNode(15), new TreeNode(7)));
    TreeNode node1 = new TreeNode(1, new TreeNode(2), null);
    System.out.println(sumOfLeftLeaves(node1));
    System.out.println(sumOfLeftLeaves(node));
  }

  public static int sumOfLeftLeaves(TreeNode root) {
    return sumOfAllLeftLeaves(root, 0, false);
  }

  private static int sumOfAllLeftLeaves(TreeNode node, int result, boolean isLeft) {
    if (node == null) {
      return result;
    }
    if (node.left == null && node.right == null) {
      if (isLeft) {
        result += node.val;
      }
      return result;
    }
    result = sumOfAllLeftLeaves(node.left, result, true);
    return sumOfAllLeftLeaves(node.right, result, false);
  }
}
