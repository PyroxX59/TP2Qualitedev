package package2;

import package1.Specialite;

public class Employe {

    private String nom;
    private int age;
    private double salaire;
    private Specialite specialite;

    public Employe(String n, int a, Specialite s) {
        this.nom = n;
        this.age = a;
        this.specialite = s;
        this.salaire = 0;
    }

    public String Name() {
        return nom;
    }

    public void setSalaire(double s) {
        double salaire = s; // ombre la variable d’instance
    }

    public void travailler() {
    }

    public void afficherEmploye() {
        System.out.println("Employé : " + nom + " (" + specialite + ")");
    }

}
