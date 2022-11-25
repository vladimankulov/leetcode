import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreePaths {

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
    TreeNode node = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3));
    System.out.println(binaryTreePaths(node));
  }

  //   1
  // 2   3
  //  5
  public static List<String> binaryTreePaths(TreeNode root) {
    if (root == null) {
      return Collections.emptyList();
    }
    if (root.left == null && root.right == null) {
      return List.of(Integer.toString(root.val));
    }

    List<String> result = new LinkedList<>();
    return result;
  }
}
