/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restotunisie.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import restotunisie.entities.Utilisateur;
import restotunisie.util.MyConnection;

/**
 *
 * @author fathi
 */
public class UtilisateurDAO implements InterfaceUtilisateurDAO {

    @Override
    public void createUtilisateur(Utilisateur u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateUtilisateur(Utilisateur u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteUtilisateur(String login) {
           String requete = "delete from utilisateur where login=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, login);
            ps.executeUpdate();
            System.out.println("client supprimée");
        } 
catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

    @Override
    public Utilisateur findUtilisateur(String login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Utilisateur> displayAllUtilisateurs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
