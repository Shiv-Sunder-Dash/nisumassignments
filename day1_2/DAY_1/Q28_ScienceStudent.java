package DAY_1;

// Parent interface
interface Student {
    void attendClass();
}

// Child interface extending the parent interface
interface Science extends Student {
    void doLabWork();
}

// Class implementing the child interface (inherits methods from both interfaces)
public class Q28_ScienceStudent implements Science {

    @Override
    public void attendClass() {
        System.out.println("Science student is attending Physics class.");
    }

    @Override
    public void doLabWork() {
        System.out.println("Science student is doing lab experiments.");
    }

    public static void main(String[] args) {
        Q28_ScienceStudent student = new Q28_ScienceStudent();
        student.attendClass();
        student.doLabWork();
    }
}
