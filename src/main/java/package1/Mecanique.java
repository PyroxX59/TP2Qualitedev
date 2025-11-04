package package1;

public class Mecanique implements IReparation, IAction {

    private String nomMecano;
    private int anneeExperience;
    private double tauxHoraire;
    private boolean occupe; // Jamais utilisé

    public Mecanique(String nom, int exp) {
        this.nomMecano = nom;
        this.anneeExperience = exp;
        tauxHoraire = 15.5;
    }

    @Override
    public int reparerVehicule(String vehicule) {
        System.out.println("Réparation du véhicule : " + vehicule);
        // Erreur : toujours retourne 0 (mauvais indicateur)
        return 0;
    }

    @Override
    public void verifierEtat() {
        System.out.println("Vérification terminée.");
        // Rien d'autre ici
    }

    @Override
    public void ExecuterAction() {
        System.out.println("Exécution d'une action mécanique.");
    }

    @Override
    public void annuler_action() {
        // Erreur : méthode vide
    }

    @Override
    public void FaireQuelqueChoseInutile() {
        int x = 5; // Variable jamais utilisée
    }

    // Erreur de convention : devrait commencer par get
    public String Nom() {
        return nomMecano;
    }

    // Erreur de logique : setter mal implémenté
    public void setExperience(int e) {
        e = anneeExperience; // inversion des valeurs
    }

}
