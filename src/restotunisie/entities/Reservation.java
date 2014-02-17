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
public class Reservation {
    
    private int id_res ;
    private Date date_reservation;
    private Date heure_reservation;
    private int nbr_personnes;

    /**
     * @return the id_res
     */
    public Reservation(int id, Date date_reservation,Date heure_reservation,int nbr_personnes )
    {
    this.id_res = id;
    this.date_reservation = date_reservation;
    this.heure_reservation = heure_reservation;
    this.nbr_personnes = nbr_personnes;
    }
    
    
    public int getId_res() {
        return id_res;
    }

    /**
     * @param id_res the id_res to set
     */
    public void setId_res(int id_res) {
        this.id_res = id_res;
    }

    /**
     * @return the date_reservation
     */
    public Date getDate_reservation() {
        return date_reservation;
    }

    /**
     * @param date_reservation the date_reservation to set
     */
    public void setDate_reservation(Date date_reservation) {
        this.date_reservation = date_reservation;
    }

    /**
     * @return the heure_reservation
     */
    public Date getHeure_reservation() {
        return heure_reservation;
    }

    /**
     * @param heure_reservation the heure_reservation to set
     */
    public void setHeure_reservation(Date heure_reservation) {
        this.heure_reservation = heure_reservation;
    }

    /**
     * @return the nbr_personnes
     */
    public int getNbr_personnes() {
        return nbr_personnes;
    }

    /**
     * @param nbr_personnes the nbr_personnes to set
     */
    public void setNbr_personnes(int nbr_personnes) {
        this.nbr_personnes = nbr_personnes;
    }
    
}
