package level5.q30OrderProcessing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrderProcessor {

    public static List<String> processOrders(List<Order> orders, String filterStatus) {
        return orders.stream()
                .filter(order -> order.getStatus().equalsIgnoreCase(filterStatus)) // Step 1: Filter
                .sorted(Comparator.comparingDouble(Order::getAmount).reversed())   // Step 2: Sort by amount (descending)
                .map(Order::getCustomerName)                                       // Step 3: Map to customer name
                .collect(Collectors.toList());                                     // Collect results
    }

    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("Alice", "COMPLETED", 150.0),
                new Order("Bob", "PENDING", 200.0),
                new Order("Charlie", "COMPLETED", 300.0),
                new Order("Diana", "CANCELLED", 100.0)
        );

        List<String> result = processOrders(orders, "COMPLETED");
        System.out.println("Processed customer names: " + result);
    }
}