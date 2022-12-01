public class UglyNumber {

  /**
   * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
   * <p>
   * Given an integer n, return true if n is an ugly number.
   */
  public static void main(String[] args) {
    System.out.println(isUgly(6));
  }

  private static boolean isUgly(int n) {
    while (n > 1) {
      if (n % 2 == 0) {
        n /= 2;
        continue;
      }
      if (n % 3 == 0) {
        n /= 3;
        continue;
      }
      if (n % 5 == 0) {
        n/=5;
      }
      else
        return false;
    }
    return true;
  }

}
