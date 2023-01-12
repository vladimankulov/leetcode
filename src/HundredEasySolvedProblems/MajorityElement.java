package HundredEasySolvedProblems;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MajorityElement {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{6, 5, 5}));
    }

    public static int majorityElement(int[] nums) {
        int apperiance = nums.length / 2;
        int count = 0;
        int candidate = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (count == 0) {
                candidate = nums[i];
            }
            count += (temp == candidate) ? 1 : -1;
            if (count == apperiance) {
                return candidate;
            }
        }
        return candidate;
    }
}
