package HundredEasySolvedProblems;

import java.util.Arrays;

public class ReverseBits {

    public static void main(String[] args) {
        int b = reverseBits(12);
        int s = reverseBitsByString(12);
        System.out.println(b + " = " + s + " is equal " + (b == s));
    }

    public static int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32; i++) {
            rev <<= 1;
            if ((n & 1) == 1)
                rev ^= 1;
            n >>= 1;
        }
        return rev;
    }

    public static int hammingWeight(int n) {
        int count = 0;

        for (int i = 0; i < 32; i++) {
            if (n == 0) {
                break;
            }
            if ((n & 1) == 1)
                count++;
            n >>= 1;
        }
        return count;
    }

    public static int reverseBitsByString(int n) {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new StringBuilder();
        String s = String.format("%32s", Integer.toBinaryString(n)).replace(" ", "0");
        builder.append(s);
        builder.reverse();
        Arrays.stream(builder.toString().split("(?<=\\\\G.{8})")).forEach(a -> result.append(Integer.parseInt(a, 2)));
        return Integer.parseInt(result.toString());
    }
}
