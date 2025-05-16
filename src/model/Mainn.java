import java.time.LocalDate;
import java.util.Date;
import java.util.*;
import vue.VolView;

public class Mainn {
    public static void main(String[] args) {
        // --- Création de la compagnie et de l’avion ---
        Compagnie compagnie = new Compagnie("Oteria Airlines", "DIV");
        Avion avion = new Avion("Boeing 737", "Boeing", 550, compagnie);

        // --- Création du vol ---
        Vol vol = new Vol(
            "OT123",
            "Paris",
            "Tunis",
            new Date(),
            300.0,   // prix
            120,     // durée en minutes
            150,     // nombre de places disponibles
            avion,
            compagnie
        );

        // --- Création d'un vol avec escale ---
        VolAvecEscale volAvecEscale = new VolAvecEscale(
            "OT456", 
            "Paris", 
            "Tunis", 
            new Date(), 
            350.0, 
            100, 
            180, 
            avion, 
            compagnie, 
            "Rome",     // Lieu de l'escale
            60,         // Durée de l'escale en minutes
            new Date(), // Heure d'arrivée
            new Date()  // Heure de départ après escale
        );

        // --- Création des membres d’équipage ---
        Pilote pilote = new Pilote("Tarek", "Melliti", LocalDate.of(1975, 3, 21), 1, "Pilote", "123456ch", 2, compagnie);
        Stewart stewart = new Stewart("Martin", "Louis", LocalDate.of(1988, 6, 10), 2, "Stewart");
        HotesseAir hotesse = new HotesseAir("Durand", "Claire", LocalDate.of(1990, 11, 5), 3, "Hôtesse");

        // --- Ajout des membres d'équipage au vol ---
        vol.ajouterMembreEquipage(pilote);
        vol.ajouterMembreEquipage(stewart);
        vol.ajouterMembreEquipage(hotesse);

        // --- Création d’un client ---
        Client client = new Client("Chalal", "Ahlame", LocalDate.of(2000, 5, 15), 4, "DZ987654");

        // --- Création d’une réservation pour le client ---
        Reservation reservation = new Reservation("RES001", true, volAvecEscale, client);
        client.ajouterReservation(reservation);

        // === Affichage des informations ===

        System.out.println("=== Informations du Client ===");
        System.out.println("Nom : " + client.getNom());
        System.out.println("Prénom : " + client.getPrenom());
        System.out.println("Date de naissance : " + client.getDateNaissance());
        System.out.println("Passeport : " + client.getPasseport());

        System.out.println("\n=== Réservations du Client ===");
        for (Reservation r : client.getListReservations()) {
            Vol v = r.getVol();
            Avion a = v.getAvion();
            System.out.println("ID Réservation       : " + r.getIdReservation());
            System.out.println("Statut               : " + (r.isStatutReservation() ? "Confirmée" : "Annulée"));
            System.out.println("Numéro du Vol        : " + v.getNumVol());
            System.out.println("Départ               : " + v.getLieuDepart());
            System.out.println("Destination          : " + v.getLieuDestination());
            System.out.println("Date du Vol          : " + v.getDateVol());
            System.out.println("Prix du Billet       : " + v.getPrix() + "€");
            System.out.println("Durée du Vol         : " + v.getDuree() + " minutes");
            System.out.println("Places disponibles   : " + v.getNbPlaces());

            if (v instanceof VolAvecEscale) {
                VolAvecEscale volEscale = (VolAvecEscale) v;
                System.out.println("Escale à : " + volEscale.getLieu());
                System.out.println("Durée de l'escale : " + volEscale.getDuree() + " minutes");
                System.out.println("Heure d'arrivée à l'escale : " + volEscale.getHeureArrivee());
                System.out.println("Heure de départ de l'escale : " + volEscale.getHeureDepart());
            }

            System.out.println("--------------------------------------------------");
        }

        System.out.println("\n=== Équipage du Vol " + vol.getNumVol() + " ===");
        for (Equipage e : vol.getListEquipage()) {
            System.out.println(
                e.getClass().getSimpleName() + " - " +
                e.getNom() + " " + e.getPrenom() +
                " (" + e.getJob() + ")"
            );
        }

        System.out.println("\n=== Informations sur l'Avion ===");
        System.out.println("Modèle : " + vol.getAvion().getModel());
        System.out.println("Immatriculation : " + vol.getAvion().getImmatriculation());
        System.out.println("Capacité : " + vol.getAvion().getNbPlaces() + " places");
        Compagnie.creerCompagnie("Air Ahlame", "AA");
        VolView vue = new VolView();
    }

}

