
package restotunisie.entities;

    
public class Menu {
    private int id;
    private String label;

    public Menu(int id, String label) {
        this.id = id;
        this.label = label;
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
    
    
}
   

    
