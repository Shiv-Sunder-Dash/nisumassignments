package DAY_1;
import java.lang.reflect.Method;
class ClassMetadataDemo {
    public static void main(String[] args) {
        String sample = "Hello World";
        Class<?> clazz = sample.getClass();
        System.out.println("Full Class Name: " + clazz.getName());
        System.out.println("Simple Class Name: " + clazz.getSimpleName());
        System.out.println("Is Interface? " + clazz.isInterface());
        Method[] methods = clazz.getDeclaredMethods();
        System.out.println("Methods:");
        for (Method method : methods) {
            System.out.println("  " + method.getName());
        }
    }
}
