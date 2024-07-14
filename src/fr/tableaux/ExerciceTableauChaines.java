package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        // Déclaration d'un tableau de chaînes de caractères contenant 5 noms de villes
        String[] villes = {"Toulouse", "Montpellier", "Paris", "Marseille", "Bordeaux"};

        System.out.println("Villes:");
        System.out.println(villes[0]);
        System.out.println(villes[1]);
        System.out.println(villes[2]);
        System.out.println(villes[3]);
        System.out.println(villes[4]);
        System.out.println("\nLongueur du tableau : " + villes.length);

        villes[3] = "Reims";
        System.out.println("\nVilles après modification :");
        System.out.println(villes[0]);
        System.out.println(villes[1]);
        System.out.println(villes[2]);
        System.out.println(villes[3]);
        System.out.println(villes[4]);

    }
}
