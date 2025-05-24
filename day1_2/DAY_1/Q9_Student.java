package DAY_1;
import java.util.Scanner;
public class Q9_Student {
    private String name;
    private String address;
    private String section;
    private String className;
    private int rollNo;
    private static String college;
    private static int rollNoCounter = 1;
    static {
        college = "KIIT UNIVERSITY";
        System.out.println("Static block: College initialized to " + college);
    }
    public Q9_Student(String name, String address, String section, String className) {
        this.name = name;
        this.address = address;
        this.section = section;
        this.className = className;
        this.rollNo = rollNoCounter++;
    }
    public void displayStudentInfo() {
        System.out.println("------ Student Info ------");
        System.out.println("Name     : " + name);
        System.out.println("Address  : " + address);
        System.out.println("Section  : " + section);
        System.out.println("Class    : " + className);
        System.out.println("Roll No  : " + rollNo);
        System.out.println("College  : " + college);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many students? ");
        int count = scanner.nextInt();
        scanner.nextLine();
        Q9_Student[] students = new Q9_Student[count];
        for (int i = 0; i < count; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Section: ");
            String section = scanner.nextLine();
            System.out.print("Class: ");
            String className = scanner.nextLine();
            students[i] = new Q9_Student(name, address, section, className);
        }
        System.out.println("\n=== Student Records ===");
        for (Q9_Student s : students) {
            s.displayStudentInfo();
        }
        scanner.close();
    }
}

