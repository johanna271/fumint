package schleife;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PQFormel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Geben sie P ein");
        double antwort = Double.parseDouble(br.readLine());

        System.out.println("Geben sie Q ein");
        double q = Double.parseDouble(br.readLine());

        double ergD = Math.pow((antwort/2),2)-q;
        double ergebnisX1 = - antwort/2 + Math.sqrt(ergD);
        double ergebnisX2 = - antwort/2 - Math.sqrt(ergD);

        if (ergD < 0) {
            System.out.println("Es existiert keine Lösung");
        } else if (ergD == 0) {
            System.out.println("Doppelte Nullstelle bei x = " + ergebnisX1);
            System.out.println(ergebnisX2);
        }else {
            System.out.println("x1=" + ergebnisX1);
            System.out.println("x2=" + ergebnisX2);
            System.out.println(ergD);
        }

    }
}
