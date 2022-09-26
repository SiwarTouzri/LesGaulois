package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion =1;
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	public int getEffetPotion() {
		return effetPotion;
	}
	public void setEffetPotion(int effetPotion) {
		this.effetPotion = effetPotion;
	}
	public Gaulois(String nom, int force, int effetPotion) {
		super();
		this.nom = nom;
		this.force = force;
		this.effetPotion = effetPotion;
	}
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

}
