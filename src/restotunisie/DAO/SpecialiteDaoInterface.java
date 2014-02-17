/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restotunisie.DAO;

import java.util.List;
import restotunisie.entities.Specialite;

/**
 *
 * @author lenovo
 */
public interface SpecialiteDaoInterface {
    public void createSpecialite(Specialite specialite);
    public void updateSpecialite(Specialite specialite);
    public void deleteSpecialite(String label);
    public Specialite findSpecialite(String label);
    public List<Specialite> findAllSpecialite();
    
}
