package gauss;

import IO.IO;

import java.io.IOException;

public class Gauss1 {
    public static void main(String[] args) throws IOException {
        double a[][], b[];

        System.out.println("Wie viele Gleichungen sollen eingelesen werden?");
        int anzahl = IO.readInteger();

        a = new double[anzahl + 1][anzahl + 1];
        b = new double[anzahl + 1];

        for (int i = 1; i < a.length; i++) {
            for (int k = 1; k < a[i].length; k++) {
                System.out.println("Geben sie a" + i + k  + " ein");
                a[i][k] = IO.readDouble();

            }
            System.out.println("Geben sie b" + i+ " ein");
            b[i] = IO.readDouble();
            System.out.println();
        }
        for (int i = 1; i < a.length; i++) {
            for (int k = 1; k < b.length; k++) {
                System.out.print(a[i][k] + "\t" + "\t");
            }
            System.out.print("| " + "" + b[i]);
            System.out.println();
        }
    }
}