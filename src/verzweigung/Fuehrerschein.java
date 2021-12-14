package verzweigung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fuehrerschein {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Wie alt sind sie ?");
        String text = br.readLine();
        int alter = Integer.parseInt(text.trim());

        if (alter < 14) {
            System.out.println("Du darfst noch nicht Mofa fahren.");
        } else if (alter < 16) {
            System.out.println("Du darfst Mofa fahren, aber nicht Moped.");
        } else if (alter < 18) {
            System.out.println("Du darfst Mofa fahren, aber nicht Auto.");
        } else {
            System.out.println("Du darfst Auto fahren.");
        }
    }
}
