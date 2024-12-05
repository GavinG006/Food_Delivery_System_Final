import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FoodDeliverySystem {
    private Queue<Order> orderQueue;

    public FoodDeliverySystem() {
        this.orderQueue = new LinkedList<>();
    }

    public void placeOrder(Customer customer, List<MenuItem> items) {
        Order order = new Order(customer, items);
        orderQueue.add(order);
        System.out.println("Order placed: " + order);
    }

    public Order getNextOrder() {
        return orderQueue.poll();
    }
}