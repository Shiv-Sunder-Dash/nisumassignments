package DAY_1;
import java.util.Scanner;
public class Q43_CHECKCOUNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it contains only digits: ");
        String input = scanner.nextLine();
        boolean isOnlyDigits = input.matches("\\d+");
        if (isOnlyDigits) {
            System.out.println("The string contains only digits.");
        } else {
            System.out.println("The string does NOT contain only digits.");
        }
        scanner.close();
    }
}
