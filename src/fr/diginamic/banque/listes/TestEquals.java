package fr.diginamic.banque.listes;

public class TestEquals {
    public static void main(String[] args) {
        // Création de deux instances de Ville avec les mêmes attributs

        Ville ville1 = new Ville("Toulouse", 500_000, Continent.EUROPE);
        Ville ville2 = new Ville("Toulouse", 500_000, Continent.EUROPE);

        // Test de la méthode equals()
        System.out.println(ville1.equals(ville2));

        ville2.getNbHabitants();

        // Test de la méthode equals() avec un attribut différent
        System.out.println(ville1.equals(ville2));

        // Test de lopérateur ==
        System.out.println(ville1 == ville2);

        // Création d'une nouvelle référence pour ville1
        Ville ville3 = ville1;

        // Test de l'opérateur == avec la même référence
        System.out.println(ville1 == ville3);
    }
}
