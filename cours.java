import java.util.ArrayList;
import java.util.List;

public class Cours {
    private int id;
    private String module;
    private String professeur;
    private List<Classe> classes;
    private Statut statut;

    public Cours(int id, String module, String professeur) {
        this.id = id;
        this.module = module;
        this.professeur = professeur;
        this.classes = new ArrayList<>(); // Initialize the list of classes
        this.statut = Statut.PLANIFIE; // Default status
    }

    // Add a class to the course
    public void addClasse(Classe classe) {
        this.classes.add(classe);
    }

    // Remove a class from the course
    public boolean removeClasse(Classe classe) {
        return this.classes.remove(classe);
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getModule() {
        return module;
    }

    public String getProfesseur() {
        return professeur;
    }

    public List<Classe> getClasses() {
        return classes;
    }

    public Statut getStatut() {
        return statut;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public void setProfesseur(String professeur) {
        this.professeur = professeur;
    }

    public void setClasses(List<Classe> classes) {
        this.classes = classes;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }
}