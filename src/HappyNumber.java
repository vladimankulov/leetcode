import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(123144453));
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
        int l = n / 10;
        int r = n % 10;

        return (l * l) + (r * r);

    }
}
