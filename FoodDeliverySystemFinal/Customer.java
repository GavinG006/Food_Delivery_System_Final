import java.util.List;

public class Customer extends Person {
    private int customerId;

    public Customer(String name, String contactInfo, String address, int customerId) {
        super(name, contactInfo, address);
        this.customerId = customerId;
    }

    public void placeOrder(FoodDeliverySystem system, List<MenuItem> items) {
        Order order = new Order(this, items);
        system.placeOrder(this, items);
        System.out.println("Customer " + getName() + " placed an order with ID: " + order.getOrderId());
    }

    public void rateDriver(Driver driver, int rating) {
        driver.addRating(rating);
        System.out.println(getName() + " rated " + driver.getName() + " with a rating of " + rating);
    }
}