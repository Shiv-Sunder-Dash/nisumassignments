package DAY_1;

class University {
    // Final method - cannot be overridden
    public final void universityName() {
        System.out.println("Welcome to KIIT UNIVERSITY - A Deemed to be University.");
    }

    // Regular method
    public void department(String dept) {
        System.out.println("Department: " + dept);
    }
}

// Subclass trying to override final method (not allowed)
// This class uses the final method but doesn't override it
public class Q29_KIIT_UNIVERSITY extends University {

    // This would cause a compile-time error:
    // public void universityName() { }

    public void studentInfo(String name, int rollNo) {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }

    public static void main(String[] args) {
        Q29_KIIT_UNIVERSITY student = new Q29_KIIT_UNIVERSITY();

        // Using final method from parent class
        student.universityName();

        // Use case 1: Display department
        student.department("Computer Science");

        // Use case 2: Display student information
        student.studentInfo("Amit Kumar", 1052);
    }
}
