package DAY_1;
abstract class Company {
    String companyName;
    String founder;
    public Company(String companyName, String founder) {
        this.companyName = companyName;
        this.founder = founder;
        System.out.println("Company constructor called.");
    }
    public void showDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Founder: " + founder);
    }
    public abstract void displayBusiness();
}
public class Q30_RELIANCE extends Company {
    String sector;
    public Q30_RELIANCE(String companyName, String founder, String sector) {
        super(companyName, founder);
        this.sector = sector;
    }
    @Override
    public void displayBusiness() {
        System.out.println("Business Sector: " + sector);
    }
    public static void main(String[] args) {
        Q30_RELIANCE reliance = new Q30_RELIANCE("Reliance Industries", "Dhirubhai Ambani", "Energy, Retail, Telecom");
        reliance.showDetails();
        reliance.displayBusiness();
    }
}
