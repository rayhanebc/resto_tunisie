
package restotunisie.DAO;

import java.util.List;
import restotunisie.entities.Restaurateur;


public interface RestaurateurDaoInterface {
    
    public void createRestaurateur(Restaurateur r);
    public void updateRestaurateur(Restaurateur r);
    public void deleteRestaurateur(String nom);
    public Restaurateur findRestaurateur(int id);
    public List<Restaurateur> displayAllRestaurateurs();
    
    
    
}
