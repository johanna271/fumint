package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {
    public static String readString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    public static Integer readInteger() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine().trim());
    }

    public static Double readDouble() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(br.readLine().replace(',','.').trim());
    }

    public static double[] readDoubleArray() throws IOException {
        System.out.println("Geben sie an wie oft die Zahl erfasst werden soll.");
        int zahl1 = IO.readInteger();

        double a[] = new double[zahl1];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Geben sie eine Zahl ein: ");
            a[i] = IO.readDouble();
        }
        return a;
    }
    public static void writeDoubleArray(double a[]) {
        System.out.println("Die erfasste Zahl lautet: ");
        for ( int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
