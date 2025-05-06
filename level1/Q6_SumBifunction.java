package level1;

import java.util.function.BiFunction;
import static java.lang.Integer.sum;

public class Q6_SumBifunction {
    public static void main(String[] args) {
        // Example usage
        int result = sum(5, 10);
        System.out.println("Sum: " + result); // Output: Sum: 15

        // Using the bifunction to sum two numbers
        BiFunction<Integer, Integer, Integer> sumFunction = Integer::sum;
        int bifunctionResult = sumFunction.apply(5, 10);
        System.out.println("Bifunction Sum: " + bifunctionResult); // Output: Bifunction Sum: 15
    }
}
