package einUndAusgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Benutzer {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Wie ist dein Vorname? ");
		String vorname = br.readLine();
		System.out.println("Wie ist dein Nachname? ");
		String nachname = br.readLine();

		System.out.println("Hallo " + nachname + " " + vorname + ".");

	}

}
