package fr.diginamic.banque.liste;

public class TestEquals {
    public static void main(String[] args) {
        // Création de deux instances de Ville avec les mêmes attributs

        Ville ville1 = new Ville("Toulouse", 500_000);
        Ville ville2 = new Ville("Toulouse", 500_000);

        // Test de la méthode equals()
        System.out.println(ville1.equals(ville2));

        // Modification d'un attribut d'une des villes
        ville2.setNombreHabitants();

        // Test de la méthode equals() avec un attribut différent
        System.out.println(ville1.equals(ville2));

        // Test de l'opérateur ==
        System.out.println(ville1 == ville2);

        // Création d'une nouvelle référence pour ville1
        Ville ville3 = ville1;

        // Test de l'opérateur == avec la même référence
        System.out.println(ville1 == ville3);
    }
}
