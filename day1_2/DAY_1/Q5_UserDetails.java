package DAY_1;
public class Q5_UserDetails {
    public String name;
    public int id;
    public String email;

    // Private fields for sensitive information
    private String password;
    private String creditCard;
    private double creditCardBalance;

    // Constructor
    public Q5_UserDetails(String name, int id, String email, String password, String creditCard, double creditCardBalance) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.password = password;
        this.creditCard = creditCard;
        this.creditCardBalance = creditCardBalance;
    }

    // Getter for masked credit card (for internal use)
    private String getMaskedCreditCard() {
        if (creditCard.length() >= 4) {
            return "**** **** **** " + creditCard.substring(creditCard.length() - 4);
        }
        return "****";
    }

    // Method to show limited internal details (optional)
    public void printUserSummary() {
        System.out.println("User ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Credit Card (masked): " + getMaskedCreditCard());
    }
}
