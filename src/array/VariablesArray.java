package array;

import IO.IO;

import java.io.IOException;

public class VariablesArray {
    public static void main(String[] args) throws IOException {

        System.out.println("Geben sie an wie oft die Zahl erfasst werden soll.");
        int zahl1 = IO.readInteger();

        double[] zahlen = new double[zahl1];

        for(int i = 0; i < zahlen.length; i++) {
            System.out.println("Geben sie eine Zahl ein: ");
            zahlen[i] = IO.readDouble();
        }

        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }
    }
}
