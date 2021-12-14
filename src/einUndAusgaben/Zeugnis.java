package einUndAusgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zeugnis {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Geben sie ihre Note in Deutsch ein.");
		String text = br.readLine(); 
		int zahl1 = Integer.parseInt(text.trim());
		
		System.out.println("Geben sie ihre Note in Mathe ein.");
		String text1 = br.readLine();
		int zahl2 = Integer.parseInt(text1.trim());
		
		System.out.println("Geben sie ihre Note in Englisch ein.");
		String text2 = br.readLine();
		int zahl3 = Integer.parseInt(text2.trim());
		
		System.out.println("Geben sie ihre Note in Biologie ein.");
		String text3 = br.readLine();
		int zahl4 = Integer.parseInt(text3.trim());
		
		System.out.println("Geben sie ihre Note in Sport ein.");
		String text4 = br.readLine();
		int zahl5 = Integer.parseInt(text4.trim());
		
		int zwischenergebnis = zahl1 + zahl2 + zahl3 + zahl4 + zahl5;
		double ergebnis = zwischenergebnis / 5.0;
		
		System.out.println("Deine Durchschnittsnote ist " + ergebnis);
	}

}
