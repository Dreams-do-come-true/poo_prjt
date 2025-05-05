import java.util.*;
import java.time.*;

public class Pilote extends Equipage {
    private String licence;
    private int experience;
    private Vector<Vol> listVols = new Vector<>();
    private Compagnie compagnie;

    // Constructeur
    public Pilote(String nom, String prenom, LocalDate dateNaissance, int idPers, String job,
                  String licence, int experience, Compagnie compagnie) {
        super(nom, prenom, dateNaissance, idPers, job); // Appel au constructeur d'Equipage
        this.licence = licence;
        this.experience = experience;
        this.compagnie = compagnie;
    }

    // Getters
    public String getLicence() {
        return licence;
    }

    public int getExperience() {
        return experience;
    }

    public Vector<Vol> getListVols() {
        return listVols;
    }

    public Compagnie getCompagnie() {
        return compagnie;
    }

    // Setters
    public void setLicence(String licence) {
        this.licence = licence;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setCompagnie(Compagnie compagnie) {
        this.compagnie = compagnie;
    }
}
