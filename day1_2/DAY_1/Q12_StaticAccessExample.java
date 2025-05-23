package DAY_1;

public class Q12_StaticAccessExample {
    // Instance variable
    int instanceVar = 50;

    // Static method trying to access instance variable
    public static void displayInstanceVar() {
        // Uncommenting the below line will cause a compile-time error
        // System.out.println(instanceVar); // ❌ Cannot access directly

        // ✅ Correct way: create an object and access instanceVar
        Q12_StaticAccessExample obj = new Q12_StaticAccessExample();
        System.out.println("Accessed through object: " + obj.instanceVar);
    }

    // Main method
    public static void main(String[] args) {
        displayInstanceVar();
    }
}
