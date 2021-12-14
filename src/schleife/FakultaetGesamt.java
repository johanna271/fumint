package schleife;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FakultaetGesamt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double fakultaet;

        System.out.println("Bis wohin soll die Fakultät berechnet werden?");
        int zahl = Integer.parseInt(br.readLine());

        System.out.println("Welche Schleife soll durchlaufen werden? w für While- und f für for-schleife");
        String eingabe = br.readLine();

        fakultaet = 1;
        int i = 1;

        if (eingabe.equalsIgnoreCase("f")) {
            while (i <= zahl) {
                fakultaet = fakultaet * i;
                System.out.println("Die Fakultät ist " + fakultaet);
                i = i + 1;
            }
        } else if (eingabe.equalsIgnoreCase("w")) {


        }
    }
}
