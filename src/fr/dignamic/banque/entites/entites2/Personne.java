package fr.dignamic.banque.entites.entites2;

import fr.dignamic.banque.entites.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adresse;

    public Personne(String nom, String prenom,AdressePostale adresse ) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public Personne(String marie, String jean) {
    }

    public void afficherIdentite() {
        System.out.println(prenom + " " + nom.toUpperCase());
    }
    public void modifierNom(String nouveauNom) {
        this.nom = nouveauNom;
    }
    public void modifierPrenom(String nouveauPrenom) {
        this.prenom = nouveauPrenom;
    }

    public void modifierAdresse(AdressePostale nouvelleAdresse) {

    }
    public String getNomNom() {
        return nom;
    }

    public String getPrenomPrenom() {
        return prenom;
    }

    public AdressePostale getAdresse() {
        return adresse;
    }

    public void modiferAdresse(AdressePostale adr1) {
    }
}
