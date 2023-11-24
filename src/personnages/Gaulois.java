package personnages;
import village.Musee; ; 

public class Gaulois {
	private String nom;
	private int force ; 
	private int nbTrophees;
	private int effetPotion = 1;
	
	private Equipement []trophees = new Equipement[100];

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	//logger pour corriger les erreurs selon la regle S106

	public void parler(String texte) {
		//System.out.println(prendreParole() + "« " + texte + "»");
		Logger.logg(texte);
		
	}

//	private String prendreParole() {
//	return "Le gaulois " + nom + " : ";
//}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		
	}

//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
//		romain.recevoirCoup((force / 3)*effetPotion);
//	}
	public void frapper(Romain romain) {
		//System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
	
		Logger.logg(nom +" envoie un grand coup dans la mâchoire de" +romain.getNom());
		   
		
		Equipement []equipements = romain.recevoirCoup((force / 3) *
		effetPotion);
		for (int i = 0; equipements != null && i < equipements.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = trophees[i];
		}
		
	}
	public void boirPotion(int forcePotion) {
		effetPotion = forcePotion;
		if(forcePotion == 3) {
			parler("Merci Druide, je sens que ma force est 3 fois décuplée.");
		}
	}
	
	public void faireUneDonnation(Musee musee) {
		if(this.nbTrophees > 0) {
			String texte = "Je donne aux musee tous mes trophees: ";
			for(int i = 0; i < this.nbTrophees; i++) {
				texte += "\n" + this.trophees[i];
				musee.donnerTrophees(this, this.trophees[i]);
			}
			parler(texte);
		}
	}


	
	
	

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public void boirePotion(int puissance) {
		this.effetPotion = puissance;
		parler("« Merci Druide, je sens que ma force est " + puissance + "  fois décuplée");

	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix ", 8);
		//System.out.println(asterix);
		Logger.logg(asterix.toString());
		asterix.boirePotion(8);
		Romain minus = new Romain("minus", 10) ; 
		asterix.frapper(minus);

	}

}
