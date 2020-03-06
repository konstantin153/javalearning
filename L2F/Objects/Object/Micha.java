package Object;

public class Micha {
	public static void main (String[] args) {
		Teilnehmer Micha = new Teilnehmer();
		Micha.alter = 15;
		Micha.haarfarbe = "Blond";
		Micha.name = "Micha";
		Micha.tanzen();
		System.out.println("Alter ist " + Micha.alter);
		System.out.println("Haarfarbe ist " + Micha.haarfarbe);
		System.out.println("Name ist " + Micha.name);
	}

}
