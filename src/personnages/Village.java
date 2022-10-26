package personnages ; 

public class Village {
	private String nom ;
	private Chef chef;
	private Gaulois []villageois ; 
	private int nbVillageois ; 
	private int numvillageois ; 
	private int numHabitant ;
	private Gaulois Abraracourcix ;
	private Gaulois Asterix ; 
	private int force ;
	
	public Village (String nom) {
		this.nom = nom;
	}
	public void setChef(Chef chef  ) {
		this.chef = chef;
		
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
		nbVillageois+=1  ;
		
	}
	public void force (int force ) {
		this.force=force ; 
	}
	public void trouverHabitant (int numvillageois) {
		this.numvillageois =numvillageois ;
		
	}
	public static void VillagesdesIrreductibles (Village VillagedesIrreductibles  ) {
		int numvillageois =30;
		Chef Abraracourcix = new setChef ;
		Abraracourcix = new force (8) ;
		
		
		
		
		
		
	}
}
