package fr.dignamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
        // Création d'une instance de StringBuilder
        StringBuilder sb = new StringBuilder();

        // Récupération du temps de départ
        long debutMs = System.currentTimeMillis();

        // Ajout des nombres de 1 à 100 000 dans le StringBuilder
        for (int i = 1; i <= 100_000; i++) {
            sb.append(i);
        }

        // Récupération du temps de fin
        long finMs = System.currentTimeMillis();

        // Calcul du temps écoulé en millisecondes
        long tempsMs = finMs - debutMs;

        // Affichage du temps écoulé
        System.out.println(tempsMs);
    }
}

