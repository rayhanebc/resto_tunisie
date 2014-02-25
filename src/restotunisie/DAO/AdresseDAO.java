/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restotunisie.DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import restotunisie.entities.Adresse;
import restotunisie.util.MyConnection;

/**
 *
 * @author lenovo
 */
public class AdresseDAO implements AdresseDaoInterface{

    @Override
    public void createAdresse(Adresse adresse) {
        
        String requete = "insert into adresse values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
             ps.setInt(1, adresse.getId());
            ps.setString(2, adresse.getRegion());
            ps.setInt(3, adresse.getCode_Postal());
            ps.setString(4, adresse.getRue());

            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }


    }

    @Override
    public void updateAdresse(Adresse adresse) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAdresse(String label) {
        String requete = "delete from adresse where id_adr=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, label);
            ps.executeUpdate();
            System.out.println("adresse supprimée");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

    @Override
    public Adresse findAdresse(String a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Adresse> findAllAdresse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
