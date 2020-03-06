package Object;

public class Dennis {
	public static void main (String[] args) {
		Teilnehmer Dennis = new Teilnehmer();
		Dennis.alter = 16;
		Dennis.haarfarbe = "Blond";
		Dennis.name = "Dennis";
		Dennis.lachen();
		System.out.println("Alter ist " + Dennis.alter);
		System.out.println("Haarfarbe ist " + Dennis.haarfarbe);
		System.out.println("Name ist " + Dennis.name);
	}

}
