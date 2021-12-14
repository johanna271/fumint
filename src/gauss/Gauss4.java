package gauss;

import IO.IO;
import runden.Runden;

import java.io.IOException;

public class Gauss4 {
    public static void main(String[] args) throws IOException {
        double a[][],b[],x[];

        String text;
        do {
            System.out.println("Wie viele Gleichungen sollen eingelesen werden?");
            int anzahl = IO.readInteger();

            a = new double[anzahl + 1][anzahl + 1];
            b = new double[anzahl + 1];
            x = new double[anzahl + 1];

            eingabe(a, b);
            ausgabe(a, b);

            do {

                System.out.println("Wollen sie noch was ändern? j = ja");
                text = IO.readString();
                koeffizenten(a, b);
                ausgabe(a, b);


            }while (text.equalsIgnoreCase("j"));

            elimination(a, b);
            System.out.println(" ");
            ausgabe(a, b);

            System.out.println(" ");
            rechnungErgebniss(a, b, x);
            ausgabeErgebniss(a, b, x);

            System.out.println("Wollen Sie das Programm wiederholen? (j = ja)");
            text = IO.readString();
        }while (text.equalsIgnoreCase("j"));

        if(!text.equalsIgnoreCase("j")){
            System.out.println("Schönen Tag noch!");
        }
    }


    public static void eingabe(double a[][], double b[]) throws IOException {
        for (int i = 1; i < a.length; i++) {
            for (int k = 1; k < a[i].length; k++) {
                System.out.println("Geben sie a" + i + k + " ein");
                a[i][k] = IO.readDouble();

            }
            System.out.println("Geben sie b" + i + " ein");
            b[i] = IO.readDouble();
            System.out.println();
        }
    }

    private static void ausgabe(double[][] a, double[] b) {
        for (int i = 1; i < a.length; i++) {
            for (int k = 1; k < b.length; k++) {
                System.out.print(a[i][k] + " \t" );
            }
            System.out.print("\t" + "|" + " " + b[i]);
            System.out.println(" ");
        }
    }

    public static void elimination(double a[][], double b[]){
        int i;
        int j;
        int k;
        double q = 0;

        for(i = 1; i < a.length - 1; i++){
            for(j = i + 1; j < a[i].length; j++){
                if(a[i][i] != 0){
                    q = -a[j][i] / a[i][i];
                }

                for(k = i; k < a.length; k++){
                    a[j][k] = a[j][k] + a[i][k] * q;
                }
                b[j] = b[j] + b[i] * q;
            }
        }
    }

    public static void rechnungErgebniss(double a[][], double b[], double x[]){
        double summe;
        int i;
        int k;

        for(i = a.length - 1 ; i >= 1 ; i--){
            summe = 0;
            for(k = i + 1; k < a[i].length; k++){
                summe = summe + a[i][k]* x[k];
            }
            x[i] = (b[i] - summe) / a[i][i];
        }
    }

    public static void ausgabeErgebniss(double a[][], double b[], double x[]){
        for(int i = 1; i < a.length; i++){
            System.out.println("x" + i + "= " + x[i]);
        }
    }


    public static void koeffizenten(double a[][], double b[]) throws IOException {
        System.out.println("Sind alle Koeffizenten ok? j = ja/ o = nein");
        String text = IO.readString();

        if(text.equalsIgnoreCase("o")){
            System.out.println("Wollen Sie die Koeffizenten links(l) oder rechts(r) ändern?");
            String seite = IO.readString();

            if(seite.equalsIgnoreCase("l")) {
                System.out.println("Geben Sie die Zeile und Spalte ein!");
                System.out.println("Zeile: ");
                int zeile = IO.readInteger();

                System.out.println("Spalte: ");
                int spalte = IO.readInteger();

                System.out.println("Neuer Wert: ");
                double neuwert = IO.readDouble();

                a[zeile][spalte] = neuwert;


            } else if(seite.equalsIgnoreCase("r")){
                System.out.println("Geben Sie die Zeile ein!");
                System.out.println("Zeile: ");
                int zeile = IO.readInteger();

                System.out.println("Neuer Wert: ");
                double neuwert = IO.readDouble();

                b[zeile] = neuwert;
            }
        }
    }
}
