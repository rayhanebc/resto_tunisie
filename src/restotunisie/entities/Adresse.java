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
public class Adresse {

    int Id;
    String Region;
    String Rue;
    int Code_Postal;

    public Adresse() {
    }

    public Adresse(String reg, String r, int code_p) {
        Region = reg;
        Rue = r;
        Code_Postal = code_p;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getRue() {
        return Rue;
    }

    public void setRue(String Rue) {
        this.Rue = Rue;
    }

    public int getCode_Postal() {
        return Code_Postal;
    }

    public void setCode_Postal(int Code_Postal) {
        this.Code_Postal = Code_Postal;
    }
}
