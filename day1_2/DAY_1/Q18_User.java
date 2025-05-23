import java.util.Scanner;

// Singleton User class
class Q18_User {
    // static instance (only one object allowed)
    private static Q18_User instance;

    // user fields
    private String name;
    private String email;

    // private constructor to prevent external instantiation
    private Q18_User() {}

    // static method to get the single instance
    public static Q18_User getInstance() {
        if (instance == null) {
            instance = new Q18_User();
        }
        return instance;
    }

    // method to set user data
    public void setUserData(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // method to display user data
    public void displayUserData() {
        System.out.println("\n===== User Information =====");
        System.out.println("Name : " + name);
        System.out.println("Email: " + email);
    }
}

// Main class
 class Q18_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        // Get the singleton instance of Q18_User
        Q18_User user = Q18_User.getInstance();

        // Set and display user data
        user.setUserData(name, email);
        user.displayUserData();

        scanner.close();
    }
}
