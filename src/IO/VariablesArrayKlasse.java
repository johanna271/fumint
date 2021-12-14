package IO;

import java.io.IOException;

public class VariablesArrayKlasse {
    public static void main(String[] args) throws IOException {
        double[] zahl = IO.readDoubleArray();
        IO.writeDoubleArray(zahl);
    }
}
