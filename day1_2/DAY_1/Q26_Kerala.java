package DAY_1;

interface IndianState {
    // Abstract method
    void showCulture();

    // Default method
    default void showWelcomeMessage() {
        System.out.println("Welcome to Incredible India!");
    }
}

// Class implementing the interface
public class Q26_Kerala implements IndianState {

    @Override
    public void showCulture() {
        System.out.println("Kerala is known for Kathakali and Ayurveda.");
    }

    public static void main(String[] args) {
        Q26_Kerala state = new Q26_Kerala();
        state.showCulture();           // Calls overridden method
        state.showWelcomeMessage();    // Calls default method from interface
    }
}
