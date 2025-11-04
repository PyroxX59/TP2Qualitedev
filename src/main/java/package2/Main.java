package package2;

import package1.*;

public class Main {

    public static void main(String[] args) {

        Garage g = new Garage("SuperGarage");
        Employe e1 = new Employe("Jean", 30, Specialite.MECANIQUE);
        Employe e2 = new Employe("Luc", 25, Specialite.TOLERIE);

        g.ajouterEmploye(e1);
        g.ajouterEmployeEncore(e2); // doublon volontaire

        g.afficherEmployes();
        g.calculerChiffreAffaire();

        Mecanique mec = new Mecanique("Pierre", 5);
        mec.reparerVehicule("Peugeot 308");
        mec.setExperience(10); // erreur logique

        Tolerie t = new Tolerie();
        t.reparerVehicule(null); // cas d'erreur
        t.afficherInfos();

        Achat_Vente av = new Achat_Vente("Client X");
        av.AjouterProduit("Pneu");
        av.afficherProduits();
    }

}
