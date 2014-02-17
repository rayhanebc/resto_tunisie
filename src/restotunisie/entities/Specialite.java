/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restotunisie.entities;

/**
 *
 * @author lenovo
 */
public class Specialite {
    int Id;
    String Label;
    
    public Specialite(String lab){
        Label= lab;
    }
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String Label) {
        this.Label = Label;
    }

    
}
