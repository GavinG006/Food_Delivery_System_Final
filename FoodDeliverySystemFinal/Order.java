import java.util.List;

public class Order {
    private static int orderCount = 0;
    private int orderId;
    private Customer customer;
    private List<MenuItem> items;
    private double totalPrice;
    private OrderStatus status;
    private Driver assignedDriver;

    public Order(Customer customer, List<MenuItem> items) {
        this.orderId = ++orderCount;
        this.customer = customer;
        this.items = items;
        this.totalPrice = calculateTotal();
        this.status = OrderStatus.PLACED;
    }

    public int getOrderId() {

        return orderId;

    }

    private double calculateTotal() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public int getOrderId() {
        return orderId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (MenuItem item : items) {
            sb.append(item.getName()).append(", ");
        }
        return sb.toString();
    }
}