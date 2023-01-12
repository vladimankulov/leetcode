package HundredEasySolvedProblems;

/**
 * Given a string s, check if it can be constructed by taking a substring of it and appending
 * multiple copies of the substring together.
 */

public class RepeatedSubstringPattern {

  public static void main(String[] args) {
    System.out.println(repeatedSubPattern("ab"));
  }

  private static boolean repeatedSubPattern(String s) {
    String str = s + s;
    String str1 = str.substring(1, str.length() - 1);
    if (str1.contains(s)) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean repeatedSubstringPattern(String s) {
    if (s == null) {
      return false;
    }

    StringBuilder subString = new StringBuilder();
    int middle = s.length() / 2;
    for (int i = 0; i < s.length(); i++) {
      subString.append(s.charAt(i));
      if (i >= middle) {
        return false;
      }
      StringBuilder result = new StringBuilder(subString);
      for (int j = subString.length(); j < s.length(); j = j + subString.length()) {
        result.append(subString);
      }
      if (result.toString().equals(s)) {
        return true;
      }
    }
    return false;
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
        length /= 2;

      }
    }
    return false;
  }

}
