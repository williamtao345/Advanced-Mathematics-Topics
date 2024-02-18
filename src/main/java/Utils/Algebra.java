package Utils;

import java.util.ArrayList;
import java.util.List;

public class Algebra {
    public static void main(String[] args) {
<<<<<<< Updated upstream
        System.out.println(gcd(12, 16, 22));
=======
        System.out.println(divisors(12));
>>>>>>> Stashed changes
    }

    public static boolean isPrime(int i) {
        if (i < 2)
            return false;

        int head = 2;
        int tail = Math.min((int) Math.sqrt(i) + 1, i - 1);

        while (head <= tail) {
            if (i % head == 0)
                return false;

            head++;
        }

        return true;
    }

    public static boolean isPrime(long i) {
        if (i < 2)
            return false;

        long head = 2;
        long tail = Math.min((long) Math.sqrt(i) + 1, i - 1);

        while (head <= tail) {
            if (i % head == 0)
                return false;

            head++;
        }

        return true;
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int gcd(int a, int b, int c) {
        int gcd1 = gcd(a, b);
        int gcd2 = gcd(b, c);

        return gcd(gcd1, gcd2);
    }

    public static boolean isInteger(double x) {
        return x % 1 == 0;
    }

    public static boolean isSquare(int x) {
        return isInteger(Math.sqrt(x));
    }

    public static boolean isSquare(long x) {
        return isInteger(Math.sqrt(x));
    }


    public static boolean isCube(int x) {
        return isInteger(Math.cbrt(x));
    }

<<<<<<< Updated upstream
    public static boolean isRectangular(long x) {
        long a = (long) Math.sqrt(x);
        return x == a * (a + 1);
    }

    public static long triangularNumber(long baseLength) {
        return baseLength * (baseLength + 1) / 2;
=======
    public static double ln(double l) {
        return (-Math.log(1 - l)) / l;
    }

    public static List<Integer> divisors(int a) {
        List<Integer> out = new ArrayList<>();
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                out.add(i);
            }
        }
        return out;
    }

    public static List<Integer> fibonacciSequence(int i) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(1);
        sequence.add(1);

        int n1 = 1;
        int n2 = 1;
        int n3 = 0;

        while (sequence.size() <= i) {
            n3 = n1 + n2;
            sequence.add(n3);
            n1 = n2;
            n2 = n3;
            n3 = 0;
        }
        return sequence;
>>>>>>> Stashed changes
    }
}
