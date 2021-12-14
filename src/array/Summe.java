package array;

import IO.IO;

import java.io.IOException;

public class Summe {
    public static void main(String[] args) throws IOException {

        System.out.println("Wie viele Werte wollen sie eingeben");
        int zahl = IO.readInteger();

        int ganzzahlen[] = new int[zahl];

        System.out.println("Bitte geben sie ein Array aus Kommazahlen ein:");

        int i;
        for(i = 0; i < ganzzahlen.length; i++) {
            int zahl1 = i + 1;
            System.out.print("Wert" + zahl1 + ": ");
            ganzzahlen[i] = IO.readInteger();
        }

        System.out.println("\nGerade Zahlen");

        int anzahlGanz = 0;
        int summeGerade = 0;
        for(i = 0; i < ganzzahlen.length;i++) {
            if(ganzzahlen[i] % 2 == 0) {
                anzahlGanz++;
                summeGerade = summeGerade + ganzzahlen[i];
            }
        }
        System.out.println("Anzahl: " + anzahlGanz);
        System.out.println("Summe: " + summeGerade);

        System.out.println("\nUngerade Zahlen");

        int anzahlUngerade = 0;
        int summeUngerade = 0;
        for(i = 0; i < ganzzahlen.length;i++) {
            if(ganzzahlen[i] % 2 == 1) {
                anzahlUngerade++;
                summeUngerade = summeUngerade + ganzzahlen[i];
            }
        }
        System.out.println("Anzahl: " + anzahlUngerade);
        System.out.println("Summe: " +summeUngerade);
    }
}
