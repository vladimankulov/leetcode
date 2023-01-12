package HundredEasySolvedProblems;

import java.util.IllegalFormatCodePointException;

public class SquareRoot {

    public static void main(String[] args) {
        System.out.println(findSqrtB(8) == 2);
        System.out.println(findSqrtB(9) == 3);
        System.out.println(findSqrtB(6) == 2);
        System.out.println(findSqrtB(10) == 3);
        System.out.println(findSqrtB(2147395599) == 46339);
        System.out.println(findSqrtB(11) == 3);
        System.out.println(findSqrtB(12) == 3);
        System.out.println(findSqrtB(13) == 3);
        System.out.println(findSqrtB(14) == 3);
        System.out.println(findSqrtB(15) == 3);
        System.out.println(findSqrtB(16) == 4);
        System.out.println(findSqrtB(17) == 4);
        System.out.println(findSqrtB(18) == 4);
        System.out.println(findSqrtB(19) == 4);
        System.out.println(findSqrtB(20) == 4);
        System.out.println(findSqrtB(21) == 4);
        System.out.println(findSqrtB(22) == 4);
        System.out.println(findSqrtB(23) == 4);
        System.out.println(findSqrtB(24) == 4);
        System.out.println(findSqrtB(25) == 5);
        System.out.println(findSqrtB(26) == 5);
        System.out.println(findSqrtB(27) == 5);
        System.out.println(findSqrtB(28) == 5);
    }

    public static long pivot(long x) {
        if (x <= 1) {
            return 1;
        }
        return x / 2;
    }

    public static int findSqrtB(int x) {
        if (x <= 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        long lb = lb(x, pivot(x));
        long rb = rb(x, pivot(x), pivot(x));
        for (long i = lb; i <= rb; i = i + 2) {
            if (i * i > x) {
                return (int) i - 2;
            }
        }
        return (int) rb;
    }

    private static long lb(int x, long n) {
        if (n * n > x) {
            return lb(x, pivot(n));
        }
        return n;
    }

    private static long rb(int x, long n, long r) {
        if (n * n > x) {
            return rb(x, pivot(n), r);
        }
        return r;
    }


    public static int mySqrt(int x) {
        return findSqrt(x, 1, 0);
    }

    private static int findSqrt(int x, int n, int steps) {
        int result = x - n;

        if (result < 0) {
            return steps;
        }

        if (result == 0) {
            return ++steps;
        }
        return findSqrt(result, n + 2, ++steps);
    }

}
