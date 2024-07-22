package fr.diginamic.banque.entites;

public class TestOperation {
    public static void main(String[] args) {

        // Création d'un tableau d'opérations Credit Debit
        Operation[] operations = new Operation[4];

        operations[0] = new Credit("2024-07-01", 1580.0);
        operations[1] = new Credit("2024-07-02", 1200.0);
        operations[2] = new Debit("2024-07-03", 500.0);
        operations[3] = new Debit("2024-07-04", 800.0);

        //Montant global
        double montantGlobal = 0;

        // Boucle for pour afficher  d'opérations
        for (Operation operation : operations) {

            System.out.println("Date de l'opération : " + operation.getDate());
            System.out.println("Montant de l'opération : " + operation.getMontant());
            System.out.println("Type d'opération : " + operation.getType());
            System.out.println();

            // Boucle if else if pour le calcul du  montant global
            if (operation instanceof Debit) {
                montantGlobal -= operation.getMontant();
            } else if (operation instanceof Credit) {
                montantGlobal += operation.getMontant();
            }
        }

            // Afficher le montant global
        System.out.println("Montant global des opérations : " + montantGlobal);
    }
}


