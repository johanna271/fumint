package schleife;

import IO.IO;

import java.io.IOException;

public class Quadrat {

    public static void main(String[] args) throws IOException {

        System.out.print("Geben sie die Kantenlänge des Quadrats an: ");
        double kantenlaenge = IO.readDouble();

        int i;
        for (i = 0; i < kantenlaenge; i++) {
            System.out.print("*");
        }

        System.out.println();

        for(int j = 1; j < kantenlaenge - 1; j++) {
            System.out.print("*");
            for (i = 1; i < kantenlaenge - 1; i++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (i = 0; i < kantenlaenge; i++) {
            System.out.print("*");
        }
    }
}
