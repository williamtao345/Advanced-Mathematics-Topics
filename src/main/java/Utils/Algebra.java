package Utils;

public class Algebra {
    public static void main(String[] args) {
        System.out.println(gcd(12,16,22));
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

    public static boolean isCube(int x) {
        return isInteger(Math.cbrt(x));
    }
}
