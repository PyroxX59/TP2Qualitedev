package package2;

import package1.Specialite;

public class Employe {

    private String nom;
    private int age;
    private double salaire;
    private Specialite specialite;

    // Erreur : constructeur sans validation
    public Employe(String n, int a, Specialite s) {
        this.nom = n;
        this.age = a;
        this.specialite = s;
        this.salaire = 0;
    }

    // Getter mal nommé
    public String Name() {
        return nom;
    }

    // Setter inutile
    public void setSalaire(double s) {
        double salaire = s; // ombre la variable d’instance
    }

    // Erreur : méthode vide
    public void travailler() {
    }

    public void afficherEmploye() {
        System.out.println("Employé : " + nom + " (" + specialite + ")");
    }

}
