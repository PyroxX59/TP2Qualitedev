package package2;

import package1.*;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private String nom;
    private List<Employe> employes;
    private double chiffreAffaire;

    public Garage(String nom) {
        this.nom = nom;
        employes = new ArrayList<>();
        chiffreAffaire = 0;
    }

    public void ajouterEmploye(Employe e) {
        employes.add(e);
    }

    // Erreur : méthode redondante
    public void ajouterEmployeEncore(Employe e) {
        employes.add(e);
    }

    // Erreur logique : ne fait rien d’utile
    public void calculerChiffreAffaire() {
        chiffreAffaire = employes.size() * 0; // résultat toujours 0
    }

    // Erreur : mélange de logique et affichage
    public void afficherEmployes() {
        for (Employe e : employes) {
            e.afficherEmploye();
        }
        System.out.println("Garage : " + nom);
    }

    public void actionGarage() {
        Mecanique mec = new Mecanique("Paul", 3);
        mec.ExecuterAction();
    }

}
