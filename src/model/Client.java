import java.util.*;
import java.time.LocalDate;

public class Client extends Personne {
    private String passeport;
    private Vector<Reservation> listReservations = new Vector<>();

    // Constructeur
    public Client(String nom, String prenom, LocalDate dateNaissance, int idPers, String passeport) {
        super(nom, prenom, dateNaissance, idPers); // Appel du constructeur de Personne
        this.passeport = passeport;
    }

    // Getters
    public String getPasseport() {
        return passeport;
    }

    public Vector<Reservation> getListReservations() {
        return listReservations;
    }

    // Méthode pour ajouter une réservation
    public void ajouterReservation(Reservation reservation) {
        if (!listReservations.contains(reservation)) {
            listReservations.add(reservation);
        }
    }
}
