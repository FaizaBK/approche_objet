package fr.algorithme;

public class AffichageSuite {
    public static void main(String[] args) {
        // Utiliser une boucle for pour afficher tous les nombres de 1 à10 inclus
        for (int i = 1; i <=10; i++) {
            System.out.println(i);
        }
      //   Utiliser une boucle for pour afficher tous les nombres pairs entre  1 et 10 inclus
        for (int i = 0; i <=10; i+=2) {
            System.out.println(i+" ");
        }

        //  Utiliser une boucle for pour afficher tous les nombres impairs entre  1 et 9 inclus
        for (int i = 1; i <10; i+=2) {
            System.out.println(i+" ");
        }
        //  Utiliser une boucle While pour afficher tous les nombres de 1 à 10 inclus
        int j=1;
        while (j<=10) {
            System.out.println(j++);
        }
    }
}
