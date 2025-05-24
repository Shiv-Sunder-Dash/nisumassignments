package DAY_1;
@FunctionalInterface
interface CricketAction {
    void playShot();
}
public class Q27_ViratKohli {
    public static void main(String[] args) {
        CricketAction coverDrive = () -> {
            System.out.println("Virat Kohli plays a beautiful cover drive!");
        };
        coverDrive.playShot();
    }
}
