package fr.istic.aoc.Materiel;

public class Materiel {

	public static Afficheur afficheur = new AfficheurImpl();
	public static EmetteurSonore emetteurSonore = new EmetteurSonoreImpl();
	public static Molette molette = new MoletteImpl();
	public static Horloge horloge = new HorlogeImpl();

	public static Horloge getHorloge() {
		// TODO Auto-generated method stub
		return horloge;
	}

	public static Molette getMolette() {
		// TODO Auto-generated method stub
		return molette;
	}

	public static EmetteurSonore getEmetteurSonore() {
		// TODO Auto-generated method stub
		return emetteurSonore;
	}

	public static Afficheur getAfficheur() {
		// TODO Auto-generated method stub
		return afficheur;
	}

}
