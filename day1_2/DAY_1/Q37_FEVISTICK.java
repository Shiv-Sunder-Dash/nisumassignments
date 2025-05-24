package DAY_1;
import java.util.Scanner;
public class Q37_FEVISTICK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter the string to concatenate: ");
        String secondString = scanner.nextLine();
        String result = firstString + secondString;
        System.out.println("Concatenated String: " + result);
        scanner.close();
    }
}
