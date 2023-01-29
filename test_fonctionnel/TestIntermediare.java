package test_fonctionnel;

import personnage.gaulois;
import personnage.romain;
import personnage.Equipement;
public class TestIntermediare {
    public static void main(String[] args) {
        romain minus = new romain("minis",6);
        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.BOUCLIER);
        minus.sEquiper(Equipement.CASQUE);
}
}
