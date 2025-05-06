package level2;

import java.util.List;

public class Q11_checkStartWithS {
    public static void main(String[] args) {
        List<String> list = List.of("hello", "world", "java", "functional", "programming", "Start");
        list.stream().filter(x->x.startsWith("S")).forEach(x->System.out.print(x+" ")); // Output: start
    }
}
