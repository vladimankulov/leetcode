package HundredEasySolvedProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IntersectionsOfTwoArrays {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(intersect(new int[]{3, 1, 2}, new int[]{1, 1})));
  }

  /**
   * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element
   * in the result must be unique and you may return the result in any order.
   */

  public static int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> intersection = new HashSet<>();

    if (nums1.length > nums2.length) {
      return findArrayFirst(intersection, nums1, nums2);
    }
    return findArrayFirst(intersection, nums2, nums1);
  }

  private static int[] findArrayFirst(Set<Integer> set, int[] biggest, int[] smallest) {
    int[] intersections = new int[smallest.length];

    for (int j : biggest) {
      set.add(j);
    }

    int index = 0;
    Arrays.sort(smallest);

    for (int i = 0; i < smallest.length - 1; i++) {
      if (set.contains(smallest[i])) {
        intersections[index] = smallest[i];
        index++;

        if (smallest[i] != smallest[i + 1]) {
          set.remove(smallest[i]);
        }
      }
    }

    for (int j : smallest) {
      if (set.contains(j)) {
        intersections[index] = j;
        index++;
      }
    }
    return Arrays.copyOf(intersections, index);
  }


  /**
   * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element
   * in the result must appear as many times as it shows in both arrays and you may return the
   * result in any order.
   */
  public static int[] intersect(int[] nums1, int[] nums2) {
    if (nums1.length > nums2.length) {
      return findArray(new HashMap<>(), nums1, nums2);
    }
    return findArray(new HashMap<>(), nums2, nums1);
  }

  private static int[] findArray(Map<Integer, Integer> map, int[] biggest, int[] smallest) {
    int[] intersections = new int[smallest.length];

    for (int value : biggest) {
      map.compute(value, (k, v) -> v == null ? 1 : v + 1);
    }

    int index = 0;

    for (int i = 0; i < smallest.length; i++) {
      Integer val = map.get(smallest[i]);
      if (val != null) {
        if (val == 0) {
          map.remove(smallest[i]);
          continue;
        }
        intersections[index] = smallest[i];
        index++;
        map.put(smallest[i], val - 1);
      }
    }
    return Arrays.copyOf(intersections, index);
  }
}
