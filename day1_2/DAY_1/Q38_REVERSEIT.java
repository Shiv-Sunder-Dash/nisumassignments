package DAY_1;
import java.util.Scanner;
public class Q38_REVERSEIT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        StringBuffer sb = new StringBuffer(input);
        sb.reverse();
        System.out.println("Reversed string: " + sb.toString());
        scanner.close();
    }
}
