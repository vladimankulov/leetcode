package HundredEasySolvedProblems;

import java.util.HashSet;
import java.util.Set;

public class DetermineIfStringHalfsAreAlike {

  public static void main(String[] args) {
    System.out.println(halvesAreAlike("book"));
  }
  //book

  public static boolean halvesAreAlike(String s) {
    if (s == null) {
      return false;
    }
    int leftVowes = 0;
    int rightVowes = 0;
    int lP = 0;
    int rP = s.length() - 1;
    while (lP < rP) {
      if (isVowelBySwitch(s.charAt(lP))) {
        leftVowes++;
      }
      if (isVowelBySwitch(s.charAt(rP))) {
        rightVowes++;
      }
      lP++;
      rP--;
    }
    return leftVowes == rightVowes;
  }

  private static boolean isVowelBySwitch(char c) {
    return switch (c) {
      case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
      default -> false;
    };
  }

}
