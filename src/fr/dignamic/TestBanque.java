package fr.dignamic;

import fr.dignamic.banque.entites.Compte;
import fr.dignamic.banque.entites.CompteTaux;

public class TestBanque {

    public static void main(String[] args) {
        // Création d'un tableau compte
        Compte[] comptes = new Compte[2];

        comptes[0] = new Compte("FR123456789", 1820.0);
        comptes[1] = new CompteTaux("FR987654321", 2000.0, 3.5);

        for (int i = 0; i < comptes.length; i++) {
            System.out.println(comptes[i]);
        }
    }
}