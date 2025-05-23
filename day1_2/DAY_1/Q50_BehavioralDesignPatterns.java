public class Q50_BehavioralDesignPatterns_Simple {

    public static void main(String[] args) {
        chainOfResponsibility();
        command();
        interpreter();
        iterator();
        mediator();
        memento();
        observer();
        state();
        strategy();
        template();
        visitor();
    }

    // 1) Chain of Responsibility - simple logging chain
    static void chainOfResponsibility() {
        System.out.println("Chain Of Responsibility:");
        Handler h1 = new InfoHandler();
        Handler h2 = new ErrorHandler();
        h1.setNext(h2);

        h1.handle("INFO");
        h1.handle("ERROR");
        h1.handle("DEBUG");
        System.out.println();
    }

    interface Handler {
        void setNext(Handler h);
        void handle(String request);
    }

    static class InfoHandler implements Handler {
        Handler next;
        public void setNext(Handler h) { next = h; }
        public void handle(String request) {
            if ("INFO".equals(request)) System.out.println("InfoHandler handles INFO");
            else if (next != null) next.handle(request);
            else System.out.println("No handler for " + request);
        }
    }

    static class ErrorHandler implements Handler {
        Handler next;
        public void setNext(Handler h) { next = h; }
        public void handle(String request) {
            if ("ERROR".equals(request)) System.out.println("ErrorHandler handles ERROR");
            else if (next != null) next.handle(request);
            else System.out.println("No handler for " + request);
        }
    }

    // 2) Command - simple light on/off commands
    static void command() {
        System.out.println("Command:");
        Light light = new Light();
        Command on = () -> light.on();
        Command off = () -> light.off();

        on.execute();
        off.execute();
        System.out.println();
    }

    interface Command { void execute(); }

    static class Light {
        void on() { System.out.println("Light ON"); }
        void off() { System.out.println("Light OFF"); }
    }

    // 3) Interpreter - checks if string contains "Hello"
    static void interpreter() {
        System.out.println("Interpreter:");
        Expression expr = s -> s.contains("Hello");
        System.out.println(expr.interpret("Hello World")); // true
        System.out.println(expr.interpret("Hi World"));    // false
        System.out.println();
    }

    interface Expression {
        boolean interpret(String context);
    }

    // 4) Iterator - simple array iteration
    static void iterator() {
        System.out.println("Iterator:");
        String[] arr = {"A", "B", "C"};
        for (String s : arr) System.out.print(s + " ");
        System.out.println("\n");
    }

    // 5) Mediator - 2 colleagues send messages via mediator
    static void mediator() {
        System.out.println("Mediator:");
        MediatorImpl mediator = new MediatorImpl();
        Colleague c1 = new Colleague(mediator, "C1");
        Colleague c2 = new Colleague(mediator, "C2");
        mediator.setColleagues(c1, c2);

        c1.send("Hello from C1");
        c2.send("Hi from C2");
        System.out.println();
    }

    static class MediatorImpl {
        Colleague c1, c2;
        void setColleagues(Colleague c1, Colleague c2) {
            this.c1 = c1; this.c2 = c2;
        }
        void send(String msg, Colleague sender) {
            if (sender == c1) c2.receive(msg);
            else c1.receive(msg);
        }
    }

    static class Colleague {
        MediatorImpl mediator;
        String name;
        Colleague(MediatorImpl m, String n) { mediator = m; name = n; }
        void send(String msg) {
            System.out.println(name + " sends: " + msg);
            mediator.send(msg, this);
        }
        void receive(String msg) {
            System.out.println(name + " receives: " + msg);
        }
    }

    // 6) Memento - save and restore a state string
    static void memento() {
        System.out.println("Memento:");
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State1");
        caretaker.save(originator.save());

        originator.setState("State2");
        caretaker.save(originator.save());

        originator.setState("State3");
        originator.restore(caretaker.get(0));
        originator.restore(caretaker.get(1));
        System.out.println();
    }

    static class Originator {
        String state;
        void setState(String s) {
            state = s;
            System.out.println("State set to " + s);
        }
        Memento save() { return new Memento(state); }
        void restore(Memento m) {
            state = m.state;
            System.out.println("State restored to " + state);
        }
    }

    static class Memento {
        String state;
        Memento(String s) { state = s; }
    }

    static class Caretaker {
        java.util.List<Memento> list = new java.util.ArrayList<>();
        void save(Memento m) { list.add(m); }
        Memento get(int i) { return list.get(i); }
    }

    // 7) Observer - simple publisher/observer
    static void observer() {
        System.out.println("Observer:");
        Subject subject = new Subject();
        Observer o1 = msg -> System.out.println("Observer1: " + msg);
        Observer o2 = msg -> System.out.println("Observer2: " + msg);

        subject.register(o1);
        subject.register(o2);

        subject.notifyObservers("Hello Observers!");
        System.out.println();
    }

    interface Observer {
        void update(String message);
    }

    static class Subject {
        java.util.List<Observer> observers = new java.util.ArrayList<>();
        void register(Observer o) { observers.add(o); }
        void notifyObservers(String msg) {
            for (Observer o : observers) o.update(msg);
        }
    }

    // 8) State - simple start/stop states
    static void state() {
        System.out.println("State:");
        Context context = new Context();
        State start = new StartState();
        State stop = new StopState();

        start.doAction(context);
        System.out.println("Current state: " + context.getState());

        stop.doAction(context);
        System.out.println("Current state: " + context.getState());
        System.out.println();
    }

    interface State {
        void doAction(Context ctx);
    }

    static class StartState implements State {
        public void doAction(Context ctx) {
            System.out.println("StartState: starting");
            ctx.setState("Start");
        }
    }

    static class StopState implements State {
        public void doAction(Context ctx) {
            System.out.println("StopState: stopping");
            ctx.setState("Stop");
        }
    }

    static class Context {
        private String state;
        void setState(String s) { state = s; }
        String getState() { return state; }
    }

    // 9) Strategy - choose operation at runtime
    static void strategy() {
        System.out.println("Strategy:");
        ContextStrategy context = new ContextStrategy(new Add());
        System.out.println("Add: " + context.execute(5, 3));
        context.setStrategy(new Multiply());
        System.out.println("Multiply: " + context.execute(5, 3));
        System.out.println();
    }

    interface Strategy {
        int doOperation(int a, int b);
    }

    static class Add implements Strategy {
        public int doOperation(int a, int b) { return a + b; }
    }

    static class Multiply implements Strategy {
        public int doOperation(int a, int b) { return a * b; }
    }

    static class ContextStrategy {
        private Strategy strategy;
        ContextStrategy(Strategy s) { strategy = s; }
        void setStrategy(Strategy s) { strategy = s; }
        int execute(int a, int b) { return strategy.doOperation(a, b); }
    }

    // 10) Template - game template with subclasses
    static void template() {
        System.out.println("Template:");
        Game cricket = new Cricket();
        cricket.play();

        Game football = new Football();
        football.play();
        System.out.println();
    }

    static abstract class Game {
        abstract void initialize();
        abstract void startPlay();
        abstract void endPlay();

        final void play() {
            initialize();
            startPlay();
            endPlay();
        }
    }

    static class Cricket extends Game {
        void initialize() { System.out.println("Cricket initialized"); }
        void startPlay() { System.out.println("Cricket started"); }
        void endPlay() { System.out.println("Cricket ended"); }
    }

    static class Football extends Game {
        void initialize() { System.out.println("Football initialized"); }
        void startPlay() { System.out.println("Football started"); }
        void endPlay() { System.out.println("Football ended"); }
    }

    // 11) Visitor - simple visitor visiting elements
    static void visitor() {
        System.out.println("Visitor:");
        Computer comp = new Computer();
        ComputerPartVisitor visitor = new DisplayVisitor();
        comp.accept(visitor);
        System.out.println();
    }

    interface ComputerPart {
        void accept(ComputerPartVisitor visitor);
    }

    static class Keyboard implements ComputerPart {
        public void accept(ComputerPartVisitor visitor) {
            visitor.visit(this);
        }
    }

    static class Monitorimplements ComputerPart {
        public void accept(ComputerPartVisitor visitor) {
            visitor.visit(this);
        }
    }
    static class Computer implements ComputerPart {
        ComputerPart[] parts = { new Keyboard(), new Monitor() };
        public void accept(ComputerPartVisitor visitor) {
            for (ComputerPart part : parts) part.accept(visitor);
            visitor.visit(this);
        }
    }

    interface ComputerPartVisitor {
        void visit(Keyboard keyboard);
        void visit(Monitor monitor);
        void visit(Computer computer);
    }

    static class DisplayVisitor implements ComputerPartVisitor {
        public void visit(Keyboard keyboard) {
            System.out.println("Displaying Keyboard");
        }
        public void visit(Monitor monitor) {
            System.out.println("Displaying Monitor");
        }
        public void visit(Computer computer) {
            System.out.println("Displaying Computer");
        }
    }

