
package restotunisie.entities;

import java.util.Date;

public class Restaurateur {
    
   private String nomRestaurant;
   private int note;
   private String Tel;
   private String Fax;
   private Date horaireMatinDebut;
   private Date HoraireMatinFin;
   private Date HoraireApremDebut;
   private Date HoraireApremFin;
   private float budget;

    public Restaurateur(String nomRestaurant, int note, String Tel, String Fax, Date horaireMatinDebut, Date HoraireMatinFin, Date HoraireApremDebut, Date HoraireApremFin, float budget) {
        this.nomRestaurant = nomRestaurant;
        this.note = note;
        this.Tel = Tel;
        this.Fax = Fax;
        this.horaireMatinDebut = horaireMatinDebut;
        this.HoraireMatinFin = HoraireMatinFin;
        this.HoraireApremDebut = HoraireApremDebut;
        this.HoraireApremFin = HoraireApremFin;
        this.budget = budget;
    }

    public String getNomRestaurant() {
        return nomRestaurant;
    }

    public int getNote() {
        return note;
    }

    public String getTel() {
        return Tel;
    }

    public String getFax() {
        return Fax;
    }

    public Date getHoraireMatinDebut() {
        return horaireMatinDebut;
    }

    public Date getHoraireMatinFin() {
        return HoraireMatinFin;
    }

    public Date getHoraireApremDebut() {
        return HoraireApremDebut;
    }

    public Date getHoraireApremFin() {
        return HoraireApremFin;
    }

    public float getBudget() {
        return budget;
    }

    public void setNomRestaurant(String nomRestaurant) {
        this.nomRestaurant = nomRestaurant;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    public void setHoraireMatinDebut(Date horaireMatinDebut) {
        this.horaireMatinDebut = horaireMatinDebut;
    }

    public void setHoraireMatinFin(Date HoraireMatinFin) {
        this.HoraireMatinFin = HoraireMatinFin;
    }

    public void setHoraireApremDebut(Date HoraireApremDebut) {
        this.HoraireApremDebut = HoraireApremDebut;
    }

    public void setHoraireApremFin(Date HoraireApremFin) {
        this.HoraireApremFin = HoraireApremFin;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }
    
   
   
}
