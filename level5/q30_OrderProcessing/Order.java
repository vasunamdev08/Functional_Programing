package level5.q30_OrderProcessing;

class Order {
    private String customerName;
    private String status;
    private double amount;

    public Order(String customerName, String status, double amount) {
        this.customerName = customerName;
        this.status = status;
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getStatus() {
        return status;
    }

    public double getAmount() {
        return amount;
    }
}