package level2;

import java.util.List;

public class Q14_SquareElements {
    public static void main(String[] args) {
        // List of integers
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        // Using map to square each element and print the result
        list.stream().map(x->x*x).forEach(x->System.out.print(x+" ")); // Output: 1 4 9 16 25
    }
}
