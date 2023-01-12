package HundredEasySolvedProblems;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Given an integer array nums, return the third distinct maximum number in this array. If the third
 * maximum does not exist, return the maximum number.
 */

public class ThirdMaximumNumber {

  public static void main(String[] args) {
    System.out.println(thirdMax(new int[]{1, 1, 2}));
  }

  //3,2,1
  public static int thirdMax(int[] nums) {
      if (nums == null) {
        return 0;
      }
      NavigableSet<Object> sorted = new TreeSet<>().descendingSet();
      for (int element : nums) {
        sorted.add(element);
      }
      int result = 0;
      int iterator = 0;

      for (Object element : sorted) {
        if (iterator == 3) {
          return result;
        }
        result = element == null ? result : (Integer) element;
        iterator ++;
      }

      return iterator >= 3 ? result : (int) sorted.pollFirst();
  }

}
