package fr.diginamic.banque.listes;

import java.util.ArrayList;
import java.util.List;

public class TestContinentEnum {
    public static void main(String[] args) {

        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("New York", 8405837, Continent.AMERIQUE));
        villes.add(new Ville("Paris", 2160000, Continent.EUROPE));
        villes.add(new Ville("Pékin", 21500000, Continent.ASIE));
        villes.add(new Ville("Moscou", 12500000, Continent.EUROPE));
        villes.add(new Ville("Berlin", 6000000, Continent.EUROPE));
        villes.add(new Ville("Sydney", 5000000, Continent.OCEANIE));
        villes.add(new Ville("Sao Paulo", 22000000, Continent.AMERIQUE));
        villes.add(new Ville("Dakar", 2500000, Continent.AFRIQUE));

        // Afficher les villes avec leur continent
        for (Ville ville : villes) {
            System.out.println(ville);
        }
    }
}
