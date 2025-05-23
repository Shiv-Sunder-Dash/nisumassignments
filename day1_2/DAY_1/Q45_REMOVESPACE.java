package DAY_1;

import java.util.Scanner;

public class Q45_REMOVESPACE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with multiple spaces: ");
        String input = scanner.nextLine();

        // Replace multiple spaces with a single space using regex
        String result = input.replaceAll("\\s+", " ").trim();

        System.out.println("String after removing multiple spaces: ");
        System.out.println(result);

        scanner.close();
    }
}
