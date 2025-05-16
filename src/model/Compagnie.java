import java.util.Vector;
import java.util.*;

public class Compagnie {
    private String nom;
    private String codeIATA;
    private Vector<Pilote> listPilotes = new Vector<>();
    private Vector<Avion> listAvions = new Vector<>();
    private Vector<Vol> listVols = new Vector<>();
    private static List<Compagnie> listeCompagnies = new ArrayList<>();


    // Constructeur
    public Compagnie(String nom, String codeIATA) {
        this.nom = nom;
        this.codeIATA = codeIATA;
    }

    // Getters
    public String getNom() { return nom; }
    public String getCodeIATA() { return codeIATA; }
    public Vector<Pilote> getListPilotes() { return listPilotes; }
    public Vector<Avion> getListAvions() { return listAvions; }
    public Vector<Vol> getListVols() { return listVols; }

    // Méthodes pour ajouter des éléments aux listes
    public void ajouterPilote(Pilote pilote) {
        if (!listPilotes.contains(pilote)) {
            listPilotes.add(pilote);
        }
    }

    public void ajouterAvion(Avion avion) {
        if (!listAvions.contains(avion)) {
            listAvions.add(avion);
        }
    }

    public void ajouterVol(Vol vol) {
        if (!listVols.contains(vol)) {
            listVols.add(vol);
        }
    }
    
    // Méthode pour créer une nouvelle compagnie
    public static boolean creerCompagnie(String nom, String codeIATA) {
        // Vérifier si une compagnie avec le même code IATA existe déjà
        for (Compagnie c : listeCompagnies) {
            if (c.getCodeIATA().equalsIgnoreCase(codeIATA)) {
                System.out.println("Une compagnie avec ce code IATA existe déjà.");
                return false;
            }
        }

        Compagnie nouvelleCompagnie = new Compagnie(nom, codeIATA);
        listeCompagnies.add(nouvelleCompagnie);
        System.out.println("Compagnie créée avec succès !");
        return true;
    }

}
