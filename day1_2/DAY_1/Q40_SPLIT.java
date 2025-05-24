package DAY_1;
import java.util.Scanner;
public class Q40_SPLIT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split("\\s+");
        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }
        scanner.close();
    }
}
