package DAY_1;
class Movie {
    static void display() {
        System.out.println("Movie: Generic Indian Movie");
    }
    void instanceDisplay() {
        System.out.println("Instance method in Movie class");
    }
}
class Q33_Baahubali extends Movie {
    static void display() {
        System.out.println("Movie: Baahubali - The Beginning");
    }
    @Override
    void instanceDisplay() {
        System.out.println("Instance method in Baahubali class");
    }
}
class TestMovie {
    public static void main(String[] args) {
        Movie m = new Movie();
        Movie b = new Q33_Baahubali();
        m.display();
        b.display();
        m.instanceDisplay();
        b.instanceDisplay();
    }
}
