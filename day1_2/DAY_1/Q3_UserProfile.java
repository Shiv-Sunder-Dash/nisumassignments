package DAY_1;
//3)	Create user profile with basic information and print the user information after completion of creating the profile.
import java.util.Scanner;

public class Q3_UserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect user information
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Create user object
        User user = new User(name, email, age);

        // Print user information
        System.out.println("\nUser Profile Created:");
        System.out.println(user);

        scanner.close();
    }
}

// User class to store basic user information
class User {
    private String name;
    private String email;
    private int age;

    // Constructor
    public User(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    // Override toString to display user info
    @Override
    public String toString() {
        return "Name: " + name +
                "\nEmail: " + email +
                "\nAge: " + age;
    }
}

