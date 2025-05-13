package level4;

import java.util.function.Function;

public class Q23ConvertStringToUppercase {
    public static void main(String[] args) {
        Function<String,String> toUpperCase = String::toUpperCase;
        Function<String,String> append = s->s+"!";

        String str = "hello world";

        String result = toUpperCase.andThen(append).apply(str);

        System.out.println(result);
    }
}
