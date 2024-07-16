package fr.diginamic.banque.listes;

import java.util.ArrayList;
import java.util.List;

public class TestListeString {
    public static void main(String[] args) {

        List<String> villes = new ArrayList<>();
        villes.add("Nice");
        villes.add("Carcassonne");
        villes.add("Narbonne");
        villes.add("Lyon");
        villes.add("Foix");
        villes.add("Pau");
        villes.add("Marseille");
        villes.add("Tarbes");

        // Recherche de la ville qui a le plus grand nombre de lettres

        String villeLongue = "";
        int maxLongueur = 0;
        for (String ville : villes) {
            if (ville.length() > maxLongueur) {
                maxLongueur = ville.length();
                villeLongue = ville;
            }
        }
        System.out.println("Ville qui a le plus grand nombre de lettres : " + villeLongue);

        //Mettre les noms des voilles en Majuscules

        villes.replaceAll(String::toUpperCase);
        /* Supprimer les villes qui commencent par N */
        villes.removeIf(ville -> ville.startsWith("N"));

        System.out.println("Liste de villes modifiée : " + villes);
    }
}
