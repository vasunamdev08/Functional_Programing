package level1;

import java.util.function.Supplier;

public class Q4_Supplier {
    public static void main(String[] args) {
        Supplier<Double> supplier= Math::random;
        System.out.println(supplier.get());
    }
}
