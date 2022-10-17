package personnages ; 
public class Village {
	private String nom ;
	private Chef chef;
	private Gaulois []villageois ; 
	private int nbVillageois ; 
	private int numvillageois ; 
	
	public Village(String nom) {
		this.nom = nom;
	}
	public void setChef(Chef chef , int force ) {
		this.chef = chef;
		this.force =6 ;
	}
	public String getNom() {
		return nom;
	}
	public Village (int nbVillageoisMaximum , String nom ) {
		
		this.nom = nom ; 
		Gaulois []villageois =new Gaulois [nbVillageoisMaximum] ;

	}
	public void ajouterHabitant (Gaulois gaulois ) {
		villageois[nbVillageois]=gaulois ;	
		nbVillageois=nbVillageois+1  ;
		
	}
	public void trouverHabitant (int numvillageois) {
		this.numvillageois =numvillageois ;
		
	}
	public void VillagesdesIrreductibles (Village VillagedesIrreductibles  ) {
		numvillageois =30;
			
	}
}
