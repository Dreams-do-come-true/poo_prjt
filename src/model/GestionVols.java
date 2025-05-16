

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GestionVols {
    private List<Vol> listeVols;

    public GestionVols() {
        this.listeVols = new ArrayList<>();
    }

    // Méthode pour créer un nouveau vol
    public Vol creerVol(String numVol, String lieuDepart, String lieuDestination, Date dateVol,
                        double prix, int duree, int nbPlaces, Avion avion, Compagnie compagnie) {
        
        Vol vol = new Vol(numVol, lieuDepart, lieuDestination, dateVol, prix, duree, nbPlaces, avion, compagnie);
        listeVols.add(vol);
        return vol;
    }

    // Pour accéder à la liste des vols (utile dans la vue)
    public List<Vol> getListeVols() {
        return listeVols;
    }

    // Exemple de recherche
    public Vol chercherVolParNumero(String numVol) {
        for (Vol vol : listeVols) {
            if (vol.getNumVol().equals(numVol)) {
                return vol;
            }
        }
        return null;
    }
}
