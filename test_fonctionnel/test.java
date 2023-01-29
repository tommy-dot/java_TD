package test_fonctionnel;

import personnage.gaulois;
import personnage.romain;

public class test {
    public static void main(String[] args) {
        gaulois asterix = new gaulois("Astérix",8);
        romain minus = new romain("minis",6);
        System.out.println("Le nom du Gaulois est: " + asterix.getNom());
        asterix.parler("Bonjour à tous");
        minus.parler("UN GAU… UN GAUGAU…");

        for (int i = 0; i < 3; i++) {
            asterix.Frapper(minus);
        }
    }
}
