/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restotunisie.DAO;

import java.util.List;
import restotunisie.entities.Client;

/**
 *
 * @author fathi
 */
public interface InterfaceClientDAO {
    
    public void createClient(Client c);

    public void updateUClient(Client c);

    public void deleteClient(String cin);

    public Client findClient(String cin);

    public List<Client> displayAllClients();
}
