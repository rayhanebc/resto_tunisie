/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restotunisie.DAO;

import java.util.List;
import restotunisie.entities.Utilisateur;

/**
 *
 * @author fathi
 */
public interface InterfaceUtilisateurDAO {

    public void createUtilisateur(Utilisateur u);

    public void updateUtilisateur(Utilisateur u);

    public void deleteUtilisateur(String login);

    public Utilisateur findUtilisateur(String login);

    public List<Utilisateur> displayAllUtilisateurs();
}
