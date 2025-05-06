package level2;

import java.util.List;

public class Q8_FilterList {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.stream().filter(x->x%2==0).forEach(x->System.out.print(x+" ")); // Output: 2 4 6 8 10
    }
}
