package DAY_1;

interface Tourism {
    // Static method in interface
    static void showStateWelcome() {
        System.out.println("Welcome to Odisha – India's best kept secret!");
    }

    // Regular abstract method
    void showCityAttraction();
}

// Implementing class
public class Q24_Bhubaneswar implements Tourism {

    @Override
    public void showCityAttraction() {
        System.out.println("Bhubaneswar is known for its ancient temples and architecture.");
    }

    public static void main(String[] args) {
        Q24_Bhubaneswar city = new Q24_Bhubaneswar();
        city.showCityAttraction();       // Calling instance method

        Tourism.showStateWelcome();      // Calling static method from interface
    }
}
