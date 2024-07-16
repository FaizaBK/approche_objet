package fr.dignamic.banque.entites;

public class TestAdressPostale {

    public static void main(String[] args) {

        AdressePostale adr1 = new AdressePostale(29, "Bd delEurope", 31700, "Blagnac");
        AdressePostale adr2 = new AdressePostale(2, "Rue Thiers", 54400, "Longwy");

        System.out.println("Adresse 1 : " + adr1.numRue + " " + adr1.libelleRue + ", " + adr1.codePostale + " " + adr1.ville);
        System.out.println("Adresse 2 : " + adr2.numRue + " " + adr2.libelleRue + ", " + adr2.codePostale + " " + adr2.ville);
    }

}