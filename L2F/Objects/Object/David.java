package Object;

public class David {
	public static void main (String[] args) {
		Teilnehmer David = new Teilnehmer();
		David.alter = 30;
		David.haarfarbe = "Schwarz";
		David.name = "David";
		David.winken();
		System.out.println("Alter ist " + David.alter);
		System.out.println("Haarfarbe ist " + David.haarfarbe);
		System.out.println("Name ist " + David.name);
	}

}
