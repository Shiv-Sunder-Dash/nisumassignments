package DAY_1;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Q11_AuthUtil {
    private static final String EMAIL_REGEX = "^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,}$";
    private static final String PASSWORD_REGEX = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{6,}$";
    public static boolean isValidEmail(String email) {
        return Pattern.matches(EMAIL_REGEX, email);
    }
    public static boolean isValidPassword(String password) {
        return Pattern.matches(PASSWORD_REGEX, password);
    }
    public static boolean authenticate(String email, String password) {
        return isValidEmail(email) && isValidPassword(password);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Login Validation ===");
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        if (!isValidEmail(email)) {
            System.out.println("Invalid email format.");
        } else if (!isValidPassword(password)) {
            System.out.println("Password must have letters, digits, special characters and be at least 6 characters long.");
        } else {
            System.out.println("Login successful!");
        }
        scanner.close();
    }
}

