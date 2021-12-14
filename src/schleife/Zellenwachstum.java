package schleife;

import IO.IO;

import java.io.IOException;

public class Zellenwachstum{
    public static void main(String[] args) throws IOException {

        String weiter;
        do {
            System.out.print("Bitte geben sie die aktuelle Zellenmenge ein: ");
            double zahlenmenge = IO.readDouble();

            System.out.print("Bitte geben sie den Wachstumfaktor ein: ");
            double wachstum = IO.readDouble();

            System.out.print("Bitte geben sie die Laufzeit in Tagen ein: ");
            double laufzeit = IO.readDouble();

            System.out.println("Tage \t Zellenmenge");

            int tage;
            for (tage = 0; tage <= laufzeit; tage++ ) {
                double zahlenmengeerg = zahlenmenge * Math.pow(wachstum, tage);
                System.out.println(tage + "\t" + "\t" + "\t" + zahlenmengeerg);

            }

            System.out.println("Wollen sie weitere Sparverträge berechnen? ( für ja = j) ");
            weiter = IO.readString();

        } while (weiter.equalsIgnoreCase("j"));
    }
}
