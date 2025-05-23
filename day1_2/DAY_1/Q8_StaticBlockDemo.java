package DAY_1;

 class Q8_StaticBlockDemo {
    // Static variable
    static int number;

    // Static block
    static {
        System.out.println("Static block executed.");
        number = 42;
    }

    // Constructor
    public Q8_StaticBlockDemo() {
        System.out.println("Constructor executed.");
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Main method started.");
        System.out.println("Value of static variable: " + number);

        Q8_StaticBlockDemo obj = new Q8_StaticBlockDemo();
    }
}
