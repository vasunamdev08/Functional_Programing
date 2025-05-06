package level4;

import java.util.List;
import java.util.stream.Collectors;

public class Q22_LengthMap {
    public static void main(String[] args) {
        List<String> list = List.of("hello", "world", "java", "functional", "programming");
        list.stream()
                .collect(
                        Collectors.groupingBy(String::length)
                ).forEach(
                        (x,y)-> System.out.println(x+"-> "+y)
                );
    }
}
