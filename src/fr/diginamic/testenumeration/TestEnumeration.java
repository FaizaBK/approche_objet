package fr.diginamic.testenumeration;

public class TestEnumeration {

    public static void main(String[] args) {
        // Afficher toutes les saisons

        String libelle = "Hiver";
        Saison saisonHiver = Saison.getSaison(libelle);
        System.out.println("\nLa saison correspondant au libellé \"" + libelle + "\" est : " + saisonHiver);
    }

}
