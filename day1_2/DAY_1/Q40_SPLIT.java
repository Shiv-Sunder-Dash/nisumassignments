package DAY_1;

import java.util.Scanner;

public class Q40_SPLIT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence from user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Split sentence into words using space as delimiter
        String[] words = sentence.split("\\s+"); // regex to handle multiple spaces

        // Print each word
        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }
}
