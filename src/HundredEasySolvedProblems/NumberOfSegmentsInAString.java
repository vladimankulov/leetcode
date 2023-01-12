package HundredEasySolvedProblems;

public class NumberOfSegmentsInAString {

  public static void main(String[] args) {
    System.out.println(countSegments("Hello"));
  }

  public static int countSegments(String s) {
    int count = 0;
    boolean isWord = true;
    for (char c : s.toCharArray()) {
      if (c == ' ') {
        isWord = true;
      } else {
        if (isWord) {
          ++count;
        }
        isWord = false;
      }
    }
    return count;
  }

}
