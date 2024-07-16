package fr.dignamic.liste;

public class Ville {
    private String nom;
    private int nombreHabitants;

    public Ville(String nom, int nombreHabitants) {
        this.nom = nom;
        this.nombreHabitants = nombreHabitants;
    }

    // Getters et setters

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) return false;
        Ville autre = (Ville) obj;
        return nombreHabitants == autre.nombreHabitants && nom.equals(autre.nom);
    }

    public void setNombreHabitants(int i) {
    }
}
