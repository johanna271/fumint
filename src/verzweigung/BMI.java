package verzweigung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Wie viel wiegst du in KG ?");
        String text = br.readLine();
        int gewicht = Integer.parseInt(text.trim());

        System.out.println("Wie Groß bist du in in cm ?");
        int groese = Integer.parseInt(br.readLine());

        System.out.println("Bist du männlich gebe 1 ein. Bist du weiblich gebe 2 ein.");
        int geschlecht = Integer.parseInt(br.readLine());

        double groese1 = groese / 100.0;

        double bmi = gewicht / Math.pow(groese1,2);

        if (geschlecht == 1 && bmi < 20 || geschlecht == 2 && bmi < 20) {
            System.out.println("Untergewichtigt");
        } else if (geschlecht == 1 && bmi < 26 || geschlecht == 2 && bmi < 26 ) {
            System.out.println("Normalgewichtigt");
        } else if (geschlecht == 1 && bmi < 30 || geschlecht == 2 && bmi < 30) {
            System.out.println("Übergewichtig");
        } else if (geschlecht == 1 && bmi < 40 || geschlecht == 2 && bmi < 40) {
            System.out.println("Adipositas");
        } else {
            System.out.println("Starke Adipositas");
        }
    }
}
