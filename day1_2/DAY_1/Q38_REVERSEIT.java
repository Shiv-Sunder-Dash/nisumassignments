package DAY_1;

import java.util.Scanner;

public class Q38_REVERSEIT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input string from user
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Use StringBuffer to reverse the string
        StringBuffer sb = new StringBuffer(input);
        sb.reverse();

        // Print reversed string
        System.out.println("Reversed string: " + sb.toString());

        scanner.close();
    }
}
