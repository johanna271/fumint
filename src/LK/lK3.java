package LK;

import IO.IO;

import java.io.IOException;

public class lK3 {
    public static void main(String[] args) throws IOException {

        System.out.print("Bitte Menge in mg eingeben");
        double menge = IO.readDouble();

        System.out.print("Bitte Zerfallsrate pro Jahr in Prozent angeben");
        double zerfallsrate = IO.readDouble();

        System.out.print("Bitte Zeitspanne in Jahren eingeben");
        double zeitspanne = IO.readDouble();

        System.out.println("Jahre \t ");
    }
}
