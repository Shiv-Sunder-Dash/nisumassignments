package DAY_1;
interface Tourism {
    static void showStateWelcome() {
        System.out.println("Welcome to Odisha – India's best kept secret!");
    }
    void showCityAttraction();
}
public class Q24_Bhubaneswar implements Tourism {
    @Override
    public void showCityAttraction() {
        System.out.println("Bhubaneswar is known for its ancient temples and architecture.");
    }
    public static void main(String[] args) {
        Q24_Bhubaneswar city = new Q24_Bhubaneswar();
        city.showCityAttraction();
        Tourism.showStateWelcome();
    }
}
