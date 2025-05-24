package DAY_1;
class University {
    public final void universityName() {
        System.out.println("Welcome to KIIT UNIVERSITY - A Deemed to be University.");
    }
    public void department(String dept) {
        System.out.println("Department: " + dept);
    }
}
public class Q29_KIIT_UNIVERSITY extends University {
    public void studentInfo(String name, int rollNo) {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
    public static void main(String[] args) {
        Q29_KIIT_UNIVERSITY student = new Q29_KIIT_UNIVERSITY();
        student.universityName();
        student.department("Computer Science");
        student.studentInfo("Amit Kumar", 1052);
    }
}
