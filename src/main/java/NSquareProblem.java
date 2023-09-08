import Utils.Algebra;

import java.util.ArrayList;
import java.util.List;

public class NSquareProblem {
    public static void main(String[] args) {
        List<Integer> nSquareMinus = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            nSquareMinus.add(formula(i));
        }

        for (int i = 0; i < 1000; i++) {
            int number = nSquareMinus.get(i);
            boolean isPrime = Algebra.isPrime(number);
            if (isPrime)
                System.out.println(i);
        }
    }

    public static int formula(int i) {
        return i * i - 2;
    }
}
