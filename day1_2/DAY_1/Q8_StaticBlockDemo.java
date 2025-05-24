package DAY_1;
class Q8_StaticBlockDemo {
    static int number;
    static {
        System.out.println("Static block executed.");
        number = 42;
    }
    public Q8_StaticBlockDemo() {
        System.out.println("Constructor executed.");
    }
    public static void main(String[] args) {
        System.out.println("Main method started.");
        System.out.println("Value of static variable: " + number);
        Q8_StaticBlockDemo obj = new Q8_StaticBlockDemo();
    }
}

