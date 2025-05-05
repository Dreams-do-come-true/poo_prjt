

import java.util.*;

public class Reservation {
    private String idReservation;
    private boolean statutReservation;
    private Vol vol;
    private Client passager;

    // Constructeur
    public Reservation(String idReservation, boolean statutReservation, Vol vol, Client passager) {
        this.idReservation = idReservation;
        this.statutReservation = statutReservation;
        this.vol = vol;
        this.passager = passager;
    }

    // Getters
    public String getIdReservation() {
        return idReservation;
    }

    public boolean isStatutReservation() {
        return statutReservation;
    }

    public Vol getVol() {
        return vol;
    }



    public Client getPassager() {
        return passager;
    }

    // Setters
    public void setIdReservation(String idReservation) {
        this.idReservation = idReservation;
    }

    public void setStatutReservation(boolean statutReservation) {
        this.statutReservation = statutReservation;
    }

    public void setVol(Vol vol) {
        this.vol = vol;
    }


    public void setPassager(Client passager) {
        this.passager = passager;
    }
}
