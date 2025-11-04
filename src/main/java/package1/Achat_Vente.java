package package1;

import java.util.ArrayList;

public class Achat_Vente {

    private String NomClient;
    private double montant;
    private ArrayList<String> produits;

    public Achat_Vente(String nom) {
        this.NomClient = nom;
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
        montant = produits.size() * 10;
    }

    public String getnomClient() {
        return NomClient;
    }

    public void SetMontant(double m){
        montant = m;
    }

}
