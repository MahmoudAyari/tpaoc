package fr.istic.aoc.Materiel;

public class Materiel {

	private static Afficheur afficheur = new AfficheurImpl();
	private static EmetteurSonore emetteurSonore = new EmetteurSonoreImpl();
	private static Molette molette = new MoletteImpl();
//	public static Horloge horloge = new HorlogeImpl();
//
//	public static Horloge getHorloge() {
//		// TODO Auto-generated method stub
//		return horloge;
//	}

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
