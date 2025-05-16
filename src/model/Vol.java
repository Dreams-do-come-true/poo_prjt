import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vol {
    private String numVol;
    private String lieuDepart;
    private String lieuDestination;
    private Date dateVol;
    private double prix;
    private int duree; // en minutes
    private int nbPlaces;
    private Avion avion;
    private Compagnie compagnie;
    private List<Equipage> listEquipage;

    // --- Constructeur ---
    public Vol(String numVol, String lieuDepart, String lieuDestination, Date dateVol, double prix, int duree, int nbPlaces, Avion avion, Compagnie compagnie) {
        this.numVol = numVol;
        this.lieuDepart = lieuDepart;
        this.lieuDestination = lieuDestination;
        this.dateVol = dateVol;
        this.prix = prix;
        this.duree = duree;
        this.nbPlaces = nbPlaces;
        this.avion = avion;
        this.compagnie = compagnie;
        this.listEquipage = new ArrayList<>();
    }

    // --- Getters ---
    public String getNumVol() {  return numVol;    }
    public String getLieuDepart() {   return lieuDepart;    }
    public String getLieuDestination() { return lieuDestination;}
    public Date getDateVol() {  return dateVol;  }
    public double getPrix() { return prix;    }
    public int getDuree() {   return duree;    }
    public int getNbPlaces() {  return nbPlaces;    }
    public Avion getAvion() {   return avion;    }
    public Compagnie getCompagnie() { return compagnie;    }
    public List<Equipage> getListEquipage() { return listEquipage;   }

    // --- Ajouter un membre d'équipage ---
    public void ajouterMembreEquipage(Equipage equipage) {
        listEquipage.add(equipage);
    }

    // --- Réduire le nombre de places disponibles (par exemple après réservation) ---
    public void reserverPlace() {
        if (nbPlaces > 0) {
            nbPlaces--;
        } else {
            System.out.println("Aucune place disponible !");
        }
    }
    
}
