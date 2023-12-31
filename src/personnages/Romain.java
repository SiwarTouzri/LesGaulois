package personnages;

public class Romain {
    private String nom;
    private int force>0;
    private String texte;
    public Romain (String nom, int force) {
        this.nom = nom;
        this.force = force;
    }
    public void recevoirCoup(int forceCoup) {
        while (force >0){
            force -= forceCoup;
            if (force > 0) {
                parler("A�e !");
            } else {
                parler("J'abandonne...");
            }
            system.out.println(force);

        }
       
    }
    public Equipement[] recevoirCoup(int forceCoup) {
        Equipement[] equipementEjecte = null;
        // pr�condition
        assert force > 0;
        int oldForce = force;
        forceCoup = CalculResistanceEquipement(forceCoup);
        force -= forceCoup;
        // if (force > 0) {
            // parler("A�e");
        // } else {
            // equipementEjecte = ejecterEquipement();
            // parler("J'abandonne...");
        // }
        switch (force) {
        case 0:
            parler("A�e");
        }
        default:
            equipementEjecte = ejecterEquipement();
            parler("J'abandonne...");
            break;
        }
        // post condition la force a diminu�e
        assert force < oldForce;
        return equipementEjecte;
    private int CalculResistanceEquipement(int forceCoup) {
        texte = "Ma force est de " + this.force + ", et la force du
        coup est de " + forceCoup;
        int resistanceEquipement = 0;
        if (!(nbEquipement == 0)) {
        texte += "\nMais heureusement, grace � mon �quipement sa
        force est diminu� de ";
        for (int i = 0; i < nbEquipement;) {
            if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER)) == true) {
                resistanceEquipement += 8;
        }   else {
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
    private Equipement[] ejecterEquipement() {
        Equipement[] equipementEjecte = new Equipement[nbEquipement];
        System.out.println("L'�quipement de " + nom.toString() + "
        s'envole sous la force du coup.");
        //TODO
        int nbEquipementEjecte = 0;
        for (int i = 0; i < nbEquipement; i++) {
            if (equipements[i] == null) {
                continue;
            } else {
                equipementEjecte[nbEquipementEjecte] =
                equipements[i];
                nbEquipementEjecte++;
                equipements[i] = null;
            }
        }
        return equipementEjecte;
    }
}
