package DAY_1;

public class Q47_CHARACTER_TO_STRING {
    public static void main(String[] args) {
        // Example Character array
        Character[] charArray = {'J', 'a', 'v', 'a'};

        // Method 1: Using a loop and StringBuilder
        StringBuilder sb = new StringBuilder();
        for (Character ch : charArray) {
            sb.append(ch);
        }
        String result1 = sb.toString();
        System.out.println("String using StringBuilder: " + result1);

        // Method 2: Convert Character[] to char[] then use String constructor
        char[] primitiveCharArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            primitiveCharArray[i] = charArray[i];
        }
        String result2 = new String(primitiveCharArray);
        System.out.println("String using char[] constructor: " + result2);
    }
}
