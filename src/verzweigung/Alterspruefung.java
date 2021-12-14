package verzweigung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alterspruefung {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Geben sie ihr Alter an.");
        String text = br.readLine();
        int alter = Integer.parseInt(text.trim());

        if (alter < 18) {
            System.out.println("Du bist noch minderjährig!");
        } else {
            System.out.println("Sie sind volljährig!");
        }
    }
}
