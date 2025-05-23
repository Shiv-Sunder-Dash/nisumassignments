// Q49_DESIGNPATTERN.java
// Demonstrating Structural Design Patterns with fixes
package DAY_1;
import java.util.ArrayList;
import java.util.List;

public class Q49_DESIGNPATTERN {

    public static void main(String[] args) {
        System.out.println("=== Adapter Pattern ===");
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("vlc", "movie.vlc");
        audioPlayer.play("mp4", "video.mp4");

        System.out.println("\n=== Bridge Pattern ===");
        ColoredShape redCircle = new Circle(new RedColor());
        redCircle.draw();
        ColoredShape blueCircle = new Circle(new BlueColor());
        blueCircle.draw();

        System.out.println("\n=== Composite Pattern ===");
        Leaf leaf1 = new Leaf("Leaf 1");
        Leaf leaf2 = new Leaf("Leaf 2");
        Composite composite = new Composite();
        composite.add(leaf1);
        composite.add(leaf2);
        composite.display(1);

        System.out.println("\n=== Decorator Pattern ===");
        Shape baseCircle = new SimpleCircle();
        Shape redDecoratedCircle = new RedShapeDecorator(baseCircle);
        redDecoratedCircle.draw();

        System.out.println("\n=== Facade Pattern ===");
        ComputerFacade computer = new ComputerFacade();
        computer.start();

        System.out.println("\n=== Flyweight Pattern ===");
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly1 = factory.getFlyweight("A");
        Flyweight fly2 = factory.getFlyweight("B");
        Flyweight fly3 = factory.getFlyweight("A"); // same object as fly1
        fly1.operation("First Call");
        fly2.operation("Second Call");
        fly3.operation("Third Call");

        System.out.println("\n=== Proxy Pattern ===");
        Image image = new ProxyImage("test_image.jpg");
        image.display();
        image.display();
    }

    // 1) Adapter Pattern
    interface MediaPlayer {
        void play(String audioType, String fileName);
    }

    interface AdvancedMediaPlayer {
        void playVlc(String fileName);
        void playMp4(String fileName);
    }

    static class VlcPlayer implements AdvancedMediaPlayer {
        public void playVlc(String fileName) {
            System.out.println("Playing vlc file: " + fileName);
        }
        public void playMp4(String fileName) {}
    }

    static class Mp4Player implements AdvancedMediaPlayer {
        public void playVlc(String fileName) {}
        public void playMp4(String fileName) {
            System.out.println("Playing mp4 file: " + fileName);
        }
    }

    static class MediaAdapter implements MediaPlayer {
        AdvancedMediaPlayer advancedMusicPlayer;

        public MediaAdapter(String audioType) {
            if (audioType.equalsIgnoreCase("vlc")) {
                advancedMusicPlayer = new VlcPlayer();
            } else if (audioType.equalsIgnoreCase("mp4")) {
                advancedMusicPlayer = new Mp4Player();
            }
        }

        public void play(String audioType, String fileName) {
            if (audioType.equalsIgnoreCase("vlc")) {
                advancedMusicPlayer.playVlc(fileName);
            } else if (audioType.equalsIgnoreCase("mp4")) {
                advancedMusicPlayer.playMp4(fileName);
            }
        }
    }

    static class AudioPlayer implements MediaPlayer {
        MediaAdapter mediaAdapter;

        public void play(String audioType, String fileName) {
            if (audioType.equalsIgnoreCase("mp3")) {
                System.out.println("Playing mp3 file: " + fileName);
            } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
                mediaAdapter = new MediaAdapter(audioType);
                mediaAdapter.play(audioType, fileName);
            } else {
                System.out.println("Invalid media. " + audioType + " format not supported");
            }
        }
    }

    // 2) Bridge Pattern
    interface Color {
        void applyColor();
    }

    static class RedColor implements Color {
        public void applyColor() {
            System.out.println("Applying red color");
        }
    }

    static class BlueColor implements Color {
        public void applyColor() {
            System.out.println("Applying blue color");
        }
    }

    abstract static class ColoredShape {
        protected Color color;
        public ColoredShape(Color color) {
            this.color = color;
        }
        abstract void draw();
    }

    static class Circle extends ColoredShape {
        public Circle(Color color) {
            super(color);
        }
        public void draw() {
            System.out.print("Circle filled with color: ");
            color.applyColor();
        }
    }

    // 3) Composite Pattern
    interface Component {
        void display(int depth);
    }

    static class Leaf implements Component {
        private String name;
        public Leaf(String name) {
            this.name = name;
        }
        public void display(int depth) {
            System.out.println("-".repeat(depth) + name);
        }
    }

    static class Composite implements Component {
        private List<Component> children = new ArrayList<>();

        public void add(Component component) {
            children.add(component);
        }

        public void remove(Component component) {
            children.remove(component);
        }

        public void display(int depth) {
            System.out.println("-".repeat(depth) + "Composite");
            for (Component component : children) {
                component.display(depth + 2);
            }
        }
    }

    // 4) Decorator Pattern
    interface Shape {
        void draw();
    }

    static class SimpleCircle implements Shape {
        public void draw() {
            System.out.println("Shape: Circle");
        }
    }

    static class ShapeDecorator implements Shape {
        protected Shape decoratedShape;

        public ShapeDecorator(Shape decoratedShape) {
            this.decoratedShape = decoratedShape;
        }

        public void draw() {
            decoratedShape.draw();
        }
    }

    static class RedShapeDecorator extends ShapeDecorator {
        public RedShapeDecorator(Shape decoratedShape) {
            super(decoratedShape);
        }

        public void draw() {
            decoratedShape.draw();
            setRedBorder();
        }

        private void setRedBorder() {
            System.out.println("Border Color: Red");
        }
    }

    // 5) Facade Pattern
    static class CPU {
        public void start() {
            System.out.println("CPU started");
        }
    }

    static class Memory {
        public void load() {
            System.out.println("Memory loaded");
        }
    }

    static class HardDrive {
        public void read() {
            System.out.println("Hard drive read");
        }
    }

    static class ComputerFacade {
        private CPU cpu;
        private Memory memory;
        private HardDrive hardDrive;

        public ComputerFacade() {
            cpu = new CPU();
            memory = new Memory();
            hardDrive = new HardDrive();
        }

        public void start() {
            cpu.start();
            memory.load();
            hardDrive.read();
            System.out.println("Computer started.");
        }
    }

    // 6) Flyweight Pattern
    interface Flyweight {
        void operation(String extrinsicState);
    }

    static class ConcreteFlyweight implements Flyweight {
        private String intrinsicState;

        public ConcreteFlyweight(String intrinsicState) {
            this.intrinsicState = intrinsicState;
        }

        public void operation(String extrinsicState) {
            System.out.println("Intrinsic: " + intrinsicState + ", Extrinsic: " + extrinsicState);
        }
    }

    static class FlyweightFactory {
        private final java.util.Map<String, Flyweight> flyweights = new java.util.HashMap<>();

        public Flyweight getFlyweight(String key) {
            Flyweight flyweight = flyweights.get(key);
            if (flyweight == null) {
                flyweight = new ConcreteFlyweight(key);
                flyweights.put(key, flyweight);
                System.out.println("Creating new flyweight for key: " + key);
            } else {
                System.out.println("Reusing existing flyweight for key: " + key);
            }
            return flyweight;
        }
    }

    // 7) Proxy Pattern
    interface Image {
        void display();
    }

    static class RealImage implements Image {
        private String fileName;

        public RealImage(String fileName) {
            this.fileName = fileName;
            loadFromDisk();
        }

        private void loadFromDisk() {
            System.out.println("Loading " + fileName);
        }

        public void display() {
            System.out.println("Displaying " + fileName);
        }
    }

    static class ProxyImage implements Image {
        private RealImage realImage;
        private String fileName;

        public ProxyImage(String fileName) {
            this.fileName = fileName;
        }

        public void display() {
            if (realImage == null) {
                realImage = new RealImage(fileName);
            }
            realImage.display();
        }
    }
}
