package fr.diginamic.banque.entites;

public class Compte {

    private String numero;
    private double solde;

      //Constructeur
        public Compte(String numero, double solde) {
            this.numero = numero;
            this.solde = solde;
        }

        // Getters et setters
        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public double getSolde() {
            return solde;
        }
        public void setSolde(double solde) {
            this.solde = solde;
        }

        // méthode toString
    @Override
    public String toString() {
        return "Numéro de compte: " + numero + ", Solde: " + solde;
    }
    }

