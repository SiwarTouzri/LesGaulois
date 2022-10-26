package personnages;

public class Romain {
	private String nom;
	private int force;
	private String texte ;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force= force;
	}
	
	public void parler(String texte) {
		 System.out.println(prendreParole() + "<<" + texte +">>");
	 }
	 private String prendreParole() {
		return "Le romain" + nom +" : ";
	 } 
	 
	 public Equipement[] recevoirCoup(int forceCoup) {

//		 force -= forceCoup;
//		 if (force > 0) {
//			 parler("Aie");
//		 } else { 
//			 parler("j'abondonne...");
//		 }
//	 }
	 	Equipement[] equipementEjecte = null;
	 	// précondition
	 	assert force > 0;
	 	int oldForce = force;
	 	forceCoup = CalculResistanceEquipement(forceCoup);
	 	force -= forceCoup;
	 	// if (force > 0) {
	 	// parler("Aïe");
	 	// } else {
	 	// equipementEjecte = ejecterEquipement();
	 	// parler("J'abandonne...");
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
