import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
//        System.out.println(isHappy(19));
        System.out.println(16 % 2);
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n >= 1 && !set.contains(n)) {
            set.add(n);
            n = getNext(n);
        }
        return n == 1;
    }

    public static int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;

    }
}
