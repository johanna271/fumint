package array;

import IO.IO;

import java.io.IOException;

public class Verdoppeln {
    public static void main(String[] args) throws IOException {

        System.out.print("Wie viele Werte möchten sie eingeben?: ");
        int zahl1 = IO.readInteger();

        double zahlen[] = new double[zahl1];

        System.out.println("Bitte geben sie ein Array aus Kommazahlen ein:");

        int i;
        for (i = 0; i < zahlen.length; i++) {
            int zahl = i + 1;
            System.out.print("Wert" + zahl + ":");
            zahlen[i] = IO.readDouble();
        }

        System.out.println("");

        System.out.println("Ursprüngliches Array:");
        for (i = 0; i < zahlen.length; i++) {
            int zahl2 = i + 1;
            System.out.println("Wert" +zahl2+ ": " +zahlen[i]);
        }

        System.out.println("");

        System.out.println("Verdoppeltes Array:");
        for (i = 0; i < zahlen.length; i++) {
            int zahl3 = i + 1;
            double verdoppelt = zahlen[i] * 2;
            System.out.println("Wert" +zahl3+ ": " +verdoppelt);
        }
    }
}
