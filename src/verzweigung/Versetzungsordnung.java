package verzweigung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Versetzungsordnung {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Wie viele Sechsen hast du? ");
        String text = br.readLine();
        int zahl1 = Integer.parseInt(text.trim());

        System.out.println("Wie viele Fünfen hast du? ");
        text = br.readLine();
        int zahl2 = Integer.parseInt(text.trim());

        if (zahl1 > 1 || zahl1 == 1 && zahl2 > 1 || zahl2 > 3) {
            System.out.println("Probehalbjahr nicht bestanden");
        } else if (zahl1 == 1 && zahl2 == 1 || zahl2 == 3) {
            System.out.println("Nicht versetzt!");
        } else {
            System.out.println("Alles im Lot!");
        }
    }
}