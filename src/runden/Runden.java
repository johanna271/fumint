package runden;

public class Runden {
    public static double runden(double wert) {
        return Math.round(wert * 100) / 100.0;

    }

    public static double runden(double wert, int stellen) {
        return Math.round(wert * Math.pow(10, stellen)) / Math.pow(10, stellen);

    }
}