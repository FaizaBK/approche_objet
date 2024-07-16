package fr.dignamic.banque.entites;

public class Compte {
    private String numeroCompte;
    private double solde;

    public Compte(String numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

  // Getters
    String getNumeroCompte() {
    return this.numeroCompte;
}

    public double getSolde() {
        return this.solde;
    }

    // Setter pour le solde (si besoin)
    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte numéro : " + this.numeroCompte + ", Solde : " + this.solde + " euros";
    }
}