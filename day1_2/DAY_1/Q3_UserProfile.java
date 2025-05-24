package DAY_1;
import java.util.Scanner;

public class Q3_UserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        User user = new User(name, email, age);

        System.out.println("\nUser Profile Created:");
        System.out.println(user);

        scanner.close();
    }
}

class User {
    private String name;
    private String email;
    private int age;

    public User(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nEmail: " + email +
                "\nAge: " + age;
    }
}

