package array;

import IO.IO;

import java.io.IOException;

public class Maxima {
    public static void main(String[] args) throws IOException {

        System.out.println("Wie viele Werte wollen sie eingeben ?");
        int zahl = IO.readInteger();

        double ganzzahlen[] = new double[zahl];

        System.out.println("Bitte geben sie ein Array ein:");

        int i;
        for(i = 0; i < ganzzahlen.length; i++) {
            int zahl1 = i + 1;
            System.out.print("Wert" + zahl1 + ": ");
            ganzzahlen[i] = IO.readDouble();
        }

        double maximum = ganzzahlen[0];
        double maximum1 = ganzzahlen[0];
        double zweitGroeste = ganzzahlen[0];

        for(i = 0; i < ganzzahlen.length; i++) {
            if (ganzzahlen[i] > maximum1) {
                maximum1 = ganzzahlen[i];
            }
        }

        for(i = 0; i < ganzzahlen.length; i++) {
            if(ganzzahlen[i] > maximum && ganzzahlen[i] < maximum1){
               zweitGroeste = ganzzahlen[i];
            }
        }
        System.out.println("Zweitgrößte Zahl: " + zweitGroeste);
        System.out.println("Größte Zahl: " + maximum1);
    }
}

