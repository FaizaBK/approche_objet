package fr.diginamic.banque.listes;

public class Ville {
    private String nom;
    private int nbHabitants;

    public Ville(String nom, int nombreHabitants) {
        this.nom = nom;
        this.nbHabitants = nombreHabitants;
    }
    // Les getters et setters
    // get nom de la ville
    public String getNom() {
        return nom;
    }
    // get le nombre des habitants
    public int getNbHabitants() {
        return nbHabitants;
    }
    // modifier le nom de ville si besoin
    public void setNom(String upperCase) {

    }

    @Override
    public String toString() {
        return nom + " (" + nbHabitants + " habitants)";
    }
}
