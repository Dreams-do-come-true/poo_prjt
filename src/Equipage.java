import java.time.LocalDate;

public class Equipage extends Personne {
    private String job;

    // Constructeur
    public Equipage(String nom, String prenom, LocalDate dateNaissance, int idPers, String job) {
        super(nom, prenom, dateNaissance, idPers); // Appel correct au constructeur de Personne
        this.job = job;
    }

    // Getter
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
