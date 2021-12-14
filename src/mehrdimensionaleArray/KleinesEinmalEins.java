package mehrdimensionaleArray;

import IO.IO;

import java.io.IOException;

public class KleinesEinmalEins {
    public static void main(String[] args) throws IOException {
        int [][] einmaleins = einmaleins();
        abfrage(einmaleins);
    }

    public static int[][] einmaleins() throws IOException {
        int zahl = 10;
        int zahl1 = 10;

        int[][] matrix = new int[zahl][zahl1];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (j+1) * (i+1);
                System.out.print(matrix[i][j] +"\t");
            }
            System.out.println();
        }
        return matrix;
    }

    public static int[][] abfrage(int[][] matrix) throws IOException {
        System.out.println();
        System.out.println("Gebe die Erste Zahl von 1-10 ein");
        int zahl = IO.readInteger();

        System.out.println("Gebe die Zweite Zahl von 1-10 ein");
        int zahl1 = IO.readInteger();

        System.out.println("Zahl 1 = " + zahl);
        System.out.println("Zahl 2 = " + zahl1);
        System.out.println();

        System.out.println(zahl + " * " + zahl1 + " = " + matrix[zahl-1][zahl1-1]);
        return matrix;
    }
}
