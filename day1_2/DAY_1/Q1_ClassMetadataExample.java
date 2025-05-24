package DAY_1;
import java.lang.reflect.Method;
public class Q1_ClassMetadataExample {
    public static void main(String[] args) {
        SampleClass sample = new SampleClass();
        Class<?> clazz = sample.getClass();
        System.out.println("Full class name: " + clazz.getName());
        System.out.println("Simple class name: " + clazz.getSimpleName());
        System.out.println("Is Interface: " + clazz.isInterface());
        System.out.println("Is Array: " + clazz.isArray());
        System.out.println("Is Enum: " + clazz.isEnum());
        System.out.println("Is Primitive: " + clazz.isPrimitive());
        System.out.println("\nDeclared Methods:");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(" - " + method.getName());
        }
    }
}
class SampleClass {
    public void display() {
        System.out.println("Display method");
    }
    private int add(int a, int b) {
        return a + b;
    }
}