package DAY_1;
// Final class cannot be extended
final class Band {
    private String bandName;
    private int membersCount;

    // Constructor
    public Band(String bandName, int membersCount) {
        this.bandName = bandName;
        this.membersCount = membersCount;
    }

    // Method to display band info
    public void displayBandInfo() {
        System.out.println("Band Name: " + bandName);
        System.out.println("Number of Members: " + membersCount);
    }

    // Method to check if the band is a solo artist
    public boolean isSoloArtist() {
        return membersCount == 1;
    }
}

public class Q32_bandname {
    public static void main(String[] args) {
        // Use case 1: Band with multiple members
        Band beatles = new Band("The Beatles", 4);
        beatles.displayBandInfo();
        System.out.println("Is solo artist? " + beatles.isSoloArtist());

        System.out.println();

        // Use case 2: Solo artist as a band
        Band adele = new Band("Adele", 1);
        adele.displayBandInfo();
        System.out.println("Is solo artist? " + adele.isSoloArtist());
    }
}
