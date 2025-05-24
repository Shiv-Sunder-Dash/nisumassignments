package DAY_1;
import java.util.Scanner;
public class Q44_CONVERT_STRING_INT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a numeric string: ");
        String numericString = scanner.nextLine();
        try {
            int number = Integer.parseInt(numericString);
            System.out.println("Converted integer value: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid numeric string.");
        }
        scanner.close();
    }
}
