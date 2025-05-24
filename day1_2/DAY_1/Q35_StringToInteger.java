package DAY_1;
import java.util.Scanner;

public class Q35_StringToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a numeric string: ");
        String input = scanner.nextLine();
        try {
            int number = Integer.parseInt(input);
            System.out.println("Converted integer: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric string.");
        }
        scanner.close();
    }
}

