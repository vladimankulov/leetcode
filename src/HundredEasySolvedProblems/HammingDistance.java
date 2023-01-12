package HundredEasySolvedProblems;

/**
 * The Hamming distance between two integers is the number of positions at which the corresponding
 * bits are different.
 * <p>
 * Given two integers x and y, return the Hamming distance between them.
 */

public class HammingDistance {

  public static void main(String[] args) {
    System.out.println(hammingDistance(1,4));
  }
  public static int hammingDistance(int x, int y) {
    int hammingDistance = 0;

    while(x!=0 || y!=0){
      int left = x & 1;
      int right = y & 1;

      if (left != right) {
        hammingDistance += 1;
      }
      x >>= 1;
      y >>= 1;
    }
    return hammingDistance;
  }

}
