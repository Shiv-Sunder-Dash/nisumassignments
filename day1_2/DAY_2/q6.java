import java.util.*;

class Employee implements Comparable<Employee> {
    int id;
    String name, dept;
    double salary;

    Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public int compareTo(Employee e) {
        return this.name.compareToIgnoreCase(e.name);
    }

    public String toString() {
        return id + " - " + name + " - " + dept + " - ₹" + salary;
    }
}

public class q6 {
    static Set<Employee> employees = new TreeSet<>();

    static void addEmployee(int id, String name, String dept, double salary) {
        employees.add(new Employee(id, name, dept, salary));
    }

    static void displayEmployees() {
        for (Employee e : employees) System.out.println(e);
    }

    public static void main(String[] args) {
        addEmployee(1, "ram", "HR", 30000);
        addEmployee(2, "sita", "IT", 50000);
        addEmployee(3, "laksman", "Finance", 40000);
        displayEmployees();
    }
}

