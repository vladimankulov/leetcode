import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SummaryRanges {

    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
    }

    public static List<String> summaryRanges(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Collections.emptyList();
        }
        List<String> results = new LinkedList<>();
        int range = nums[0];
        int startIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            range += 1;
            if (nums[i] != range) {
                results.add(printRange(nums[startIndex], nums[i - 1]));
                range = nums[i];
                startIndex = i;
            }
        }
        results.add(printRange(nums[startIndex], nums[nums.length - 1]));
        return results;
    }

    private static String printRange(int from, int to) {
        if (from == to) {
            return Integer.toString(from);
        }
        StringBuilder builder = new StringBuilder();
        builder.append(from).append("->").append(to);
        return builder.toString();
    }
}
