package level1;

import java.util.function.Predicate;

public class Q1_Predicate {
    public static void main(String[] args) {
        Predicate<String> startsWithA = s -> s.startsWith("A");
        System.out.println(startsWithA.test("Aman"));
    }
}
