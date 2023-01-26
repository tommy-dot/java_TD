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
}
