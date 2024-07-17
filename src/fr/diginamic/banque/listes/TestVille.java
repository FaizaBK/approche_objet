package fr.diginamic.banque.listes;

import java.util.ArrayList;
import java.util.List;

public class TestVille {
    public static void main(String[] args) {

        // Création de la liste de villes

        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000, Continent.AMERIQUE));
        villes.add(new Ville("Carcassonne", 47800, Continent.AMERIQUE));
        villes.add(new Ville("Narbonne", 53400, Continent.AMERIQUE));
        villes.add(new Ville("Lyon", 484000, Continent.AMERIQUE));
        villes.add(new Ville("Foix", 9700, Continent.AMERIQUE));
        villes.add(new Ville("Pau", 77200, Continent.AMERIQUE));
        villes.add(new Ville("Marseille", 850700, Continent.AMERIQUE));
        villes.add(new Ville("Tarbes", 40600, Continent.AMERIQUE));

        // chercher la ville la plus peuplée
        Ville villeMax = villes.get(0);

        for (Ville ville : villes) {
            if (ville.getNbHabitants() > villeMax.getNbHabitants()) {
                villeMax = ville;
            }
        }
        System.out.println("Ville la plus peuplée : " + villeMax);

        // Supprimer la ville la moins peuplée
        Ville villeMin = villes.get(0);
        for (Ville ville : villes) {
            if (ville.getNbHabitants() < villeMin.getNbHabitants()) {
                villeMin = ville;
            }
        }
        villes.remove(villeMin);

        // Mettre en majuscules des villes de plus de 100 000 habitants
        for (Ville ville : villes) {
            if (ville.getNbHabitants() > 100000) {
                ville.setNom(ville.getNom().toUpperCase());
            }
        }

        // Afficher la liste des villes résultante

        System.out.println("Liste des villes :");
        for (Ville ville : villes) {
            System.out.println(ville);
        }
    }
}
