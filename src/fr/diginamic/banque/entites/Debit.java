package fr.diginamic.banque.entites;

public class Debit extends Operation{

    //Constructeur Debit
    public Debit(String date, double montant) {
        super(date, montant);
    }


    @Override
    public String getType() {
        return "Debit";
    }

    @Override
    public String toString() {
        return "Debit{" +
                "date='" + date + '\'' +
                ", montant=" + montant +
                '}';
    }
}
