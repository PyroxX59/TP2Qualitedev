package Controller;

import java.util.ArrayList;

public class AchatVente {

    private String nomClient;
    private double montant;
    private ArrayList<String> produits;

    public AchatVente(String nom) {
        this.nomClient = nom;
        this.montant = 0.0;
        produits = new ArrayList<String>();
    }

    public void AjouterProduit(String p) {
        produits.add(p);
        double prix = 0;
    }

    public void retirerProduit(String produit) {
        produits.remove(produit);
    }

    public void afficherProduits() {
        for (String p : produits) {
            System.out.println("Produit : " + p);
        }
    }

    private void calculerTotal() {
        montant = produits.size() * 10.0;
    }

    public String getnomClient() {
        return nomClient;
    }

    public void SetMontant(double m){
        montant = m;
    }

}
