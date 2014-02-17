/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restotunisie.entities;

/**
 *
 * @author fathi
 */
public class Client extends Utilisateur {

    private String cin;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String mail;

   public Client(String cin, String nom, String prenom, String adresse, String telephone, String mail, String login, String mdp) {
        super(login, mdp);
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.mail = mail;
    }

    public String getCin() {
        return cin;
    }
     public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getMail() {
        return mail;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
     public void setCin(String cin) {
        this.cin = cin;
    }

}
