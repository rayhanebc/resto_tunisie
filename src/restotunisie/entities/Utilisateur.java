/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restotunisie.entities;

public class Utilisateur {

    protected String login;
    protected String mdp;

    public Utilisateur() {
    }
    

    public Utilisateur(String login, String mdp) {
        this.login = login;
        this.mdp = mdp;
    }
    
     public String getLogin() {
        return login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

   
}
