
package restotunisie.entities;

import java.util.Date;

public class Restaurateur {
    
   private String nomRestaurant;
   private int note;
   private String Tel;
   private String Fax;
   private Date horaireOverture;
   private Date HoraireFermeture;
   private float budget;

   public Restaurateur()
   {}
   
    public Restaurateur(String nomRestaurant, int note, String Tel, String Fax, Date horaireMatinDebut, Date HoraireMatinFin, Date HoraireApremDebut, Date HoraireApremFin, float budget) {
        this.nomRestaurant = nomRestaurant;
        this.note = note;
        this.Tel = Tel;
        this.Fax = Fax;
        this.horaireOverture= horaireMatinDebut;
        
        this.HoraireFermeture = HoraireApremFin;
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

   

    public void setBudget(float budget) {
        this.budget = budget;
    }

    /**
     * @return the horaireOverture
     */
    public Date getHoraireOverture() {
        return horaireOverture;
    }

    /**
     * @param horaireOverture the horaireOverture to set
     */
    public void setHoraireOverture(Date horaireOverture) {
        this.horaireOverture = horaireOverture;
    }

    /**
     * @return the HoraireFermeture
     */
    public Date getHoraireFermeture() {
        return HoraireFermeture;
    }

    /**
     * @param HoraireFermeture the HoraireFermeture to set
     */
    public void setHoraireFermeture(Date HoraireFermeture) {
        this.HoraireFermeture = HoraireFermeture;
    }
    
   
   
}
