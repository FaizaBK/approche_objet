package fr.dignamic;

import fr.dignamic.banque.entites.Credit;
import fr.dignamic.banque.entites.Debit;
import fr.dignamic.banque.entites.Operation;

public class TestOperation {

        public static void main(String[] args) {
            // Création d'un tableau d'opérations
            Operation[] operations = new Operation[4];

            // Ajout de 2 crédits et 2 débits dans le tableau
            operations[0] = new Credit("2024-07-16", 82.0);
            operations[1] = new Debit("2024-07-17", 500.0);
            operations[2] = new Credit("2024-07-18", 150.0);
            operations[3] = new Debit("2024-07-19", 250.0);

            // Boucle sur le tableau d'opérations pour afficher les informations
            double montantGlobal = 0.0;
            for (Operation op : operations) {
                System.out.println(op.getType() + " - " + op);
                if (op instanceof Credit) {
                    montantGlobal += op.getMontant();
                } else if (op instanceof Debit) {
                    montantGlobal -= op.getMontant();
                }
            }

            System.out.println("Montant global : " + montantGlobal + " euros");
        }
    }