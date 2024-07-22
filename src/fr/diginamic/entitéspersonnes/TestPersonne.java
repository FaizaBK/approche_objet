package fr.diginamic.entitéspersonnes;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adr1 = new AdressePostale(29, "Bd delEurope", 31700, "Blagnac");
        AdressePostale adr2 = new AdressePostale(2, "Rue Thiers", 54400, "Longwy");

        Personne personne1 = new Personne("Marie", "Jean");
        personne1.modiferAdresse(adr1);
        Personne personne2 = new Personne("Marc", "Julie");
        personne2.modiferAdresse(adr2);


        personne1.afficherIdentite();
        personne2.afficherIdentite();

        personne1.modifierAdresse(adr1);
        personne2.modifierAdresse(adr2);

    }

}
