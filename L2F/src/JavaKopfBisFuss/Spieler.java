package JavaKopfBisFuss;

public class Spieler { 
	int zahl = 5; // hier kommt der Tipp rein

public void raten() {
	zahl = (int) (Math.random() * 10);
	System.out.println("Ich tippe auf die Zahl: " + zahl);
}
}