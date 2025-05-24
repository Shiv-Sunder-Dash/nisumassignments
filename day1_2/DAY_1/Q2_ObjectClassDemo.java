package DAY_1;
public class Q2_ObjectClassDemo {
    public static void main(String[] args) {
        Person person1 = new Person("YASH", 51);
        Person person2 = new Person("SUSMITA", 44);
        Person person3 = person1;
        System.out.println("toString(): " + person1.toString());
        System.out.println("person1.equals(person2): " + person1.equals(person2)); // should be true (based on content)
        System.out.println("person1.equals(person3): " + person1.equals(person3)); // should be true (same reference)
        System.out.println("person1.hashCode(): " + person1.hashCode());
        System.out.println("person2.hashCode(): " + person2.hashCode());
    }
}
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person other = (Person) obj;
        return age == other.age && name.equals(other.name);
    }
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}

