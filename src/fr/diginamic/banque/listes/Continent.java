package fr.diginamic.banque.listes;

public enum Continent {

    AFRIQUE("Afrique"),
    AMERIQUE("Amérique"),
    ASIE("Asie"),
    EUROPE("Europe"),
    OCEANIE("Océanie");

    private final String libelle;

    Continent(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }
}
