package package2;

import Controller.*;

public class Main {

    public static void main(String[] args) {

        Garage g = new Garage("SuperGarage");
        Employe e1 = new Employe("Jean", 30, Specialite.MECANIQUE);
        Employe e2 = new Employe("Luc", 25, Specialite.TOLERIE);

        g.ajouterEmploye(e1);
        g.ajouterEmploye2(e2);

        g.afficherEmployes();
        g.calculerChiffreAffaire();

        Mecanique mec = new Mecanique("Pierre", 5);
        mec.reparerVehicule("Peugeot 308");
        mec.setExperience(10); // erreur logique

        Tolerie t = new Tolerie();
        t.reparerVehicule(null); // cas d'erreur
        t.afficherInfos();

        AchatVente av = new AchatVente("Client X");
        av.AjouterProduit("Pneu");
        av.afficherProduits();
    }

}
