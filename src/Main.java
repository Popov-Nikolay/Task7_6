import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        int indmin = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            list.add(m);
            if (list.get(i) <= min) {
                min = list.get(i);
                indmin = i;
            }
        }
        int indmax = 0;
        int max = Integer.MIN_VALUE;
        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i) >= max) {
                max = list.get(i);
                indmax = i;
            }
        }
        int summ = 0;
        for (int i = Math.min(indmax, indmin) + 1; i <= Math.max(indmax, indmin) - 1; i++) {
            summ += list.get(i);
        }
        System.out.println(summ);
    }
}