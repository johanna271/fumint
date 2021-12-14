package schleife;

import IO.IO;

import java.io.IOException;

public class Bevoelkerungswachstum {
    public static void main(String[] args) throws IOException {

        String weiter;

        do {
        System.out.print("Geben sie bitte die aktuelle Populationsgröße in Milliarden an: ");
        double population = IO.readDouble();

        System.out.print("Geben sie bitte den Jährlichen Zuwachs in Prozent an: ");
        double zuwachs = IO.readDouble();

        System.out.print("Geben sie bitte die Laufzeit in Jahren an: ");
        double laufzeit = IO.readDouble();

        System.out.print("Geben sie bitte die Anzahl der Nachkommerstellen an an: ");
        double nachkommerstelle = IO.readDouble();

        System.out.println("Jahre \t Anfangspopulation \t Zuwachs \t Endpopulation");

        int jahre;
        double populationAlt = population;
            for (jahre = 1; jahre <= laufzeit; jahre++) {

                double zuwachs1 = zuwachs / 100;
                double zuwachs2 = population * zuwachs1;
                double i = Math.pow(10, nachkommerstelle);
                double zuwachsErg = Math.round(zuwachs2 * i) / i;

                double populationList = Math.round(population * i) / i;

                double endPopulation = population + zuwachsErg;
                double endPopulationErg = Math.round(endPopulation * i) / i;


                if (endPopulationErg > populationAlt * 1.2) {
                    System.out.println(jahre +"\t"+"\t"+ populationList +"\t"+"\t"+ zuwachsErg + "\t" + endPopulationErg + "*");
                    population = endPopulationErg;
                } else {

                    System.out.println(jahre +"\t"+"\t"+ populationList +"\t"+"\t"+ zuwachsErg + "\t" + endPopulationErg);
                    population = endPopulationErg;
                }
            }

            System.out.println("Wollen sie weitere Sparverträge berechnen? ( für ja = j) ");
            weiter = IO.readString();

        } while (weiter.equalsIgnoreCase("j"));
    }
}
