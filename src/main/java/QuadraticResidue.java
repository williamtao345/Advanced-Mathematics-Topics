import Utils.Algebra;

import java.util.HashSet;
import java.util.Set;

public class QuadraticResidue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (!Algebra.isPrime(i))
                continue;

            Set<Integer> qr = getQR(i);
            Set<Integer> nr = getNR(i);
            int qrSum = 0;
            int nrSum = 0;

            for (Integer n : qr) {
                qrSum += n;
            }
            for (Integer n : nr) {
                nrSum += n;
            }

//            if(qrSum-nrSum == 0 && (i-1)%4 != 0)
//                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!! " + i);

            System.out.printf("m: %d,\tDiff/m: %d, QR: %d, NR: %d, (i-1 mod m): %d\n", i, (nrSum - qrSum) / i, qrSum, nrSum, (i-1)%4);
        }
    }

    public static Set<Integer> getQR(int mod) {

        Set<Integer> qr = new HashSet<>();
        Set<Integer> nr = new HashSet<>();

        for (int i = 1; i < mod; i++) {
            qr.add((i * i) % mod);
        }

        for (int i = 1; i < mod; i++) {
            if (!qr.contains(i)) {
                nr.add(i);
            }
        }
        return qr;
    }

    public static Set<Integer> getNR(int mod) {
        Set<Integer> qr = new HashSet<>();
        Set<Integer> nr = new HashSet<>();

        for (int i = 1; i < mod; i++) {
            qr.add((i * i) % mod);
        }

        for (int i = 1; i < mod; i++) {
            if (!qr.contains(i)) {
                nr.add(i);
            }
        }
        return nr;
    }
}
