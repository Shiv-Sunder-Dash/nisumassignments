package DAY_1;
interface Culture {
    void celebrateFestival();
}
interface Transportation {
    void modeOfTransport();
}
public class Q23_Mumbai implements Culture, Transportation {
    @Override
    public void celebrateFestival() {
        System.out.println("Mumbai celebrates Ganesh Chaturthi with great enthusiasm.");
    }
    @Override
    public void modeOfTransport() {
        System.out.println("Local trains and auto-rickshaws are popular modes of transport in Mumbai.");
    }
    public static void main(String[] args) {
        Q23_Mumbai city = new Q23_Mumbai();
        city.celebrateFestival();
        city.modeOfTransport();
    }
}