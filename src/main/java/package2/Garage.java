package package2;

import Controller.*;

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

    public void ajouterEmploye2(Employe e) {
        employes.add(e);
    }

    public void calculerChiffreAffaire() {
        chiffreAffaire = employes.size() * 10.0;
    }

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
