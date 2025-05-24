import java.util.*;

public class q4 {
    static Map<String, Integer> inventory = new HashMap<>();

    static void addProduct(String name, int quantity) {
        inventory.put(name, inventory.getOrDefault(name, 0) + quantity);
    }

    static void updateProduct(String name, int quantity) {
        if (inventory.containsKey(name)) inventory.put(name, quantity);
    }

    static void removeProduct(String name) {
        inventory.remove(name);
    }

    static boolean isInStock(String name) {
        return inventory.containsKey(name) && inventory.get(name) > 0;
    }

    static void displayInventory() {
        for (var entry : inventory.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
    }

    public static void main(String[] args) {
        addProduct("Pen", 10);
        addProduct("Notebook", 5);
        updateProduct("Pen", 15);
        System.out.println("Pen in stock: " + isInStock("Pen"));
        displayInventory();
        removeProduct("Notebook");
        displayInventory();
    }
}
