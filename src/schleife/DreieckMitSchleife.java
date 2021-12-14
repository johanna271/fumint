package schleife;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DreieckMitSchleife {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int weiter;
        do {
            System.out.println("Geben sie die Länge von Seite a ein.");
            double a = Double.parseDouble(br.readLine().trim().replace(',', '.'));

            System.out.println("Geben sie die Länge von Seite b ein.");
            double b = Double.parseDouble(br.readLine().trim().replace(',', '.'));

            System.out.println("Geben sie die Länge von Seite c ein.");
            double c = Double.parseDouble(br.readLine().trim().replace(',', '.'));

            double ergebnisab = a + b;
            double ergebnisbc = b + c;
            double ergebnisca = c + a;

            if (ergebnisab > c || ergebnisbc > a || ergebnisca > b) {
                System.out.println("Die Zeichnung eines Dreiecks ist möglich");
                double umfang = a + b + c;
                double s = (a + b + c) / 2;
                double flaeche = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println(umfang + " = " + a + " + " + b + " + " + c);
                System.out.println(flaeche);
            } else {
                System.out.println("Die zeichnung eines Dreiecks ist nicht möglich");
            }
            System.out.println("Soll das Programm woederholt werden? (1=ja)");
            weiter = Integer.parseInt(br.readLine());
        } while (weiter == 1);
    }
}
