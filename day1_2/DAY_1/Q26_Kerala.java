package DAY_1;
interface IndianState {
    void showCulture();
    default void showWelcomeMessage() {
        System.out.println("Welcome to Incredible India!");
    }
}
public class Q26_Kerala implements IndianState {
    @Override
    public void showCulture() {
        System.out.println("Kerala is known for Kathakali and Ayurveda.");
    }
    public static void main(String[] args) {
        Q26_Kerala state = new Q26_Kerala();
        state.showCulture();
        state.showWelcomeMessage();
    }
}
