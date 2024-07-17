package fr.diginamic.testenumeration;

public class TestEnumeration {

    public static void main(String[] args) {
        // Afficher toutes les saisons

        System.out.println("Toutes les saisons :");
        for (Saison saison : Saison.values()) {
            System.out.println(saison.getLibelle() + " (" + saison.getNumero() + ")");
        }

        // Retrouver et afficher le libellé de l'instance de Saison dont le nom est "ETE"

        String nom = "ETE";
        Saison saisonEte = Saison.valueOf(nom);
        System.out.println("\nLe libellé de la saison " + nom + " est : " + saisonEte.getLibelle());
    }
}
