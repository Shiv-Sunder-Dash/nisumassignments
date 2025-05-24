import java.util.*;

public class q5 {
    static Stack<String> history = new Stack<>();

    static void visit(String url) {
        history.push(url);
        System.out.println("Visited: " + url);
    }

    static void back() {
        if (!history.isEmpty()) {
            history.pop();
            System.out.println("Went back.");
        } else {
            System.out.println("No history.");
        }
    }

    static void currentPage() {
        if (!history.isEmpty())
            System.out.println("Current page: " + history.peek());
        else
            System.out.println("No current page.");
    }

    static void viewHistory() {
        System.out.println("Browser History:");
        for (String url : history)
            System.out.println(url);
    }

    public static void main(String[] args) {
        visit("google.com");
        visit("example.com");
        currentPage();
        back();
        currentPage();
        viewHistory();
    }
}
