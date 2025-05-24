import java.util.*;

class Student {
    int id;
    String name;
    double grade;

    Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public String toString() {
        return id + " - " + name + " - " + grade;
    }
}

public class q2 {
    static List<Student> students = new ArrayList<>();

    static void addStudent(int id, String name, double grade) {
        students.add(new Student(id, name, grade));
    }

    static void removeStudent(int id) {
        students.removeIf(s -> s.id == id);
    }

    static Student searchStudent(int id) {
        for (Student s : students)
            if (s.id == id) return s;
        return null;
    }

    static void displayAll() {
        for (Student s : students) System.out.println(s);
    }

    public static void main(String[] args) {
        addStudent(1, "ram", 8.5);
        addStudent(2, "sita", 9.0);
        displayAll();
        System.out.println("Search ID 2: " + searchStudent(2));
        removeStudent(1);
        displayAll();
    }
}

