package schleife;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eingabe{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int weiter;
        do {
            System.out.println("Geben sie Zahl 1 an");
            String text = br.readLine();
            double zahl1 = Double.parseDouble(text.trim().replace(',', '.'));

            System.out.println("Geben sie Zahl 2 an");
            String text1 = br.readLine();
            double zahl2 = Double.parseDouble(text1.trim().replace(',', '.'));

            double summe = zahl1 + zahl2;
            double differenz = zahl1 - zahl2;
            double produkt = zahl1 * zahl2;
            double quotient = zahl1 / zahl2;
            double potenz = Math.pow(zahl1, zahl2);

            System.out.println(zahl1 + " + " + zahl2 + " = " + summe);
            System.out.println(zahl1 + " - " + zahl2 + " = " + differenz);
            System.out.println(zahl1 + " * " + zahl2 + " = " + produkt);
            System.out.println(zahl1 + " / " + zahl2 + " = " + quotient);
            System.out.println(zahl1 + " hoch " + zahl2 + " = " + potenz);

            System.out.println("Soll das Programm wiederholt werden (1= ja)");
            weiter = Integer.parseInt(br.readLine());
        }while (weiter==1);

    }
}



