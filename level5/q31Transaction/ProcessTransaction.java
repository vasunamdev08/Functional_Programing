package level5.q31Transaction;

import java.util.List;

public class ProcessTransaction {
    public static void main(String[] args) {
        // Sample transaction data
        List<Transaction> transactions = List.of(
                new Transaction("DEBIT", 100.0),
                new Transaction("CREDIT", 200.0),
                new Transaction("DEBIT", 50.0),
                new Transaction("CREDIT", 300.0),
                new Transaction("DEBIT", 150.0)
        );

        // Process transactions
        System.out.println("Total amount debited : "+processTransactions(transactions)+" $");
    }

    private static double processTransactions(List<Transaction> transactions) {
        return transactions.stream()
                            .filter(x -> x.getType().equalsIgnoreCase("debit"))
                            .mapToDouble(Transaction::getAmount)
                            .sum();
    }

}
