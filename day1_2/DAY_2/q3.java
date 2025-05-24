import java.util.*;

public class q3 {
    static Set<String> emails = new HashSet<>();

    static void addEmail(String email) {
        emails.add(email.toLowerCase());
    }

    static void displayEmails() {
        for (String email : emails) System.out.println(email);
    }

    public static void main(String[] args) {
        addEmail("user@example.com");
        addEmail("test@example.com");
        addEmail("USER@example.com"); // duplicate in different case
        addEmail("admin@example.com");
        displayEmails();
    }
}

