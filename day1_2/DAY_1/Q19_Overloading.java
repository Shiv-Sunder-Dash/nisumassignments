package DAY_1;
public class Q19_Overloading {
    public void show() {
        System.out.println("Show method with no parameters");
    }
    public void show(int a) {
        System.out.println("Show method with one int parameter: " + a);
    }
    public void show(String name, int age) {
        System.out.println("Show method with name and age: " + name + ", " + age);
    }
    public void show(String message) {
        System.out.println("Show method with message: " + message);
    }
    public static void main(String[] args) {
        Q19_Overloading obj = new Q19_Overloading();
        obj.show();
        obj.show(42);
        obj.show("Hello World");
        obj.show("SUSMITA DASH", 25);
    }
}
