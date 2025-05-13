package level5;

import java.util.Collection;
import java.util.List;

public class Q33FlattenMap {
    public static void main(String[] args) {
        List<List<Integer>> list = List.of(
                List.of(1, 2, 3),
                List.of(4, 5),
                List.of(6, 7, 8, 9)
        );
        list.stream().flatMap(Collection::stream).filter(x-> x % 2 == 0)
                .forEach(x->System.out.print(x+" "));
    }
}
