package test_fonctionnel;

import personnage.gaulois;
import personnage.romain;
import personnage.druide;

public class test {
    public static void main(String[] args) {
        gaulois asterix = new gaulois("Astérix",8);
        gaulois obelix = new gaulois("obelix",8);
        romain minus = new romain("minis",6);
        druide druide = new druide(5, 10);
        druide.booster(asterix);
        druide.booster(obelix);
        System.out.println("Le nom du Gaulois est: " + asterix.getNom());
        asterix.parler("Bonjour à tous");
        minus.parler("UN GAU… UN GAUGAU…");

        for (int i = 0; i < 3; i++) {
            asterix.Frapper(minus);
        }
    }
}
