package histoire;
import personnages.Gaulois;
import village.Musee;
import personnages.Druide;
import personnages.Equipement;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		Gaulois obelix = new Gaulois("Obelix",10);
		Gaulois asterix = new Gaulois("Asterix",8);
		Romain minus = new Romain("Minus",6);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		panoramix.parler("Je vais aller preparer une petite potion...");
		panoramix.preparerPotion(10);
		panoramix.booster(obelix);
		obelix.parler("Par Belenos, ce n'est pas juste !");
		panoramix.booster(asterix);
		asterix.parler("Bonjour a tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		Musee musee = new Musee();
		asterix.faireUneDonnation(musee);
		System.out.println(musee.extraireInstructionsCaml());
		
	}
}
