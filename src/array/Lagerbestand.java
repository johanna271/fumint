package array;

import IO.IO;

import java.io.IOException;

public class Lagerbestand {
    public static void main(String[] args) throws IOException {

        System.out.println("Wie viele unterschiedlichen Artikel haben sie im Lager?");
        int zahl = IO.readInteger();

        String[] artikel  = new String[zahl];
        double[] preis = new double[zahl];
        int[] anzahl = new int[zahl];

        System.out.println("Erfassen sie die einzelnen Artikelbezeichnung: ");
        for(int i = 0; i < artikel.length; i++){
            artikel[i] = IO.readString();
        }

        System.out.println("Erfassen sie jetzt den Einzelpreis jedes Artikels: ");
        for(int i = 0; i < preis.length; i++){
            System.out.print("Preis des Artikels '" + artikel[i] + "': ");
            preis[i] = IO.readDouble();
        }

        System.out.println("Erfassen sie jetzt die Anzahl jedes Artikels: ");
        for(int i = 0; i < anzahl.length; i++){
            System.out.print("Menge des Artikels '" + artikel[i] + "': ");
            anzahl[i] = IO.readInteger();
        }

        double preiszsm = 0;
        int menge = 0;
        double preisgsm = 0;
        for(int i = 0; i < anzahl.length; i++){
            preiszsm += preis[i];
            menge += anzahl[i];
            preisgsm = preisgsm + anzahl[i] * preis[i];
        }
        System.out.println("In ihrem Lager befinden sich insgesamt " + menge + " Artikel im Wert von " + preisgsm + " Euro");
    }
}
