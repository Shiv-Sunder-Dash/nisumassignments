package DAY_1;

public class Q7_StaticFlow {
    // Static variable
    static int a = initializeA();

    // Static block
    static {
        System.out.println("Static Block executed");
        a = 20;
    }

    // Static method
    public static int initializeA() {
        System.out.println("Static Method initializeA() called");
        return 10;
    }

    // Constructor
    public Q7_StaticFlow() {
        System.out.println("Constructor executed");
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Main method started");
        System.out.println("Value of static variable a: " + a);
        Q7_StaticFlow obj = new Q7_StaticFlow();
    }

}
