package HundredEasySolvedProblems;

import java.util.Arrays;

public class MoveZeroes {
  /* *
   * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
   * Note that you must do this in-place without making a copy of the array.
   * */

  public static void main(String[] args) {
    int[] nums = new int[]{0,1};
    moveZeroes(nums);
    System.out.println(Arrays.toString(nums));
  }

  //[0,1,0,3,12]
  public static void moveZeroes(int[] nums) {
    if (nums == null || nums.length == 1) {
      return;
    }
    int leftPointer = 0;
    int rightPointer = 1;
    while (rightPointer < nums.length) {
      if (nums[leftPointer] == 0 && nums[rightPointer] != 0) {
        swap(nums, leftPointer, rightPointer);
        leftPointer++;
        rightPointer++;
        continue;
      }
      if (nums[leftPointer] != 0 || nums[rightPointer] != 0) {
        leftPointer++;
      }
      rightPointer++;
    }
  }

  private static void swap(int[] nums, int left, int right) {
    int temp = nums[left];
    nums[left] = nums[right];
    nums[right] = temp;
  }
}
