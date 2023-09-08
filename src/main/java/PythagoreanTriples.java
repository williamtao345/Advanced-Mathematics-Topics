import Utils.Algebra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PythagoreanTriples {
    static List<NumberGroup> numberGroups = new ArrayList<>();

    static long maxC = 0;

    public static void main(String[] args) {
        boolean flag = false;
        for (int t = 1; t < 100000; t += 2) {
            if (flag) {
                break;
            }

            int s = t;
            int count = 0;

            while (count < 10000) {
                s += 2;
                long gcd = Algebra.gcd(s, t);
                if (gcd == 1) {
                    long a, b, c;
                    a = getA(s, t);
                    b = getB(s, t);
                    c = getC(s, t);

                    if (a * a < 0) {
                        flag = true;
                    }

                    if (c > 1000 && (((b - a) == 3) || ((a - b) == 3))) {
                        System.out.println(new NumberGroup(s, t, a, b, c));
                        System.out.println("" + (a * a + b * b) + " " + (c * c));
                        flag = true;
                        break;
                    }

                    if (maxC < c) {
                        maxC = c;
                        System.out.println(new NumberGroup(s, t, a, b, c));
                    }
                    count++;
                }
            }
        }
    }

    public static void userInputCompute() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();
            String[] stString = userInput.split(" ");

            long s, t, a, b, c;
            s = Integer.parseInt(stString[0]);
            t = Integer.parseInt(stString[1]);
            a = getA(s, t);
            b = getB(s, t);
            c = getC(s, t);


            System.out.println(new NumberGroup(s, t, a, b, c));

        }
    }

    public static long getA(long s, long t) {
        return s * t;
    }

    public static long getB(long s, long t) {
        return (s * s - t * t) / 2;
    }

    public static long getC(long s, long t) {
        return (s * s + t * t) / 2;
    }
}

class NumberGroup {
    long s, t, a, b, c;

    public NumberGroup(long s, long t, long a, long b, long c) {
        this.s = s;
        this.t = t;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "NG{" +
                "s=" + s +
                ", t=" + t +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
