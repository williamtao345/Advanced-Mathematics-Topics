import java.util.ArrayList;
import java.util.List;

public class SquareAndTriangularNumbers {
    public static void main(String[] args) {
        List<Integer> square = new ArrayList<>();
        List<Integer> triangular = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            square.add(i * i);
            triangular.add(getTriangularNumber(i));
            System.out.println(getTriangularNumber(i));
        }

        for (int i = 0; i < 10000; i++) {
            if (triangular.contains(square.get(i))) {
                System.out.println(i + " " + square.get(i) + " " + (triangular.indexOf(square.get(i))-1));
            }
        }
    }

    public static int getTriangularNumber(int i) {
        int out = 0;
        for (int j = 0; j < i; j++) {
            out+=j;
        }
        return out;
    }
}
