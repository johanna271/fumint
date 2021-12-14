package schleife;

import IO.IO;

import java.io.IOException;

public class Sparvertrag {
    public static void main(String[] args) throws IOException {

        String weiter;

        do {
            System.out.println("Geben sie das Kapital ein");
            double kapital = IO.readDouble();

            System.out.println("Geben sie den Zinssatz ein");
            double zinssatz = IO.readDouble();

            System.out.println("Geben sie die Laufzeit in Jahren an");
            int jahre = IO.readInteger();

            System.out.println("Jahre \t Kapital \t Zinesbetrag \t Jahresendbetrag");

            int jahre2;
            for (jahre2 = 1; jahre2 <= jahre ; jahre2++) {
                double zinsen1 = kapital * zinssatz;
                double zinsen = zinsen1 / 100.0;
                double zinsenerg = Math.round(zinsen * 100.0) / 100.00;

                double jahresendbertrag1 = kapital + zinsenerg;
                double jahresendbertrag =Math.round(jahresendbertrag1 * 100.0) / 100.00;

                System.out.println(jahre2 + "\t" + "\t" + kapital + "\t" + "\t" + zinsenerg + "\t" + "\t" + jahresendbertrag );
                kapital = jahresendbertrag;
            }

            System.out.println("Wollen sie weitere Sparverträge berechnen? (ja oder nein) ");
            weiter = IO.readString();
        } while (weiter.equalsIgnoreCase("ja"));
    }
}
