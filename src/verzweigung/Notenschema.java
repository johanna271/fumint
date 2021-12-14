package verzweigung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Notenschema {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Wieviel Prozent hast du erreicht? ");
        String text = br.readLine();
        int zahl = Integer.parseInt(text.trim());

        if (zahl < 27) {
            System.out.println("Deine Note ist eine 6");
        } else if (zahl < 45) {
            System.out.println("Deine Note ist eine 5");
        } else if (zahl < 59) {
            System.out.println("Deine Note ist eine 4");
        } else if (zahl < 73) {
            System.out.println("Deine Note ist eine 3");
        } else if (zahl < 85) {
            System.out.println("Deine Note ist eine 2");
        } else {
            System.out.println("Deine Note ist eine 1");
        }
    }
}
