import java.util.HashSet;
import java.util.Set;

public class CongruenceQuestion {
    public static void main(String[] args) {
//        for (int a = 0; a < 5; a++) {
//            for (int c = 0; c < 20; c++) {
//                for (int m = 0; m < 20; m++) {
//                    int answer = calculate(a, c, m);
//                    if(answer == 0)
//                        continue;
//                    System.out.println(a + " " + c + " " + m + " " + answer);
//                }
//            }
//        }

        System.out.println(calculate(893, 266, 2432));
    }

    public static int calculate(int a, int c, int m) {
        int answer = 0;
        for (int x = 0; x < m; x++) {
            if ((a * x) % m == c) {
                answer++;
            }
        }
        return answer;
    }
}
