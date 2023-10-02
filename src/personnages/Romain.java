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
//	public void recevoirCoup(int forceCoup) {
//		assert force > 0; 
//		int t = force ; 
//		force -= forceCoup;
//		if (force > 0) {
//			parler("Aïe");
//		} else {
//			parler("J'abandonne...");
//		}
//		assert force <t ; 
//		
//	}
	
	private void prv(Equipement equipement,int position) {
		equipements[position] = equipement;
		nbEquipement ++;
		Logger.logg("Le soldat " + nom + " s'equipe d'un " + equipement + " .");
	}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2 :
			Logger.logg("Le soldat " + nom + " est deja bien proteege !");
			break;
		case 1 :
			if ((equipements[0] == equipement) || (equipements[1] == equipement)) {
				Logger.logg("Le soldat " + nom + " possede deja un " + equipement + " .");
			}
			else {
				if (equipements[0] == null) prv(equipement,0);
				else prv(equipement,1);
			}
			break;
		default :
			prv(equipement,0);
			break;
		}
	}
	
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom.toString() + "s'envole sous la force du coup.");
		//TODO
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] == null) {
				continue;
			}else {
				equipementEjecte[nbEquipementEjecte] =
				equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		}
		return equipementEjecte;
	}

			
			
			
			
	private int CalculResistanceEquipement(int forceCoup) {
		int texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (!(nbEquipement == 0)) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement;) {
				if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER)) == true) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
				i++;
			}
			texte =+ resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = CalculResistanceEquipement(forceCoup);
		force -= forceCoup;
		// if (force > 0) {
		// 	parler("Aïe");
		// } else {
		// 	equipementEjecte = ejecterEquipement();
		// 	parler("J'abandonne...");
		// }
		switch (force) {
		case 0:
			parler("Aïe");
		default:
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
			break;
			}
		// post condition la force a diminuée
		assert force < oldForce;
		return equipementEjecte;
	}
	
	public static void main (String[] args ) {
		Romain minus = new Romain("Minus" ,6); 
		System.out.println(minus.prendreParole());
		minus.parler("hyhyhyhy") ; 
		minus.recevoirCoup(8);
		System.out.println("Les équipement sont :"); 
		
//		for(Equipement equip : Equipement.values()) {
//			System.out.println("-" + equip);
//	    }
		//System.out.println(Equipement.CASQUE);
		//System.out.println(Equipement.BOUCLIER);
		System.out.println(Equipement.CASQUE.tosting());
		System.out.println(Equipement.BOUCLIER.tosting());
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}
	
}


