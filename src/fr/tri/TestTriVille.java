package fr.tri;

import java.util.ArrayList;
import java.util.List;

public class TestTriVille {

    private static TestTriVille Collections;

    public static void main(String[] args) {

        // Création de l'ArrayList et ajout des villes
        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        // Afficher la liste non triée
        System.out.println("Liste des villes avant le tri :");

        for (Ville ville : villes) {
            System.out.println(ville);
        }

        // Trier  la lise

        Collections.sort(villes);

        // Affichage de la liste triée
        System.out.println("\nListe des villes après le tri alphabétique :");
        for (Ville ville : villes) {
            System.out.println(ville);
        }
    }

    private static void sort(List<Ville> villes) {
    }
}

