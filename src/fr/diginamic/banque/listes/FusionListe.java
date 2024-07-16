package fr.diginamic.banque.listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {
    public static void main(String args[]) {
        List<String> liste1 = new ArrayList<>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        List<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

       //TODO Développements à réaliser ci-dessous
       //Création Liste 3
        List<String> liste3 = new ArrayList<String>();

        // Boucle pour ajouter les éléments de liste1 à liste3
        for (String element : liste1) {
            liste3.add(element);
        }

        // Boucle pour ajouter les éléments de liste2 à liste3
        for (String element : liste2) {
            liste3.add(element);
        }
       // Nouvelle liste 3
        System.out.println("Liste 3 : " + liste3);
    }

}
