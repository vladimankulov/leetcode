import java.util.LinkedList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

  public static void main(String[] args) {
    System.out.println(findDisappearedNumbers(new int[]{2,2}));
  }

  public static List<Integer> findDisappearedNumbers(int[] nums) {
    int lastDisappearedIndex = 0;

    for (int i = 0; i < nums.length; i++) {
      if (i + 1 != nums[i]) {
        int rightfulPosition = nums[i] - 1;
        if (nums[i] == nums[rightfulPosition]) {
          lastDisappearedIndex = i;
          continue;
        }
        swap(nums, nums[i] - 1, i);
        i--;
      }
    }
    List<Integer> integers = new LinkedList<>();
    for (int i = lastDisappearedIndex; i >= 0; i--) {
      if (nums[i] != i+1) {
        integers.add(i+1);
      }

    }
    return integers;
  }

  private static void swap(int[] nums, int left, int right) {
    int temp = nums[right];
    nums[right] = nums[left];
    nums[left] = temp;
  }

}
