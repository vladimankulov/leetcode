public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] day1 = new int[]{7, 1, 5, 3, 6, 4};
        int[] day2 = new int[]{7, 2, 5, 1, 6, 4};
        int[] day3 = new int[]{7, 6, 5, 4, 3, 2, 1};
        int[] day4 = new int[]{2, 4, 1};
        int[] day5 = new int[]{3, 2, 6, 5, 0, 3};
        int[] day6 = new int[]{1, 2};
        System.out.println(maxProfit(day1));
        System.out.println(maxProfit(day2));
        System.out.println(maxProfit(day3));
        System.out.println(maxProfit(day4));
        System.out.println(maxProfit(day5));
        System.out.println(maxProfit(day6));
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 1) {
            return 0;
        }
        int profit = 0;
        int min = prices[0];
        for (int i = 1; i <= prices.length - 1; i++) {
            int temp = prices[i] - min;
            if (temp > profit) {
                profit = temp;
            }
            if (min > prices[i]) {
                min = prices[i];
            }
        }
        return profit;
    }
}
