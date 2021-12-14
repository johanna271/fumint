package einUndAusgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anrede {

	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Wie ist dein Vorname? ");
		String vorname = br.readLine();
		System.out.println("Wie ist dein Nachname? ");
		String nachname = br.readLine();

		System.out.println("Geben sie eine 1 für männlich. 2 für weiblich und 3 für divers. ");
		String text = br.readLine();
		int zahl = Integer.parseInt (text.trim());

		if (zahl == 1) {
			System.out.println("Hallo Herr " + nachname + " " + vorname + ".");
		} else if (zahl == 2) {
			System.out.println("Hallo Frau " + nachname + " " + vorname + ".");
		} else if (zahl == 3) {
			System.out.println("Hallo " + nachname + " " + vorname + ".");
		} else {
			System.out.println("Idiot");
		}

	}

}
