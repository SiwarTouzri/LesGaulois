package personnages ; 

public class Village {
	private String nom ;
	private Chef chef;
	private Gaulois[] Villageois ; 
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
		Villageois[nbVillageois++]=gaulois ;	
		nbVillageois+=1  ;
		
	}
	public void force (int force ) {
		this.force=force ; 
	}
	public Gaulois trouverHabitant (int numvillageois) {
		return Villageois[numvillageois] ;
		
	}
	public void afficherVillageois() {

        System.out.println("Dans le village du chef " + this.chef.getNom() + "Vivent les legendaires gaulois : ");
        for (int i = 0; i < nbVillageois; i++) {
            System.out.println(Villageois[i].getNom());
        }
    }
}