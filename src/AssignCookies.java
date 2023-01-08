/**
 * Assume you are an awesome parent and want to give your children some cookies. But, you should
 * give each child at most one cookie.
 * <p>
 * Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will
 * be content with; and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j
 * to the child i, and the child i will be content. Your goal is to maximize the number of your
 * content children and output the maximum number.
 */

public class AssignCookies {

  public static void main(String[] args) {
    System.out.println(findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}));
  }

  public static int findContentChildren(int[] g, int[] s) {
    sort(g);
    sort(s);

    int countOfCookies = 0;
    for (int i = 0; i < g.length; i++) {
      if (i >= s.length) {
        return countOfCookies;
      }
      int value = find(s, 0, s.length - 1, g[i]);
      if (value == -1) {
        return countOfCookies;
      }
      countOfCookies += 1;
    }
    return countOfCookies;
  }

  private static int find(int[] num, int left, int right, int number) {
    if (left > right) {
      return -1;
    }
    if (left == right) {
      if (num[left] == number) {
        num[left] = -1;
        return number;
      }
      return -1;
    }
    int mid = (left + right) / 2;
    if (num[mid] == number) {
      num[mid] = -1;
      return number;
    }
    return num[mid] < number ? find(num, mid + 1, right, number) : find(num, left, mid - 1, number);
  }

  private static void sort(int[] num) {
    sort(num, 0, num.length - 1);
  }

  //4,2,3,5,7
  private static void sort(int[] num, int left, int right) {
    if (left >= right) {
      return;
    }

    int pivot = num[right];
    int leftPointer = left;
    int rightPointer = right;

    while (leftPointer < rightPointer) {
      while (num[leftPointer] <= pivot && leftPointer < rightPointer) {
        leftPointer++;
      }

      while (num[rightPointer] >= pivot && leftPointer < rightPointer) {
        rightPointer--;
      }
      swap(num, leftPointer, rightPointer);
    }
    swap(num, leftPointer, right);

    sort(num, left, --leftPointer);
    sort(num, ++rightPointer, right);
  }

  private static void swap(int[] nums, int left, int right) {
    int temp = nums[left];
    nums[left] = nums[right];
    nums[right] = temp;
  }
}
