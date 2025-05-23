//Write a program to get metadata of class using getClass() in Object?(eg: name, simple, methods, isInterface etc..)
package DAY_1;
import java.lang.reflect.Method;
public class Q1_ClassMetadataExample {
    public static void main(String[] args) {
        // Create an instance of any class
        SampleClass sample = new SampleClass();

        // Get the Class object
        Class<?> clazz = sample.getClass();

        // Print class metadata
        System.out.println("Full class name: " + clazz.getName());
        System.out.println("Simple class name: " + clazz.getSimpleName());
        System.out.println("Is Interface: " + clazz.isInterface());
        System.out.println("Is Array: " + clazz.isArray());
        System.out.println("Is Enum: " + clazz.isEnum());
        System.out.println("Is Primitive: " + clazz.isPrimitive());

        // Get and print methods
        System.out.println("\nDeclared Methods:");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(" - " + method.getName());
        }
    }
}

// A sample class to demonstrate reflection
class SampleClass {
    public void display() {
        System.out.println("Display method");
    }

    private int add(int a, int b) {
        return a + b;
    }
}
