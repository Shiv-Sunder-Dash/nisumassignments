package DAY_1;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Q11_AuthUtil {

    // Email must follow proper format like user@example.com
    private static final String EMAIL_REGEX = "^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,}$";

    // Password must contain letters, digits, and special characters (min 6 characters)
    private static final String PASSWORD_REGEX = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{6,}$";

    // Validate email format
    public static boolean isValidEmail(String email) {
        return Pattern.matches(EMAIL_REGEX, email);
    }

    // Validate password rules
    public static boolean isValidPassword(String password) {
        return Pattern.matches(PASSWORD_REGEX, password);
    }

    // Authenticate both
    public static boolean authenticate(String email, String password) {
        return isValidEmail(email) && isValidPassword(password);
    }

    // Main method with user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Login Validation ===");

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        // Validate input
        if (!isValidEmail(email)) {
            System.out.println("❌ Invalid email format.");
        } else if (!isValidPassword(password)) {
            System.out.println("❌ Password must have letters, digits, special characters and be at least 6 characters long.");
        } else {
            System.out.println("✅ Login successful!");
        }

        scanner.close();
    }
}
