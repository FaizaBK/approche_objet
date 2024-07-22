package fr.diginamic.banque.entites;

public abstract class Operation {

    //Les attributs d'instance
    protected String date;
    protected double montant;

    //Constrcuteur Operation
    public Operation(String date, double montant) {
        this.date = date;
        this.montant = montant;
    }

    // Getters
    public String getDate() {
        return date;
    }

    public double getMontant() {
        return montant;
    }


    public abstract String getType();

    @Override
    public String toString() {
        return "Opération{" +
                "date='" + date + '\'' +
                ", montant=" + montant +
                '}';
    }
}
