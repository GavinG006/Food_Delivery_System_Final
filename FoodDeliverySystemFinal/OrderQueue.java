import java.util.LinkedList;
import java.util.Queue;

public class OrderQueue {
    private Queue<Order> orders = new LinkedList<>();

    public void addOrder(Order order) {
        orders.add(order);
        System.out.println("Order ID " + order.getOrderId() + " added to the queue.");
    }

    public Order getNextOrder() {
        return orders.poll();
    }

    public int getQueueSize() {
        return orders.size();
    }
}
