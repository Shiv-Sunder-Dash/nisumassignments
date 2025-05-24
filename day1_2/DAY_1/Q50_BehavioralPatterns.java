package DAY_1;
import java.util.*;

public class Q50_BehavioralPatterns {
    public static void main(String[] args) {
        Handler h1 = new InfoHandler();
        Handler h2 = new ErrorHandler();
        h1.setNext(h2);
        h1.handle("INFO");
        h1.handle("ERROR");
        h1.handle("DEBUG");

        Light light = new Light();
        Command on = light::on;
        Command off = light::off;
        on.execute();
        off.execute();

        Expression expr = s -> s.contains("Hello");
        System.out.println(expr.interpret("Hello World"));
        System.out.println(expr.interpret("Hi World"));

        String[] arr = {"A", "B", "C"};
        for (String s : arr) System.out.print(s + " ");
        System.out.println();

        MediatorImpl mediator = new MediatorImpl();
        Colleague c1 = new Colleague(mediator, "C1");
        Colleague c2 = new Colleague(mediator, "C2");
        mediator.setColleagues(c1, c2);
        c1.send("Hello from C1");
        c2.send("Hi from C2");

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("State1"); caretaker.save(originator.save());
        originator.setState("State2"); caretaker.save(originator.save());
        originator.setState("State3");
        originator.restore(caretaker.get(0));
        originator.restore(caretaker.get(1));

        Subject subject = new Subject();
        Observer o1 = msg -> System.out.println("Observer1: " + msg);
        Observer o2 = msg -> System.out.println("Observer2: " + msg);
        subject.register(o1); subject.register(o2);
        subject.notifyObservers("Hello Observers!");

        ContextState ctx = new ContextState();
        State start = new StartState();
        State stop = new StopState();
        start.doAction(ctx);
        stop.doAction(ctx);

        ContextStrategy strategy = new ContextStrategy(new Add());
        System.out.println("Add: " + strategy.execute(5, 3));
        strategy.setStrategy(new Multiply());
        System.out.println("Multiply: " + strategy.execute(5, 3));

        Game cricket = new Cricket(); cricket.play();
        Game football = new Football(); football.play();

        Computer comp = new Computer();
        ComputerPartVisitor visitor = new DisplayVisitor();
        comp.accept(visitor);
    }

    interface Handler { void setNext(Handler h); void handle(String req); }
    static class InfoHandler implements Handler {
        Handler next;
        public void setNext(Handler h) { next = h; }
        public void handle(String req) {
            if ("INFO".equals(req)) System.out.println("Handled INFO");
            else if (next != null) next.handle(req);
        }
    }
    static class ErrorHandler implements Handler {
        Handler next;
        public void setNext(Handler h) { next = h; }
        public void handle(String req) {
            if ("ERROR".equals(req)) System.out.println("Handled ERROR");
            else if (next != null) next.handle(req);
        }
    }

    interface Command { void execute(); }
    static class Light {
        void on() { System.out.println("Light ON"); }
        void off() { System.out.println("Light OFF"); }
    }

    interface Expression { boolean interpret(String context); }

    static class MediatorImpl {
        Colleague c1, c2;
        void setColleagues(Colleague a, Colleague b) { c1 = a; c2 = b; }
        void send(String msg, Colleague s) { if (s == c1) c2.receive(msg); else c1.receive(msg); }
    }
    static class Colleague {
        MediatorImpl mediator; String name;
        Colleague(MediatorImpl m, String n) { mediator = m; name = n; }
        void send(String msg) {
            System.out.println(name + " sends: " + msg);
            mediator.send(msg, this);
        }
        void receive(String msg) {
            System.out.println(name + " receives: " + msg);
        }
    }

    static class Originator {
        String state;
        void setState(String s) { state = s; System.out.println("Set: " + s); }
        Memento save() { return new Memento(state); }
        void restore(Memento m) { state = m.state; System.out.println("Restored: " + state); }
    }
    static class Memento { String state; Memento(String s) { state = s; } }
    static class Caretaker {
        List<Memento> list = new ArrayList<>();
        void save(Memento m) { list.add(m); }
        Memento get(int i) { return list.get(i); }
    }

    interface Observer { void update(String msg); }
    static class Subject {
        List<Observer> observers = new ArrayList<>();
        void register(Observer o) { observers.add(o); }
        void notifyObservers(String msg) {
            for (Observer o : observers) o.update(msg);
        }
    }

    interface State { void doAction(ContextState c); }
    static class StartState implements State {
        public void doAction(ContextState c) { System.out.println("Starting"); c.setState("Start"); }
    }
    static class StopState implements State {
        public void doAction(ContextState c) { System.out.println("Stopping"); c.setState("Stop"); }
    }
    static class ContextState {
        private String state;
        void setState(String s) { state = s; }
        String getState() { return state; }
    }

    interface Strategy { int doOperation(int a, int b); }
    static class Add implements Strategy { public int doOperation(int a, int b) { return a + b; } }
    static class Multiply implements Strategy { public int doOperation(int a, int b) { return a * b; } }
    static class ContextStrategy {
        private Strategy strategy;
        ContextStrategy(Strategy s) { strategy = s; }
        void setStrategy(Strategy s) { strategy = s; }
        int execute(int a, int b) { return strategy.doOperation(a, b); }
    }

    abstract static class Game {
        abstract void initialize(); abstract void startPlay(); abstract void endPlay();
        final void play() { initialize(); startPlay(); endPlay(); }
    }
    static class Cricket extends Game {
        void initialize() { System.out.println("Cricket init"); }
        void startPlay() { System.out.println("Cricket start"); }
        void endPlay() { System.out.println("Cricket end"); }
    }
    static class Football extends Game {
        void initialize() { System.out.println("Football init"); }
        void startPlay() { System.out.println("Football start"); }
        void endPlay() { System.out.println("Football end"); }
    }

    interface ComputerPart { void accept(ComputerPartVisitor v); }
    static class Keyboard implements ComputerPart {
        public void accept(ComputerPartVisitor v) { v.visit(this); }
    }
    static class Monitor implements ComputerPart {
        public void accept(ComputerPartVisitor v) { v.visit(this); }
    }
    static class Computer implements ComputerPart {
        ComputerPart[] parts = { new Keyboard(), new Monitor() };
        public void accept(ComputerPartVisitor v) {
            for (ComputerPart part : parts) part.accept(v);
            v.visit(this);
        }
    }
    interface ComputerPartVisitor {
        void visit(Keyboard k); void visit(Monitor m); void visit(Computer c);
    }
    static class DisplayVisitor implements ComputerPartVisitor {
        public void visit(Keyboard k) { System.out.println("Keyboard"); }
        public void visit(Monitor m) { System.out.println("Monitor"); }
        public void visit(Computer c) { System.out.println("Computer"); }
    }
}


