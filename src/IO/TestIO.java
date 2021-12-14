package IO;

import java.io.IOException;

public class TestIO {
    public static void main(String[] args) throws IOException {

        System.out.println("Geben sie ihren Namen ein");
        String text = IO.readString();
        System.out.println("Dein Name ist " + text);

    }
}
