/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restotunisie.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import restotunisie.entities.Client;
import restotunisie.util.MyConnection;

/**
 *
 * @author fathi
 */
public class ClientDAO implements InterfaceClientDAO{

    @Override
    public void createClient(Client c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateUClient(Client c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteClient(String cin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Client findClient(String cin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Client> displayAllClients() {
         List<Client> listeclient = new ArrayList<Client>();

        String requete = "select * from client";
        try {
            Statement statement = MyConnection.getInstance()
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Client c = new Client();
                c.setCin(resultat.getInt("cin")+"");
                c.setNom(resultat.getString("nom"));
                c.setPrenom(resultat.getString("prenom"));
                c.setAdresse(resultat.getString("adresse"));
                c.setTelephone(resultat.getString("tel"));
                c.setMail(resultat.getString("email"));
                c.setLogin(resultat.getString("login"));
                listeclient.add(c);

            }
            return listeclient;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots " + ex.getMessage());
            return null;
        }
    }
   
    
}
