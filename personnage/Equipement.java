package personnage;

public enum Equipement {
    CASQUE("casque"), BOUCLIER("bouclier");

    private String name;
    private Equipement(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
