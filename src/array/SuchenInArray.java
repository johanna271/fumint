package array;

import IO.IO;

import java.io.IOException;

public class SuchenInArray {
    public static void main(String[] args) throws IOException {

        double zahl[] = new double[5];

        System.out.println("Bitte geben sie ein Array bestehend aus 5 Kommerzahlen an.");

        int i;
        for (i = 0; i < zahl.length; i++) {
            int zahl1 = i + 1;
            System.out.print("Wert " + zahl1 + ": ");
            zahl[i] = IO.readDouble();
        }

        System.out.println("Nach welcher Zahl wollen sie suchen");
        double gesuchteZahl = IO.readDouble();

        for (i = 0; i < zahl.length; i++) {
            if (zahl[i] == gesuchteZahl) {
                System.out.println("Treffer");
            } else {
                System.out.println("Niete");
            }
        }
    }
}
