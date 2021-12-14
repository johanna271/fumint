package einUndAusgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anrede2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Wie ist dein Vorname? ");
        String vorname = br.readLine();
        System.out.println("Wie ist dein Nachname? ");
        String nachname = br.readLine();

        System.out.println("Geben sie ihr Geschlecht ein. Männlich = m. Weiblich = w und für Divers = d. ");
        String zahl = br.readLine();

        if (zahl.equalsIgnoreCase ("m")) {
            System.out.println("Hallo Herr " + nachname + " " + vorname + ".");
        } else if(zahl.equalsIgnoreCase("w")) {
            System.out.println("Hallo Frau " + nachname + " " + vorname + ".");
        } else if (zahl.equalsIgnoreCase("d")) {
            System.out.println("Hallo " + nachname + " " + vorname + ".");
        } else {
            System.out.println("Idiot");
        }

    }
}
