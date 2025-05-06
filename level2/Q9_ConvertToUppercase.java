package level2;

import java.util.List;

public class Q9_ConvertToUppercase {
    public static void main(String[] args) {
        List<String> list = List.of("hello", "world", "java", "functional", "programming");
        list.stream().map(String::toUpperCase).forEach(x->System.out.print(x+" ")); // Output: HELLO WORLD JAVA FUNCTIONAL PROGRAMMING
    }
}
