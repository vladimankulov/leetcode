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
    TreeNode node = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));
    System.out.println(binaryTreePaths(node));
  }
  public static List<String> binaryTreePaths(TreeNode root) {
    if (root == null) {
      return Collections.emptyList();
    }
    if (root.left == null && root.right == null) {
      return List.of(Integer.toString(root.val));
    }
    List<String> results = new LinkedList<>();
    printLeaf(root, new StringBuilder(), results);
    return results;
  }

  private static void printLeaf(TreeNode node, StringBuilder builder, List<String> results) {
    if (node == null) {
      return;
    }
    if (node.left == null && node.right == null) {
      results.add(builder.append(node.val).toString());
      return;
    }
    final int length = builder.length();
    printLeaf(node.left, builder.append(node.val).append("->"), results);
    builder.setLength(length);
    printLeaf(node.right, builder.append(node.val).append("->"), results);
    builder.setLength(length);
  }
}
