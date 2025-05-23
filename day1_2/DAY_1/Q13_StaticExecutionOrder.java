package DAY_1;

public class Q13_StaticExecutionOrder {
    // Static block
    static {
        System.out.println("Static Block Executed");
    }

    // Static method
    public static void staticMethod() {
        System.out.println("Static Method Called");
    }

    public static void main(String[] args) {
        System.out.println("Main Method Started");
        staticMethod(); // Call static method
    }
}
