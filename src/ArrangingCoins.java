/**
 * You have n coins and you want to build a staircase with these coins. The staircase consists of k
 * rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
 * <p>
 * Given the integer n, return the number of complete rows of the staircase you will build.
 */
public class ArrangingCoins {

  public static void main(String[] args) {
    System.out.println(arrangeCoins(5));
  }

  public static int arrangeCoins(int n) {
    int steps = 0;

    while (n > steps) {
      steps += 1;
      n -= steps;
    }
    return steps;
  }
}
