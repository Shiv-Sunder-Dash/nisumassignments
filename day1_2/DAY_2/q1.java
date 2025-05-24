import java.util.*;

class Item {
    String name;
    double price;
    int quantity;

    Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString() {
        return name + " - Rs. " + price + " x " + quantity;
    }
}

public class q1 {
    static List<Item> cart = new ArrayList<>();

    static void addItem(String name, double price, int quantity) {
        cart.add(new Item(name, price, quantity));
    }

    static void removeItem(String name) {
        cart.removeIf(i -> i.name.equalsIgnoreCase(name));
    }

    static void viewCart() {
        for (Item i : cart) System.out.println(i);
    }

    static double getTotalPrice() {
        double total = 0;
        for (Item i : cart) total += i.price * i.quantity;
        return total;
    }

    public static void main(String[] args) {
        addItem("Apple", 30, 2);
        addItem("Banana", 10, 5);
        viewCart();
        System.out.println("Total: Rs. " + getTotalPrice());
        removeItem("Apple");
        viewCart();
        System.out.println("Total: Rs. " + getTotalPrice());
    }
}