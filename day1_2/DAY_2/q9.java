import java.util.*;

class Event {
    String title, time, desc;

    Event(String title, String time, String desc) {
        this.title = title;
        this.time = time;
        this.desc = desc;
    }

    public String toString() {
        return title + " at " + time + " - " + desc;
    }
}

public class q9 {
    static TreeMap<String, List<Event>> calendar = new TreeMap<>();

    static void addEvent(String date, String title, String time, String desc) {
        calendar.putIfAbsent(date, new ArrayList<>());
        calendar.get(date).add(new Event(title, time, desc));
    }

    static void removeEvent(String date) {
        calendar.remove(date);
    }

    static void displayDateEvents(String date) {
        if (calendar.containsKey(date))
            for (Event e : calendar.get(date))
                System.out.println(e);
    }

    static void displayAllEvents() {
        for (var entry : calendar.entrySet()) {
            System.out.println("Date: " + entry.getKey());
            for (Event e : entry.getValue())
                System.out.println("  " + e);
        }
    }

    public static void main(String[] args) {
        addEvent("2025-05-25", "Meeting", "10:00 AM", "Project discussion");
        addEvent("2025-05-25", "Lunch", "1:00 PM", "With team");
        addEvent("2025-05-26", "Webinar", "4:00 PM", "Tech talk");
        displayAllEvents();
    }
}

