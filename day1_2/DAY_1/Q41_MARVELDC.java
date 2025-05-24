package DAY_1;
import java.util.HashMap;
import java.util.Map;
public class Q41_MARVELDC {
    public static void main(String[] args) {
        String input = "Super Man Bat Man Spider Man";
        Map<Character, Integer> charCountMap = new HashMap<>();
        char[] chars = input.toCharArray();
        for (char c : chars) {
            if (c == ' ') continue;
            c = Character.toLowerCase(c);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        System.out.println("Character occurrences:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
}
