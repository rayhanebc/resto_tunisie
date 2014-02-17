/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restotunisie.DAO;

import java.util.List;
import restotunisie.entities.Facture;

/**
 *
 * @author Rayhane
 */
public interface InterfaceFactureDAO {
    
    public void createFacture(Facture f);
    public void updateFacture(Facture f);
    public void deleteFacture(Facture f);
    public Facture findFacture(int id);
    public List<Facture> displayAllFactures();
}
