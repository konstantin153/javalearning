package Object;

public class Kostja {
	public static void main (String[] args) {
		Teilnehmer Kostja = new Teilnehmer();
		Kostja.alter = 23;
		Kostja.haarfarbe = "Blond";
		Kostja.name = "Kostja";
		Kostja.huepfen();
		System.out.println("Alter ist " + Kostja.alter);
		System.out.println("Haarfarbe ist " + Kostja.haarfarbe);
		System.out.println("Name ist " + Kostja.name);
	}

}
