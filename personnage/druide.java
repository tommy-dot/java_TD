package personnage;
import java.util.Random;

public class druide {
  public static int FORCE_POTION_MIN = 5;
  public static int FORCE_POTION_MAX = 10;
  
  static int forcePotion;
  static int effetPotion = 1;

  public druide(int minForce, int maxForce) {
    FORCE_POTION_MIN = minForce;
    FORCE_POTION_MAX = maxForce;
    forcePotion = 0;
  }

  public void parler(String txt){
    System.out.println("Le druide "+": «"+ txt +"».");
}
public void preparerPotion() {
    Random random = new Random();
    forcePotion = random.nextInt(FORCE_POTION_MAX - FORCE_POTION_MIN + 1) + FORCE_POTION_MIN;
    
    if (forcePotion > 7) {
      System.out.println("J'ai préparé une super potion de force " + forcePotion);
    } else {
      System.out.println("Je n'ai pas trouvé tous les ingrédients ma potion est seulement de force " + forcePotion);
    }
  }
  public void booster(gaulois gaulois){
    if (gaulois.getNom().equals("obelix")){
        System.out.println("le druide dit « Non, Obélix !... Tu n’auras pas de potion magique ! »");
        System.out.println("Le gaulois"+ gaulois.getNom()+ ": « Par Bélénos, ce n'est pas juste ! ».");
    }
    else{
        gaulois.boirePotion();
        
    }
  }

  
}
