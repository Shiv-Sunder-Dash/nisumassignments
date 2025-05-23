package DAY_1;

// Abstract class
abstract class Company {
    String companyName;
    String founder;

    // Constructor
    public Company(String companyName, String founder) {
        this.companyName = companyName;
        this.founder = founder;
        System.out.println("Company constructor called.");
    }

    // Concrete method
    public void showDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Founder: " + founder);
    }

    // Abstract method
    public abstract void displayBusiness();
}

// Subclass
public class Q30_RELIANCE extends Company {

    // Additional data member
    String sector;

    // Constructor
    public Q30_RELIANCE(String companyName, String founder, String sector) {
        super(companyName, founder);
        this.sector = sector;
    }

    // Implement abstract method
    @Override
    public void displayBusiness() {
        System.out.println("Business Sector: " + sector);
    }

    public static void main(String[] args) {
        // Create object of subclass
        Q30_RELIANCE reliance = new Q30_RELIANCE("Reliance Industries", "Dhirubhai Ambani", "Energy, Retail, Telecom");

        // Call methods
        reliance.showDetails();
        reliance.displayBusiness();
    }
}
