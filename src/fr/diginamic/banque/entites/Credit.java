package fr.diginamic.banque.entites;

public class Credit extends Operation {

    //Constructeur Credit
    public Credit(String date, double montant) {
        super(date, montant);
    }

    @Override
    public String getType() {
        return "Crédit";
    }

    // Redéfinition de la méthode toString()
    @Override
    public String toString() {
        return "Credit{" +
                "date='" + date + '\'' +
                ", montant=" + montant +
                '}';
    }
}
