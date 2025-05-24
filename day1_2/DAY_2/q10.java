import java.util.*;

class Movie {
    String title, director, genre;
    int year;
    double rating;

    Movie(String title, String director, String genre, int year, double rating) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }

    public String toString() {
        return title + " | " + director + " | " + genre + " | " + year + " | " + rating;
    }
}

public class q10 {
    static List<Movie> movies = new ArrayList<>();

    static void addMovie(String t, String d, String g, int y, double r) {
        movies.add(new Movie(t, d, g, y, r));
    }

    static void removeMovie(String title) {
        movies.removeIf(m -> m.title.equalsIgnoreCase(title));
    }

    static void filterByGenre(String genre) {
        movies.stream().filter(m -> m.genre.equalsIgnoreCase(genre)).forEach(System.out::println);
    }

    static void sortByTitle() {
        movies.stream().sorted(Comparator.comparing(m -> m.title)).forEach(System.out::println);
    }

    static void sortByYear() {
        movies.stream().sorted(Comparator.comparingInt(m -> m.year)).forEach(System.out::println);
    }

    static void sortByRating() {
        movies.stream().sorted((a, b) -> Double.compare(b.rating, a.rating)).forEach(System.out::println);
    }

    public static void main(String[] args) {
        addMovie("Dangal", "Nitesh Tiwari", "Biopic", 2016, 8.4);
        addMovie("Shershaah", "Vishnuvardhan", "War", 2021, 8.5);
        addMovie("Lagaan", "Ashutosh Gowariker", "Historical", 2001, 8.1);
        sortByRating();
    }
}

