package DAY_1;
import java.util.Scanner;

public class Q37_FEVISTICK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Input second string to concatenate
        System.out.print("Enter the string to concatenate: ");
        String secondString = scanner.nextLine();

        // Concatenate using + operator or concat() method
        String result = firstString + secondString;
        // Or: String result = firstString.concat(secondString);

        System.out.println("Concatenated String: " + result);

        scanner.close();
    }
}
