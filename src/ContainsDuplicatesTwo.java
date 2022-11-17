import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicatesTwo {

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        Map<Integer, Integer> indexes = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            if (indexes.containsKey(number) && i - indexes.get(number) <= k) {
                    return true;
            } else {
                indexes.put(nums[i], i);
            }
        }
        return false;
    }

    public static boolean containsNearbyDuplicates(int[] nums, int k) {
        if (k == 0) return false;

        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int integer = nums[i];
            if (hashMap.containsKey(integer) && i - hashMap.get(integer) <= k)
                return true;
            hashMap.put(integer, i);
        }
        return false;
    }
}
