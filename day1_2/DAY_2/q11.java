import java.util.*;

public class q11 {
    static Deque<Integer> stack = new ArrayDeque<>();

    static void push(int x) {
        stack.push(x);
    }

    static int pop() {
        return stack.pop();
    }

    static int peek() {
        return stack.peek();
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        System.out.println("Peek: " + peek());
        System.out.println("Pop: " + pop());
        System.out.println("Peek: " + peek());
    }
}

