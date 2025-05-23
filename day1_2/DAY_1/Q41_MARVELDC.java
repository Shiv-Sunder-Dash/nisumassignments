package DAY_1;

import java.util.HashMap;
import java.util.Map;

public class Q41_MARVELDC {
    public static void main(String[] args) {
        String input = "Super Man Bat Man Spider Man";

        // Use a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert string to char array
        char[] chars = input.toCharArray();

        for (char c : chars) {
            // Ignore spaces
            if (c == ' ') {
                continue;
            }

            // Convert to lowercase for case-insensitive count
            c = Character.toLowerCase(c);

            // Update count in map
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Display character counts
        System.out.println("Character occurrences:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
}
