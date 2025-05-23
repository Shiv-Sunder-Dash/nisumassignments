package DAY_1;

class Movie {
    // Static method in parent class
    static void display() {
        System.out.println("Movie: Generic Indian Movie");
    }

    // Instance method for comparison
    void instanceDisplay() {
        System.out.println("Instance method in Movie class");
    }
}

class Q33_Baahubali extends Movie {
    // This hides the static method, it is NOT overriding
    static void display() {
        System.out.println("Movie: Baahubali - The Beginning");
    }

    // This overrides the instance method
    @Override
    void instanceDisplay() {
        System.out.println("Instance method in Baahubali class");
    }
}

 class TestMovie {
    public static void main(String[] args) {
        Movie m = new Movie();
        Movie b = new Q33_Baahubali();

        // Calls static method based on reference type, NOT runtime object
        m.display();  // Output: Movie: Generic Indian Movie
        b.display();  // Output: Movie: Generic Indian Movie (static methods are hidden, not overridden)

        // Calls overridden instance method at runtime
        m.instanceDisplay();  // Output: Instance method in Movie class
        b.instanceDisplay();  // Output: Instance method in Baahubali class
    }
}
