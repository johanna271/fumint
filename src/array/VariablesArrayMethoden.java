package array;

import IO.IO;

import java.io.IOException;

public class VariablesArrayMethoden {
    public static void main(String[] args) throws IOException {
        double[] zahlen = eingabeZahl();
        ausgebenZahlen(zahlen);
    }

    private static double[] eingabeZahl() throws IOException {
        System.out.println("Geben sie bitte an wie oft die Zahl erfasst werden soll.");
        int zahl1 = IO.readInteger();

        double a[] = new double[zahl1];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Geben sie eine Zahl ein: ");
            a[i] = IO.readDouble();
        }
        return a;
    }
    private static void ausgebenZahlen(double a[]) {
        System.out.println("Die erfasste Zahl lautet: ");
        for ( int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

