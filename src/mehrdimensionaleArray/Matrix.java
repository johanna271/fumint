package mehrdimensionaleArray;

import IO.IO;

import java.io.IOException;

public class Matrix {
    public static void main(String[] args) throws IOException {
        int[][] zahlen = eingabeint();
        ausgabeint(zahlen);

        double[][] zahlen1 = eingabeDouble();
        ausgabedouble(zahlen1);

        String[][] zahlen2 = eingabeString();
        ausgabeString(zahlen2);
    }
    public static int[][] eingabeint() throws IOException {
        System.out.println("Geben sie die Anzahl der Zeilen ein");
        int zahl = IO.readInteger();

        System.out.println("Geben sie die Anzahl der Spalten ein");
        int zahl1 = IO.readInteger();

        int[][] matrix = new int[zahl][zahl1];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Zeile" + (i+1)+ "Spalte" + (j+1)+ ": ");
                matrix[i][j] = IO.readInteger();
            }
            System.out.println();
        }
        return matrix;
    }

    public static void ausgabeint(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print("Zeile " + (i+1)+ " Spalte " + (j+1)+ ": " + matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static double[][] eingabeDouble() throws IOException{
        System.out.println("\nGeben sie die Anzahl der Zeilen ein");
        int zahl = IO.readInteger();

        System.out.println("Geben sie die Anzahl der Spalten ein");
        int zahl1 = IO.readInteger();

        double[][] matrix = new double[zahl][zahl1];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Zeile" + (i+1)+ "Spalte" + (j+1)+ ": ");
                matrix[i][j] = IO.readDouble();
            }
            System.out.println();
        }
        return matrix;
    }

    public static void ausgabedouble(double[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print("Zeile " + (i+1)+ " Spalte " + (j+1)+ ": " + matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static String[][] eingabeString() throws IOException {
        System.out.println("Geben sie die Anzahl der Zeilen ein");
        int zahl = IO.readInteger();

        System.out.println("Geben sie die Anzahl der Spalten ein");
        int zahl1 = IO.readInteger();

        String[][] matrix = new String[zahl][zahl1];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Zeile" + (i+1)+ "Spalte" + (j+1)+ ": ");
                matrix[i][j] = IO.readString();
            }
            System.out.println();
        }
        return matrix;
    }

    public static void ausgabeString(String[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print("Zeile " + (i+1)+ " Spalte " + (j+1)+ ": " + matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
