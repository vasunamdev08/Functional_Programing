package level2;

import java.util.List;

public class Q10_CheckString {
    public static void main(String[] args) {
        List<String> list = List.of("hello", "world", "java", "functional", "programming");
        list.stream().filter(x->x.length()>4).forEach(x->System.out.print(x+" ")); // Output: hello world functional programming
    }
}
