package LK;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LKJohanna {
    public static void main(String[] args) throws IOException {
        double a[][], b[], x[], y[][];

        String text;
        do {
            System.out.println("Wie viele Gleichungen sollen eingelesen werden?");
            int anzahl = readInteger();

            a = new double[anzahl + 1][anzahl + 1];
            b = new double[anzahl + 1];
            x = new double[anzahl + 1];
            y = new double[anzahl + 1][anzahl + 1];

            eingabe(a, b);
            ausgabe(a, b);

            while (koeffizenten(a, b) == "j") {
                koeffizenten(a, b);
                ausgabe(a, b);
            }

            elimination(a, b);
            System.out.println(" ");
            ausgabe(a, b);

            System.out.println(" ");
            rechnungErgebniss(a, b, x);
            ausgabeErgebniss(a, b, x);
            loesungWenn(a,b);

            System.out.println("Wollen Sie das Programm wiederholen? (j = ja)");
            text = readString();

        } while (text.equalsIgnoreCase("j"));

        if (!text.equalsIgnoreCase("j")) {
            System.out.println("Schönen Tag noch!");
        }
    }

    public static Integer readInteger() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine().trim());
    }

    public static String readString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    public static Double readDouble() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(br.readLine().replace(',', '.').trim());
    }

    public static void eingabe(double a[][], double b[]) throws IOException {
        for (int i = 1; i < a.length; i++) {
            for (int k = 1; k < a[i].length; k++) {
                System.out.println("Geben sie a" + i + k + " ein");
                a[i][k] = readDouble();

            }
            System.out.println("Geben sie b" + i + " ein");
            b[i] = readDouble();
            System.out.println();
        }
    }

    private static void ausgabe(double[][] a, double[] b) {
        for (int i = 1; i < a.length; i++) {
            for (int k = 1; k < b.length; k++) {
                System.out.print(a[i][k] + " \t");
            }
            System.out.print("\t" + "|" + " " + b[i]);
            System.out.println(" ");
        }
    }

    public static void elimination(double a[][], double b[]) {
        int i;
        int j;
        int k;
        double q = 0;

        for (i = 1; i < a.length - 1; i++) {
            for (j = i + 1; j < a[i].length; j++) {
                if (a[i][i] != 0) {
                    q = -a[j][i] / a[i][i];
                    System.out.println(" ");
                    ausgabe(a, b);
                }

                for (k = i; k < a.length; k++) {
                    a[j][k] = a[j][k] + a[i][k] * q;
                }
                b[j] = b[j] + b[i] * q;
            }
        }
    }

    public static void rechnungErgebniss(double a[][], double b[], double x[]) {
        double summe;
        int i;
        int k;

        for (i = a.length - 1; i >= 1; i--) {
            summe = 0;
            for (k = i + 1; k < a[i].length; k++) {
                summe = summe + a[i][k] * x[k];
            }
            x[i] = (b[i] - summe) / a[i][i];
        }
    }

    public static void ausgabeErgebniss(double a[][], double b[], double x[]) {
        for (int i = 1; i < a.length; i++) {
            System.out.println("x" + i + "= " + x[i]);
        }
    }


    public static String koeffizenten(double a[][], double b[]) throws IOException {
        System.out.println("Sind alle Koeffizenten ok? j = ja/ o = nein");
        String text = readString();

        if (text.equalsIgnoreCase("o")) {
            System.out.println("Wollen Sie die Koeffizenten links(l) oder rechts(r) ändern?");
            String seite = readString();

            if (seite.equalsIgnoreCase("l")) {
                System.out.println("Geben Sie die Zeile und Spalte ein!");
                System.out.println("Zeile: ");
                int zeile = readInteger();

                System.out.println("Spalte: ");
                int spalte = readInteger();

                System.out.println("Neuer Wert: ");
                double neuwert = readDouble();

                a[zeile][spalte] = neuwert;


            } else if (seite.equalsIgnoreCase("r")) {
                System.out.println("Geben Sie die Zeile ein!");
                System.out.println("Zeile: ");
                int zeile = readInteger();

                System.out.println("Neuer Wert: ");
                double neuwert = readDouble();

                b[zeile] = neuwert;
            }
        }
        return text;
    }

    public static void loesungWenn(double a[][], double b[]) {
        int i = 1;
        int k;
        int j;
        int l;
        int z = 0;
        int m = 2;
        String text = " ";

        for (j = 1; j < b.length; j++) {
            for (l = 1; l < b.length; l++) {

                for (i = i ; i < m; i++) {
                    for (k = 1; k < b.length; k++) {
                        if (a[i][k] == 0) {
                            z++;
                        }
                    }
                }

                for (i = 0; i < 1; i++) {
                    if (z == 2) {
                        if (b[i] == 0) {
                            z++;
                        }
                    }

                    if (z == 3) {
                        System.out.println("Es gibt mehr Lösungen");
                    }

                }

                for(int c = 0; c < 1; c++){
                    for(int y = 0; y < 1; y++){
                        if(a[a.length - 1][a.length - 1] == 0 && b[a.length - 1] != 0){
                            text = "ja";
                        }
                    }
                }



                if(m < b.length) {
                    m++;
                    i++;
                }


            }
        }
        if(text.equalsIgnoreCase("ja")){
            System.out.println("Die Gleichung ist nicht lösbar");
        }
    }
}
