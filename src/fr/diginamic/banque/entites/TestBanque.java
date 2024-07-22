package fr.diginamic.banque.entites;

public class TestBanque {
        public static void main(String[] args) {

            // Création d'une instance de Compte avec un numéro et un solde
            Compte compte = new Compte("FR123456789", 1520.0);

            // Afficher l'instance créée
            System.out.println(compte);
        }
    }

