package package1;

public interface IAction {

    // Mauvaise convention de nommage (devrait être en camelCase)
    void ExecuterAction();

    // Méthode non utilisée dans les classes concrètes
    void annuler_action();

    // Erreur : commentaire incohérent
    // Cette méthode sert à faire quelque chose... peut-être.
    void FaireQuelqueChoseInutile();

}
