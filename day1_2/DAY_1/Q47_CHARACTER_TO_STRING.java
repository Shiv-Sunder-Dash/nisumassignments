package DAY_1;
public class Q47_CHARACTER_TO_STRING {
    public static void main(String[] args) {
        Character[] charArray = {'J', 'a', 'v', 'a'};
        StringBuilder sb = new StringBuilder();
        for (Character ch : charArray) {
            sb.append(ch);
        }
        String result1 = sb.toString();
        System.out.println("String using StringBuilder: " + result1);
        char[] primitiveCharArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            primitiveCharArray[i] = charArray[i];
        }
        String result2 = new String(primitiveCharArray);
        System.out.println("String using char[] constructor: " + result2);
    }
}
