package level3;

import java.util.List;
import java.util.stream.Collectors;

public class Q16_GroupByFirstLetter {
    public static void main(String[] args) {
        List<String> list = List.of("hello", "world", "java", "functional", "programming");
        list.stream()
                .collect(
                        Collectors.groupingBy(x -> x.charAt(0))
                ).forEach((x,y)-> System.out.println(x+"->"+y));
    }
}
