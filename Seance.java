public class Seance {
    private int id;
    private LocalDate date;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    private Cours cours;
    private Statut statut;

    public Seance(int id, LocalDate date, LocalTime heureDebut, LocalTime heureFin, Cours cours) {
        this.id = id;
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.cours = cours;
        this.statut = Statut.PLANIFIE; // Initial status
    }

    // Getters
    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getHeureDebut() {
        return heureDebut;
    }

    public LocalTime getHeureFin() {
        return heureFin;
    }

    public Cours getCours() {
        return cours;
    }

    public Statut getStatut() {
        return statut;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setHeureDebut(LocalTime heureDebut) {
        this.heureDebut = heureDebut;
    }

    public void setHeureFin(LocalTime heureFin) {
        this.heureFin = heureFin;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }
}