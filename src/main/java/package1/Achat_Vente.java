package package1;

import java.util.ArrayList;

public class Achat_Vente {

    private String NomClient;
    private double montant;
    private ArrayList<String> produits;

    public Achat_Vente(String nom) {
        this.NomClient = nom;
        this.montant = 0; // Montant non mis à jour
        produits = new ArrayList<String>();
    }

    public void AjouterProduit(String p) {
        produits.add(p);
        // Erreur : montant non mis à jour, variable jamais utilisée
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

    // Erreur : méthode inutile
    private void calculerTotal() {
        montant = produits.size() * 10; // prix arbitraire
    }

    // Erreur : orthographe du getter
    public String getnomClient() {
        return NomClient;
    }

    // Erreur de style : nom de méthode non conforme
    public void SetMontant(double m){
        montant = m;
    }

}
