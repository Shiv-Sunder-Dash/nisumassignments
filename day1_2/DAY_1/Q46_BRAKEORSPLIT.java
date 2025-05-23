package DAY_1;

import java.util.Scanner;

public class Q46_BRAKEORSPLIT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter the string to split: ");
        String input = scanner.nextLine();

        // Input delimiter
        System.out.print("Enter the delimiter to split the string: ");
        String delimiter = scanner.nextLine();

        // Escape delimiter if needed (e.g., special regex characters)
        String regexDelimiter = delimiter;

        // For special regex chars, escape them properly
        if ("|\\.^$*+?()[]{}".contains(delimiter)) {
            regexDelimiter = "" + delimiter;
        }

        // Split the string by delimiter
        String[] parts = input.split(regexDelimiter);

        // Print the parts
        System.out.println("Splitted parts:");
        for (String part : parts) {
            System.out.println(part);
        }

        scanner.close();
    }
}
