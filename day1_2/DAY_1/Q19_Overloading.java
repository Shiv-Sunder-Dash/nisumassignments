package DAY_1;

public class Q19_Overloading {

    // Method with no parameters
    public void show() {
        System.out.println("Show method with no parameters");
    }

    // Method with one int parameter
    public void show(int a) {
        System.out.println("Show method with one int parameter: " + a);
    }

    // Method with two parameters
    public void show(String name, int age) {
        System.out.println("Show method with name and age: " + name + ", " + age);
    }

    // Method with one String parameter
    public void show(String message) {
        System.out.println("Show method with message: " + message);
    }

    public static void main(String[] args) {
        Q19_Overloading obj = new Q19_Overloading();

        obj.show();                       // no parameter
        obj.show(42);                     // int parameter
        obj.show("Hello World");          // String parameter
        obj.show("SUSMITA DASH", 25);           // String and int parameters
    }
}