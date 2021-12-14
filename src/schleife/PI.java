package schleife;

import IO.IO;

import java.io.IOException;

public class PI {

    public static void main(String[] args) throws IOException {
        System.out.println("Erfassen sie die Zahl der berechneten Brüche: ");
        int n = IO.readInteger();

        int k;
        for (k = 1; k < n; k++) {

            double wert =  Math.pow(-1,k);

        }
    }
}
