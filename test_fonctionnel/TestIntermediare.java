package test_fonctionnel;

import personnage.gaulois;
import personnage.romain;
import personnage.Equipement;
import personnage.druide;
public class TestIntermediare {
    public static void main(String[] args) {
        romain minus = new romain("minis",6);
        druide druide = new druide(5, 10);
        druide.parler("Je vais aller préparer une petite potion...");
        druide.preparerPotion();
        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.BOUCLIER);
        minus.sEquiper(Equipement.CASQUE);

}
}
