package level3;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q20_ConvertToSet {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Set<Integer> set = list.stream().collect(Collectors.toSet());
        for (Integer i : set) {
            System.out.print(i+", ");
        }
    }
}
