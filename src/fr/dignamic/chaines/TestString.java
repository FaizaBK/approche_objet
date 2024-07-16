package fr.dignamic.chaines;

public class TestString {
    public static void main(String[] args) {
        // Création d'une chaîne vide
        String s = "";

        // Récupération du temps de départ
        long debutMs = System.currentTimeMillis();

        // Ajout des nombres de 1 à 100 000 dans la chaîne
        for (int i = 1; i <= 100_000; i++) {
            s += i;
        }

        // Récupération du temps de fin
        long finMs = System.currentTimeMillis();

        // Calcul du temps écoulé en millisecondes
        long tempsMs = finMs - debutMs;

        // Affichage du temps écoulé
        System.out.println(tempsMs);
    }
}
