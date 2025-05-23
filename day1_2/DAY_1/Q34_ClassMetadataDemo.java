package DAY_1;

import java.lang.reflect.Method;

class ClassMetadataDemo {
    public static void main(String[] args) {
        // Create an object of any class (String here)
        String sample = "Hello World";

        // Get the Class object using getClass()
        Class<?> clazz = sample.getClass();

        // Get full name of the class
        System.out.println("Full Class Name: " + clazz.getName());

        // Get simple name of the class
        System.out.println("Simple Class Name: " + clazz.getSimpleName());

        // Check if it is an interface
        System.out.println("Is Interface? " + clazz.isInterface());

        // Get all declared methods
        Method[] methods = clazz.getDeclaredMethods();

        System.out.println("Methods:");
        for (Method method : methods) {
            System.out.println("  " + method.getName());
        }
    }
}
