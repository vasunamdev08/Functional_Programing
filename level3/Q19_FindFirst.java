package level3;

import java.util.List;
import java.util.Optional;

public class Q19_FindFirst {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> first = list.stream().filter(x->x%5==0).findFirst();
        System.out.println(first.isPresent()?first.get():"Not Found");
    }
}
