/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using
 * the letters from magazine and false otherwise.
 * <p>
 * Each letter in magazine can only be used once in ransomNote.
 */

public class RandomNote {

  public static void main(String[] args) {
    System.out.println(canConstruct("a", "b"));
  }

  public static boolean canConstruct(String ransomNote, String magazine) {
    if (ransomNote.length() > magazine.length()) {
      return false;
    }

    int[] alphabetOFMagazine = new int[26];

    for (int i = 0; i < magazine.length(); i++) {
      int c = magazine.charAt(i) - 'a';
      int countOfChars = alphabetOFMagazine[c];
      alphabetOFMagazine[c] = ++countOfChars;
    }

    for (char c : ransomNote.toCharArray()) {
      int index = c - 'a';
      int countOfAvailableChars = alphabetOFMagazine[index];
      if (countOfAvailableChars <= 0) {
        return false;
      }
      alphabetOFMagazine[index] = --countOfAvailableChars;
    }
    return true;
  }

}
