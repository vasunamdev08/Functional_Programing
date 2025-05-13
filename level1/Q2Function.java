package level1;

import java.util.function.Function;

public class Q2Function {
    public static void main(String[] args) {
        Function<String,Integer> length = String::length;
        System.out.println(length.apply("Aman"));
    }
}
