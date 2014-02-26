/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restotunisie.entities;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import restotunisie.DAO.RestaurateurDAO;

/**
 *
 * @author fathi
 */
public class CTableModel extends AbstractTableModel {

    private String[] columnNames = {"Nom du restaurant", "Fax", "note"};
    private List<Restaurateur> dat = (new RestaurateurDAO().displayAllRestaurateurs());

    public List<Restaurateur> getDat() {
        return dat;
    }

    
    
    
    @Override
    public int getRowCount() {
        return dat.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    
    @Override
    public Object getValueAt(int rowIndex, int ColumnIndex) {
        Restaurateur re = dat.get(rowIndex);
      
        switch (ColumnIndex) {
            case 0:
                return re.getNomRestaurant();

            case 1:
                return re.getFax();

            case 2:
                return re.getNote();
                

            default:
                return null;
        }

    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col]; //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
