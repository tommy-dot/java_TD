package personnage;

public class TestVisibilite {
    public static void main(String[] args) {
        gaulois asterix = new personnage.gaulois("Astérix",8);

        System.out.println("Le nom du Gaulois est: " + asterix.getNom());
    }
}
