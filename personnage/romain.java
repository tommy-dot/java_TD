package personnage;

public class romain {
    private String nom;
    private int force;

    public romain(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }
    public void parler(String txt){
        System.out.println("Le romain " + this.nom+": «"+ txt +"».");
    }
    public void recevoirCoup(int forceCoup){
        this.force = this.force - forceCoup;
        if (this.force > 0) {
            parler("Aïe !");
        } else {
            parler("J'abandonne...");
        }
    }

}


