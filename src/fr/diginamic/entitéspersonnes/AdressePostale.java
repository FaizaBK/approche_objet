package fr.diginamic.entitéspersonnes;

public class AdressePostale {

    public String numeroRue;
    int numRue;
    String libelleRue;
    int codePostale;
    String ville;

    public AdressePostale(int numRue, String libelleRue, int codePostale, String ville) {
        this.numRue = numRue;
        this.libelleRue = libelleRue;
        this.codePostale = codePostale;
        this.ville = ville;
    }
}
