package DAY_1;
//2)	Write a program to demonistrate methods in Object class? (at least 3 methods)
public class Q2_ObjectClassDemo {
    public static void main(String[] args) {
        Person person1 = new Person("YASH", 51);
        Person person2 = new Person("SUSMITA", 44);
        Person person3 = person1;

        // toString() method
        System.out.println("toString(): " + person1.toString());

        // equals() method
        System.out.println("person1.equals(person2): " + person1.equals(person2)); // should be true (based on content)
        System.out.println("person1.equals(person3): " + person1.equals(person3)); // should be true (same reference)

        // hashCode() method
        System.out.println("person1.hashCode(): " + person1.hashCode());
        System.out.println("person2.hashCode(): " + person2.hashCode());
    }
}

// A simple class that overrides Object class methods
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override toString() to provide a custom string representation
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    // Override equals() to compare content, not just references
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person other = (Person) obj;
        return age == other.age && name.equals(other.name);
    }

    // Override hashCode() to maintain consistency with equals()
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}

