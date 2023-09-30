package personnages;

public class Romain {
	private String nom;
	private int force ;
	private Equipement []equipements = new Equipement [2];
	private int nbEquipement =0;
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force  = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		assert force > 0; 
		int t = force ; 
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert force <t ; 
		
	}
	private void prv(Equipement equipement,int position) {
		equipements[position] = equipement;
		nbEquipement ++;
		System.out.println("Le soldat " + nom + " s'equipe d'un " + equipement + " .");
	}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2 :
			System.out.println("Le soldat " + nom + " est deja bien proteege !");
			break;
		case 1 :
			if ((equipements[0] == equipement) || (equipements[1] == equipement)) {
				System.out.println("Le soldat " + nom + " possede deja un " + equipement + " .");
			}
			else {
				if (equipements[0] == null) prv(equipement,0);
				else prv(equipement,1);
			}
			break;
		case 0 :
			prv(equipement,0);
			break;
		}
	}
	
	public static void main (String[] args ) {
		Romain minus = new Romain("Minus" ,6); 
		System.out.println(minus.prendreParole());
		minus.parler("hyhyhyhy") ; 
		minus.recevoirCoup(8);
		System.out.println("Les équipement sont :"); 
		
		for(Equipement equip : Equipement.values()) {
			System.out.println("-" + equip);
	    }
		//System.out.println(Equipement.CASQUE);
		//System.out.println(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}
	
}


