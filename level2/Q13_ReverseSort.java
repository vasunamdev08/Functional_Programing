package level2;

import java.util.Comparator;
import java.util.List;

public class Q13_ReverseSort {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.stream().sorted(Comparator.reverseOrder()).forEach(x -> System.out.print(x + " ")); // Output: 10 9 8 7 6 5 4 3 2 1
    }
}
