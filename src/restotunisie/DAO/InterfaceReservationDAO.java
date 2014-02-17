/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restotunisie.DAO;

import java.util.List;
import restotunisie.entities.Reservation;

/**
 *
 * @author Rayhane
 */
public interface InterfaceReservationDAO {
     public void createReservation(Reservation r);
    public void updateReservation(Reservation r);
    public void deleteReservation(Reservation r);
    public Reservation findReservation(int id);
    public List<Reservation> displayAllReservation();
    
}
