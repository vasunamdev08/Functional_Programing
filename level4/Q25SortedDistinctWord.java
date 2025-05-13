package level4;

import java.util.Arrays;

public class Q25SortedDistinctWord {
    public static void main(String[] args) {
        String str = "hello world hello java functional programming";
        String[] s = str.toLowerCase().split(" ");
        Arrays.stream(s)
                .distinct()
                .sorted()
                .forEach(x->System.out.print(x + " "));
    }
}
