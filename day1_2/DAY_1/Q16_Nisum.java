package DAY_1;
import java.util.Scanner;
public class Q16_Nisum {
    String companyName = "Nisum Technologies";
    String location = "IDCO TOWER,BHUBANESWAR";
}
class Employee extends Q16_Nisum {
    String employeeName;
    int employeeId;
    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        employeeName = scanner.nextLine();
        System.out.print("Enter Employee ID: ");
        employeeId = scanner.nextInt();
        scanner.close();
    }
    public void displayInfo() {
        System.out.println("\n===== Employee Information =====");
        System.out.println("Company Name   : " + companyName);
        System.out.println("Company Location: " + location);
        System.out.println("Employee Name  : " + employeeName);
        System.out.println("Employee ID    : " + employeeId);
    }
}
class CompanyDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.inputDetails();
        emp.displayInfo();
    }
}
