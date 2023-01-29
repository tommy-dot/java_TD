package personnage;

public class romain {
    private String nom;
    private int force;
    private Equipement[] equipements = new Equipement[2];
    private int nbEquipement = 0;

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
    public void displayEquipements(){
        for(int i = 0; i < nbEquipement; i++){
            System.out.println(equipements[i].getName());
        }
    }
        public void sEquiper(Equipement equipement) {
            switch (nbEquipement) {
                case 0:
                case 1:
                    if(equipements[0] != null && equipements[0].equals(equipement)) {
                        System.out.println("Le soldat " + nom + " possède déjà " + equipement.getName() + "!");
                    } else {
                        equipements[nbEquipement] = equipement;
                        nbEquipement++;
                        System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement.getName() + ".");
                    }
                    break;
                case 2:
                    System.out.println("Le soldat " + nom + " est déjà bien protégé !");
                    break;
            }
        
    
    }
}


