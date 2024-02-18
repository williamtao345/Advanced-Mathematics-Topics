import Utils.Algebra;

public class PhiHypothesis {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            if (phi(i) % 2 == 1) {
                System.out.println(i);
            }

            if(i%1000 == 0){
                System.out.println("------- " + i);
            }
        }
    }

    public static int phi(int a) {
        int count = 0;
        for (int i = 0; i < a; i++) {
            if (Algebra.gcd(i, a) == 1) {
                count++;
            }
        }
        return count;
    }
}
