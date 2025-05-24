package DAY_1;
import java.util.Scanner;
class Q18_User {
    private static Q18_User instance;
    private String name;
    private String email;
    private Q18_User() {}
    public static Q18_User getInstance() {
        if (instance == null) {
            instance = new Q18_User();
        }
        return instance;
    }
    public void setUserData(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public void displayUserData() {
        System.out.println("\n===== User Information =====");
        System.out.println("Name : " + name);
        System.out.println("Email: " + email);
    }
}
class Q18_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        Q18_User user = Q18_User.getInstance();
        user.setUserData(name, email);
        user.displayUserData();
        scanner.close();
    }
}

