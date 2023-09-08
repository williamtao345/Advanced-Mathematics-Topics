import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

/**
 * L(21) = 8
 * L(13) = 10
 * L(31) = 107
 */
public class ThreePlusOneAlgorithm {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        long startNumber = 0;
        long maxOutput = 0;

        for (long i = startNumber; i < 10000000; i++) {
            long answer = L(i);
            if (maxOutput < answer) {
                System.out.println(i);
                System.out.println(LProcess(i));
            }
            maxOutput = Math.max(answer, maxOutput);
        }
    }

    public static long L(long n) {
        if (n == 0)
            return 1;

        long count = 1;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            count++;
        }

        return count;
    }

    public static String LProcess(long n) {
        StringBuilder stringBuilder = new StringBuilder();

        if (n == 0)
            return "";

        stringBuilder.append(n);

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            stringBuilder.append(" ").append(n);
        }

        return stringBuilder.toString();
    }
}
