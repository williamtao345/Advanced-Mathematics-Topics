import Utils.Algebra;

public class Test {
    public static void main(String[] args) {
        System.out.println(Algebra.triangularNumber(118));
    }

    // 4a
    /*public static void main(String[] args) {
        for (int i = 1; i < 1000000; i++) {
            long triangular = Algebra.triangularNumber(i);
            if(Algebra.isRectangular(triangular)){
                System.out.println(i + " " + triangular);
            }
        }
    }*/

    // 3b
    /*public static void main(String[] args) {
        for (int i = 1; i < 200; i++) {
            for (int j = i; j < 200 + i; j++) {
                long answer = (long) (Math.pow(i, 5) + Math.pow(j, 5));
                if (Algebra.isSquare(answer)) {
                    System.out.printf(
                            "%d, %d, %d gcd:%d\n",
                            i,
                            j,
                            (int) Math.sqrt(answer),
                            Algebra.gcd(i, j)
                    );
                }
            }
        }
    }*/
}
