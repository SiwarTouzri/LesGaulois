package personnages;

import java.util.Random;

public class Druide {

	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " 
					+ nom +
					" et ma potion peut aller d'une force " + effetPotionMin + " à "
					+ effetPotionMax + ".");
	}

	public void preparerPotion(int effetPotionMax) {
		Random rand = new Random();
		int puissance = rand.nextInt(effetPotionMin, effetPotionMax);
		if (puissance > 7) {
			parler("J'ai préparé une super potion de force : " + puissance);
		} else {
			parler("Je n'ai pas trouvé tous les ingrédients, " + " ma potion est seulement de force : " + puissance);
		}
		setForcePotion(puissance) ;  
		

	}
	public void setForcePotion(int potion) {
		this.forcePotion = potion ; 
	}
	public int getForcePotion( ) {
		return forcePotion ; 
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	public void booster (Gaulois asterix  ) {
		if (asterix.getNom()== "Obelix" ) {
			parler("Non, Obélix !... Tu n’auras pas de potion magique ! ");
		}
		else {
			asterix.boirePotion(getForcePotion()) ; 
			
		}
			
	}
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparerPotion(9);

	}

}
