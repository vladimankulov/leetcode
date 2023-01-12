package HundredEasySolvedProblems;

public class ReverseString {

  /**
   * Write a function that reverses a string. The input string is given as an array of characters
   * s.
   * <p>
   * You must do this by modifying the input array in-place with O(1) extra memory.
   */
  public void reverseString(char[] s) {
    int start = 0;
    int end = s.length - 1;

    while (start < end) {

      char temp = s[end];
      s[end] = s[start];
      s[start] = temp;

      start++;
      end--;
    }
  }
}
