package level2;

import java.util.List;

public class Q15ConvertList {
    public static void main(String[] args) {
        List<String> list = List.of("hello", "world", "java", "functional", "programming");
        list.stream().map(String::length).forEach(x->System.out.print(x+", "));
    }
}
