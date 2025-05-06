package level1;

import java.util.function.Consumer;

public class Q3_Consumer {
    public static void main(String[] args) {
        String name = "Aman";
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        consumer.accept(name);
    }
}
