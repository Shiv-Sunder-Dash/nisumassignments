package DAY_1;
import java.util.ArrayList;
import java.util.Scanner;
public class Q4_CartOrderSummaryWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cart> cartItems = new ArrayList<>();
        int itemIdCounter = 1;
        System.out.print("How many items do you want to add? ");
        int numberOfItems = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("\nEnter details for Item " + (i + 1) + ":");
            System.out.print("Item name: ");
            String itemName = scanner.nextLine();
            System.out.print("Item price: ");
            double itemValue = scanner.nextDouble();
            scanner.nextLine();
            Cart item = new Cart(itemName, itemValue, itemIdCounter++);
            if (item.isValid()) {
                cartItems.add(item);
            } else {
                System.out.println("Invalid item. Skipping.");
            }
        }
        int itemsCount = cartItems.size();
        double orderTotal = 0.0;
        System.out.println("\nOrder Summary:");
        for (Cart item : cartItems) {
            System.out.println("- " + item.getItemName() + " (Rs. " + item.getItemValue() + ")");
            orderTotal += item.getItemValue();
        }
        System.out.println("\nTotal Items: " + itemsCount);
        System.out.println("Order Total: Rs. " + orderTotal);
        scanner.close();
    }
}
class Cart {
    private String itemName;
    private double itemValue;
    private int itemId;
    public Cart(String itemName, double itemValue, int itemId) {
        this.itemName = itemName;
        this.itemValue = itemValue;
        this.itemId = itemId;
    }
    public boolean isValid() {
        return itemName != null && !itemName.trim().isEmpty() && itemValue > 0;
    }
    public String getItemName() {
        return itemName;
    }
    public double getItemValue() {
        return itemValue;
    }
    public int getItemId() {
        return itemId;
    }
}


