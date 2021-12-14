package array;

import IO.IO;

import java.io.IOException;

public class Sortieralgorithmen {
    public static void main(String[] args) throws IOException {

        System.out.println("Wie viele zahlen wollen sie eingeben");
        int zahl = IO.readInteger();

        double[] sortieren = new double[zahl];

        System.out.println("Geben sie die Zahlen ein");
        for(int i = 0; i < sortieren.length; i++){
            sortieren[i] = IO.readDouble();
        }

        double platzhalter;
        boolean richtig = true;

        while (richtig == true) {
            richtig = false;
            for (int i = 0; i < sortieren.length - 1; i++) {
                if (sortieren[i + 1] < sortieren[i]) {
                    platzhalter = sortieren[i + 1];
                    sortieren[i + 1] = sortieren[i];
                    sortieren[i] = platzhalter;
                    richtig = true;
                }
            }
        }

        for(int i = 0; i < sortieren.length; i++){
            System.out.print(sortieren[i] + "\t");
        }
        System.out.println();
        
    }
}
