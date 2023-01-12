package HundredEasySolvedProblems;

/**
 * Given a positive integer num, return true if num is a perfect square or false otherwise.
 * <p>
 * A perfect square is an integer that is the square of an integer. In other words, it is the
 * product of some integer with itself.
 * <p>
 * You must not use any built-in library function, such as sqrt.
 */

public class ValidPerfectSquare {

  public static void main(String[] args) {

  }

  public static boolean isPerfectSquare(int num) {
    int oddNumber = 1;

    while (num > 0) {
      num -= oddNumber;
      oddNumber += 2;
    }

    return num == 0;
  }

}
