package VorbereitungLK4;

import IO.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestLK4 {
    public static void main(String[] args) throws IOException {
        String weiter;
        do {
            double[] zahlen = eingabeZahl();
            ausgabeZahl(zahlen);
            ausgabe(summeErmitteln(zahlen), produktErmitteln(zahlen));

            System.out.println("Wollen sie weitere berechnen? ( für ja = j) ");
            weiter = IO.readString();
        } while (weiter.equalsIgnoreCase("j"));
    }

    private static double[] eingabeZahl() throws IOException {
        System.out.println("Wie viele Zahlen wollen sie eingeben");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int zahl = Integer.parseInt(br.readLine().trim());

        double[] eingabe = new double[zahl];

        System.out.println("Geben sie die Zahlen ein");
        for (int i = 0; i < eingabe.length; i++) {
            eingabe[i] = Double.parseDouble(br.readLine().replace(',', '.').trim());
        }
        return eingabe;
    }

    private static void ausgabeZahl(double[] a) {
        System.out.println("Die Zahlen sind");
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    private static double summeErmitteln(double[] a){
        double summe = 0;
        for(int i = 0; i < a.length; i++){
            summe = summe + a[i];
        }
        return summe;
    }

    private static double produktErmitteln(double[] a) {
        double produkt = 1;
        for(int i = 0; i < a.length; i++){
            produkt = produkt * a[i];
        }
        return produkt;
    }

    public static double runden(double wert, int stellen) {
        return Math.round(wert * Math.pow(10, stellen)) / Math.pow(10, stellen);
    }

    private static void ausgabe(double summe, double produkt) {
        System.out.println("Die Summe ist: " + runden(summe, 2));
        System.out.println("Das Produkt ist: " + runden(produkt, 2));
    }
}
