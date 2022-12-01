public class FirstBadVersion {

  /**
   * You are a product manager and currently leading a team to develop a new product. Unfortunately,
   * the latest version of your product fails the quality check. Since each version is developed
   * based on the previous version, all the versions after a bad version are also bad.
   * <p>
   * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which
   * causes all the following ones to be bad.
   * <p>
   * You are given an API bool isBadVersion(version) which returns whether version is bad. Implement
   * a function to find the first bad version. You should minimize the number of calls to the API.
   */

  public static int firstBadVersion = 3;

  public static boolean isBadVersion(int n) {
    return firstBadVersion <= n;
  }

  public static void main(String[] args) {
    firstBadVersion = 1702766719;
    long start = System.currentTimeMillis();
    System.out.println(firstBadVersion(2126753390) == firstBadVersion);
    System.out.println("took " + (System.currentTimeMillis() - start));
  }
  public static int firstBadVersion(int n) {
    if (n == 1) {
      return 1;
    }

    return findFirst(0, n);
  }

  public static int findFirst(int l, int r) {
    if (r >= 1) {
      int mid = l + (r - l) / 2;

      boolean isMidIsBad = isBadVersion(mid);

      if (isMidIsBad && !isBadVersion(mid - 1)) {
        return mid;
      }
      if (isMidIsBad) {
        return findFirst(l, mid - 1);
      }
      return findFirst(mid + 1, r);
    }
    return r;
  }
}
