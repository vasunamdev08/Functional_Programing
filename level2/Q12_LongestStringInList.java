package level2;

import java.util.List;

public class Q12_LongestStringInList {
    public static void main(String[] args) {
        List<String> list = List.of("hello", "world", "java", "functional", "programming");
        System.out.println(list.stream().reduce("", (a, b) -> a.length() > b.length() ? a : b)); // Output: programming
    }
}
