package DAY_1;
public class Q10_StaticOverload {
    public static void greet() {
        System.out.println("Hello!");
    }
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
    public static void greet(String name, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hello, " + name + "! [" + (i + 1) + "]");
        }
    }
    public static void main(String[] args) {
        Q10_StaticOverload.greet();
        Q10_StaticOverload.greet("SHIV SUNDER DASH");
        Q10_StaticOverload.greet("BIJAY MOHANTY", 3);
    }
}

