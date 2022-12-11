public class ReverseVowsInString {

  /**
   * Given a string s, reverse only all the vowels in the string and return it.
   * <p>
   * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases,
   * more than once.
   */
  public static void main(String[] args) {
    System.out.println(reverseVowels("Euston saw I was not Sue."));
  }


  public static String reverseVowels(String s) {
    char[] stringAsArray = s.toCharArray();
    int start = 0;
    int end = stringAsArray.length - 1;

    int lV = -1;
    int rV = -1;

    while (start < end) {

      if (isVow(stringAsArray[start])) {
        lV = start;
      }

      if (isVow(stringAsArray[end])) {
        rV = end;
      }

      if (lV > -1 && rV > -1) {
        swap(stringAsArray, lV, rV);
        lV = -1;
        rV = -1;
      }

      if (lV == -1) {
        start++;
      }
      if (rV == -1) {
        end--;
      }
    }
    return String.valueOf(stringAsArray);
  }

  private static void swap(char[] c, int l, int r) {
    char t = c[l];
    c[l] = c[r];
    c[r] = t;
  }

  public static boolean isVow(char c) {
    switch (c) {
      case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' -> {
        return true;
      }
      default -> {
        return false;
      }
    }
  }
}
