import Utils.Algebra;

public class TwoSquareEqualsOneCube {
    public static void main(String[] args) {
        for (int x = 0; x < 1000; x++) {
            for (int y = x; y < x + 1000; y++) {
                int left = x * x * x + y * y * y;
                double z = Math.sqrt(left);
                if (Algebra.isInteger(z) && Algebra.gcd(x, y) == 1) {
                    System.out.println(x + " " + y + " " + (int) z);
                }
            }
        }
    }
}
