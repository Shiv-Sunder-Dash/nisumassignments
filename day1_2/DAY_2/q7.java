import java.util.*;

public class q7 {
    public static void main(String[] args) {
        String text = "This is a test. This test is only a test!";
        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        String[] words = text.split("\\s+");

        Map<String, Integer> freq = new HashMap<>();
        for (String word : words)
            freq.put(word, freq.getOrDefault(word, 0) + 1);

        freq.entrySet().stream()
            .sorted((a, b) -> b.getValue() - a.getValue())
            .forEach(e -> System.out.println(e.getKey() + " = " + e.getValue()));
    }
}

