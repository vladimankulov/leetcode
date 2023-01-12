package HundredEasySolvedProblems;

public class PowerOfTwo {

  public static void main(String[] args) {
    System.out.println(243 / 30);
  }

  public static boolean isPowerOfTwo(int n) {
    if (n <= 0) {
      return false;
    }
    while (n > 1) {
      if (n % 2 == 0) {
        n = n / 2;
      } else {
        return false;
      }
    }
    return true;
  }

  public boolean isPowerOfThree(int n) {
    if (n <= 0) {
      return false;
    }
    while (n > 1) {
      if (n % 3 == 0) {
        n = n / 3;
      } else {
        return false;
      }
    }
    return true;
  }

  public boolean isPowerOfFour(int n) {
    if (n <= 0) {
      return false;
    }
    while (n > 1) {
      if (n % 4 == 0) {
        n = n / 4;
      } else {
        return false;
      }
    }
    return true;
  }

}
