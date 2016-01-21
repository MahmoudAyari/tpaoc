package v2.Materiel;

public class Materiel {

	private static Afficheur afficheur = new AfficheurImpl();
	private static EmetteurSonore emetteurSonore = new EmetteurSonoreImpl();
	private static Molette molette = new MoletteImpl();
	//public static Horloge horloge = new HorlogeImpl();

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

	public static void setAfficheur(Afficheur afficheur) {
		Materiel.afficheur = afficheur;
	}

	public static void setEmetteurSonore(EmetteurSonore emetteurSonore) {
		Materiel.emetteurSonore = emetteurSonore;
	}

	public static void setMolette(Molette molette) {
		Materiel.molette = molette;
	}

//	public static void setHorloge(Horloge horloge) {
//		Materiel.horloge = horloge;
//	}

	
}
