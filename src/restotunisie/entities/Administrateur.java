/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restotunisie.entities;

/**
 *
 * @author fathi
 */
public class Administrateur extends Utilisateur{

    
    
    private  int id;
    private String role;
    
    public Administrateur(int id, String role, String login, String mdp) {
        super(login, mdp);
        this.id = id;
        this.role = role;
    }
    public int getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRole(String role) {
        this.role = role;
    }

    
}
