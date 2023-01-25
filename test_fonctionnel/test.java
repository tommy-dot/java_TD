package test_fonctionnel;

import personnage.gaulois;
import personnage.romain;

public class test {
    public static void main(String[] args) {
        romain romain = new personnage.romain("Julius", 10);
        gaulois gaulois = new personnage.gaulois("Vercingetorix", 12);

        System.out.println("Le nom du romain est: " + romain.getNom());
        System.out.println("Le nom du Gaulois est: " + gaulois.getNom());
    }
}
