package DAY_1;
import java.util.Scanner;

public class Q16_Nisum {
    String companyName = "Nisum Technologies";
    String location = "IDCO TOWER,BHUBANESWAR";
}

// Child class
class Employee extends Q16_Nisum {
    String employeeName;
    int employeeId;

    // Method to take user input
    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        employeeName = scanner.nextLine();

        System.out.print("Enter Employee ID: ");
        employeeId = scanner.nextInt();

        scanner.close();
    }

    // Method to display all info
    public void displayInfo() {
        // Access parent class variables directly (no super keyword)
        System.out.println("\n===== Employee Information =====");
        System.out.println("Company Name   : " + companyName);
        System.out.println("Company Location: " + location);
        System.out.println("Employee Name  : " + employeeName);
        System.out.println("Employee ID    : " + employeeId);
    }
}

// Main class
class CompanyDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.inputDetails();
        emp.displayInfo();
    }
}
