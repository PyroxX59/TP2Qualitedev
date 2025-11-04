package package1;

public class Tolerie implements IReparation {

    private double coutFixe;
    private String description;

    public Tolerie() {
        coutFixe = 100; // valeur en dur
        description = "Réparation de carrosserie";
    }

    @Override
    public int reparerVehicule(String vehicule) {
        System.out.println("Réparation de la tôle du véhicule : " + vehicule);
        if (vehicule == null) {
            // Erreur : pas de gestion correcte du cas null
            System.out.println("Erreur : véhicule invalide");
        }
        return 1; // Valeur arbitraire
    }

    @Override
    public void verifierEtat() {
        // Erreur : mauvaise logique
        if (coutFixe > 0)
            System.out.println("Tout est bon.");
        else
            System.out.println("Problème détecté.");
    }

    public void afficherInfos() {
        System.out.println("Description : " + description);
        System.out.println("Cout : " + coutFixe);
    }

}
