package Controller;

import package2.IAction;
import package2.IReparation;

public class Mecanique implements IReparation, IAction {

    private String nomMecano;
    private int anneeExperience;
    private double tauxHoraire;
    private boolean occupe;

    public Mecanique(String nom, int exp) {
        this.nomMecano = nom;
        this.anneeExperience = exp;
        tauxHoraire = 15.5;
    }

    @Override
    public int reparerVehicule(String vehicule) {
        System.out.println("Réparation du véhicule : " + vehicule);
        return 0;
    }

    @Override
    public void verifierEtat() {
        System.out.println("Vérification terminée.");
    }

    @Override
    public void ExecuterAction() {
        System.out.println("Exécution d'une action mécanique.");
    }

    @Override
    public void annuler_action() {
    }

    @Override
    public void FaireQuelqueChoseInutile() {
        int x = 5;
    }

    public String Nom() {
        return nomMecano;
    }

    public void setExperience(int e) {
        anneeExperience = e;
    }

}
