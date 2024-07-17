package fr.diginamic.testenumeration;

public enum Saison {
    PRINTEMPS("Printemps", 1),
    ETE("Été", 2),
    AUTOMNE("Automne", 3),
    HIVER("Hiver", 4);

    private final String libelle;
    private final int numero;

    Saison(String libelle, int numero) {
        this.libelle = libelle;
        this.numero = numero;
    }

    public String getLibelle() {
        return libelle;
    }

    public int getNumero() {
        return numero;
    }

    public static Saison getSaison(String libelle) {
        for (Saison saison : values()) {
            if (saison.libelle.equals(libelle)) {
                return saison;
            }
        }
        throw new IllegalArgumentException("Libellé de saison invalide : " + libelle);
    }
}