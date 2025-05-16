

import java.util.*;

public class Avion {
    private String immatriculation;
    private String model;
    private int nbPlaces;
    private Vector<Vol> listVols = new Vector<>();
    private Compagnie compagnie;

    // Constructeur
    public Avion(String immatriculation, String model, int nbPlaces, Compagnie compagnie) {
        this.immatriculation = immatriculation;
        this.model = model;
        this.nbPlaces = nbPlaces;
        this.compagnie = compagnie;
    }
    
    // Méthode pour ajouter un vol à la liste
    public void ajouterVol(Vol vol) {
        if (!listVols.contains(vol)) {
            listVols.add(vol);
        }
    }
    
 // Getters
    public String getImmatriculation() {
        return immatriculation;
    }

    public String getModel() {
        return model;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public Vector<Vol> getListVols() {
        return listVols;
    }

    public Compagnie getCompagnie() {
        return compagnie;
    }



    // Setters
    public void setCompagnie(Compagnie compagnie) { this.compagnie = compagnie; }

   
}
