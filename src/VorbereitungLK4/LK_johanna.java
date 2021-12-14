package VorbereitungLK4;

import IO.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LK_johanna {
    public static void main(String[] args) throws IOException {
        String weiter;
        do {
            double[] zahl = eingebenZahl();
            ausgabenZahl(zahl);
            ermittelnMin(zahl);
            ermittelnMax(zahl);
            berechneMittelwert(zahl);
            berechneVarianz(zahl, berechneMittelwert(zahl));
            berechneStandartabweichung(zahl, berechneVarianz(zahl, berechneMittelwert(zahl)));
            ausgabe(ermittelnMin(zahl), ermittelnMax(zahl), berechneMittelwert(zahl), berechneVarianz(zahl, berechneMittelwert(zahl)), berechneStandartabweichung(zahl, berechneVarianz(zahl, berechneMittelwert(zahl))));

            System.out.println("Soll das Programm wiederholt werden? ( für ja = j) ");
            weiter = IO.readString();
        }while (weiter.equalsIgnoreCase("j"));
    }

    private static double[] eingebenZahl() throws IOException {
        System.out.println("Wie viele Zahlen wollen sie eingeben?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int zahl = Integer.parseInt(br.readLine().trim());

        double[] eingabe = new double[zahl];

        System.out.println("Geben sie die Zahlen ein.");
        for (int i = 0; i < eingabe.length; i++) {
            int zahl1 = i + 1;
            System.out.print("Wert " + zahl1+ ": ");
            eingabe[i] = Double.parseDouble(br.readLine().replace(',', '.').trim());
        }
        return eingabe;

    }
    private static void ausgabenZahl(double[] a) {
        System.out.println("Die Zahlen sind: ");
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    private static double ermittelnMin(double[] a) {
        double minimum = a[0];

        for(int i = 0; i < a.length; i++){
            if(a[i] < minimum){
                minimum = a[i];
            }
        }
        return minimum;
    }

    private static double ermittelnMax(double[] a){
        double maximum = a[0];

        for(int i = 0; i < a.length; i++) {
            if (a[i] > maximum) {
                maximum = a[i];
            }
        }
        return maximum;
    }

    private static double berechneMittelwert(double[] a){
        double mittelwert = 0;
        double mittelwert1 = a[0];

        for(int i = 0; i < a.length; i++){
            mittelwert1 = a[i] + a[i];
        }
        mittelwert = mittelwert1 / a.length;
        return mittelwert;
    }

    private static double berechneVarianz(double[] a, double mittelwert){
        double varianz = 0;
        double x = 0;
        double x1 = 0;

        for(int i = 0; i < a.length; i++){
            x1 = Math.pow((a[i] - mittelwert),2);
            x = x1 + x1;
        }
        varianz = 1 / a.length * x;
        return varianz;
    }

    private static double berechneStandartabweichung(double[] a, double varianz){
        double standartabweichung = Math.sqrt(varianz);
        return standartabweichung;
    }

    private static double runden(double wert, int stellen) {
        return Math.round(wert * Math.pow(10, stellen)) / Math.pow(10, stellen);
    }

    private static void ausgabe(double minimum, double maximum, double mittelwert, double varianz, double standartabweichung){
        System.out.println("Das Minimum ist " + minimum);
        System.out.println("Das Maximum ist " + maximum);
        System.out.println("Der Mittelwert ist " + runden(mittelwert, 4));
        System.out.println("Die Varianz ist " + runden(varianz, 4));
        System.out.println("Die Standartabweichung ist " + runden(standartabweichung, 4));
    }
}