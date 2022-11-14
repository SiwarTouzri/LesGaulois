package histoire;

public class Humain {
    private String nom ;
    protected int nbConnaissance ;
    private int argent ;
    private String boissonFavorite ; 
    public Humain(String nom , String boisson , int qargent ){
        this.nom = nom ;
        this.boisson = boisson ;
        this.argent = qargent ;
    }
    public String getNom () {
    	return nom ; 
    }
    public int getArgent() {
    	return argent ;
    }
    private String prendreParole() {
        return "Le gaulois " + nom + " : ";
        }
   
    protected String parler(String texte){
        return prendreParole() + " "+ texte + " ";
    }
    public String getNom( ){
        return nom ;
    }
    /*public String getboisson() {
        return boisson;
    }*/
   
    public int getArgent(){
        return argent ;
    }
    public void direBonjour (){
     
        System.out.println( parler("Bonjour ! Je m'appelle ")+getNom()+ " et j'aime boire du " +boisson); ;

    }
    
    public void faireConnaissanceAvec(Humain Humain) {
    	
    }
    public void listerConnaissance() {
    	
    	
    }
    public void boire(){
        System.out.println( parler("Mmmmmm , un bon verre de " )+ boisson +"!GLOUPS ! ");
       

    }
   
   
    /*public void setargent(int argent) {
        this.argent = argent;
    }*/
    protected int gagnerArgent(int gain){
        int x=getArgent();
        return argent=x+gain;
    }
   
    protected int perdreArgent(int perte ){
        int x=getArgent();
        return argent=x-perte;
    }
   
    public void acheter(String bien , int prix ){
        if(getArgent()>prix) {
            System.out.println( parler("j'ai ")+getArgent()+"sous en poche .Je vais m'offrir un "+ bien + " à "+ prix +" sous");
            perdreArgent(prix);
        }
        else if(getArgent()<prix) {
            System.out.println(parler("je n'ai plus que")+getArgent()+"sous en poche.Je ne peux meme pas m'offrir un "+bien+" à "+prix+" sous");
        }
       
    }
   

}
