package personnage;

public class gaulois {
    private String nom;
    private int force;

    public gaulois(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }
    public void parler(String txt){
        System.out.println("Le Gaulois " + this.nom+": «"+ txt +"».");
    }
    
    public static void main(String[] args) {
        gaulois asterix = new personnage.gaulois("Astérix",8);

        System.out.println("Le nom du Gaulois est: " + asterix.getNom());
    }
}


