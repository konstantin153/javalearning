package JavaKopfBisFuss;

public class Ratespiel {
	Spieler s1;
	Spieler s2;
	Spieler s3;

	public void starteSpiel() {

	s1 = new Spieler();
	s2 = new Spieler();
	s3 = new Spieler();

	int tipp1 = 0;
	int tipp2 = 0;
	int tipp3 = 0;

	boolean s1hatRecht = false;
	boolean s2hatRecht = false;
	boolean s3hatRecht = false;

	int zielZahl = (int) (Math.random() * 10);
	System.out.println("Ich denke mir eine Zahl zwischen 0 und 9 aus ...");

	while (true) {
	System.out.println("Die zu ratende Zahl ist " + zielZahl);

	s1.raten();
	s2.raten();
	s3.raten();

	tipp1 = s1.zahl;
	System.out.println("Spieler eins tippte " + tipp1);
	
	tipp2 = s2.zahl;
	System.out.println("Spieler zwei tippte " + tipp2);

	tipp3 = s3.zahl;
	System.out.println("Spieler drei tippte " + tipp3);
	
	if (tipp1 == zielZahl) {
	s1hatRecht = true;
	}
	if (tipp2 == zielZahl) {
	s2hatRecht = true;
	}
	if (tipp3 == zielZahl) {
	s3hatRecht = true;
	}

	if(s1hatRecht || s2hatRecht || s3hatRecht) {

	System.out.println("Wir haben einen Gewinner!");
	System.out.println("Spieler eins hat richtig geraten? " + s1hatRecht);
	System.out.println("Spieler zwei hat richtig geraten? " + s2hatRecht);
	System.out.println("Spieler drei hat richtig geraten? " + s3hatRecht);
	System.out.println("Das Spiel ist aus.");
	break; //Aus der Schleife ausbrechen.

	}else{
	//wir müssen weitermachen weil keiner das Spiel gewonnen hat!
	System.out.println("Die Spieler müssen es erneut versuchen.");

	}//if/else Ende
	}//Schleifenende
	}//Methodenende
	}//Klassenende