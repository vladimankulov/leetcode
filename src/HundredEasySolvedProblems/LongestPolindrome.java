package HundredEasySolvedProblems;

/**
 * Given a string s which consists of lowercase or uppercase letters, return the length of the
 * longest palindrome that can be built with those letters.
 * <p>
 * Letters are case-sensitive, for example, "Aa" is not considered a palindrome here.
 */
public class LongestPolindrome {

  public static void main(String[] args) {
    System.out.println(longestPalindrome(
        "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz"));
    System.out.println(longestPalindrome("abcdefghijklmnopqrstuvwxyz"));
    System.out.println(longestPalindrome("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    //naaan
  }

  public static int longestPalindrome(String s) {
    int[] alphabetOrder = new int[52];

    for (char c : s.toCharArray()) {
      if (Character.isLowerCase(c)) {
        alphabetOrder[c - 'a'] += 1;
      } else {
        alphabetOrder[c - 'A' + 26] += 1;
      }
    }
    int ans = 0;

    for (int c : alphabetOrder) {
      ans += c / 2 * 2;
      if (ans % 2 == 0 && c % 2 == 1)
        ans++;
    }
    return ans;
  }
}
