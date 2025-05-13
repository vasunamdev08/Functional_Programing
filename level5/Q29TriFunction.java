package level5;

public class Q29TriFunction {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> triFunction = (a, b, c) -> a + b + c;
        System.out.println(triFunction.apply(1, 2, 3)); // Output: 6
    }

    @FunctionalInterface
    interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }
}
