package fr.diginamic.banque.listes;

public class Ville {
    private String nom;
    private int nbHabitants;

    public Ville(String nom, int nombreHabitants) {
        this.nom = nom;
        this.nbHabitants = nombreHabitants;
    }

    public String getNom() {
        return nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

}
