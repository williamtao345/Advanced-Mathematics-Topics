public class FibonacciSequenceRepetition {
    public static void main(String[] args) {
        int range = 200;
        int mod = 4;

        for (int i = 2; i < range; i++) {
            System.out.printf("%d\t%d\t%d\n", i, i % mod, N(i));
        }
    }

    public static int N(int m) {
        if (m < 2) {
            return 0;
        }

        int n1 = 1;
        int n2 = 1;
        int n3 = 0;
        int count = 0;

        while (true) {
            n3 = (n1 + n2) % m;
            n1 = n2;
            n2 = n3;
            count++;
            if (n1 == 1 && n2 == 1) {
                return count;
            }
        }
    }
}
