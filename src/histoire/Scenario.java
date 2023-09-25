package histoire;
import personnages.Gaulois ;
import personnages.Druide;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois gaulois1 = new Gaulois("Asterix", 8);
		Gaulois gaulois2 = new Gaulois("Obelix", 25);
		Romain romain1 = new Romain("minus", 6);
		Druide druide1 = new Druide("Panoramix",5, 10);
		//eviter d'utliser Majus dans druide1//
		System.out.println(druide1);
		druide1.parler("Je vais aller préparer une petite potion");
		druide1.preparerPotion(10);
		druide1.booster(gaulois2);
		gaulois2.boirePotion(6);
		romain1.recevoirCoup(8);
		
		
		}
}
