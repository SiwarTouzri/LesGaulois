package personnages;

public enum Equipement  {
	
	CASQUE("casque"), BOUCLIER("bouclier") ;
	
	private String nom ;
	
	private Equipement (String nom) {
		this.nom = nom ; 
	}
	public String tosting() {
		System.out.println("DEBUG");
		return nom ; 
	}
	
}

	

