package DAY_1;
import java.util.Scanner;
public class Q46_BRAKEORSPLIT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string to split: ");
        String input = scanner.nextLine();
        System.out.print("Enter the delimiter to split the string: ");
        String delimiter = scanner.nextLine();
        String regexDelimiter = delimiter;
        if ("|\\.^$*+?()[]{}".contains(delimiter)) {
            regexDelimiter = "" + delimiter;
        }
        String[] parts = input.split(regexDelimiter);
        System.out.println("Splitted parts:");
        for (String part : parts) {
            System.out.println(part);
        }
        scanner.close();
    }
}
