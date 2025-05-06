package level3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q17_PartitionList {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.stream().
                collect(
                        Collectors.partitioningBy(x -> x % 2 == 0)
                ).forEach(
                        (x,y)-> System.out.println(x+"-> "+y)
                );
    }
}
