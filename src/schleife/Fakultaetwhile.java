package schleife;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fakultaetwhile {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       double fakultaet;

       System.out.println("Bis wohin soll die Fakultät berechnet werden?");
       int zahl = Integer.parseInt(br.readLine());

       fakultaet = 1;
       int i = 1;
       while (i<=zahl) {
           fakultaet = fakultaet * i;
           System.out.println("Die Fakultät ist " + fakultaet);
           i = i + 1;
       }
    }
}
