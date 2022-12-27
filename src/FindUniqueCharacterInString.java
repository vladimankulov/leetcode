/**
 * Given a string s, find the first non-repeating character in it and return its index. If it does
 * not exist, return -1.
 */

public class FindUniqueCharacterInString {

  public static void main(String[] args) {
    System.out.println(firstUniqChar("bd"));
  }

  public static int firstUniqChar(String s) {
    int[] sumOfCharInWord = new int[26];

    for (char c : s.toCharArray()) {
      sumOfCharInWord[c - 'a'] += 1;
    }

    int nonRepeatedIndex = -1;

    for (int i = 0; i < s.length(); i++) {
      int index = s.charAt(i) - 'a';

      if (sumOfCharInWord[index] > 1 && nonRepeatedIndex > -1) {
        return nonRepeatedIndex;
      }
      if (sumOfCharInWord[index] == 1 && nonRepeatedIndex == -1) {
        nonRepeatedIndex = i;
      }
    }
    return nonRepeatedIndex;
  }

}
