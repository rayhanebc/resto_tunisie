/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restotunisie.DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import restotunisie.entities.Adresse;
import restotunisie.entities.Restaurateur;
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
    public Adresse findAdresseByRegion(String reg) {

     Adresse adr = new Adresse();
   
        String requete = "select * from adresse a join restaurateur r on r.id_resto = a.id_resto where region=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, reg);
            ResultSet resultat = ps.executeQuery(); 
            while (resultat.next()) {
                adr.setRegion(resultat.getString(2));
                adr.setCode_Postal(resultat.getInt(3));
                adr.setRue(resultat.getString(4));
             
            }
            return adr;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche de l'adresse By region" + ex.getMessage());
            return null;
        }}

    

    @Override
    public Adresse findAdresseByCodePostal(String codP) {
        Adresse adr = new Adresse();
        String requete = "select * from adresse where code_postal= ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, codP);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                adr.setRegion(resultat.getString(2));
                adr.setCode_Postal(resultat.getInt(3));
                adr.setRue(resultat.getString(4));
                
             
            }
            return adr;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche de l'adresse By codePostal" + ex.getMessage());
            return null;
        }
    }

    @Override
    public Adresse findAdresseByRue(String rue) {
        Adresse adr = new Adresse();
        String requete = "select * from adresse where rue ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, rue);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                adr.setRegion(resultat.getString(2));
                adr.setCode_Postal(resultat.getInt(3));
                adr.setRue(resultat.getString(4));
             
            }
            return adr;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche de l'adresse By rue" + ex.getMessage());
            return null;
        }
    }
    
    @Override
    public List<Adresse> findAllAdresse() {
                List<Adresse> lst_adresse = new ArrayList<Adresse>();
                String requete = "select * from adresse a join restaurateur r on a.id_resto=r.id_resto";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            
            while(resultat.next()){
                Adresse adresse = new Adresse();
                adresse.setId(resultat.getInt(1));                
                adresse.setRegion(resultat.getString(2));
                adresse.setCode_Postal(resultat.getInt(3));
                adresse.setRue(resultat.getString(4));
                 lst_adresse.add(adresse);
            }
            
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
        return lst_adresse;
    }
    
}
