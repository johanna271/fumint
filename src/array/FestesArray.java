package array;

import IO.IO;

import java.io.IOException;

public class FestesArray {
    public static void main(String[] args) throws IOException{

        double[] zahlen = new double[5];

        for(int i = 0; i < zahlen.length; i++) {
            System.out.println("Geben sie eine Zahl ein: ");
            zahlen[i] = IO.readDouble();
        }

        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }
        double hey = 0;

        hey = Math.sqrt(36);

        System.out.println(hey);
    }
}

