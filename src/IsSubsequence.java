/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * <p>
 * A subsequence of a string is a new string that is formed from the original string by deleting
 * some (can be none) of the characters without disturbing the relative positions of the remaining
 * characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */

public class IsSubsequence {

  public static void main(String[] args) {
    System.out.println(isSubsequence("bb", "acbhgc"));
  }

  public static boolean isSubsequence(String s, String t) {
    int orderOfSubsequence = 0;

    for (char c : s.toCharArray()) {
      int orderOfPattern = t.indexOf(c, orderOfSubsequence);

      if (orderOfPattern == -1) {
        return false;
      }
      orderOfSubsequence =
          orderOfPattern == orderOfSubsequence ? orderOfSubsequence + 1 : orderOfPattern + 1;
    }
    return true;
  }

}
