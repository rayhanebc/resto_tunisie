/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restotunisie.DAO;

import java.util.List;
import restotunisie.entities.Administrateur;

/**
 *
 * @author fathi
 */
public interface InterfaceAdministrateurDAO {

    public void createAdministrateur(Administrateur a);

    public void updateUAdministrateur(Administrateur a);

    public void deleteAdministrateur(int id);

    public Administrateur findAdministrateur(int id);

    public List<Administrateur> displayAllAdministrateurs();
}
