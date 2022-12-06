public class RangeSumQuery {

  /**
   * Given an integer array nums, handle multiple queries of the following type:
   * <p>
   * Calculate the sum of the elements of nums between indices left and right inclusive where left
   * <= right. Implement the NumArray class:
   * <p>
   * NumArray(int[] nums) Initializes the object with the integer array nums. int sumRange(int left,
   * int right) Returns the sum of the elements of nums between indices left and right inclusive
   * (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
   */
  public static class NumArray {

    int[] sums;

    /**
     * Your NumArray object will be instantiated and called as such: NumArray obj = new
     * NumArray(nums); int param_1 = obj.sumRange(left,right);
     */
    public NumArray(int[] nums) {
      for (int i = 1; i < nums.length; i++) {
        nums[i] = nums[i] + nums[i - 1];
      }
      this.sums = nums;
    }

    public int sumRange(int left, int right) {
      if (left == 0) {
        return sums[right];
      } else {
        return sums[right] - sums[left - 1];
      }
    }
  }

  public static void main(String[] args) {
    NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
    System.out.println(numArray.sumRange(0, 2));
  }

}
