/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restotunisie.DAO;

import java.util.List;
import restotunisie.entities.Adresse;

/**
 *
 * @author lenovo
 */
public interface AdresseDaoInterface {
    public void createAdresse(Adresse adresse);
    public void updateAdresse(Adresse adresse);
    public void deleteAdresse(String label);
    public Adresse findAdresse(String a);
    public List<Adresse> findAllAdresse();
    
}
