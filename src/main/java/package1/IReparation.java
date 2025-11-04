package package1;

// Interface mal documentée
public interface IReparation {

    // Erreur de typage potentiel : devrait retourner un booléen
    public int reparerVehicule(String vehicule);

    // Méthode jamais utilisée
    void verifierEtat();

}
