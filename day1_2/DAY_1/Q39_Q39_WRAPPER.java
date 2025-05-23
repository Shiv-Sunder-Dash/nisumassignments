package DAY_1;

import java.util.Scanner;

 class Q39_WRAPPER {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take integer input from user
        System.out.print("Enter an integer value: ");
        int intValue = scanner.nextInt();

        // Wrap the int into Integer object
        Integer intObj = Integer.valueOf(intValue);

        // Convert Integer to Float using floatValue() method
        float floatValue = intObj.floatValue();

        // Print the converted float value
        System.out.println("Converted float value: " + floatValue);

        scanner.close();
    }
}
