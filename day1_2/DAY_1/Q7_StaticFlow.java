package DAY_1;
public class Q7_StaticFlow {
    static int a = initializeA();
    static {
        System.out.println("Static Block executed");
        a = 20;
    }
    public static int initializeA() {
        System.out.println("Static Method initializeA() called");
        return 10;
    }
    public Q7_StaticFlow() {
        System.out.println("Constructor executed");
    }
    public static void main(String[] args) {
        System.out.println("Main method started");
        System.out.println("Value of static variable a: " + a);
        Q7_StaticFlow obj = new Q7_StaticFlow();
    }
}
