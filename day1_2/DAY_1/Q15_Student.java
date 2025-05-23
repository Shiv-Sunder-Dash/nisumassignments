package DAY_1;
import java.util.Scanner;
public class Q15_Student {
    private String name;
    private String college;
    private int subject1;
    private int subject2;
    private int subject3;

    // Constructor
    public Q15_Student(String name, String college, int s1, int s2, int s3) {
        this.name = name;
        this.college = college;
        this.subject1 = s1;
        this.subject2 = s2;
        this.subject3 = s3;
    }

    // Public method to calculate total
    public int getTotalMarks() {
        return subject1 + subject2 + subject3;
    }

    // Public method to calculate average
    public double getAverageMarks() {
        return getTotalMarks() / 3.0;
    }

    // Method to display allowed info
    public void displayStudentInfo() {
        System.out.println("Student Name : " + name);
        System.out.println("College      : " + college);
        System.out.println("Total Marks  : " + getTotalMarks());
        System.out.printf("Average Marks: %.2f%n", getAverageMarks());
    }
}

class CollegeInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter College Name: ");
        String college = scanner.nextLine();

        System.out.print("Enter Subject 1 Marks: ");
        int s1 = scanner.nextInt();

        System.out.print("Enter Subject 2 Marks: ");
        int s2 = scanner.nextInt();

        System.out.print("Enter Subject 3 Marks: ");
        int s3 = scanner.nextInt();

        // Create student object
        Q15_Student student = new Q15_Student(name, college, s1, s2, s3);

        System.out.println("\n===== Student Report =====");
        student.displayStudentInfo();

        scanner.close();
    }
}
