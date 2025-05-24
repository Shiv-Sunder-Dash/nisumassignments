package DAY_1;
import java.util.Scanner;
public class Q36_RIVER_NAME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the river: ");
        String riverName = scanner.nextLine();
        System.out.print("Enter the index to get character: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < riverName.length()) {
            char ch = riverName.charAt(index);
            System.out.println("Character at index " + index + " is: " + ch);
        } else {
            System.out.println("Invalid index! Please enter index between 0 and " + (riverName.length() - 1));
        }
        scanner.close();
    }
}
