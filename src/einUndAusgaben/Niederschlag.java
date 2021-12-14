package einUndAusgaben;

public class Niederschlag {

	public static void main(String[] args) {
		
		int april;
		int mai;
		int juni;
		int niederschlag;
		double durchschnittlicherNiederschlag;
		
		april = 12;
		mai = 14;
		juni = 8;
		niederschlag = april + mai + juni;
		durchschnittlicherNiederschlag = niederschlag / 3.0;
		
		System.out.println("Niederschlag im April: " + april);
		System.out.println("Niederschlag im Mai: " + mai);
		System.out.println("Niederschlag im Juni: " + juni);
		System.out.println("Gesamter Niederschlag: " + niederschlag);
		System.out.println("Durchschnitt des Niederschlags: " + durchschnittlicherNiederschlag);
	}

}
