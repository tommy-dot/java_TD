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
    public void Frapper(romain romain) {
        System.out.println(this.nom+" envoie un grand coup à "+romain.getNom());
        int force = this.force/3;
        romain.recevoirCoup(force);
    }
}

