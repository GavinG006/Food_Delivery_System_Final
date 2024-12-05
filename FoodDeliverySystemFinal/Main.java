import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MenuItem fries = new MenuItem("Fries", 2.99, "Crispy salty fries");
        MenuItem burger = new MenuItem("Burger", 5.99, "Juicy beef burger");
        MenuItem soda = new MenuItem("Soda", 1.99, "Refreshing soda");
        List<MenuItem> menu = Arrays.asList(fries, burger, soda);

        // Create customers
        Customer customer1 = new Customer("Alice", "alice@example.com", "789 Pine St", 1);
        Customer customer2 = new Customer("Bob", "bob@example.com", "101 Maple St", 2);

        // Create drivers with initial ratings
        List<Integer> initialRatingsDriver1 = Arrays.asList(5, 4, 3);
        List<Integer> initialRatingsDriver2 = Arrays.asList(4, 5, 5);
        Driver driver1 = new Driver("John", "123-456-7890", "123 Elm St",  1, initialRatingsDriver1);
        Driver driver2 = new Driver("Jane", "987-654-3210", "456 Oak St", 2, initialRatingsDriver2);

        // Create food delivery system
        FoodDeliverySystem system = new FoodDeliverySystem();

        // Customers place orders
        customer1.placeOrder(system, Arrays.asList(fries, soda));
        customer2.placeOrder(system, Arrays.asList(burger, soda));

        // Drivers pick up and deliver orders
        Order order1 = system.getNextOrder();
        driver1.pickUpOrder(order1);
        driver1.deliverOrder(order1);

        Order order2 = system.getNextOrder();
        driver2.pickUpOrder(order2);
        driver2.deliverOrder(order2);

        // Customers rate their drivers
        customer1.rateDriver(driver1, 5);
        customer2.rateDriver(driver2, 4);

        // Printing updated average ratings
        System.out.println("Updated average rating for driver1: " + driver1.getAverageRating());
        System.out.println("Updated average rating for driver2: " + driver2.getAverageRating());

        // Printing most recent ratings
        System.out.println("Most recent ratings for driver1: " + driver1.getMostRecentRatings());
        System.out.println("Most recent ratings for driver2: " + driver2.getMostRecentRatings());
    }
}