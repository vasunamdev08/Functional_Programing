package level3;

import java.util.List;
import java.util.stream.Collectors;

public class Q18_JoinString {
    public static void main(String[] args) {
        List<String> list = List.of("hello", "world", "java", "functional", "programming");
        String join = String.join(",", list);
        System.out.println(join);
    }
}
