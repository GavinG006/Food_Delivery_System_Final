import java.util.*;

public class Driver extends Person {
    private LinkedList<Integer> ratings;
    private boolean available;
    private String name;
    private String vehicle;

    public Driver(String name, String phone, String vehicle, String address, int id) {
        super(name, phone, address);
        this.name = name;
        this.ratings = new LinkedList<>();
        this.available = true;
        this.vehicle = vehicle;
    }

    public Driver(String name, String phone, String address, int id, List<Integer> initialRatings) {
        super(name, phone, address);
        this.name = name;
        this.ratings = new LinkedList<>(initialRatings);
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void updateAvailability(boolean available) {
        this.available = available;
    }

    public void pickUpOrder(Order order) {
        System.out.println(name + " is picking up order: " + order + "ID: " + order.getOrderId());
    }

    public void deliverOrder(Order order) {
        System.out.println(name + " is delivering order: " + order + "ID: " + order.getOrderId());
    }

    public void addRating(int rating) {
        ratings.addLast(rating);
        if (ratings.size() > 3) {
            ratings.removeFirst();
        }
    }

    public double getAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }
        return (double) sum / ratings.size();
    }

    public List<Integer> getMostRecentRatings() {

        return ratings;

    }


    public String getName() {
        return name;
    }
}