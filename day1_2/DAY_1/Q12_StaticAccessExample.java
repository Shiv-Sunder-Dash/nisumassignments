package DAY_1;
public class Q12_StaticAccessExample {
    int instanceVar = 50;
    public static void displayInstanceVar() {
        Q12_StaticAccessExample obj = new Q12_StaticAccessExample();
        System.out.println("Accessed through object: " + obj.instanceVar);
    }
    public static void main(String[] args) {
        displayInstanceVar();
    }
}