import java.util.*;

class MenuItem {
    String name, desc;
    double price;

    MenuItem(String name, String desc, double price) {
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public String toString() {
        return name + " - " + desc + " - Rs. " + price;
    }
}

public class q8 {
    static Map<String, Map<String, MenuItem>> menu = new LinkedHashMap<>();

    static void addItem(String category, String name, String desc, double price) {
        menu.putIfAbsent(category, new HashMap<>());
        menu.get(category).put(name, new MenuItem(name, desc, price));
    }

    static void removeItem(String category, String name) {
        if (menu.containsKey(category)) menu.get(category).remove(name);
    }

    static void updateItem(String category, String name, String desc, double price) {
        if (menu.containsKey(category) && menu.get(category).containsKey(name))
            menu.get(category).put(name, new MenuItem(name, desc, price));
    }

    static void displayMenu() {
        for (var cat : menu.entrySet()) {
            System.out.println("[" + cat.getKey() + "]");
            for (MenuItem item : cat.getValue().values())
                System.out.println(item);
        }
    }

    public static void main(String[] args) {
        addItem("Appetizer", "chicken Rolls", "Crispy rolls", 120);
        addItem("Main Course", "Paneer Butter Masala", "Rich gravy", 250);
        addItem("Dessert", "Gulab Jamun", "Sweet balls", 80);
        displayMenu();
    }
}

