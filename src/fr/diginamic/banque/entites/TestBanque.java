package fr.diginamic.banque.entites;

public class TestBanque {
        public static void main(String[] args) {

            //Création d' un tableau de comptes
            Compte[] comptes = new Compte[2];
            comptes[0] = new Compte("FR123456789", 1800.0);
            comptes[1] = new CompteTaux("FR987654321", 2500.0, 3.5);

            //Boucle for pour afficher les informations des comptes
            for (Compte compte : comptes) {
                System.out.println(compte);
            }
        }
    }

