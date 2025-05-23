package DAY_1;

// Q48_HERITAGE.java
// Demonstrates Creational Design Patterns

// Import for cloning in Prototype
import java.util.HashMap;
import java.util.Map;

public class Q48_HERITAGE {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("=== Factory Pattern ===");
        Vehicle vehicle = VehicleFactory.getVehicle("Car");
        vehicle.drive();

        System.out.println("\n=== Abstract Factory Pattern ===");
        Factory factory = new ShapeFactory();
        Shape shape1 = factory.getShape("Circle");
        shape1.draw();

        factory = new ColorFactory();
        Color color1 = factory.getColor("Red");
        color1.fill();

        System.out.println("\n=== Singleton Pattern ===");
        Singleton singleton1 = Singleton.getInstance();
        singleton1.showMessage();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Are both singleton objects same? " + (singleton1 == singleton2));

        System.out.println("\n=== Prototype Pattern ===");
        PrototypeRegistry registry = new PrototypeRegistry();
        PrototypeShape clonedShape = registry.getShape("Circle").clone();
        clonedShape.draw();

        System.out.println("\n=== Builder Pattern ===");
        Product product = new Product.Builder()
                .setName("Laptop")
                .setPrice(1200)
                .setRam(16)
                .build();
        System.out.println(product);
    }

    // 1) Factory Pattern
    interface Vehicle {
        void drive();
    }
    static class Car implements Vehicle {
        public void drive() {
            System.out.println("Driving a Car");
        }
    }
    static class Bike implements Vehicle {
        public void drive() {
            System.out.println("Riding a Bike");
        }
    }
    static class VehicleFactory {
        public static Vehicle getVehicle(String type) {
            if ("Car".equalsIgnoreCase(type)) return new Car();
            else if ("Bike".equalsIgnoreCase(type)) return new Bike();
            else throw new IllegalArgumentException("Unknown vehicle type");
        }
    }

    // 2) Abstract Factory Pattern
    interface Shape {
        void draw();
    }
    static class Circle implements Shape {
        public void draw() {
            System.out.println("Drawing Circle");
        }
    }
    static class Rectangle implements Shape {
        public void draw() {
            System.out.println("Drawing Rectangle");
        }
    }

    interface Color {
        void fill();
    }
    static class Red implements Color {
        public void fill() {
            System.out.println("Filling Red Color");
        }
    }
    static class Blue implements Color {
        public void fill() {
            System.out.println("Filling Blue Color");
        }
    }

    static abstract class Factory {
        abstract Shape getShape(String shapeType);
        abstract Color getColor(String colorType);
    }

    static class ShapeFactory extends Factory {
        Shape getShape(String shapeType) {
            if ("Circle".equalsIgnoreCase(shapeType)) return new Circle();
            else if ("Rectangle".equalsIgnoreCase(shapeType)) return new Rectangle();
            return null;
        }
        Color getColor(String colorType) {
            return null; // ShapeFactory doesn’t create colors
        }
    }

    static class ColorFactory extends Factory {
        Shape getShape(String shapeType) {
            return null; // ColorFactory doesn’t create shapes
        }
        Color getColor(String colorType) {
            if ("Red".equalsIgnoreCase(colorType)) return new Red();
            else if ("Blue".equalsIgnoreCase(colorType)) return new Blue();
            return null;
        }
    }

    // 3) Singleton Pattern
    static class Singleton {
        private static Singleton instance;

        private Singleton() {
            // private constructor
        }

        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }

        public void showMessage() {
            System.out.println("Hello from Singleton!");
        }
    }

    // 4) Prototype Pattern
    static abstract class PrototypeShape implements Cloneable {
        abstract void draw();

        public PrototypeShape clone() throws CloneNotSupportedException {
            return (PrototypeShape) super.clone();
        }
    }

    static class CirclePrototype extends PrototypeShape {
        void draw() {
            System.out.println("Drawing Circle (Prototype)");
        }
    }

    static class RectanglePrototype extends PrototypeShape {
        void draw() {
            System.out.println("Drawing Rectangle (Prototype)");
        }
    }

    static class PrototypeRegistry {
        private Map<String, PrototypeShape> shapes = new HashMap<>();

        public PrototypeRegistry() {
            shapes.put("Circle", new CirclePrototype());
            shapes.put("Rectangle", new RectanglePrototype());
        }

        public PrototypeShape getShape(String shapeType) {
            return shapes.get(shapeType);
        }
    }

    // 5) Builder Pattern
    static class Product {
        private String name;
        private int price;
        private int ram;

        private Product(Builder builder) {
            this.name = builder.name;
            this.price = builder.price;
            this.ram = builder.ram;
        }

        @Override
        public String toString() {
            return "Product{name='" + name + "', price=" + price + ", ram=" + ram + "GB}";
        }

        static class Builder {
            private String name;
            private int price;
            private int ram;

            public Builder setName(String name) {
                this.name = name;
                return this;
            }

            public Builder setPrice(int price) {
                this.price = price;
                return this;
            }

            public Builder setRam(int ram) {
                this.ram = ram;
                return this;
            }

            public Product build() {
                return new Product(this);
            }
        }
    }
}
