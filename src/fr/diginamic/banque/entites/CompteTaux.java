package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
    //Déclaration troisième Attribut taux remunération
    private double tauxRemuneration;

    //Constrcuteur CompteTaux
    public CompteTaux(String numero, double solde,  double tauxRemuneration) {
        super(numero, solde);
        this.tauxRemuneration = tauxRemuneration;
    }
    // Getter
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }
    // Redéfinition de la méthode toString()
    @Override
    public String toString() {
        return super.toString() +
                ", Taux de rémunération=" + tauxRemuneration + "%";
    }

}
