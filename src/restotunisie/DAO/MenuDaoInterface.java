package restotunisie.DAO;

import java.util.List;
import restotunisie.entities.Menu;


public interface MenuDaoInterface {
    
    public void createMenu(Menu menu);
    public void updateMenu(Menu menu);
    public void deleteMenu(String label);
    public Menu findMenu(String label);
    public List<Menu> displayAllMenus();
}
