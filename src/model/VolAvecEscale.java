import java.util.*;
import java.time.*;

public class VolAvecEscale extends Vol {
    private String lieu;
    private int duree;
    private Date heureArrivee;
    private Date heureDepart;

    // Constructeur
    public VolAvecEscale(String numVol, String lieuDepart, String lieuDestination, Date date, double prix,
                         int placesDispo, int dureeVol, Avion avion, Compagnie compagnie,
                         String lieu, int duree, Date heureArrivee, Date heureDepart) {
        super(numVol, lieuDepart, lieuDestination, date, prix, placesDispo, dureeVol, avion, compagnie);
        this.lieu = lieu;
        this.duree = duree;
        this.heureArrivee = heureArrivee;
        this.heureDepart = heureDepart;
    }

    // Getters
    public String getLieu() {
        return lieu;
    }

    public int getDuree() {
        return duree;
    }

    public Date getHeureArrivee() {
        return heureArrivee;
    }

    public Date getHeureDepart() {
        return heureDepart;
    }

    // Setters
    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public void setHeureArrivee(Date heureArrivee) {
        this.heureArrivee = heureArrivee;
    }

    public void setHeureDepart(Date heureDepart) {
        this.heureDepart = heureDepart;
    }
}
