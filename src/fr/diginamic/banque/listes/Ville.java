package fr.diginamic.banque.listes;

public class Ville {
    private String nom;
    private int nbHabitants;
    private Continent continent;

    public Ville (String nom, int nbHabitants, Continent continent) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.continent = continent;
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
    // get nom du contient

    public Continent getContinent() {
        return continent;
    }

    // modifier le nom de ville si besoin
    public void setNom(String upperCase) {

    }

    @Override
    public String toString() {
        return nom + " (" + nbHabitants + " habitants) - " + continent.getLibelle();
    }
}
