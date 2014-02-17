/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restotunisie.entities;

import java.util.Date;

/**
 *
 * @author Rayhane
 */
public class Facture {
    
    private int num_fact;
    private String nom_resto;
    private String nom_cient;
    private Date date;
    private String designation;
    private float total_prix;

   
    
    public Facture(int num_fact, String nom_resto, String nom_cient, Date date, String designation, float total_prix) {
        this.num_fact = num_fact;
        this.nom_resto = nom_resto;
        this.nom_cient = nom_cient;
        this.date = date;
        this.designation = designation;
        this.total_prix = total_prix;
    }
    
     /**
     * @return the num_fact
     */
    public int getNum_fact() {
        return num_fact;
    }

    /**
     * @param num_fact the num_fact to set
     */
    public void setNum_fact(int num_fact) {
        this.num_fact = num_fact;
    }

    /**
     * @return the nom_resto
     */
    public String getNom_resto() {
        return nom_resto;
    }

    /**
     * @param nom_resto the nom_resto to set
     */
    public void setNom_resto(String nom_resto) {
        this.nom_resto = nom_resto;
    }

    /**
     * @return the nom_cient
     */
    public String getNom_cient() {
        return nom_cient;
    }

    /**
     * @param nom_cient the nom_cient to set
     */
    public void setNom_cient(String nom_cient) {
        this.nom_cient = nom_cient;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the designation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * @param designation the designation to set
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * @return the total_prix
     */
    public float getTotal_prix() {
        return total_prix;
    }

    /**
     * @param total_prix the total_prix to set
     */
    public void setTotal_prix(float total_prix) {
        this.total_prix = total_prix;
    }
    
}
