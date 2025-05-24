package DAY_1;
interface Student {
    void attendClass();
}
interface Science extends Student {
    void doLabWork();
}
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
