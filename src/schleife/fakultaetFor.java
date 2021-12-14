package schleife;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fakultaetFor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double fakultaet;

        System.out.println("Bis wohin soll die Fakultät berechnet werden?");
        int zahl = Integer.parseInt(br.readLine());



        for (int i = 1; i <= zahl; i++){
            fakultaet = 1;
            fakultaet = fakultaet * i;
            System.out.println("Die Fakultät ist " + fakultaet);
        }
    }
}
