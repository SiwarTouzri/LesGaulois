package personnages;

public class Village {
	private String nom;
	private Chef chef ;
	private Gaulois []Villageois; 
	int nbVillageois ; 
	
	public Village(String nom,int nbVillageoisMax) {
		this.nom = nom;
		Villageois = new Gaulois[nbVillageoisMax] ;
	}
	public void ajouterHabitant(Gaulois gaulois  ) {
	
		Villageois[nbVillageois]= gaulois ; 
		nbVillageois ++ ;
		 
	}
	public void setChef (Chef chef) {
		this.chef = chef ; 
		
	}
	public String getNom() {
		return nom;
	}
	public Gaulois trouverHabitant(int nbV) {
		Gaulois t =Villageois[nbV] ; 
		return t ;
	}
	public void afficherVillageois () {
		System.out.println("Dans le village du chef "+ getNom()+ " vivent"
				+ "les legendaires gaulois : ");
		for (int i = 0; i < Villageois.length; i++) {
			if (Villageois[i] != null) {
				System.out.println(Villageois[i].getNom());
			}
		}
	}
	public static void main (String []args) {
		Village v1= new Village ("Village des irréductibles ", 30); 
		//Gaulois gaulois = village.trouverHabitant(30);
		Chef chef1 = new Chef ("Abraracourcix",6,v1) ;
		Gaulois g1= new Gaulois ("Asterix",8);
		v1.ajouterHabitant(g1) ;
		//Gaulois gaulois = village.trouverHabitant(1);
		v1.afficherVillageois();
		Gaulois g2 = new Gaulois ("Obleix", 25) ; 
		v1.ajouterHabitant(g2);
		v1.afficherVillageois() ;
		
		
		
		
		
		
	}
	


}
