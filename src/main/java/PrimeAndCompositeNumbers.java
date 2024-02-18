import java.util.ArrayList;
import java.util.List;

public class PrimeAndCompositeNumbers {
    public static void main(String[] args) {
        int mod = 16;
        List<Integer> answers = calculate(mod);
        for (int i = 2; i < mod; i++) {
            if (i == answers.get(i)) {
                System.out.println(i);
            }
        }
        System.out.println(calculate(14));
    }

    public static List<Integer> calculate(int mod) {
        List<Integer> rows = new ArrayList<>(mod);


        for (int i = 0; i < mod; i++) {
            // Each row
            int rowCount = 0;
            for (int j = 0; j < mod; j++) {
                int remainder = (int) (Math.pow(j, i) % mod);
                if (remainder == 1) {
                    rowCount++;
                }
            }
            rows.add(rowCount);
        }

        return rows;
    }
}
