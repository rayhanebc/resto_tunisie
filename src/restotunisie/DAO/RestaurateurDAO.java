package restotunisie.DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import restotunisie.entities.Restaurateur;
import restotunisie.util.MyConnection;

/**
 *
 * @author Molk
 */
public class RestaurateurDAO implements RestaurateurDaoInterface {

    @Override
    public void createRestaurateur(Restaurateur r) {

        String requete = "insert into restaurateur values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, r.getNomRestaurant());
            ps.setInt(2, r.getNote());
            ps.setString(3, r.getTel());
            ps.setString(4, r.getFax());
            ps.setFloat(5, r.getBudget());
            ps.setDate(6, (Date) r.getHoraireOverture());
            ps.setDate(7, (Date) r.getHoraireFermeture());
            // ps.setString(8, r.getLogin);

            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }



    }

    @Override
    public void updateRestaurateur(Restaurateur r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteRestaurateur(String nom) {

        String requete = "delete from restaurateur where nom_restaurant=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, nom);
            ps.executeUpdate();
            System.out.println("restaurant supprimée");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }


    }

    @Override
    public List<Restaurateur> displayAllRestaurateurs() {

        List<Restaurateur> listeresto = new ArrayList<Restaurateur>();
//        Restaurateur r = new Restaurateur();
//
//        r.setNomRestaurant("aaa");
//       // r.setBudget((float) 12.3);
//       
//        r.setNote(10);
//        //r.setTel("07111111");
//        r.setFax("faxxx");
//        listeresto.add(r);
//        
//        Restaurateur r2 = new Restaurateur();
//
//        r2.setNomRestaurant("bbb");
//        //r2.setBudget((float) 13.5);
//        r2.setNote(15);
//       // r2.setTel("02111111");
//        r2.setFax("faxxx2");
//        listeresto.add(r2);


//
        String requete = "select * from restaurateur";
        try {
            Statement statement = MyConnection.getInstance()
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Restaurateur r = new Restaurateur();
                r.setNomRestaurant(resultat.getString(2));
                r.setFax(resultat.getString(9));
                r.setNote(resultat.getInt(3));
//                r.setTel(resultat.getString(3));
//                r.setBudget(resultat.getFloat(4));

//                r.setHoraireOverture(resultat.getDate(5));
                
//                r.setHoraireFermeture(resultat.getDate(2));

                listeresto.add(r);

            }

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots " + ex.getMessage());
            return null;
        }

        return listeresto;
    }

    @Override
    public Restaurateur findRestaurateur(String nom_resto) {

        Restaurateur r = new Restaurateur();
        String requete = "select * from restaurateur where nom_restaurant= ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, nom_resto);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                r.setNomRestaurant(resultat.getString(1));
                // System.out.println("testttttttt"+depot.getId_dep());
                r.setBudget(resultat.getFloat(2));
                r.setNote(resultat.getInt(2));
                r.setTel(resultat.getString(2));
                r.setFax(resultat.getString(2));
                r.setHoraireOverture(resultat.getDate(2));
                r.setHoraireFermeture(resultat.getDate(2));

                // System.out.println(resultat.getString(2));
            }
            return r;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du restaurateur " + ex.getMessage());
            return null;
        }

    }
}
