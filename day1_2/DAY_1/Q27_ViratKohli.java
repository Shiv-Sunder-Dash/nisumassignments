package DAY_1;

// Functional interface: only one abstract method
@FunctionalInterface
interface CricketAction {
    void playShot();
}

// Class implementing functional interface using lambda
public class Q27_ViratKohli {
    public static void main(String[] args) {
        // Using lambda expression to implement the functional interface
        CricketAction coverDrive = () -> {
            System.out.println("Virat Kohli plays a beautiful cover drive!");
        };

        // Call the method
        coverDrive.playShot();
    }
}
