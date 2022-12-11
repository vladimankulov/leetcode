import java.util.HashSet;
import java.util.Set;

public class IntersectionsOfTwoArrays {

  public static void main(String[] args) {

  }

  public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> intersection = new HashSet<>();

    int left = nums1.length - 1;
    int right = nums2.length - 1;

    while (left >= 0 || right >= 0) {
      if (left > 0) {
        intersection.add(nums1[left]);
      }

      if (right > 0) {
        intersection.add(nums2[right]);
      }

      left--;
      right--;
    }
    return intersection.stream().mapToInt(Integer::intValue).toArray();
  }
}
