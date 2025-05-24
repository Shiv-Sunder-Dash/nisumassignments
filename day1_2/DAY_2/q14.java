import java.util.*;

class Product {
    String name, category;
    double price;

    Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String toString() {
        return name + " - " + category + " - Rs. " + price;
    }
}

public class q14 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Pen", "Stationery", 10));
        products.add(new Product("Notebook", "Stationery", 25));
        products.add(new Product("Apple", "Fruits", 5));
        products.add(new Product("Banana", "Fruits", 3));

        products.sort(Comparator.comparing((Product p) -> p.category).thenComparing(p -> p.price));
        for (Product p : products) System.out.println(p);
    }
}

