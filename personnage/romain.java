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

    public int getForce() {
        return force;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setForce(int force) {
        this.force = force;
    }
}