package DAY_1;
import java.util.Scanner;
class Q39_WRAPPER {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int intValue = scanner.nextInt();
        Integer intObj = Integer.valueOf(intValue);
        float floatValue = intObj.floatValue();
        System.out.println("Converted float value: " + floatValue);
        scanner.close();
    }
}
