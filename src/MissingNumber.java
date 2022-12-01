public class MissingNumber {

  public static void main(String[] args) {
    System.out.println(5/2);
  }

  //3,2,6,4,1

  public static int missingNumber(int[] nums) {
//    if (nums.length == 1) {
//      return nums[0] == 1 ? 0 : 1;
//    }

    sort(nums);
    int limit = 0;
    for (int i = 0; i < nums.length; i++) {
      if (limit == nums[i]) {
        limit++;
      } else {
        break;
      }
    }
    return limit;
  }

  private static void sort(int[] nums) {
    quickSort(nums, 0, nums.length - 1);
  }

  //3,2,4,5

  private static void quickSort(int[] nums, int lowIndex, int highIndex) {
    if (lowIndex >= highIndex) {
      return;
    }
    int pivot = nums[highIndex];

    int leftPointer = lowIndex;
    int rightPointer = highIndex;

    while (leftPointer < rightPointer) {
      while (nums[leftPointer] <= pivot && leftPointer < rightPointer) {
        leftPointer++;
      }
      while (nums[rightPointer] >= pivot && leftPointer < rightPointer) {
        rightPointer--;
      }
      swap(nums, leftPointer, rightPointer);
    }
    swap(nums, leftPointer, highIndex);

    quickSort(nums, lowIndex, --leftPointer);
    quickSort(nums, ++leftPointer, highIndex);
  }

  private static void swap(int[] nums, int left, int right) {
    if (left == right) {
      return;
    }
    int temp = nums[right];
    nums[right] = nums[left];
    nums[left] = temp;
  }

}
