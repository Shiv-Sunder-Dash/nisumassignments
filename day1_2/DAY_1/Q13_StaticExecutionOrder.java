package DAY_1;
public class Q13_StaticExecutionOrder {
    static {
        System.out.println("Static Block Executed");
    }
    public static void staticMethod() {
        System.out.println("Static Method Called");
    }
    public static void main(String[] args) {
        System.out.println("Main Method Started");
        staticMethod();
    }
}
