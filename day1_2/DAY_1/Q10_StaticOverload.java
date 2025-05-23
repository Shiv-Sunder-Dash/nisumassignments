package DAY_1;

public class Q10_StaticOverload {
    // Static method with no parameters
    public static void greet() {
        System.out.println("Hello!");
    }

    // Static method with one parameter
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Static method with two parameters
    public static void greet(String name, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hello, " + name + "! [" + (i + 1) + "]");
        }
    }

    public static void main(String[] args) {
        // Calling overloaded static methods
        Q10_StaticOverload.greet();
        Q10_StaticOverload.greet("SHIV SUNDER DASH");
        Q10_StaticOverload.greet("BIJAY MOHANTY", 3);
    }
}

