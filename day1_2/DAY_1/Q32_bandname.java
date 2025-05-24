package DAY_1;
final class Band {
    private String bandName;
    private int membersCount;
    public Band(String bandName, int membersCount) {
        this.bandName = bandName;
        this.membersCount = membersCount;
    }
    public void displayBandInfo() {
        System.out.println("Band Name: " + bandName);
        System.out.println("Number of Members: " + membersCount);
    }
    public boolean isSoloArtist() {
        return membersCount == 1;
    }
}
public class Q32_bandname {
    public static void main(String[] args) {
        Band beatles = new Band("The Beatles", 4);
        beatles.displayBandInfo();
        System.out.println("Is solo artist? " + beatles.isSoloArtist());
        System.out.println();
        Band adele = new Band("Adele", 1);
        adele.displayBandInfo();
        System.out.println("Is solo artist? " + adele.isSoloArtist());
    }
}
