public class FindUniqueCharacterInString {

  public static void main(String[] args) {
    System.out.println(firstUniqChar("leetcode"));
  }

  public static int firstUniqChar(String s) {
    int nonRepeated = -1;

    for (int i = 0; i < s.length() - 1; i++) {
      if (s.charAt(i) == s.charAt(i + 1)) {
        return nonRepeated;
      }
      nonRepeated = i;
    }
    return nonRepeated;
  }

}
