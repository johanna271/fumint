package aufwaermen;

import IO.IO;

import java.io.IOException;


public class Monate {

    public static void main(String[] args) throws IOException {

        String name;
        do {
            System.out.println("Wie ist ihr Name?");
            name = IO.readString();
        } while (name.equalsIgnoreCase("")) ;
        System.out.println("Hallo " + name);


        System.out.println("Gebe die Zahl eines Monats ein");
        int zahl = IO.readInteger();

        if (zahl > 12) {
            System.out.println("Die eingegebene Zahl ist zu groß");
        } else if (zahl < 1) {
            System.out.println("Die eingegebene Zahl ist zu klein");
        } else {
            System.out.println("Die eingegebene Zahl war korrekt");
        }


        if (zahl == 1 || zahl == 3 || zahl == 5 || zahl == 7 || zahl == 8 || zahl == 10 || zahl == 12  ) {
            System.out.println("Der ausgewählte Monat hat 31 Tage");
        } else if (zahl == 4 || zahl == 6 || zahl == 9 || zahl == 11 ) {
            System.out.println("Der ausgewählte Monat hat 30 Tage");
        } else if (zahl == 2) {
            System.out.println("Der ausgewählte Monat hat 28 Tage");
        }
    }
}
