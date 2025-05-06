package level1;

import java.util.stream.Stream;

public class Q5_SortStringAlphabetically {
    public static void main(String[] args) {
        String str="lorem ipsum dolor sit amet";
        String[] words = str.split(" ");
        Stream.of(words).sorted().forEach(x ->System.out.print(x +" "));
    }
}
