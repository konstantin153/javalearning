package JavaKopfBisFuss;

public class PhrasOMat {
public static void main (String[] args) {

//Java Buch Kopf bis Zeh Seite 16

// *1* drei Wortgruppen erstellen, aus denen ausgewaehlt wird
	String[] wortListeEins = {"verlaessliche", "erfolgsorientierte", 
	"webbasierte", "allumfassende", "clevere", "kundenorientierte",
	"pfadkritische", "dynamische", "konkurenzfaehige", "verteilte",
	"zielgerichtete"};

	String[] wortListeZwei = {"gepowerte", "haftende", "Mehrwert", 
	"zentrierte", "geclusterte", "proaktive", "Out-of-the-Box",
	"positionierte", "vernetzte", "fokusierte", "kraftvolle", "geordnete",
	"geteilte", "kooperative", "beschleunigte", "Multi-Tier-",
	"Enterprise-", "B2B-", "Frontend-"};

	String[] wortListeDrei = {"Schicht", "Endstufe", "Loesung",
	"Architektur", "Kernkompetenz", "Strategie", "Kooperation", 
	"Ausrichtung", "Raeumlichkeit", "Vision", "Dimension", "Mission, Tania"};

// *2* ermitteln, wie viele Wörter sich in jeder Liste befinden
	int einsLaenge = wortListeEins.length;
	int zweiLaenge = wortListeZwei.length;
	int dreiLaenge = wortListeDrei.length;

// *3* drei Zufallszahlen generieren, um Wörter aus den Listen herauszuziehen
	int rand1 = (int) (Math.random() * einsLaenge);
	int rand2 = (int) (Math.random() * zweiLaenge);
	int rand3 = (int) (Math.random() * dreiLaenge);

// *4* eine Phrase zusammenbauen
	String phrase = wortListeEins[rand1] + " " + wortListeZwei[rand2]+ 
	wortListeDrei[rand3];

// *5* eine Phrase ausgeben
	System.out.println("Was wir brauchen, ist eine " + phrase);


	}
}