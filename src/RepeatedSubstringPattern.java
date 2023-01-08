public class RepeatedSubstringPattern {

  public static void main(String[] args) {

  }

  public boolean repeatedSubstringPattern(String s) {
    if (s == null) {
      return false;
    }

    int[] alphabet = new int[26];

    for (char c : s.toCharArray()) {
      alphabet[c - 'a'] += 1;
    }
    int sum = 0;
    int singleCharactersCount = 0;
    for (int count : alphabet) {
      sum += count;
      if (singleCharactersCount >= 2) {
        return false;
      }
      singleCharactersCount = count == 1 ? singleCharactersCount + 1 : singleCharactersCount;
    }

    return sum % 2 == 0;
  }

  public static boolean repeatedSubstringPatternSecond(String s) {
    if (s == null) {
      return false;
    }
    int length = s.length() / 2;
    while (length > 1) {
      String substring = s.substring(0, length);
      String substringEnd = s.substring(length, s.length() - 1);
      if (substringEnd.equals(substring)) {
        return true;
      } else {
        length /=2;

      }
    }
    return false;
  }

}
